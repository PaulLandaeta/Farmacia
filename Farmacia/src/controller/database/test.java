/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.database;

import com.mysql.jdbc.Connection;
import java.sql.SQLException;
import java.util.List;
import models.entities.Medicamento;

/**
 *
 * @author plandaeta
 */
public class test {
    public static void main(String args[]) throws SQLException, ClassNotFoundException{
       Connection c=Conexion.obtener();
       MedicamentoService medicamentoservice=new MedicamentoService();
       List<Medicamento> medicamentolist=medicamentoservice.recuperarTodas(c);
       System.out.println(medicamentolist.size());
    }
}
