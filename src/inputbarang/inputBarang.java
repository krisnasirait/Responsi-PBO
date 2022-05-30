
package inputbarang;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class inputBarang extends javax.swing.JFrame {

    public inputBarang() {
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
        tNama = new javax.swing.JTextField();
        tMassa = new javax.swing.JTextField();
        tHargaSatuan = new javax.swing.JTextField();
        bSubmit = new javax.swing.JButton();
        bReset = new javax.swing.JButton();
        bKembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Input Barang");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nama");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Massa (gr)");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Harga Satuan");

        tMassa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tMassaActionPerformed(evt);
            }
        });
        tMassa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tMassaKeyTyped(evt);
            }
        });

        tHargaSatuan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tHargaSatuanKeyTyped(evt);
            }
        });

        bSubmit.setBackground(new java.awt.Color(74, 146, 243));
        bSubmit.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        bSubmit.setForeground(new java.awt.Color(255, 255, 255));
        bSubmit.setText("Submit");
        bSubmit.setBorder(null);
        bSubmit.setBorderPainted(false);
        bSubmit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bSubmit.setFocusPainted(false);
        bSubmit.setFocusable(false);
        bSubmit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSubmitActionPerformed(evt);
            }
        });

        bReset.setBackground(new java.awt.Color(255, 0, 51));
        bReset.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        bReset.setForeground(new java.awt.Color(255, 255, 255));
        bReset.setText("Reset");
        bReset.setBorder(null);
        bReset.setBorderPainted(false);
        bReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bReset.setFocusPainted(false);
        bReset.setFocusable(false);
        bReset.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bResetActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tHargaSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tMassa, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tNama, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(bSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bReset, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 61, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bKembali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tMassa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tHargaSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bReset, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSubmitActionPerformed
        
        if ("".equals(tNama.getText()) || "".equals(tMassa.getText()) || "".equals(tHargaSatuan.getText())) {
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", JOptionPane.WARNING_MESSAGE);
        } 
           else {
               
               String SQL = "INSERT INTO barang(nama,massa,harga) "
                       + "VALUES('"+tNama.getText()+"','"+tMassa.getText()+"','"+tHargaSatuan.getText()+"')";
               int status;
               status = koneksiDB.execute(SQL);
               if (status == 1) {
                   JOptionPane.showMessageDialog(this, "Data Berhasil Ditambahkan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                   
               } else {
                   JOptionPane.showMessageDialog(this, "Data Gagal Ditambahkan", "Gagal", JOptionPane.WARNING_MESSAGE);
               }
               
               reset();
        }
    }//GEN-LAST:event_bSubmitActionPerformed

    private void bResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResetActionPerformed
        reset();
    }//GEN-LAST:event_bResetActionPerformed

    private void bKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bKembaliActionPerformed
        mainMenu menu = null;
        menu = new mainMenu();
        menu.pack();
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_bKembaliActionPerformed

    private void tMassaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tMassaKeyTyped
    char karakter = evt.getKeyChar();
    if(!(((karakter >= '0') && (karakter <= '9') || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE)))){
    getToolkit().beep();
    evt.consume();
    JOptionPane.showMessageDialog(null, "Hanya Bisa Input Angka!");
    }
        
    }//GEN-LAST:event_tMassaKeyTyped

    private void tMassaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tMassaActionPerformed
        
    }//GEN-LAST:event_tMassaActionPerformed

    private void tHargaSatuanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tHargaSatuanKeyTyped
        char karakter = evt.getKeyChar();
    if(!(((karakter >= '0') && (karakter <= '9') || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE)))){
    getToolkit().beep();
    evt.consume();
    JOptionPane.showMessageDialog(null, "Hanya Bisa Input Angka!");
    }
    }//GEN-LAST:event_tHargaSatuanKeyTyped

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
            java.util.logging.Logger.getLogger(inputBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inputBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inputBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inputBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inputBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAdmin;
    private javax.swing.JButton bAdmin1;
    private javax.swing.JButton bAdmin2;
    private javax.swing.JButton bKembali;
    private javax.swing.JButton bPembeli;
    private javax.swing.JButton bReset;
    private javax.swing.JButton bSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JTextField tHargaSatuan;
    public javax.swing.JTextField tMassa;
    public javax.swing.JTextField tNama;
    // End of variables declaration//GEN-END:variables
}
