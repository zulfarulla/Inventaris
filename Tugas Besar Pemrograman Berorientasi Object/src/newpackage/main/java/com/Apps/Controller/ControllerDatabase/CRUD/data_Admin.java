/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage.main.java.com.Apps.Controller.ControllerDatabase.CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import newpackage.main.java.com.Apps.Model.ModelPropertis;
import newpackage.main.java.com.Apps.View.FromView.Form_GantiPassword;
import newpackage.main.java.com.koneksi;

/**
 *
 * @author ZRF
 */
public class data_Admin {
    ModelPropertis model = new ModelPropertis();
    /////////////////////////////////////////////////
    //UPDATE PASSWORD/GANTI PASSWORD
    /////////////////////////////////////////////////
    public void gantiPassw(Form_GantiPassword form){
        String id = form.getjTxtId().getText();
        String passw = form.getjTxtPassw().getText();
        String passwlama = form.getjTxtPasswlama().getText();
        
        String getPass = null;
        
        model.gantiPass(id, passw,passwlama);
        
        try {
            String sql = "SELECT * FROM tbl_user";
            Connection conn = (Connection) koneksi.connectDatabase();
            Statement st = (Statement)koneksi.connectDatabase().createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                getPass = rs.getString("passw");//MENDAPATKAN PASSWORD LAMA DI DATABASE
            }
        } catch (Exception e) {
        }
        
        if (model.getPasslama().equals(getPass)){
            try {
                String sql = "UPDATE tbl_user SET id = ?, passw = ? WHERE passw = ?";
                Connection conn = (Connection) koneksi.connectDatabase();
                PreparedStatement st = conn.prepareStatement(sql);

                st.setString(1, model.getId());
                st.setString(2, model.getPassw());
                st.setString(3, model.getPasslama());

                st.execute();
                JOptionPane.showMessageDialog(null, "PASSWORD BERHASIL DI GANTI");
                form.setVisible(false);
            }catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "ERROR : "+e);
            }
        }else
            JOptionPane.showMessageDialog(null, "PASSWORD LAMA YANG ANDA MASUKAN SALAH");
        
        
        
    }
}
