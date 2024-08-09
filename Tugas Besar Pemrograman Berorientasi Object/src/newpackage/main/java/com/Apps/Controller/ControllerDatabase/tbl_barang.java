/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage.main.java.com.Apps.Controller.ControllerDatabase;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import newpackage.main.java.com.Apps.View.MenuSideBar.Barang;
import newpackage.main.java.com.Apps.View.MenuSideBar.Dashboard;
import newpackage.main.java.com.koneksi;

/**
 *
 * @author ZRF
 */
public class tbl_barang {
    int no = 0;
    public void tableDataBarang(Barang barang){
        try {
            Statement stat = (Statement)koneksi.connectDatabase().createStatement();
            String sql = "SELECT * from tbl_barang";
            ResultSet rs = stat.executeQuery(sql);
            DefaultTableModel tblModel;
            tblModel = (DefaultTableModel)barang.getTblDataBarang().getModel();
            while(rs.next()){
                no = no + 1;
                tblModel.addRow(new Object[]{ 
                    no,
                    rs.getString("kode_barang"),
                    rs.getString("nama_barang"),
                    rs.getString("spesifikasi"),
                    rs.getString("kategori"),
                    rs.getString("jumlah_brg"),
                    rs.getString("kondisi"),
                });
            }
        } catch (SQLException e) {
        }
    }
    public void tableDataBarangDashboard(Dashboard dashboard){
        try {
            Statement stat = (Statement)koneksi.connectDatabase().createStatement();
            String sql = "SELECT * from tbl_barang";
            ResultSet rs = stat.executeQuery(sql);
            DefaultTableModel tblModel;
            tblModel = (DefaultTableModel)dashboard.getjTblBarang().getModel();
            while(rs.next()){
                no = no + 1;
                tblModel.addRow(new Object[]{ 
                    no,
                    rs.getString("kode_barang"),
                    rs.getString("nama_barang"),
                    rs.getString("spesifikasi"),
                    rs.getString("kategori"),
                    rs.getString("jumlah_brg"),
                    rs.getString("kondisi"),
                });
            }
        } catch (SQLException e) {
        }
    }
    
}
