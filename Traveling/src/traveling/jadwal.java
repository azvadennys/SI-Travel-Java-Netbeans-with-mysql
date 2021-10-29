/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traveling;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.sql.DriverManager;
import java.util.HashMap;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author ASUS
 */
public class jadwal extends javax.swing.JFrame {
    Connection con;
    Statement stat;
    ResultSet rs;
    String sql, dateChooser;
    public jadwal() {
        initComponents();
        setDefaultCloseOperation(jadwal.DO_NOTHING_ON_CLOSE);
        tampildata();
        bersih();
        
    }
    private void bersih(){
   kode.setText(null); 
   asal.setText(null); 
   tujuan.setText(null);
   tgl.setDate(null); 
   kode.requestFocus();
    }   
    
    public void getMouseClick(){
        int jTable1 = tbjadwal.getSelectedRow();
        String a = tbjadwal.getValueAt(jTable1, 0).toString();
        String b = tbjadwal.getValueAt(jTable1, 1).toString();
        String c = tbjadwal.getValueAt(jTable1, 2).toString(); 
        Date date = (Date) tbjadwal.getValueAt(jTable1,3);
        kode.setText(a);
        asal.setText(b);
        tujuan.setText(c);
        tgl.setDate(date);
        kode.setEnabled(false);
        asal.requestFocus();
 
}
    
    public void getTanggalfromTable(){
    try{
    if(tgl.getDate() != null){
     String pattern = "yyyy-MM-dd";
     SimpleDateFormat format = new SimpleDateFormat(pattern);
     dateChooser= String.valueOf(format.format(tgl.getDate()));
    }
}catch (Exception e) {
}
    }

