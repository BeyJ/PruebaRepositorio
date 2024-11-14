/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Joazar
 */
public class RellenarCombo {
    public void RellenarComboBox(String tabla, String valor, JComboBox combo) {
        
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select * from ingreso");

            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
                combo.addItem(rs.getString(valor));              
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error" + e.toString());
        }
    }
    
    public void RellenarComboBox1(String tabla, String valor, JComboBox combo) {
        
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select * from Egreso");

            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
                combo.addItem(rs.getString(valor));              
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error" + e.toString());
        }
    }
    
    
    
}
