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
import newpackage.main.java.com.Apps.View.MenuSideBar.BarangMasuk;
import newpackage.main.java.com.koneksi;

/**
 *
 * @author ZRF
 */
public class tbl_BarangMasuk {
    int no = 0;
    public void tableBarangKeluar(BarangMasuk barang){
        try {
            Statement stat = (Statement)koneksi.connectDatabase().createStatement();
            String sql = "SELECT * from tbl_masukbarang";
            ResultSet rs = stat.executeQuery(sql);
            DefaultTableModel tblModel;
            tblModel = (DefaultTableModel)barang.getTblBarangMasuk().getModel();
            while(rs.next()){
                no = no + 1;
                tblModel.addRow(new Object[]{ 
                    no,
                    rs.getString("id_masukbarang"),
                    rs.getString("kode_barang"),
                    rs.getString("nama_barang"),
                    rs.getString("tgl_masuk"),
                    rs.getString("jumlah_masuk"),
                    rs.getString("kode_supplier"),
                });
            }
        } catch (SQLException e) {
        }
    }
}
