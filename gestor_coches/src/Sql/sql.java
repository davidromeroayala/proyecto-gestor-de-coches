/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sql;

import Objetos.Persona;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class sql {

    public static ArrayList<Persona> conectar() {
        ArrayList<Persona> vPersonas=new ArrayList<>();
        Persona p=null;

        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:mysql://192.168.4.237:3306/gestionvehiculos";
            String user = "root";
            String password = "root";

            // create a connection to the database
            conn = DriverManager.getConnection(url, user, password);
            // more processing here

            String sql = "SELECT * FROM persona";
            PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            
            while (rs.next()) {                
                p=new Persona(rs.getString(1), rs.getString(2), rs.getString(3), rs.getBoolean(4), rs.getString(5));
                vPersonas.add(p);
            }
           
            
            // ... 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }

        return vPersonas;
    }

}