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
import newpackage.main.java.com.Apps.View.MenuSideBar.BarangKeluar;
import newpackage.main.java.com.koneksi;

/**
 *
 * @author ZRF
 */
public class tbl_BarangKeluar {
    int no = 0;
    public void tableBarangKeluar(BarangKeluar barang){
        try {
            Statement stat = (Statement)koneksi.connectDatabase().createStatement();
            String sql = "SELECT * from tbl_keluarbarang";
            ResultSet rs = stat.executeQuery(sql);
            DefaultTableModel tblModel;
            tblModel = (DefaultTableModel)barang.getTblBarangKeluar().getModel();
            while(rs.next()){
                no = no + 1;
                tblModel.addRow(new Object[]{ 
                    no,
                    rs.getString("kode_keluar"),
                    rs.getString("kode_barang"),
                    rs.getString("nama_barang"),
                    rs.getString("tgl_keluar"),
                    rs.getString("penerima"),
                    rs.getString("jumlah_keluar"),
                });
            }
        } catch (SQLException e) {
        }
    }
}
