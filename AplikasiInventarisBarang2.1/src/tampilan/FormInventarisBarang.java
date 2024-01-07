package tampilan;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author acer
 */
public class FormInventarisBarang extends javax.swing.JFrame {
  
    private final DefaultTableModel model;
    public FormInventarisBarang() {
        initComponents();
        model = (DefaultTableModel) tbl_barang.getModel();
        getData();
        
        
    }

   private Connection getDBConnection() throws SQLException {
        // Sesuaikan informasi koneksi database Anda di sini
        String url = "jdbc:mysql://localhost:3306/inventaris";
        String user = "root";
        String password = "";
        return DriverManager.getConnection(url, user, password);
    }
      
     
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TextFieldid = new javax.swing.JTextField();
        TextFieldnama = new javax.swing.JTextField();
        TextFieldjenis = new javax.swing.JTextField();
        TextFieldukuran = new javax.swing.JTextField();
        TextFieldstok = new javax.swing.JTextField();
        TextFieldharga = new javax.swing.JTextField();
        btnsimpan = new javax.swing.JButton();
        btnubah = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btlclear = new javax.swing.JButton();
        btnkeluar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_barang = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Input Data Barang"));

        jLabel1.setText("ID Barang");

        jLabel3.setText("Nama Barang");

        jLabel4.setText("Jenis Barang");

        jLabel5.setText("Ukuran");

        jLabel6.setText("Stok");

        jLabel7.setText("Harga");

