/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage.main.java.com.Apps.Model;


/**
 *
 * @author ZRF
 */
public class ModelPropertis {
    private int jml_barang;
    private int jml_stok;
    private int jml_barangmasuk;
    private int jml_barangkeluar;
    private int stok = 0;
    private int barangkeluar = 0;
    private int barangmasuk = 0;
    
    
    
    private String namaBarang;
    private String spesifikasi;
    private String lokasiBarang;
    private String kategori;
    private String kodisi;
    private String jenisBrang;
    private String sumberDana;
    private String kode;
    private String namaSupplier;
    private String tanggalMasuk;
    private String tanggalKeluar;
    private String namaPenerima;
    private String alamat;
    private String telp;
    private String kota;
    private String nama;
    private String id;
    private String passw;
    private String passlama;
    private String kode_keluar;

    public String getTanggalKeluar() {
        return tanggalKeluar;
    }

    public void setTanggalKeluar(String tanggalKeluar) {
        this.tanggalKeluar = tanggalKeluar;
    }

    public String getNamaPenerima() {
        return namaPenerima;
    }

    public void setNamaPenerima(String namaPenerima) {
        this.namaPenerima = namaPenerima;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassw() {
        return passw;
    }

    public void setPassw(String passw) {
        this.passw = passw;
    }
    
   
    public String getNamaSupplier() {
        return namaSupplier;
    }

    public void setNamaSupplier(String namaSupplier) {
        this.namaSupplier = namaSupplier;
    }
    public String getTanggalMasuk() {
        return tanggalMasuk;
    }

    public void setTanggalMasuk(String tanggalMasuk) {
        this.tanggalMasuk = tanggalMasuk;
    }

    public int getBarangkeluar() {
        return barangkeluar;
    }

    public void setBarangkeluar(int barangkeluar) {
        this.barangkeluar = barangkeluar;
    }

    public int getBarangmasuk() {
        return barangmasuk;
    }

    public void setBarangmasuk(int barangmasuk) {
        this.barangmasuk = barangmasuk;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getSpesifikasi() {
        return spesifikasi;
    }

    public void setSpesifikasi(String spesifikasi) {
        this.spesifikasi = spesifikasi;
    }

    public String getLokasiBarang() {
        return lokasiBarang;
    }

    public void setLokasiBarang(String lokasiBarang) {
        this.lokasiBarang = lokasiBarang;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getKodisi() {
        return kodisi;
    }

    public void setKodisi(String kodisi) {
        this.kodisi = kodisi;
    }

    public String getJenisBrang() {
        return jenisBrang;
    }

    public void setJenisBrang(String jenisBrang) {
        this.jenisBrang = jenisBrang;
    }

    public String getSumberDana() {
        return sumberDana;
    }

    public void setSumberDana(String sumberDana) {
        this.sumberDana = sumberDana;
    }
    

    public int getJml_barangmasuk() {
        return jml_barangmasuk;
    }

    public void setJml_barangmasuk(int jml_barangmasuk) {
        this.jml_barangmasuk = jml_barangmasuk;
    }

    public int getJml_barangkeluar() {
        return jml_barangkeluar;
    }

    public void setJml_barangkeluar(int jml_barangkeluar) {
        this.jml_barangkeluar = jml_barangkeluar;
    }
    public int getJml_stok() {
        return jml_stok;
    }

    public void setJml_stok(int jml_stok) {
        this.jml_stok = jml_stok;
    }
    public int getJml_barang() {
        return jml_barang;
    }

    public void setJml_barang(int jml_barang) {
        this.jml_barang = jml_barang;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPasslama() {
        return passlama;
    }

    public void setPasslama(String passlama) {
        this.passlama = passlama;
    }

    public String getKode_keluar() {
        return kode_keluar;
    }

    public void setKode_keluar(String kode_keluar) {
        this.kode_keluar = kode_keluar;
    }
    
    
    public void saveDataBarang(String namaBarang, String spesifikasi, String kategori,String kondisi){
        this.namaBarang = namaBarang;
        this.spesifikasi = spesifikasi;
        this.kategori = kategori;
        this.kodisi = kondisi;

    }
    public void saveDataBrangMasuk(String code_barang,String nama_barang,String nama_supplier, int JumlahMasuk, String tanggalMasuk){
        this.kode = code_barang;
        this.namaBarang = nama_barang;
        this.namaSupplier = nama_supplier;
        this.jml_barangmasuk = JumlahMasuk;
        this.tanggalMasuk = tanggalMasuk;
        
    }
    public void saveBarangKeluar(String kode_keluar,String nama_barang, String nama_penerima, int jumlah_keluar, String tanggal){
        this.kode_keluar = kode_keluar;
        this.namaBarang = nama_barang;
        this.namaPenerima = nama_penerima;
        this.jml_barangkeluar = jumlah_keluar;
        this.tanggalKeluar = tanggal;
    }
    public void saveSupplier(String kodesupplier,String namaSupplier, String alamat,String telp,String kota){
        this.kode = kodesupplier;
        this.namaSupplier = namaSupplier;
        this.alamat = alamat;
        this.telp = telp;
        this.kota = kota;
    }
    public void SrcBarang (String nama){
        this.nama = nama;
    }
    public void gantiPass(String id, String passw,String passwlama){
        this.id = id;
        this.passw = passw;
        this.passlama = passwlama;
    }

    
}
