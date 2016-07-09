/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.database;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import models.entities.User;

/**
 *
 * @author Paul Wilker Landaeta Flores paulwilkerlf@gmail.com
 */
public class UserService {
    private final String tabla = "user";
    public User recuperarPorUsername(Connection conexion, String username) throws SQLException {
      User user = null;
      try{
         PreparedStatement consulta = conexion.prepareStatement("SELECT id, username, password FROM " + this.tabla + " WHERE username = ?" );
         consulta.setString(1, username);
         ResultSet resultado = consulta.executeQuery();
         while(resultado.next()){
            user = new User(resultado.getLong("id"), username, resultado.getString("password"));
         }
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
      return user;
   }
}
