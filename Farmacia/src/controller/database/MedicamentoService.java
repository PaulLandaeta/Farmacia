/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.database;

import com.mysql.jdbc.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.entities.Medicamento;

/**
 *
 * @author plandaeta
 */
public class MedicamentoService {
   private final String tabla = "medicamento";
   public void guardar(Connection conexion, Medicamento medicamento) throws SQLException{
      try{
         PreparedStatement consulta;
         if(medicamento.getId() == null){
            consulta = conexion.prepareStatement("INSERT INTO " + this.tabla + "(name, laboratorio, tipo,dateExpired) VALUES(?, ?, ?,?)");
            consulta.setString(1, medicamento.getName());
            consulta.setString(2, medicamento.getLaboratorio());
            consulta.setString(3, medicamento.getTipo());
            consulta.setDate(4, (Date) medicamento.getDateExpired());
         }else{
            consulta = conexion.prepareStatement("UPDATE " + this.tabla + " SET name = ?, laboratorio = ?, tipo = ?, dateExpired = ? WHERE id_tarea = ?");
            consulta.setString(1, medicamento.getName());
            consulta.setString(2, medicamento.getLaboratorio());
            consulta.setString(3, medicamento.getTipo());
            consulta.setDate(4, (Date) medicamento.getDateExpired());
            consulta.setLong(5, medicamento.getId());
         }
         consulta.executeUpdate();
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
   }
   /*public Tarea recuperarPorId(Connection conexion, int id_tarea) throws SQLException {
      Tarea tarea = null;
      try{
         PreparedStatement consulta = conexion.prepareStatement("SELECT titulo, descripcion, nivel_de_prioridad FROM " + this.tabla + " WHERE id_tarea = ?" );
         consulta.setInt(1, id_tarea);
         ResultSet resultado = consulta.executeQuery();
         while(resultado.next()){
            tarea = new Tarea(id_tarea, resultado.getString("titulo"), resultado.getString("descripcion"), resultado.getInt("nivel_de_prioridad"));
         }
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
      return tarea;
   }
   public void eliminar(Connection conexion, Tarea tarea) throws SQLException{
      try{
         PreparedStatement consulta = conexion.prepareStatement("DELETE FROM " + this.tabla + " WHERE id_tarea = ?");
         consulta.setInt(1, tarea.getId_tarea());
         consulta.executeUpdate();
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
   }*/
   
   public List<Medicamento> recuperarTodas(Connection conexion) throws SQLException{
      List<Medicamento> medicamentos = new ArrayList<>();
      try{
         PreparedStatement consulta = conexion.prepareStatement("SELECT id, name, laboratorio, tipo,dateexpired FROM " + this.tabla + " ORDER BY name");
         ResultSet resultado = consulta.executeQuery();
         while(resultado.next()){
            medicamentos.add(new Medicamento(resultado.getLong("id"), resultado.getString("name"), resultado.getString("laboratorio"), resultado.getString("tipo"),resultado.getDate("dateexpired")));
         }
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
      return medicamentos;
   }
}
