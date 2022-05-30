
package inputbarang;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class detailBarang extends javax.swing.JFrame {

    public detailBarang() {
        initComponents();
    }
    public void reset(){
        tNama.setText("");
        tMassa.setText("");
        tHargaSatuan.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bEdit = new javax.swing.JButton();
        bHapus = new javax.swing.JButton();
        bKembali = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        tBanyak = new javax.swing.JTextField();
        bTotal = new javax.swing.JButton();
        labelTotal = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tNama = new javax.swing.JTextField();
        tMassa = new javax.swing.JTextField();
        tHargaSatuan = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Detail Barang");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nama");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Massa (gr)");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Harga Satuan");

        bEdit.setBackground(new java.awt.Color(74, 146, 243));
        bEdit.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        bEdit.setForeground(new java.awt.Color(255, 255, 255));
        bEdit.setText("Edit");
        bEdit.setBorder(null);
        bEdit.setBorderPainted(false);
        bEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bEdit.setFocusPainted(false);
        bEdit.setFocusable(false);
        bEdit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditActionPerformed(evt);
            }
        });

        bHapus.setBackground(new java.awt.Color(255, 0, 51));
        bHapus.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        bHapus.setForeground(new java.awt.Color(255, 255, 255));
        bHapus.setText("Hapus");
        bHapus.setBorder(null);
        bHapus.setBorderPainted(false);
        bHapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bHapus.setFocusPainted(false);
        bHapus.setFocusable(false);
        bHapus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHapusActionPerformed(evt);
            }
        });

        bKembali.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        bKembali.setForeground(new java.awt.Color(255, 255, 255));
        bKembali.setText("Kembali");
        bKembali.setBorder(null);
        bKembali.setBorderPainted(false);
        bKembali.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bKembali.setFocusPainted(false);
        bKembali.setFocusable(false);
        bKembali.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bKembaliActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Banyak");

        tBanyak.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tBanyakKeyTyped(evt);
            }
        });

        bTotal.setBackground(new java.awt.Color(153, 255, 0));
        bTotal.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        bTotal.setForeground(new java.awt.Color(255, 255, 255));
        bTotal.setText("Total Harga");
        bTotal.setBorder(null);
        bTotal.setBorderPainted(false);
        bTotal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bTotal.setFocusPainted(false);
        bTotal.setFocusable(false);
        bTotal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTotalActionPerformed(evt);
            }
        });

        labelTotal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelTotal.setText("............");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setText("Rp.");

        tNama.setEditable(false);

        tMassa.setEditable(false);

        tHargaSatuan.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tBanyak, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(bTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tHargaSatuan)
                                    .addComponent(tMassa)
                                    .addComponent(tNama)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelTotal))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tMassa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tHargaSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tBanyak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTotal)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditActionPerformed
        editBarang edit = null;
        edit = new editBarang();
        edit.pack();
        edit.setLocationRelativeTo(null);
        edit.setVisible(true);
        dispose();
        
        int baris = dataBarang.tabel.getSelectedRow();
        if (baris != -1) {
            
            editBarang.tId.setText(dataBarang.tabel.getValueAt(baris, 0).toString());
            editBarang.tNama.setText(dataBarang.tabel.getValueAt(baris, 1).toString());
            editBarang.tMassa.setText(dataBarang.tabel.getValueAt(baris, 2).toString());
            editBarang.tHargaSatuan.setText(dataBarang.tabel.getValueAt(baris, 3).toString());
           
        }
        
    }//GEN-LAST:event_bEditActionPerformed

    private void bHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHapusActionPerformed
            String SQL = "DELETE FROM barang WHERE nama='"+tNama.getText()+"'";
            int status = koneksiDB.execute(SQL);
            if (status==1) {
                JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Data Gagal Dihapus!", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
         reset();
    }//GEN-LAST:event_bHapusActionPerformed

    private void bKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bKembaliActionPerformed
        dataBarang data = null;
        data = new dataBarang();
        data.pack();
        data.setLocationRelativeTo(null);
        data.setVisible(true);
        dispose();
    }//GEN-LAST:event_bKembaliActionPerformed

    private void bTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTotalActionPerformed
        double satuan, banyak, total, totalharga;
        satuan = Double.parseDouble(tHargaSatuan.getText());
        banyak = Double.parseDouble(tBanyak.getText());
        
        if (banyak==12){
            total = (satuan*banyak);
            totalharga = total-(0.05*(satuan*banyak));
            labelTotal.setText("" + (String.format("%0,2d", (int) totalharga)));
        }
            else if(banyak==20){
                    total = (satuan*banyak);
                    totalharga = total-(0.1*(satuan*banyak));
                    labelTotal.setText("" + (String.format("%0,2d", (int) totalharga)));
                    }
            else if(banyak==144){
                    total = (satuan*banyak);
                    totalharga = total-(0.25*(satuan*banyak));
                    labelTotal.setText("" + (String.format("%0,2d", (int) totalharga)));
                    }
        
        
        
        
        
    }//GEN-LAST:event_bTotalActionPerformed

    private void tBanyakKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tBanyakKeyTyped
        char karakter = evt.getKeyChar();
    if(!(((karakter >= '0') && (karakter <= '9') || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE)))){
    getToolkit().beep();
    evt.consume();
    JOptionPane.showMessageDialog(null, "Hanya Bisa Input Angka!");
    }
    }//GEN-LAST:event_tBanyakKeyTyped

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
            java.util.logging.Logger.getLogger(detailBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(detailBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(detailBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(detailBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new detailBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bEdit;
    private javax.swing.JButton bHapus;
    private javax.swing.JButton bKembali;
    private javax.swing.JButton bTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JTextField tBanyak;
    public static javax.swing.JTextField tHargaSatuan;
    public static javax.swing.JTextField tMassa;
    public static javax.swing.JTextField tNama;
    // End of variables declaration//GEN-END:variables
}
