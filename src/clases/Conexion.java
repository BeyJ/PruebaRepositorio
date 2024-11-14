/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.*;

/**
 *
 * @author Joazar
 */
public class Conexion {
    public static Connection conectar(){
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/dep_auditoria", "root", "");
            return cn;
        } catch (SQLException e){
            System.out.println("Error en conexion local " + e);
        }
        return (null);
    }
}
