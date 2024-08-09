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
import java.time.LocalDate;
import java.util.HashSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import newpackage.main.java.com.Apps.Model.ModelPropertis;
import newpackage.main.java.com.Apps.View.FromView.Form_BarangKeluarV2;
import newpackage.main.java.com.Apps.View.FromView.Form_BarangMasukV2;
import newpackage.main.java.com.Apps.View.FromView.Form_EditDataBarangV2;
import newpackage.main.java.com.Apps.View.FromView.Form_EditSupplier;
import newpackage.main.java.com.Apps.View.FromView.Form_HapusBarang;
import newpackage.main.java.com.Apps.View.FromView.Form_HapusSupplier;
import newpackage.main.java.com.Apps.View.FromView.Form_Supplier;
import newpackage.main.java.com.Apps.View.FromView.Form_TambahBarangBaruV2;
import newpackage.main.java.com.Apps.View.MenuSideBar.Barang;
import newpackage.main.java.com.Apps.View.MenuSideBar.BarangKeluar;
import newpackage.main.java.com.Apps.View.MenuSideBar.BarangMasuk;
import newpackage.main.java.com.Apps.View.MenuSideBar.Stok;
import newpackage.main.java.com.Apps.View.MenuSideBar.Supplier;
import newpackage.main.java.com.koneksi;

/**
 *
 * @author ZRF
 */
