/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traveling;

/**
 *
 * @author ASUS
 */
public class menu_utama extends javax.swing.JFrame {

    /**
     * Creates new form menu_utama
     */
    public menu_utama() {
        initComponents();
        setDefaultCloseOperation(menu_utama.DO_NOTHING_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logojadwal = new javax.swing.JLabel();
        logoorder = new javax.swing.JLabel();
        Penumpang1 = new javax.swing.JLabel();
        pemesan = new javax.swing.JLabel();
        Menuutama = new javax.swing.JLabel();
        Pemesanan = new javax.swing.JButton();
        Jadwal = new javax.swing.JButton();
        Harga = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        Penumpang = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(795, 553));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logojadwal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logojadwal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/calendar_clock_schedule_icon-icons.com_51085.png"))); // NOI18N
        logojadwal.setToolTipText("");
        logojadwal.setMaximumSize(new java.awt.Dimension(100, 100));
        logojadwal.setMinimumSize(new java.awt.Dimension(100, 100));
        logojadwal.setPreferredSize(new java.awt.Dimension(100, 100));
        getContentPane().add(logojadwal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 140, 130));

        logoorder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/ICON.png"))); // NOI18N
        logoorder.setMaximumSize(new java.awt.Dimension(150, 150));
        logoorder.setMinimumSize(new java.awt.Dimension(150, 150));
        logoorder.setPreferredSize(new java.awt.Dimension(150, 150));
        getContentPane().add(logoorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 180, -1));

        Penumpang1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/pngwing.com.png"))); // NOI18N
        getContentPane().add(Penumpang1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 350, 110, 130));

        pemesan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/people_users_icon_145877.png"))); // NOI18N
        getContentPane().add(pemesan, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, -1, 130));

        Menuutama.setFont(new java.awt.Font("Times New Roman", 1, 60)); // NOI18N
        Menuutama.setForeground(new java.awt.Color(0, 139, 162));
        Menuutama.setText("TRAVELAN");
        getContentPane().add(Menuutama, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 340, 50));

        Pemesanan.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Pemesanan.setText("PEMESANAN");
        Pemesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PemesananActionPerformed(evt);
            }
        });
        getContentPane().add(Pemesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 490, -1, -1));

        Jadwal.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Jadwal.setText("JADWAL");
        Jadwal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Jadwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JadwalActionPerformed(evt);
            }
        });
        getContentPane().add(Jadwal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 120, -1));

        Harga.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Harga.setText("HARGA");
        Harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HargaActionPerformed(evt);
            }
        });
        getContentPane().add(Harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, 120, -1));

        Exit.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Exit.setText("EXIT");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 90, -1));

        Penumpang.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Penumpang.setText("PENUMPANG");
        Penumpang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PenumpangActionPerformed(evt);
            }
        });
        getContentPane().add(Penumpang, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 490, -1, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/pngegg1.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 790, 310));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PemesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PemesananActionPerformed
pemesanan mnu = new pemesanan();
mnu.setVisible(true);
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_PemesananActionPerformed

    private void JadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JadwalActionPerformed
jadwal mnu = new jadwal();
mnu.setVisible(true);
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_JadwalActionPerformed

    private void HargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HargaActionPerformed
harga mnu = new harga();
mnu.setVisible(true);
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_HargaActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_ExitActionPerformed

    private void PenumpangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PenumpangActionPerformed
penumpang mnu = new penumpang();
mnu.setVisible(true);
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_PenumpangActionPerformed

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
            java.util.logging.Logger.getLogger(menu_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_utama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Harga;
    private javax.swing.JButton Jadwal;
    private javax.swing.JLabel Menuutama;
    private javax.swing.JButton Pemesanan;
    private javax.swing.JButton Penumpang;
    private javax.swing.JLabel Penumpang1;
    private javax.swing.JLabel logojadwal;
    private javax.swing.JLabel logoorder;
    private javax.swing.JLabel pemesan;
    // End of variables declaration//GEN-END:variables
}