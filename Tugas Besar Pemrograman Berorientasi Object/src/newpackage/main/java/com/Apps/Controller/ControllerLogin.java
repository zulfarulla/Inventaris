/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage.main.java.com.Apps.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import newpackage.main.java.com.Apps.View.MainView.loginView;
import newpackage.main.java.com.Apps.View.MainView.mainView;
import newpackage.main.java.com.koneksi;

/**
 *
 * @author ZRF
 */
public class ControllerLogin {
    mainView main = new mainView();
    public void login(loginView view){
        String id = view.getjTxtId().getText();
        String pass = view.getjTxtPassw().getText();
        
        String ID = null;
        String PASS = null;
        
        try {
            String sql = "SELECT * FROM tbl_user WHERE passw = ? ";
            Connection conn = (Connection) koneksi.connectDatabase();
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, pass);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                ID = rs.getString("id");
                PASS = rs.getString("passw");
            }
        } catch (SQLException e) {
        }
        if(id.trim().equals(ID) & pass.trim().equals(PASS)){
            JOptionPane.showMessageDialog(null, "WELLCOME ADMIN");
            main.setVisible(true);
            view.setVisible(false);
        }else
            JOptionPane.showMessageDialog(null, "KATA SANDI ATAU PASSWORD SALAH","!", JOptionPane.ERROR_MESSAGE);
    }
}
