    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage.main.java.com.Apps.Controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import newpackage.main.java.com.Apps.Controller.ControllerDatabase.CRUD.data_Barang;
import newpackage.main.java.com.Apps.Model.ModelPropertis;
import newpackage.main.java.com.koneksi;

/**
 *
 * @author ZRF
 */
public class ControllerNomerCode {
    data_Barang data = new data_Barang();
    ModelPropertis model = new ModelPropertis();
    /////////////////////////////////////////////////
    //NOMER CODE BARANG
    ////////////////////////////////////////////////
    public String generateKodeBarang(){
        String kodeTrakhir = null;
        String kodeBarang = null;
        int noTrakhir;
        int nomerBaru;
        
        try {
             String sql = "SELECT MAX(kode_barang) AS maxKode FROM tbl_barang";
             Connection conn = (Connection) koneksi.connectDatabase();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql);
             
             if (rs.next()){
                 kodeTrakhir = rs.getString("maxKode");
             }
             if (kodeTrakhir == null){
                 return "BR001";
             }
                  noTrakhir =  Integer.parseInt(kodeTrakhir.substring(2));
                  nomerBaru = noTrakhir + 1;
                  kodeBarang = "BR" + String.format("%03d", nomerBaru);
                  
        } catch (Exception e) {
        }
        return kodeBarang;
    }
    /////////////////////////////////////////////////
    //NOMER CODE BARANG MASUK
    ////////////////////////////////////////////////
    public String generateKodeBarangMasuk(){
        String kodeTrakhir = null;
        String kodeBarangM = null;
        int noTrakhir;
        int nomerBaru;
        
        try {
             String sql = "SELECT MAX(id_masukbarang) AS maxKode FROM tbl_masukbarang";
             Connection conn = (Connection) koneksi.connectDatabase();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql);
             
             if (rs.next()){
                 kodeTrakhir = rs.getString("maxKode");
             }
             if (kodeTrakhir == null){
                 return "BMSK001";
             }
                  noTrakhir =  Integer.parseInt(kodeTrakhir.substring(4));
                  nomerBaru = noTrakhir + 1;
                  kodeBarangM = "BMSK" + String.format("%03d", nomerBaru);
                  
        } catch (Exception e) {
        }
        return kodeBarangM;
    }
    /////////////////////////////////////////////////
    //NOMER CODE BARANG KELUAR
    ////////////////////////////////////////////////
    public String generateKodeBarangKeluar(){
        String kodeTrakhir = null;
        String kodeBarangK = null;
        int noTrakhir;
        int nomerBaru;

        try {
            String sql = "SELECT MAX(kode_keluar) AS maxKode FROM tbl_keluarbarang";
            Connection conn = (Connection) koneksi.connectDatabase();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()){
                kodeTrakhir = rs.getString("maxKode");
            }
            if (kodeTrakhir == null){
                return "BRK001";
            }
             noTrakhir =  Integer.parseInt(kodeTrakhir.substring(4));
             nomerBaru = noTrakhir + 1;
             kodeBarangK = "BRK" + String.format("%03d", nomerBaru);
            } catch (Exception e) {
            }
            return kodeBarangK;
        }
    /////////////////////////////////////////////////
    //NOMER CODE SUPPLIER
    ////////////////////////////////////////////////
    public String generateKodeSupplier(){
        String kodeTrakhir = null;
        String kodeSupplier = null;
        int noTrakhir;
        int nomerBaru;

        try {
            String sql = "SELECT MAX(kode_supplier) AS maxKode FROM tbl_supplier";
            Connection conn = (Connection) koneksi.connectDatabase();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()){
                kodeTrakhir = rs.getString("maxKode");
            }
            if (kodeTrakhir == null){
                return "SP001";
            }
             noTrakhir =  Integer.parseInt(kodeTrakhir.substring(2));
             nomerBaru = noTrakhir + 1;
             kodeSupplier = "SP" + String.format("%03d", nomerBaru);
            } catch (Exception e) {
            }
            return kodeSupplier;
        }
}
