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
import newpackage.main.java.com.Apps.View.MenuSideBar.Supplier;
import newpackage.main.java.com.koneksi;

/**
 *
 * @author ZRF
 */
public class tbl_supplier {
    int no = 0;
    public void tableDataSupplier(Supplier supplier){
        try {
            Statement stat = (Statement)koneksi.connectDatabase().createStatement();
            String sql = "SELECT * from tbl_supplier";
            ResultSet rs = stat.executeQuery(sql);
            DefaultTableModel tblModel;
            tblModel = (DefaultTableModel)supplier.getTblSupplier().getModel();
            while(rs.next()){
                no = no + 1;
                tblModel.addRow(new Object[]{ 
                    no,
                    rs.getString("kode_supplier"),
                    rs.getString("nama_supplier"),
                    rs.getString("alamat_supplier"),
                    rs.getString("telp_supplier"),
                    rs.getString("kota_supplier"),
                });
            }
        } catch (SQLException e) {
        }
    }
}