        btnsimpan.setText("Simpan");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        btnubah.setText("Ubah");
        btnubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnubahActionPerformed(evt);
            }
        });

        btnhapus.setText("Hapus");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        btlclear.setText("Clear");
        btlclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlclearActionPerformed(evt);
            }
        });

        btnkeluar.setText("Keluar");
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnsimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnubah))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(btlclear)
                        .addGap(18, 18, 18)
                        .addComponent(btnhapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(btnkeluar)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextFieldnama, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextFieldjenis, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextFieldid, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextFieldukuran, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextFieldstok, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextFieldharga, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TextFieldid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TextFieldnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TextFieldjenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TextFieldukuran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldstok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsimpan)
                    .addComponent(btnubah)
                    .addComponent(btlclear)
                    .addComponent(btnhapus)
                    .addComponent(btnkeluar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabel Data Barang"));

        tbl_barang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Barang", "Nama Barang", "Jenis Baang", "Ukuran", "Ukuran", "Harga"
            }
        ));
        tbl_barang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_barangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_barang);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel4.setBackground(new java.awt.Color(0, 153, 204));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\OneDrive\\Pictures\\50x50 logo.jpg")); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Data Barang");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel8)
                .addGap(40, 40, 40)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel9)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        
      String id_barang = TextFieldid.getText();
        String nama_barang = TextFieldnama.getText();
        String jenis_barang = TextFieldjenis.getText();
        String ukuran = TextFieldukuran.getText();
        String stok = TextFieldstok.getText();
        String harga = TextFieldharga.getText();

        try (Connection connection = getDBConnection()) {
            String query = "INSERT INTO tb_barang (id_barang, nama_barang, jenis_barang, ukuran, stok, harga) VALUES (?, ?, ?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, id_barang);
                preparedStatement.setString(2, nama_barang);
                preparedStatement.setString(3, jenis_barang);
                preparedStatement.setString(4, ukuran);
                preparedStatement.setString(5, stok);
                preparedStatement.setString(6, harga);
                preparedStatement.executeUpdate();
                JOptionPane.showMessageDialog(this, "Data berhasil disimpan", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                getData(); // Refresh tabel setelah menyimpan data
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menyimpan data ke database", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void btlclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlclearActionPerformed
       clearData();
        JOptionPane.showMessageDialog(this, "Form berhasil di-clear", "Informasi", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btlclearActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        int barisTerpilih = tbl_barang.getSelectedRow();
        if (barisTerpilih != -1) {
            // Ambil ID barang dari baris yang dipilih
            String id_barang = tbl_barang.getValueAt(barisTerpilih, 0).toString();

            // Hapus data dari database
            try (Connection connection = getDBConnection()) {
                String query = "DELETE FROM tb_barang WHERE id_barang = ?";
                try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                    preparedStatement.setString(1, id_barang);
                    preparedStatement.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Data berhasil dihapus", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                    getData(); // Refresh tabel setelah menghapus data
                }
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menghapus data dari database", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Pilih baris yang akan dihapus", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btnubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnubahActionPerformed
      int barisTerpilih = tbl_barang.getSelectedRow();
        if (barisTerpilih != -1) {
            String id_barang = TextFieldid.getText();
            String nama_barang = TextFieldnama.getText();
            String jenis_barang = TextFieldjenis.getText();
            String ukuran = TextFieldukuran.getText();
            String stok = TextFieldstok.getText();
            String harga = TextFieldharga.getText();

            // Ubah data di database
            try (Connection connection = getDBConnection()) {
                String query = "UPDATE tb_barang SET nama_barang = ?, jenis_barang = ?, ukuran = ?, stok = ?, harga = ? WHERE id_barang = ?";
                try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                    preparedStatement.setString(1, nama_barang);
                    preparedStatement.setString(2, jenis_barang);
                    preparedStatement.setString(3, ukuran);
                    preparedStatement.setString(4, stok);
                    preparedStatement.setString(5, harga);
                    preparedStatement.setString(6, id_barang);
                    preparedStatement.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Data berhasil diubah", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                    getData(); // Refresh tabel setelah mengubah data
                }
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat mengubah data di database", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Pilih baris yang akan diubah", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnubahActionPerformed

    private void tbl_barangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_barangMouseClicked
        tbl_barang.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    int row = tbl_barang.getSelectedRow();
                    if (row != -1) {
                        // Isi nilai dari baris yang dipilih ke dalam teksfield
                        TextFieldid.setText(tbl_barang.getValueAt(row, 0).toString());
                        TextFieldnama.setText(tbl_barang.getValueAt(row, 1).toString());
                        TextFieldjenis.setText(tbl_barang.getValueAt(row, 2).toString());
                        TextFieldukuran.setText(tbl_barang.getValueAt(row, 3).toString());
                        TextFieldstok.setText(tbl_barang.getValueAt(row, 4).toString());
                        TextFieldharga.setText(tbl_barang.getValueAt(row, 5).toString());
                    }
                }
            }
        });
    }//GEN-LAST:event_tbl_barangMouseClicked

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
        JOptionPane.showMessageDialog(this, "Kembali ke Main Menu", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        new MenuUtama().setVisible(true);
        this.dispose(); // Menutup form saat ini
    }//GEN-LAST:event_btnkeluarActionPerformed

     private void clearData() {
        TextFieldid.setText("");
        TextFieldnama.setText("");
        TextFieldjenis.setText("");
        TextFieldukuran.setText("");
        TextFieldstok.setText("");
        TextFieldharga.setText("");
        tbl_barang.clearSelection(); // Membersihkan pilihan pada tabel
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the windows look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormInventarisBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormInventarisBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormInventarisBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormInventarisBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 FormInventarisBarang form = new FormInventarisBarang();
            form.getData(); // Tambahkan baris awal ke tabel di sini jika diperlukan
            form.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextFieldharga;
    private javax.swing.JTextField TextFieldid;
    private javax.swing.JTextField TextFieldjenis;
    private javax.swing.JTextField TextFieldnama;
    private javax.swing.JTextField TextFieldstok;
    private javax.swing.JTextField TextFieldukuran;
    private javax.swing.JButton btlclear;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JButton btnubah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_barang;
    // End of variables declaration//GEN-END:variables

   private void getData() {
        // Mengambil data dari database dan menampilkannya di tabel
        model.setRowCount(0); // Mengosongkan tabel
        try (Connection connection = getDBConnection()) {
            String query = "SELECT * FROM tb_barang";
            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(query)) {
                while (resultSet.next()) {
                    String id_barang = resultSet.getString("id_barang");
                    String nama_barang = resultSet.getString("nama_barang");
                    String jenis_barang = resultSet.getString("jenis_barang");
                    String ukuran = resultSet.getString("ukuran");
                    String stok = resultSet.getString("stok");
                    String harga = resultSet.getString("harga");
                    model.addRow(new Object[]{id_barang, nama_barang, jenis_barang, ukuran, stok, harga});
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat mengambil data dari database", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    }