    public void koneksi(){
try{
Class.forName("com.mysql.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database","root","");
stat = con.createStatement();
}catch (Exception e){
JOptionPane.showMessageDialog(this,"koneksi gagal..",
"Error",JOptionPane.ERROR_MESSAGE);
System.out.println(e.getMessage());
}
}
 
//method tampil data
 public void tampildata(){ 
DefaultTableModel tabelnyo = new DefaultTableModel();
tabelnyo.addColumn("KODE JADWAL");
tabelnyo.addColumn("ASAL ");
tabelnyo.addColumn("TUJUAN");
tabelnyo.addColumn("TANGGAL");
try{
 
koneksi();
sql = "SELECT * FROM `jadwal`ORDER BY `tanggal` ASC";
rs = stat.executeQuery(sql);
while (rs.next())
{
tabelnyo.addRow(new Object[]{
rs.getString(1), 
rs.getString(2),
rs.getString(3),
rs.getDate(4),
});
}
tbjadwal.setModel(tabelnyo);
}catch (Exception e)
{
JOptionPane.showMessageDialog(null, "Ada Kesalahan");
}
}
 void filterhuruf(KeyEvent a){
        if(Character.isAlphabetic(a.getKeyChar())){
            a.consume();
            JOptionPane.showMessageDialog(null,"Pada Kolom Ini Hanya Bisa Memasukan Karakter Angka");
        }
    }
 void filterangka(KeyEvent b){
        if(Character.isDigit(b.getKeyChar())){
            b.consume();
            JOptionPane.showMessageDialog(null,"Pada Kolom Ini Hanya Bisa Memasukan Karakter Huruf");
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cari = new javax.swing.JTextField();
        kode = new javax.swing.JTextField();
        tujuan = new javax.swing.JTextField();
        asal = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbjadwal = new javax.swing.JTable();
        tgl = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Hapus = new javax.swing.JButton();
        ubah = new javax.swing.JButton();
        Kembali = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        Simpan = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cari.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        cari.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });
        getContentPane().add(cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 170, 30));

        kode.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        kode.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        kode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodeActionPerformed(evt);
            }
        });
        kode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                kodeKeyTyped(evt);
            }
        });
        getContentPane().add(kode, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 200, 30));

        tujuan.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        tujuan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tujuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tujuanActionPerformed(evt);
            }
        });
        tujuan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tujuanKeyTyped(evt);
            }
        });
        getContentPane().add(tujuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 200, 30));

        asal.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        asal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        asal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asalActionPerformed(evt);
            }
        });
        asal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                asalKeyTyped(evt);
            }
        });
        getContentPane().add(asal, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 200, 30));

        tbjadwal.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tbjadwal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbjadwal.setFocusCycleRoot(true);
        tbjadwal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbjadwalMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbjadwal);
        if (tbjadwal.getColumnModel().getColumnCount() > 0) {
            tbjadwal.getColumnModel().getColumn(0).setResizable(false);
            tbjadwal.getColumnModel().getColumn(1).setResizable(false);
            tbjadwal.getColumnModel().getColumn(2).setResizable(false);
            tbjadwal.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 307, 720, 220));

        tgl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tgl.setDateFormatString("dd-MM-yyyy");
        tgl.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        tgl.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tglPropertyChange(evt);
            }
        });
        tgl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tglKeyTyped(evt);
            }
        });
        getContentPane().add(tgl, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 200, 30));

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("Cari");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, 80, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton2.setText("Batal");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 80, -1));

        Hapus.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Hapus.setText("Hapus");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });
        getContentPane().add(Hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 80, -1));

        ubah.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ubah.setText("Ubah");
        ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahActionPerformed(evt);
            }
        });
        getContentPane().add(ubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 80, -1));

        Kembali.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Kembali.setText("Kembali");
        Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliActionPerformed(evt);
            }
        });
        getContentPane().add(Kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 80, -1));

        Logout.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Logout.setText("Logout");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        getContentPane().add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, 80, -1));

        jButton7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton7.setText("Cetak Laporan");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, 140, -1));

        Simpan.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Simpan.setText("Simpan");
        Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanActionPerformed(evt);
            }
        });
        getContentPane().add(Simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 80, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Asal");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 110, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Tujuan");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 110, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Tanggal");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 110, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Kode Jadwal");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 110, 30));

        jLabel1.setFont(new java.awt.Font("Stencil Std", 1, 40)); // NOI18N
        jLabel1.setText("JADWAL KEBERANGKATAN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 570, 80));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/Screenshot (434).jpg"))); // NOI18N
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, 0, 920, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed

    }//GEN-LAST:event_cariActionPerformed

    private void kodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kodeActionPerformed

    private void tujuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tujuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tujuanActionPerformed

    private void asalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_asalActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        // TODO add your handling code here:
     login mnu = new login();
     mnu.setVisible(true);
     dispose();
    }//GEN-LAST:event_LogoutActionPerformed

    private void KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembaliActionPerformed
    menu_utama mnu = new menu_utama();
    mnu.setVisible(true);
    dispose();
    }//GEN-LAST:event_KembaliActionPerformed

    private void SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanActionPerformed
  if(kode.getText().equals("")||dateChooser.equals("")||asal.getText().equals("")||tujuan.getText().equals("")){
    JOptionPane.showMessageDialog(null,"Data tidak boleh kosong");
  } else {    
      try {
      koneksi();
      sql = "INSERT INTO jadwal VALUES ('"+kode.getText()+"','"+asal.getText()+"','"+tujuan.getText()+"','"+dateChooser+"')";
      stat.executeUpdate(sql);
      con.close();
      tampildata();
      bersih();
      JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
      } catch (Exception e) {
      JOptionPane.showMessageDialog(null, "Gagal");
     }
  }
    }//GEN-LAST:event_SimpanActionPerformed

    private void kodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kodeKeyTyped
filterhuruf(evt);
if (kode.getText().length() == 3 ) {
        evt.consume(); 
        }
    // TODO add your handling code here:
    }//GEN-LAST:event_kodeKeyTyped

    private void tbjadwalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbjadwalMouseClicked
        getMouseClick();
       kode.setEnabled(false);// TODO add your handling code here:
    }//GEN-LAST:event_tbjadwalMouseClicked

    private void tglPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tglPropertyChange
        getTanggalfromTable();// TODO add your handling code here:
    }//GEN-LAST:event_tglPropertyChange

    private void ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahActionPerformed
