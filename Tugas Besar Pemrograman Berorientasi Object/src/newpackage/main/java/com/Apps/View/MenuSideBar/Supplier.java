/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage.main.java.com.Apps.View.MenuSideBar;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;
import newpackage.main.java.com.Apps.Controller.ControllerDatabase.CRUD.data_Barang;
import newpackage.main.java.com.Apps.Controller.ControllerDatabase.tbl_supplier;
import newpackage.main.java.com.Apps.View.FromView.Form_EditSupplier;
import newpackage.main.java.com.Apps.View.FromView.Form_HapusSupplier;
import newpackage.main.java.com.Apps.View.FromView.Form_Supplier;
import rojerusan.RSMetroTextPlaceHolder;

/**
 *
 * @author ZRF
 */
public class Supplier extends javax.swing.JPanel {
    tbl_supplier tbl = new tbl_supplier();
    Form_EditSupplier formEdit = new Form_EditSupplier();
    Form_HapusSupplier formHapus = new Form_HapusSupplier();
    data_Barang data = new data_Barang();
    /**
     * Creates new form Supplier
     */
    public Supplier() {
        initComponents();
        tbl.tableDataSupplier(this);
        customizeTableHeader();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSupplier = new javax.swing.JTable();
        jPanel5 = new RoundedPanel(15);
        jLabel4 = new javax.swing.JLabel();
        jSrcBarang = new rojerusan.RSMetroTextPlaceHolder();
        rSMaterialButtonRectangle4 = new rojerusan.RSMaterialButtonRectangle();
        rSMaterialButtonRectangle1 = new rojerusan.RSMaterialButtonRectangle();
        rSMaterialButtonRectangle2 = new rojerusan.RSMaterialButtonRectangle();
        rSMaterialButtonRectangle3 = new rojerusan.RSMaterialButtonRectangle();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        tblSupplier.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblSupplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Kode Supplier", "Nama Supplier", "Alamat Supplier", "No Telepon Supplier", "Kota"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSupplier.setRowHeight(30);
        tblSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSupplierMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSupplier);
        if (tblSupplier.getColumnModel().getColumnCount() > 0) {
            tblSupplier.getColumnModel().getColumn(0).setMinWidth(30);
            tblSupplier.getColumnModel().getColumn(0).setMaxWidth(40);
        }

        jPanel5.setBackground(new java.awt.Color(0, 204, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Data Supplier");

        rSMaterialButtonRectangle4.setText("Cari");
        rSMaterialButtonRectangle4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSMaterialButtonRectangle4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 626, Short.MAX_VALUE)
                .addComponent(rSMaterialButtonRectangle4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSrcBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSrcBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSMaterialButtonRectangle4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        rSMaterialButtonRectangle1.setBackground(new java.awt.Color(0, 204, 102));
        rSMaterialButtonRectangle1.setText("Edit");
        rSMaterialButtonRectangle1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSMaterialButtonRectangle1MouseClicked(evt);
            }
        });

        rSMaterialButtonRectangle2.setBackground(new java.awt.Color(51, 153, 255));
        rSMaterialButtonRectangle2.setText("Tambah Supplier");
        rSMaterialButtonRectangle2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSMaterialButtonRectangle2MouseClicked(evt);
            }
        });

        rSMaterialButtonRectangle3.setBackground(new java.awt.Color(255, 51, 51));
        rSMaterialButtonRectangle3.setText("Hapus");
        rSMaterialButtonRectangle3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSMaterialButtonRectangle3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1125, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(rSMaterialButtonRectangle2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rSMaterialButtonRectangle1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rSMaterialButtonRectangle3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSMaterialButtonRectangle2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSMaterialButtonRectangle1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSMaterialButtonRectangle3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(305, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void rSMaterialButtonRectangle2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle2MouseClicked
       Form_Supplier form = new Form_Supplier();
       form.setVisible(true);
    }//GEN-LAST:event_rSMaterialButtonRectangle2MouseClicked

    private void tblSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSupplierMouseClicked
        int baris = tblSupplier.rowAtPoint(evt.getPoint());

        String kode_barang = tblSupplier.getValueAt(baris, 1).toString();
        String nama_supplier = tblSupplier.getValueAt(baris, 2).toString();
        String alamat = tblSupplier.getValueAt(baris, 3).toString();
        String telp = tblSupplier.getValueAt(baris, 4).toString();
        String kota = tblSupplier.getValueAt(baris, 5).toString();
       
        formEdit.getjTxtKodeSupplier().setText(kode_barang);
        formEdit.getjTxtNamaSupplier().setText(nama_supplier);
        formEdit.getjTxtAlamat().setText(alamat);
        formEdit.getjTxtTelp().setText(telp);
        formEdit.getjTxtKota().setText(kota);
        
        formHapus.getjTxtKodeSupplier().setText(kode_barang);
        formHapus.getjTxtNamaSupplier().setText(nama_supplier);
        formHapus.getjTxtAlamat().setText(alamat);
        formHapus.getjTxtTelp().setText(telp);
        formHapus.getjTxtKota().setText(kota);

    }//GEN-LAST:event_tblSupplierMouseClicked

    private void rSMaterialButtonRectangle1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle1MouseClicked
       formEdit.setVisible(true);
    }//GEN-LAST:event_rSMaterialButtonRectangle1MouseClicked

    private void rSMaterialButtonRectangle3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle3MouseClicked
        formHapus.setVisible(true);
    }//GEN-LAST:event_rSMaterialButtonRectangle3MouseClicked

    private void rSMaterialButtonRectangle4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle4MouseClicked
        data.searchignSupplier(this);
    }//GEN-LAST:event_rSMaterialButtonRectangle4MouseClicked

    public JTable getTblSupplier() {
        return tblSupplier;
    }

    public void setTblSupplier(JTable tblSupplier) {
        this.tblSupplier = tblSupplier;
    }
public class RoundedPanel extends JPanel {
    
    private int cornerRadius;

    public RoundedPanel(int cornerRadius) {
        this.cornerRadius = cornerRadius;
        setOpaque(false); // To make sure the panel is transparent and shows rounded corners
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Anti-aliasing for smoother edges
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Draw the rounded rectangle
        g2d.setColor(getBackground()); // Use the panel's background color
        g2d.fillRoundRect(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius);
    }

    public int getCornerRadius() {
        return cornerRadius;
    }

    public void setCornerRadius(int cornerRadius) {
        this.cornerRadius = cornerRadius;
        repaint(); // Repaint the panel to reflect the changes
    }
}
    private void customizeTableHeader() {
        // Ambil JTableHeader dari JTable
        JTableHeader tableHeader = tblSupplier.getTableHeader();
        
        // Buat font baru dengan ukuran yang diinginkan
        Font headerFont = new Font("Serif", Font.BOLD, 20); // Sesuaikan dengan kebutuhan
        
        // Set font ke header
        tableHeader.setFont(headerFont);
    }

    public RSMetroTextPlaceHolder getjSrcBarang() {
        return jSrcBarang;
    }

    public void setjSrcBarang(RSMetroTextPlaceHolder jSrcBarang) {
        this.jSrcBarang = jSrcBarang;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private rojerusan.RSMetroTextPlaceHolder jSrcBarang;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle1;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle2;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle3;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle4;
    private javax.swing.JTable tblSupplier;
    // End of variables declaration//GEN-END:variables
}