public class data_Barang {
    ModelPropertis model = new ModelPropertis();
    /////////////////////////////////////////////
    //MEMBUAT yyyy-MM-dd
    /////////////////////////////////////////////
    public String time(){
        LocalDate time = LocalDate.now();
        String dateNow;
        return dateNow = String.valueOf(time);
    }
    /////////////////////////////////////////////
    //MENGHTIUNG DATA BARANG
    /////////////////////////////////////////////
    public int hitungJumlahBarang() {
        try {
            String sql = "SELECT COUNT(*) AS total FROM tbl_barang";
            Connection conn = koneksi.connectDatabase();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()) {
                model.setJml_barang(rs.getInt("total"));
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
    return model.getJml_barang();
    }
    /////////////////////////////////////////////
    //MENGHTIUNG DATA BARANG KELUAR
    /////////////////////////////////////////////
    public int hitungBarangKeluar() {
        try {
            String sql = "SELECT COUNT(*) AS total FROM tbl_keluarbarang";
            Connection conn = koneksi.connectDatabase();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()) {
                model.setJml_barang(rs.getInt("total"));
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
    return model.getJml_barang();
    }
    /////////////////////////////////////////////
    //MENGHTIUNG DATA BARANG MASUK
    /////////////////////////////////////////////
    public int hitungBarangMasuk() {
        try {
            String sql = "SELECT COUNT(*) AS total FROM tbl_masukbarang";
            Connection conn = koneksi.connectDatabase();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()) {
                model.setJml_barang(rs.getInt("total"));
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
    return model.getJml_barang();
    }
    /////////////////////////////////////////////
    //MENGHITUNG STOK BARANG
    /////////////////////////////////////////////
    public int hitungJumlahStok(){
        int total = 0;
        try {
            Statement stat = (Statement)koneksi.connectDatabase().createStatement();
            String sql = "SELECT * from tbl_stok";
            ResultSet rs = stat.executeQuery(sql);
            while(rs.next()){
                int jml_barangMasuk = rs.getInt("jml_barangmasuk");
                int jml_barangKeluar = rs.getInt("jml_barangkeluar");
                int jml_stok = jml_barangMasuk - jml_barangKeluar;
                total = total + jml_stok;
            }
        model.setJml_stok(total);
        }
        catch (SQLException e){
        }return model.getJml_stok();
    }
    /////////////////////////////////////////////
    //MENGHITUNG JUMLAH BARANG MASUK
    /////////////////////////////////////////////
    public int hitungJumlahBarangMasuk(){
        int total = 0;
        try {
            Statement stat = (Statement)koneksi.connectDatabase().createStatement();
            String sql = "SELECT * from tbl_stok";
            ResultSet rs = stat.executeQuery(sql);
            while(rs.next()){
                int jml_barangMasuk = rs.getInt("jml_barangmasuk");
                total = total + jml_barangMasuk;
            }
        model.setJml_barangmasuk(total);
        }
        catch (SQLException e){
        }return model.getJml_barangmasuk();
    }
    //MENGHITUNG STOK BARANG
    public int hitungJumlahBarangKeluar(){
        int total = 0;
        try {
            Statement stat = (Statement)koneksi.connectDatabase().createStatement();
            String sql = "SELECT * from tbl_stok";
            ResultSet rs = stat.executeQuery(sql);
            while(rs.next()){
                int jml_barangKeluar = rs.getInt("jml_barangkeluar");
                total = total + jml_barangKeluar;
            }
        model.setJml_barangkeluar(total);
        }
        catch (SQLException e){
        }return model.getJml_barangkeluar();
    }
    /////////////////////////////////////////////
    //INPUT BARANG BARU
    /////////////////////////////////////////////
    public void tambahBarang(Form_TambahBarangBaruV2 tambahBarang){
        String nama_barang = tambahBarang.getjTxtNamaBarang().getText();
        String spesifikasi = tambahBarang.getjTxtSpesifikasi().getText();
        String kategori = tambahBarang.getjCmbKategori().getSelectedItem().toString();
        String kondisi = tambahBarang.getjCmbKondisi().getSelectedItem().toString();


        if (nama_barang.trim().equals("Masukan Nama Barang")){
            JOptionPane.showMessageDialog(null, "Nama Barang tidak boleh kosong");
        }else if (spesifikasi.trim().equals("Masukan Spesifikasi Barang")){
            JOptionPane.showMessageDialog(null, "Spesifikasi tidak boleh kosong");
        }
        else{
            model.saveDataBarang(nama_barang, spesifikasi, kategori, kondisi);
            //MENGIRIM DATA KE DATABASE TABEL BARANG
            try {
                String sql = "INSERT INTO tbl_barang VALUES('"+tambahBarang.getjTxtKode().getText()+"','"
                        +model.getNamaBarang()+"','"+model.getSpesifikasi()+"','"+model.getKategori()+"','"
                        +model.getJml_barang()+"','"+model.getKodisi()+"')";
                Connection conn = (Connection)koneksi.connectDatabase();
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.execute();
            }catch ( SQLException ex) {
                JOptionPane.showMessageDialog(null, "Gagal "+ex);
            }
           //MENGIRIM DATA KE DATABASE TABEL STOK
            try {
                String sql = "INSERT INTO tbl_stok VALUES('"+tambahBarang.getjTxtKode().getText()+"','"
                        +model.getNamaBarang()+"','"+model.getStok()+"','"+model.getBarangkeluar()+"','"+(model.getStok()-model.getBarangkeluar())+"')";
                Connection conn = (Connection)koneksi.connectDatabase();
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.execute();
            }catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Gagal "+ex);
            }
            JOptionPane.showMessageDialog(null, "Berhasil Menambah Data Barang");
            tambahBarang.setVisible(false);
        }
    }
    ///////////////////////////////////////////////////
    //INPUT DATA BARANG MASUK
    ///////////////////////////////////////////////////
    public void inputBarangMasuk(Form_BarangMasukV2 form) {
        String kode_barangMasuk = form.getjTxtKodeBrgMasuk().getText();
        String nama_barang = form.getjCmbNamaBarang().getSelectedItem().toString();
        String nama_supplier = form.getjCmbSupplier().getSelectedItem().toString();
        String jumlah_masuk = form.getJTxtJumlahMasuk().getText();
        String tanggal_masuk = form.getjTxtTanggalMasuk().getText();
        String kode_supplier = null;
        String kode_barang = null;
        int jmlBarangmasuk = 0;
        int jmlBarangkeluar = 0;

        // Validasi input jumlah masuk
        if (nama_barang.trim().equals("Pilih Barang")) {
            JOptionPane.showMessageDialog(null, "Silahkan Pilih Barang");
            return;
        }else if (nama_supplier.trim().equals("Pilih Supplier")){
            JOptionPane.showMessageDialog(null, "Silahkan Pilih Supplier");
        }else if(jumlah_masuk.trim().equals("Masukan Jumlah")){
            JOptionPane.showMessageDialog(null, "Silahkan Masukan Jumlah");
        }else
            // Simpan data barang masuk
            model.saveDataBrangMasuk(kode_barangMasuk, nama_barang, nama_supplier, Integer.valueOf(jumlah_masuk), tanggal_masuk);

            // Mendapatkan kode supplier
            try {
                String sqlSupplier = "SELECT kode_supplier FROM tbl_supplier WHERE nama_supplier = ?";
                Connection conn = koneksi.connectDatabase();
                PreparedStatement stSupplier = conn.prepareStatement(sqlSupplier);

                stSupplier.setString(1, model.getNamaSupplier());

                ResultSet rsSupplier = stSupplier.executeQuery();
                if (rsSupplier.next()) {
                    kode_supplier = rsSupplier.getString("kode_supplier");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Gagal Mendapatkan Kode supplier: " + e.getMessage());
                return;
            }

            // Mendapatkan kode barang
            try {
                String sqlBarang = "SELECT kode_barang FROM tbl_barang WHERE nama_barang = ?";
                Connection conn = koneksi.connectDatabase();
                PreparedStatement stBarang = conn.prepareStatement(sqlBarang);
                stBarang.setString(1, model.getNamaBarang());
                ResultSet rsBarang = stBarang.executeQuery();
                if (rsBarang.next()) {
                    kode_barang = rsBarang.getString("kode_barang");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Gagal Mendapatkan kode barang: " + e.getMessage());
                return;
            }

            // Menyimpan data barang masuk ke tabel
            try {
                String sqlInsert = "INSERT INTO tbl_masukbarang (id_masukbarang, kode_barang, nama_barang, tgl_masuk, jumlah_masuk, kode_supplier) VALUES (?, ?, ?, ?, ?, ?)";
                Connection conn = koneksi.connectDatabase();
                PreparedStatement stInsert = conn.prepareStatement(sqlInsert);

                stInsert.setString(1, model.getKode());
                stInsert.setString(2, kode_barang);
                stInsert.setString(3, model.getNamaBarang());
                stInsert.setString(4, model.getTanggalMasuk());
                stInsert.setInt(5, Integer.valueOf(jumlah_masuk));
                stInsert.setString(6, kode_supplier);

                stInsert.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data barang masuk berhasil disimpan");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Mohon Masukan Data Dengan Benar");
            }
            // Mendapatkan Jumlah Barang Sebelumnya
            try {
                String sqlBarang = "SELECT jml_barangmasuk,jml_barangkeluar FROM tbl_stok WHERE nama_barang = ?";
                Connection conn = koneksi.connectDatabase();
                PreparedStatement st = conn.prepareStatement(sqlBarang);
                st.setString(1, model.getNamaBarang());
                ResultSet rs = st.executeQuery();
                if (rs.next()) {
                    jmlBarangkeluar = rs.getInt("jml_barangkeluar");
                    jmlBarangmasuk = rs.getInt("jml_barangmasuk");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Gagal Mendapatkan : " + e.getMessage());
                return;
            }
            int total = jmlBarangmasuk + Integer.valueOf(jumlah_masuk);
            //UPDATE JUMLAH STOK
            try {
                String sql = "UPDATE tbl_stok SET jml_barangmasuk = ? , total_barang = ? WHERE nama_barang = ?";
                Connection conn = (Connection) koneksi.connectDatabase();
                PreparedStatement st = conn.prepareStatement(sql);

                st.setInt(1, total);
                st.setInt(2, total);
                st.setString(3, model.getNamaBarang());

                st.executeUpdate();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "ERROR " +e);
            }
            //UPDATE JUMLAH STOK DI TABEL BARANG
            int totalStok = (Integer.valueOf(jumlah_masuk) + jmlBarangmasuk )- jmlBarangkeluar;
            try {
                String sql = "UPDATE tbl_barang SET jumlah_brg = ? WHERE nama_barang = ?";
                Connection conn = (Connection) koneksi.connectDatabase();
                PreparedStatement st = conn.prepareStatement(sql);

                st.setInt(1, totalStok);
                st.setString(2, model.getNamaBarang());


                st.executeUpdate();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "ERROR " +e);
            }
            form.setVisible(false);

        
    }
    ////////////////////////////////////////////////////
    //INPUT BARANG KELUAR
    ////////////////////////////////////////////////////
    public void inputBarangKeluar(Form_BarangKeluarV2 form) {
        String kode_keluar = form.getjTxtKodeBrgKeluar().getText();
        String nama_barang = form.getjCmbNamaBarang().getSelectedItem().toString();
        String nama_penerima = form.getJTxtNamaPenerima().getText();
        String jml_keluar = form.getJTxtJumlahKeluar().getText();
        String tanggal = form.getjTxtTanggaKeluar().getText();
        String kode_barang = null;
        
        int totalbarang = 0;
        int jumlahBarangmasuk = 0;
        int jumlahBarangkeluar = 0;
        int totalStok = 0;
        
        if (nama_penerima.trim().equals("Masukan Nama Penerima")){
            JOptionPane.showMessageDialog(null, "Nama Penerima tidak boleh kosong");
        }else if (jml_keluar.trim().equals("Masukan Jumlah")){
            JOptionPane.showMessageDialog(null, "Jumlah Keluar tidak boleh kosong");
        }else if(nama_barang.trim().equals("Pilih Barang")){
            JOptionPane.showMessageDialog(null, "Silahkan Pilih Nama Barang");
        }else
            model.saveBarangKeluar(kode_keluar, nama_barang, nama_penerima, Integer.parseInt(jml_keluar), tanggal);
            try (Connection conn = (Connection) koneksi.connectDatabase()) {
                // Ambil total_barang dari tbl_stok
                String sql = "SELECT total_barang FROM tbl_stok WHERE nama_barang = ?";
                try (PreparedStatement st = conn.prepareStatement(sql)) {
                    st.setString(1, model.getNamaBarang());
                    try (ResultSet rs = st.executeQuery()) {
                        if (rs.next()) {
                            totalbarang = rs.getInt("total_barang");
                        }
                    }
                }

            // Ambil kode_barang dari tbl_barang
            sql = "SELECT kode_barang FROM tbl_barang WHERE nama_barang = ?";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                st.setString(1, model.getNamaBarang());
                try (ResultSet rs = st.executeQuery()) {
                    if (rs.next()) {
                        kode_barang = rs.getString("kode_barang");
                    }
                }
            }
                // Ambil jumlah barang masuk dan keluar dari tbl_stok
                    sql = "SELECT jml_barangmasuk, jml_barangkeluar FROM tbl_stok WHERE nama_barang = ?";
                    try (PreparedStatement st = conn.prepareStatement(sql)) {
                        st.setString(1, model.getNamaBarang());
                        try (ResultSet rs = st.executeQuery()) {
                            if (rs.next()) {
                                jumlahBarangmasuk = rs.getInt("jml_barangmasuk");
                                jumlahBarangkeluar = rs.getInt("jml_barangkeluar");
                                totalStok = jumlahBarangmasuk-jumlahBarangkeluar;
                            }
                        }
                    }

            // Cek stok barang
            if (Integer.parseInt(jml_keluar) > totalStok) {
                JOptionPane.showMessageDialog(null, "STOK TIDAK CUKUP");
            }else
                // Insert ke tbl_keluarbarang
                    sql = "INSERT INTO tbl_keluarbarang (kode_keluar, kode_barang, nama_barang, tgl_keluar, penerima, jumlah_keluar) VALUES (?, ?, ?, ?, ?, ?)";
                    try (PreparedStatement st = conn.prepareStatement(sql)) {
                        st.setString(1, model.getKode_keluar());
                        st.setString(2, kode_barang);
                        st.setString(3, model.getNamaBarang());
                        st.setString(4, tanggal);
                        st.setString(5, nama_penerima);
                        st.setInt(6, Integer.parseInt(jml_keluar));
                        st.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Data Berhasil DiTambah");
                    }



                    // Update jumlah barang keluar di tbl_stok
                    int totalBarangKeluar = jumlahBarangkeluar + Integer.parseInt(jml_keluar);
                    sql = "UPDATE tbl_stok SET jml_barangkeluar = ? WHERE nama_barang = ?";
                    try (PreparedStatement st = conn.prepareStatement(sql)) {
                        st.setInt(1, totalBarangKeluar);
                        st.setString(2, model.getNamaBarang());
                        st.executeUpdate();
                    }

                    // Update total stok di tbl_barang
                    totalStok = jumlahBarangmasuk - totalBarangKeluar;
                    sql = "UPDATE tbl_barang SET jumlah_brg = ? WHERE nama_barang = ?";
                    try (PreparedStatement st = conn.prepareStatement(sql)) {
                        st.setInt(1, totalStok);
                        st.setString(2, model.getNamaBarang());
                        st.executeUpdate();
                    }
                    form.setVisible(false);
                } catch (Exception e) {
                }
}
    ////////////////////////////////////////////////////
    //INPUT SUPPLIER
    ////////////////////////////////////////////////////
    public void InputSupplier(Form_Supplier form){
        String kodeSupplier = form.getjTxtKodeSupplier().getText();
        String namaSupplier = form.getjTxtNamaSupplier().getText();
        String alamat = form.getjTxtAlamat().getText();
        String telp = form.getjTxtTelp().getText();
        String kota = form.getjTxtKota().getText();
        
        if (namaSupplier.trim().equals("Masukan Nama")){
            JOptionPane.showMessageDialog(null, "Nama Supplier  tidak boleh kosong");
        }else if (alamat.trim().equals("Masukan Alamat")){
            JOptionPane.showMessageDialog(null, "Alamat tidak boleh kosong");
        }else if (telp.trim().equals("Masukan Telepon")){
            JOptionPane.showMessageDialog(null, "Telp tidak boleh kosong");
        }else if (kota.trim().equals("Masukan Kota")){
            JOptionPane.showMessageDialog(null, "Kota tidak boleh kosong");
        }else
            model.saveSupplier(kodeSupplier, namaSupplier, alamat, telp, kota);
            try {
                String sql = "INSERT INTO tbl_supplier VALUES (?,?,?,?,?)";
                Connection conn = (Connection) koneksi.connectDatabase();
                PreparedStatement st = conn.prepareStatement(sql);

                st.setString(1, model.getKode());
                st.setString(2, model.getNamaSupplier());
                st.setString(3, model.getAlamat());
                st.setString(4, model.getTelp());
                st.setString(5, model.getKota());
                st.execute();

                JOptionPane.showMessageDialog(null, "DATA SUPPLIER BERHASIL DI TAMBAH");
                form.setVisible(false);
            } catch (SQLException e) {
            }
    }
    ////////////////////////////////////////////////////
    //EDIT DATA SUPPLIER
    ////////////////////////////////////////////////////
    public void ediiDataSupplier(Form_EditSupplier form){
        String kodeSupplier = form.getjTxtKodeSupplier().getText();
        String namaSupplier = form.getjTxtNamaSupplier().getText();
        String alamat = form.getjTxtAlamat().getText();
        String telp = form.getjTxtTelp().getText();
        String kota = form.getjTxtKota().getText();
        
        model.saveSupplier(kodeSupplier, namaSupplier, alamat, telp, kota);
        try {
            String sql = "UPDATE tbl_supplier SET kode_supplier = ?, nama_supplier = ? , alamat_supplier = ?, "
                    + "telp_supplier = ?, kota_supplier = ? WHERE kode_supplier = ?";
            Connection conn = (Connection) koneksi.connectDatabase();
            PreparedStatement st = conn.prepareStatement(sql);
            
            st.setString(1, model.getKode());
            st.setString(2, model.getNamaSupplier());
            st.setString(3, model.getAlamat());
            st.setString(4, model.getTelp());
            st.setString(5, model.getKota());
            st.setString(6, model.getKode());
            
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "BERHASIL DI EDIT");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "GAGAL EDIT :" +e);
        }
    }
    ////////////////////////////////////////////////////
    //EDIT DATA BARANG
    ////////////////////////////////////////////////////
    public void edtiDataBarang(Form_EditDataBarangV2 edit){
        String nama_barang = edit.getjTxtNamaBarang().getText();
        String kode_barang = edit.getjTxtKode().getText();
        String spesifikasi = edit.getjTxtSpesifikasi().getText();
        String kategori = edit.getjCmbKategori().getSelectedItem().toString();
        String kondisi = edit.getjCmbKondisi().getSelectedItem().toString();

        
        model.saveDataBarang(nama_barang, spesifikasi, kategori, kondisi);
        try {
            String sql = "UPDATE tbl_barang SET kode_barang = ? ,nama_barang = ?, spesifikasi = ?,"
                    + "kategori = ?,kondisi = ?  WHERE kode_barang = ?";
            Connection conn = (Connection) koneksi.connectDatabase();
            PreparedStatement st = conn.prepareStatement(sql);
            
            st.setString(1, kode_barang);
            st.setString(2, model.getNamaBarang());
            st.setString(3, model.getSpesifikasi());
            st.setString(4, model.getKategori());
            st.setString(5, model.getKodisi());
            st.setString(6, kode_barang);

            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Barang Berhasil Di Update");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR :" +e);
        }
        try {
            String sql = "UPDATE tbl_stok SET kode_barang  = ? ,nama_barang = ? WHERE kode_barang = ?";
            Connection conn = (Connection)koneksi.connectDatabase();
            PreparedStatement st = conn.prepareStatement(sql);
            
            st.setString(1, kode_barang);
            st.setString(2, model.getNamaBarang());
            st.setString(3, kode_barang);
            
            st.executeUpdate();
        } catch (SQLException e) {
        }
        try {
            String sql = "UPDATE tbl_keluarbarang SET kode_barang  = ? ,nama_barang = ? WHERE kode_barang = ?";
            Connection conn = (Connection)koneksi.connectDatabase();
            PreparedStatement st = conn.prepareStatement(sql);
            
            st.setString(1, kode_barang);
            st.setString(2, model.getNamaBarang());
            st.setString(3, kode_barang);
            
            st.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR :" +e);
        }
        try {
            String sql = "UPDATE tbl_masukbarang SET kode_barang  = ? ,nama_barang = ? WHERE kode_barang = ?";
            Connection conn = (Connection)koneksi.connectDatabase();
            PreparedStatement st = conn.prepareStatement(sql);
            
            st.setString(1, kode_barang);
            st.setString(2, model.getNamaBarang());
            st.setString(3, kode_barang);
            
            st.executeUpdate();
            edit.setVisible(false);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR :" +e);
        }
        
    }
    ///////////////////////////////////////////////////
    //HAPUS DATA SUPPLIER
    ///////////////////////////////////////////////////
    public void HapusSupplier(Form_HapusSupplier form){
        String kodeSupplier = form.getjTxtKodeSupplier().getText();
        String namaSupplier = form.getjTxtNamaSupplier().getText();
        String alamat = form.getjTxtAlamat().getText();
        String telp = form.getjTxtTelp().getText();
        String kota = form.getjTxtKota().getText();
        
        model.saveSupplier(kodeSupplier, namaSupplier, alamat, telp, kota);
        
        int isCheck = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin menghapusnya?","Menghapus Data Barang", JOptionPane.YES_NO_OPTION);
        switch(isCheck){
            case JOptionPane.YES_OPTION:
                //DELETE DATA SUPPLIER 
                try {
                    String sql = "DELETE FROM tbl_supplier WHERE kode_supplier = ?";
                    Connection conn = (Connection) koneksi.connectDatabase();
                    PreparedStatement st = conn.prepareStatement(sql);
                    
                    st.setString(1, model.getKode());
                    
                    st.execute();
                } catch (SQLException e) {
                    JOptionPane.showConfirmDialog(null, "ERROR " +e);
                }
                //DELETE DATA MASUK BARANG
                try {
                    String sql = "DELETE FROM tbl_masukbarang WHERE kode_supplier = ?";
                    Connection conn = (Connection) koneksi.connectDatabase();
                    PreparedStatement st = conn.prepareStatement(sql);
                    
                    st.setString(1, model.getKode());
                    
                    st.execute();
                 JOptionPane.showMessageDialog(null, "HAPUS BERHASIL");
                } catch (SQLException e) {
                    JOptionPane.showConfirmDialog(null, "ERROR " +e);
                }
                break;
            case JOptionPane.NO_OPTION:
                break;
        }
    }
    ////////////////////////////////////////////
    //DELET DATA BARANG
    ////////////////////////////////////////////
    public void deletDataBarang(Form_HapusBarang hapus){
        String kode = hapus.getjTxtKode2().getText();
        String namaBarang = hapus.getjTxtNamaBarang2().getText();
        String spesifikasi = hapus.getjTxtSpesifikasi2().getText();
        
        int isCheck = 0;
        
        if(namaBarang.trim().equals("")){
            JOptionPane.showMessageDialog(null, "Barang Tidak Ada Yang di Pilih");
        }else if (spesifikasi.trim().equals("")){
            JOptionPane.showMessageDialog(null, "Barang Tidak Ada Yang di Pilih");
        }else
            isCheck = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin menghapusnya?","Menghapus Data Barang", JOptionPane.YES_NO_OPTION);
            switch(isCheck){
                case JOptionPane.YES_OPTION:
                    try {
                        String sql="DELETE FROM tbl_barang WHERE kode_barang = ?";
                        Connection conn = (Connection)koneksi.connectDatabase();
                        PreparedStatement st = conn.prepareStatement(sql);

                        st.setString(1, kode);
                        st.execute();
                        JOptionPane.showMessageDialog(null, "Berhasil Menghapus");
                        hapus.setVisible(false);
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "ERROR :" +e);
                    }
                    try {
                        String sql="DELETE FROM tbl_stok WHERE kode_barang = ?";
                        Connection conn = (Connection)koneksi.connectDatabase();
                        PreparedStatement st = conn.prepareStatement(sql);

                        st.setString(1, kode);
                        st.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showConfirmDialog(null, "ERROR " +e);
                    }
                    try {
                        String sql="DELETE FROM tbl_masukbarang WHERE kode_barang = ?";
                        Connection conn = (Connection)koneksi.connectDatabase();
                        PreparedStatement st = conn.prepareStatement(sql);

                        st.setString(1, kode);
                        st.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showConfirmDialog(null, "ERROR " +e);
                    }
                    try {
                        String sql="DELETE FROM tbl_keluarbarang WHERE kode_barang = ?";
                        Connection conn = (Connection)koneksi.connectDatabase();
                        PreparedStatement st = conn.prepareStatement(sql);

                        st.setString(1, kode);
                        st.executeUpdate();

                    } catch (SQLException e) {
                        JOptionPane.showConfirmDialog(null, "ERROR " +e);
                    }

                    break;
                case JOptionPane.NO_OPTION:
                    break;
            }
    }

    ///////////////////////////////////////////
    //COMBOBOX UNTUK PILIHAN NAMA BARANG SESUAI TABLE DATABASE 
    ///////////////////////////////////////////
    public void cmbboxbarang(Form_BarangMasukV2 form){
        try {
            String sql = "SELECT nama_barang FROM tbl_barang";
            Connection conn = koneksi.connectDatabase();
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
            model.addElement("Pilih Barang");            
            while(rs.next()){
                String namaBarang = rs.getString("nama_barang");

                model.addElement(namaBarang);
            }
            form.getjCmbNamaBarang().setModel(model);
        } catch (Exception e) {
        }
    }

    ///////////////////////////////////////////
    //COMBOBOX UNTUK PILIHAN NAMA SUPPLIER SESUAI TABLE DATABASE
    ///////////////////////////////////////////
    public void cmbboxsupplier(Form_BarangMasukV2 form){
        try {
            String sql = "SELECT nama_supplier FROM tbl_supplier";
            Connection conn = koneksi.connectDatabase();
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
            model.addElement("Pilih Supplier");            
            while(rs.next()){
                String namaBarang = rs.getString("nama_supplier");

                model.addElement(namaBarang);
            }
            form.getjCmbSupplier().setModel(model);
        } catch (Exception e) {
        }
    }
    //////////////////////////////////////////////////////////////////////////////////
    //COMBOBOX UNTUK PILIHAN NAMA BARANG SESUAI TABLE DATABASE NAMYN DATA TIDAK BOLEH SAMA
    /////////////////////////////////////////////////////////////////////////////////////
    public void cmbboxnamaBarangUniqItem(Form_BarangKeluarV2 form){
        try {
            String sql = "SELECT nama_barang FROM tbl_masukbarang";
            Connection conn = koneksi.connectDatabase();
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            HashSet<String> item = new HashSet<>();       
            while(rs.next()){
                String namaBarang = rs.getString("nama_barang");
                if(!item.contains(namaBarang)){
                    item.add(namaBarang);
                    form.getjCmbNamaBarang().addItem(namaBarang);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, "ERROR " +e);
        }
    }
    /////////////////////////////////////////////////////
    //SEARCHING
    /////////////////////////////////////////////////////
    public void searchignBarang(Barang barang) {
        String nama = barang.getjSrcBarang().getText();
        model.SrcBarang(nama);
        int no = 0;
        DefaultTableModel tblModel = (DefaultTableModel) barang.getTblDataBarang().getModel();
        tblModel.setRowCount(0); // Mengosongkan data yang ada di tabel

        try {
            String sql = "SELECT * FROM tbl_barang WHERE nama_barang LIKE ?";
            Connection conn = koneksi.connectDatabase();
            PreparedStatement pst = conn.prepareStatement(sql) ;

            pst.setString(1, model.getNama() + "%");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                no = no + 1;
                tblModel.addRow(new Object[]{
                    no,
                    rs.getString("kode_barang"),
                    rs.getString("nama_barang"),
                    rs.getString("spesifikasi"),
                    rs.getString("kategori"),
                    rs.getInt("jumlah_brg"),
                    rs.getString("kondisi")
                });
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal Melakukan Pencarian");
        }
    }
    public void searchignBarangMasuk(BarangMasuk barang) {
        String nama = barang.getjSrcBarang().getText();
        model.SrcBarang(nama);
        int no = 0;
        DefaultTableModel tblModel = (DefaultTableModel) barang.getTblBarangMasuk().getModel();
        tblModel.setRowCount(0); // Mengosongkan data yang ada di tabel

        try {
            String sql = "SELECT * FROM tbl_masukbarang WHERE nama_barang LIKE ?";
            Connection conn = koneksi.connectDatabase();
            PreparedStatement pst = conn.prepareStatement(sql) ;

            pst.setString(1, model.getNama() + "%");
            ResultSet rs = pst.executeQuery();

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
            JOptionPane.showMessageDialog(null, "Gagal Melakukan Pencarian");
        }
    }
    public void searchignBarangKeluar(BarangKeluar barang) {
        String nama = barang.getjSrcBarang().getText();
        model.SrcBarang(nama);
        int no = 0;
        DefaultTableModel tblModel = (DefaultTableModel) barang.getTblBarangKeluar().getModel();
        tblModel.setRowCount(0); // Mengosongkan data yang ada di tabel

        try {
            String sql = "SELECT * FROM tbl_keluarbarang WHERE nama_barang LIKE ?";
            Connection conn = koneksi.connectDatabase();
            PreparedStatement pst = conn.prepareStatement(sql) ;

            pst.setString(1, model.getNama() + "%");
            ResultSet rs = pst.executeQuery();

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
            JOptionPane.showMessageDialog(null, "Gagal Melakukan Pencarian");
        }
    }
    public void searchignStok(Stok stok) {
        String nama = stok.getjSrcBarang().getText();
        model.SrcBarang(nama);
        int no = 0;
        int totalBarang = 0;
        DefaultTableModel tblModel = (DefaultTableModel) stok.getTblStok().getModel();
        tblModel.setRowCount(0); // Mengosongkan data yang ada di tabel

        try {
            String sql = "SELECT * FROM tbl_stok WHERE nama_barang LIKE ?";
            Connection conn = koneksi.connectDatabase();
            PreparedStatement pst = conn.prepareStatement(sql) ;

            pst.setString(1, model.getNama() + "%");
            ResultSet rs = pst.executeQuery();

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
            JOptionPane.showMessageDialog(null, "Gagal Melakukan Pencarian");
        }
    }
    public void searchignSupplier(Supplier supplier) {
        String nama = supplier.getjSrcBarang().getText();
        model.SrcBarang(nama);
        int no = 0;
        int totalBarang = 0;
        DefaultTableModel tblModel = (DefaultTableModel) supplier.getTblSupplier().getModel();
        tblModel.setRowCount(0); // Mengosongkan data yang ada di tabel

        try {
            String sql = "SELECT * FROM tbl_supplier WHERE nama_supplier LIKE ?";
            Connection conn = koneksi.connectDatabase();
            PreparedStatement pst = conn.prepareStatement(sql) ;

            pst.setString(1, model.getNama() + "%");
            ResultSet rs = pst.executeQuery();

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
            JOptionPane.showMessageDialog(null, "Gagal Melakukan Pencarian");
        }
    }

}
 