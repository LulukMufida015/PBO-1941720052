/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
* @author Windows 10
 */
public final class FrmPeminjaman extends javax.swing.JFrame {

    /**
     * Creates new form FrmPeminjaman
     */
    public FrmPeminjaman() {
        initComponents();
        tampilkanData();
        kosongkanForm();
    }
    
    public boolean isValidDate(String inDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(inDate.trim());
        } catch (ParseException pe) {
            return false;
        }
        return true;
    }
    
    public void kosongkanForm(){
        txtPeminjaman.setText("0");
        txtIdBuku.setText("");
        txtIdAnggota.setText("");
        txtJudulBuku.setText("Judul Buku");
        txtNamaAnggota.setText("Nama Anggota");
        txtTanggalKembali.setText("");
        txtTanggalPinjam.setText("");
    }
    
    private Anggota cariAnggota(int idAnggota){
        Anggota ang = new Anggota().getById(idAnggota);
        if(ang != null){
            return ang;
        } 
       return null;
    }
    
    private Buku cariBuku(int idBuku){
        Buku buku = new Buku().getById(idBuku);
        if(buku != null){
            return buku;
        } 
       return null;
    }
    
    public final void tampilkanData(){ 
        String[] kolom = {"ID", "Nama", "Judul Buku", "Tanggal Pinjam", "Tanggal Kembali"};
        ArrayList<Peminjaman> pen = new Peminjaman().getAll();
        Object rowData[] = new Object[5];
        
        tblPeminjaman.setModel(new DefaultTableModel(new Object[][] {}, kolom));
        
        for (int i = 0; i < pen.size(); i++ ) {
            rowData[0] = pen.get(i).getIdPeminjaman();
            rowData[1] = pen.get(i).getAnggota().getNama();
            rowData[2] = pen.get(i).getBuku().getJudul();
            rowData[3] = pen.get(i).getTanggalPinjam();
            rowData[4] = pen.get(i).getTanggalKembali();
        
            ((DefaultTableModel)tblPeminjaman.getModel()).addRow(rowData);
        }
    }   
    
    
    private boolean checkInput(String tanggalPinjam, String tanggalKembali) {
        boolean res = true;

        if(tanggalPinjam.equals("") && tanggalKembali.equals("")){
            res = false;
        } else if(tanggalPinjam.equals("") ){
            res = false;
        } else if (tanggalKembali.equals("")) {
            res = false;
        } 
        return res;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtPeminjaman = new javax.swing.JTextField();
        txtIdAnggota = new javax.swing.JTextField();
        txtIdBuku = new javax.swing.JTextField();
        txtTanggalPinjam = new javax.swing.JTextField();
        txtTanggalKembali = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnCariAnggota = new javax.swing.JButton();
        btnCariBuku = new javax.swing.JButton();
        txtNamaAnggota = new javax.swing.JLabel();
        txtJudulBuku = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        btnTambahBaru = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPeminjaman = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setText("FORM PEMINJAMAN");

        txtPeminjaman.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Droid Sans", 1, 13)); // NOI18N
        jLabel2.setText("ID");

        jLabel3.setFont(new java.awt.Font("Droid Sans", 1, 13)); // NOI18N
        jLabel3.setText("ID Anggota");

        jLabel4.setFont(new java.awt.Font("Droid Sans", 1, 13)); // NOI18N
        jLabel4.setText("ID Buku");

        jLabel5.setFont(new java.awt.Font("Droid Sans", 1, 13)); // NOI18N
        jLabel5.setText("Tanggal Pinjam");

        jLabel6.setFont(new java.awt.Font("Droid Sans", 1, 13)); // NOI18N
        jLabel6.setText("Tanggal Kembali");

        btnCariAnggota.setText("Cari");
        btnCariAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariAnggotaActionPerformed(evt);
            }
        });

        btnCariBuku.setText("Cari");
        btnCariBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariBukuActionPerformed(evt);
            }
        });

        txtNamaAnggota.setText("Nama Anggota");

        txtJudulBuku.setText("Judul Buku");

        jLabel7.setFont(new java.awt.Font("Droid Sans", 1, 13)); // NOI18N
        jLabel7.setText("Format: YYYY/MM/DD");

        jLabel8.setFont(new java.awt.Font("Droid Sans", 1, 13)); // NOI18N
        jLabel8.setText("Format: YYYY/MM/DD");

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnTambahBaru.setText("Tambah Baru");
        btnTambahBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahBaruActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        tblPeminjaman.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblPeminjaman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPeminjamanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPeminjaman);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTambahBaru)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnHapus))
                            .addComponent(btnSimpan)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 26, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(47, 47, 47)
                                .addComponent(txtPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtIdAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnCariAnggota)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNamaAnggota))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtTanggalPinjam)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(txtIdBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(btnCariBuku))
                                                .addComponent(txtTanggalKembali))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtJudulBuku)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel8)))))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtIdAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCariAnggota)
                    .addComponent(txtNamaAnggota))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtIdBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCariBuku)
                    .addComponent(txtJudulBuku))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTanggalPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTanggalKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(btnSimpan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambahBaru)
                    .addComponent(btnHapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCariAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariAnggotaActionPerformed
        // TODO add your handling code here:
        if(txtIdAnggota.getText().equals("")){
            JOptionPane.showMessageDialog(this, "ID anggota harus diisi!"); 
        }else {
            Anggota ang = cariAnggota(Integer.parseInt(txtIdAnggota.getText()));
            if(ang.getIdAnggota() != 0){
                txtIdAnggota.setText(String.valueOf(ang.getIdAnggota()));
                txtNamaAnggota.setText(ang.getNama());
            } else {
                JOptionPane.showMessageDialog(this, "ID tidak dapat ditemukan!"); 
                txtIdAnggota.setText("");
                txtNamaAnggota.setText("Nama Anggota");
            }
        }
    }//GEN-LAST:event_btnCariAnggotaActionPerformed

    private void btnCariBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariBukuActionPerformed
        // TODO add your handling code here:
        if(txtIdBuku.getText().equals("")){
            JOptionPane.showMessageDialog(this, "ID buku harus diisi!"); 
        } else if(txtIdBuku.getText().equals("0")){
            JOptionPane.showMessageDialog(this, "ID buku harus diisi!"); 
        }else {
            Buku buku = cariBuku(Integer.parseInt(txtIdBuku.getText()));
            if(buku.getIdbuku() != 0){
                txtIdBuku.setText(String.valueOf(buku.getIdbuku()));
                txtJudulBuku.setText(buku.getJudul());
            } else {
                JOptionPane.showMessageDialog(this, "ID Buku tidak dapat ditemukan!"); 
                txtIdBuku.setText("");
                txtJudulBuku.setText("Judul Buku");                  
            } 
        }
    }//GEN-LAST:event_btnCariBukuActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        Peminjaman pen = new Peminjaman();                
        boolean res = checkInput(txtTanggalPinjam.getText(), txtTanggalKembali.getText());

        if(res){
            boolean tglPinjam = isValidDate(txtTanggalPinjam.getText());
            boolean tglKembali = isValidDate(txtTanggalKembali.getText()) ;
            if(tglKembali == false || tglPinjam == false){
                JOptionPane.showMessageDialog(this, "Format tanggal invalid!"); 
            } else {
                Anggota ang = cariAnggota(Integer.parseInt(txtIdAnggota.getText()));
                Buku buku = cariBuku(Integer.parseInt(txtIdBuku.getText()));
                if(buku.getIdbuku() == 0 && ang.getIdAnggota()== 0){
                    JOptionPane.showMessageDialog(this, "ID Anggota atau ID Buku tidak dapat ditemukan!"); 
                    txtIdBuku.setText("");
                    txtIdAnggota.setText("");
                } else {
                    Anggota newAng = new Anggota().getById(ang.getIdAnggota());
                    Buku newBuku = new Buku().getById(buku.getIdbuku());
                    pen.setBuku(newBuku);
                    pen.setAnggota(newAng);
                    pen.setIdPeminjaman(Integer.parseInt(txtPeminjaman.getText()));
                    pen.setTanggalKembali(txtTanggalKembali.getText());
                    pen.setTanggalPinjam(txtTanggalPinjam.getText());
                    pen.save();
                    tampilkanData();
                    kosongkanForm();
                }   
            }
        } else {
            JOptionPane.showMessageDialog(this, "Tambah peminjaman gagal!");
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnTambahBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahBaruActionPerformed
        // TODO add your handling code here:
        kosongkanForm();
    }//GEN-LAST:event_btnTambahBaruActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        if(tblPeminjaman.getSelectionModel().isSelectionEmpty()){
            JOptionPane.showMessageDialog(this, "Silahkan pilih data yang akan dihapus!");
            kosongkanForm();
        }else {
            DefaultTableModel model = (DefaultTableModel)tblPeminjaman.getModel();
            int row = tblPeminjaman.getSelectedRow();
            
            Peminjaman pen = new Peminjaman().getById(Integer.parseInt(model.getValueAt(row, 0).toString()));
            pen.delete();
            kosongkanForm();
            tampilkanData();
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void tblPeminjamanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPeminjamanMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tblPeminjaman.getModel();
        int row = tblPeminjaman.getSelectedRow();
        
        Peminjaman pen = new Peminjaman().getById(Integer.parseInt(model.getValueAt(row, 0).toString()));
        
        txtPeminjaman.setText(String.valueOf(pen.getIdPeminjaman()));
        txtNamaAnggota.setText(pen.getAnggota().getNama());
        txtJudulBuku.setText(pen.getBuku().getJudul());
        txtTanggalPinjam.setText(pen.getTanggalPinjam());
        txtTanggalKembali.setText(pen.getTanggalKembali());
    }//GEN-LAST:event_tblPeminjamanMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPeminjaman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCariAnggota;
    private javax.swing.JButton btnCariBuku;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambahBaru;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPeminjaman;
    private javax.swing.JTextField txtIdAnggota;
    private javax.swing.JTextField txtIdBuku;
    private javax.swing.JLabel txtJudulBuku;
    private javax.swing.JLabel txtNamaAnggota;
    private javax.swing.JTextField txtPeminjaman;
    private javax.swing.JTextField txtTanggalKembali;
    private javax.swing.JTextField txtTanggalPinjam;
    // End of variables declaration//GEN-END:variables
}