if(kode.getText().equals("")||dateChooser.equals("")||asal.getText().equals("")||tujuan.getText().equals("")){
    JOptionPane.showMessageDialog(null,"Data tidak boleh kosong");
  } else {    
    try {
        koneksi();
      sql = "UPDATE `jadwal` SET `Kode Jadwal`='"+kode.getText()+"',`Asal`='"+asal.getText()+"',`Tujuan`='"+tujuan.getText()+"',`Tanggal`='"+dateChooser+"' WHERE `Kode Jadwal`='"+kode.getText()+"'";
      stat.executeUpdate(sql);
      JOptionPane.showMessageDialog(null, "Ubah Data Berhasil");
      con.close();
      tampildata();
      bersih();
      kode.setEnabled(true);
      } catch (Exception e) {
      JOptionPane.showMessageDialog(null, "Gagal");
     }  
}// TODO add your handling code here:
    }//GEN-LAST:event_ubahActionPerformed

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
if(kode.getText().equals("")||dateChooser.equals("")||asal.getText().equals("")||tujuan.getText().equals("")){
    JOptionPane.showMessageDialog(null,"Data tidak boleh kosong");
  } else {    
    try{
        koneksi();
        sql = "DELETE FROM `jadwal` WHERE `Kode Jadwal`='"+kode.getText()+"'";
        stat.executeUpdate(sql);
        con.close();
        JOptionPane.showMessageDialog(null,"Data berhasil di hapus");
        tampildata();
        bersih();
        kode.setEnabled(true);
    }catch (Exception e){
        JOptionPane.showMessageDialog(null,"Proses hapus gagal/koneksi gagal..");
        System.out.println(e.getMessage());
    }
}
    
// TODO add your handling code here:
    }//GEN-LAST:event_HapusActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
bersih();
kode.setEnabled(true);
cari.setText(null);
tampildata();// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    if(cari.getText().equals("")){
    JOptionPane.showMessageDialog(null,"Data tidak boleh kosong");
  } else {    
DefaultTableModel tabelnyo = new DefaultTableModel();
tabelnyo.addColumn("KODE JADWAL");
tabelnyo.addColumn("ASAL ");
tabelnyo.addColumn("TUJUAN");
tabelnyo.addColumn("TANGGAL");
try{
koneksi();
sql = "Select * from `jadwal` where `Kode Jadwal` like '%"+cari.getText()+"%'"+"or `Tanggal` like '%"+cari.getText() +"%'"+"or `Asal` like '%"+cari.getText() +"%'"+"or `Tujuan` like '%"+cari.getText() +"%'";
rs = stat.executeQuery(sql);
while (rs.next()) {
tabelnyo.addRow(new Object[]{
rs.getString(1),
rs.getString(2),
rs.getString(3),
rs.getDate(4),
});
}
tbjadwal.setModel(tabelnyo);
}catch (SQLException e){
} 
}// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tglKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tglKeyTyped
filterhuruf(evt);        // TODO add your handling code here:
    }//GEN-LAST:event_tglKeyTyped

    private void tujuanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tujuanKeyTyped
filterangka(evt);  
if (tujuan.getText().length() == 20 ) {
        evt.consume(); 
        }// TODO add your handling code here:
    }//GEN-LAST:event_tujuanKeyTyped

    private void asalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_asalKeyTyped
filterangka(evt);
if (asal.getText().length() == 20 ) {
        evt.consume(); 
        }// TODO add your handling code here:
    }//GEN-LAST:event_asalKeyTyped

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
try {
     HashMap parameter = new HashMap();
     koneksi();
     File file = new File("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\Traveling\\src\\methodprint\\jadwal.jasper");
     JasperReport jr = (JasperReport) JRLoader.loadObject(file);
     JasperPrint jp = JasperFillManager.fillReport(jr, parameter,con);
     JasperViewer.viewReport(jp, false);
     JasperViewer.setDefaultLookAndFeelDecorated(true);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(jadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jadwal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Hapus;
    private javax.swing.JButton Kembali;
    private javax.swing.JButton Logout;
    private javax.swing.JButton Simpan;
    private javax.swing.JTextField asal;
    private javax.swing.JTextField cari;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField kode;
    private javax.swing.JTable tbjadwal;
    private com.toedter.calendar.JDateChooser tgl;
    private javax.swing.JTextField tujuan;
    private javax.swing.JButton ubah;
    // End of variables declaration//GEN-END:variables
}
