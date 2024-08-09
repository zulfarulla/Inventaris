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
import newpackage.main.java.com.Apps.View.MenuSideBar.Stok;
import newpackage.main.java.com.koneksi;

/**
 *
 * @author ZRF
 */
public class tbl_Stok {
    int no = 0;
    int totalBarang;
    public void tableDataStok(Stok stok){
        try {
            Statement stat = (Statement)koneksi.connectDatabase().createStatement();
            String sql = "SELECT * from tbl_stok";
            ResultSet rs = stat.executeQuery(sql);
            DefaultTableModel tblModel;
            tblModel = (DefaultTableModel)stok.getTblStok().getModel();
            while(rs.next()){
                int jumlahBarangmasuk = rs.getInt("jml_barangmasuk");
                int jumlahBarangkeluar = rs.getInt("jml_barangkeluar");
                totalBarang =  jumlahBarangmasuk - jumlahBarangkeluar;
                no = no + 1;
                tblModel.addRow(new Object[]{ 
                    no,
                    rs.getString("kode_barang"),
                    rs.getString("nama_barang"),
                    rs.getString("jml_barangmasuk"),
                    rs.getString("jml_barangkeluar"),
                    rs.getString("total_barang"),
                    totalBarang,
                });
            }
        } catch (SQLException e) {
        }
    } 
}
