/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traveling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class tabelpenumpang extends javax.swing.JFrame {
    Connection con;
    Statement stat;
    ResultSet rs;
    String sql;
    pemesanan tp = null;
    /**
     * Creates new form tabelpenumpang
     */
    public tabelpenumpang() {
        initComponents();
        koneksi();
        tampildata();
    }

public void koneksi(){
try{
Class.forName("com.mysql.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database","root","");
stat = con.createStatement();
}catch (ClassNotFoundException | SQLException e){
JOptionPane.showMessageDialog(this,"koneksi gagal..",
"Error",JOptionPane.ERROR_MESSAGE);
System.out.println(e.getMessage());
}
}
public void tampildata(){ 
DefaultTableModel tabelnyo = new DefaultTableModel();
tabelnyo.addColumn("KODE");
tabelnyo.addColumn("NAMA ");
tabelnyo.addColumn("NO.IDENTITAS");
tabelnyo.addColumn("JENIS KELAMIN");
tabelnyo.addColumn("USIA");
tabelnyo.addColumn("TELEPON");
tabelnyo.addColumn("ALAMAT");
try{
koneksi();
sql = "SELECT * FROM `penumpang`";
rs = stat.executeQuery(sql);
while (rs.next())
{
tabelnyo.addRow(new Object[]{
rs.getString(1), 
rs.getString(2),
rs.getString(3),
rs.getString(4),
rs.getInt(5),
rs.getString(6),
rs.getString(7)
});
}
tbpenumpang.setModel(tabelnyo);
}catch (Exception e)
{
JOptionPane.showMessageDialog(null, "Ada Kesalahan");
}
}
public void getMouseClick(){
        int jTable1 = tbpenumpang.getSelectedRow();
        tp.a = tbpenumpang.getValueAt(jTable1, 0).toString();
        tp.b = tbpenumpang.getValueAt(jTable1, 1).toString();
        tp.c = tbpenumpang.getValueAt(jTable1, 2).toString();
        tp.d = tbpenumpang.getValueAt(jTable1, 3).toString();
        tp.e = tbpenumpang.getValueAt(jTable1, 4).toString();
        tp.f = tbpenumpang.getValueAt(jTable1, 5).toString();
        tp.g = tbpenumpang.getValueAt(jTable1, 6).toString();
        tp.itemterpilih();
        this.dispose();
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbpenumpang = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        tcari = new javax.swing.JTextField();
        cari = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        tbpenumpang.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbpenumpang.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tbpenumpang.setModel(new javax.swing.table.DefaultTableModel(
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
        tbpenumpang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbpenumpangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbpenumpang);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("DATA PENUMPANG");

        tcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcariActionPerformed(evt);
            }
        });

        cari.setText("CARI");
        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tcari, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(380, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(369, 369, 369))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cari)
                    .addComponent(tcari, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tcariActionPerformed

    private void tbpenumpangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbpenumpangMouseClicked
getMouseClick();        // TODO add your handling code here:
    }//GEN-LAST:event_tbpenumpangMouseClicked

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
if(tcari.getText().equals("")){
    JOptionPane.showMessageDialog(null,"Data tidak boleh kosong");
  } else { 
    DefaultTableModel tabelnyo = new DefaultTableModel();
tabelnyo.addColumn("KODE PENUMPANG");
tabelnyo.addColumn("NAMA ");
tabelnyo.addColumn("NO.IDENTITAS");
tabelnyo.addColumn("JENIS KELAMIN");
tabelnyo.addColumn("USIA");
tabelnyo.addColumn("TELEPON");
tabelnyo.addColumn("ALAMAT");
try{
koneksi();
sql = "Select * from `penumpang` where `kode` like '%"+tcari.getText()+"%'"+"or `nama` like '%"+tcari.getText() +"%'"+"or `identitas` like '%"+tcari.getText() +"%'";
rs = stat.executeQuery(sql);
while (rs.next()) {
tabelnyo.addRow(new Object[]{
rs.getString(1),
rs.getString(2),
rs.getString(3),
rs.getString(4),
rs.getString(5),
rs.getString(6),
rs.getString(7)
});
}
tbpenumpang.setModel(tabelnyo);
}catch (SQLException e){
} 
}         // TODO add your handling code here:
    }//GEN-LAST:event_cariActionPerformed

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
            java.util.logging.Logger.getLogger(tabelpenumpang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tabelpenumpang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tabelpenumpang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tabelpenumpang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tabelpenumpang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cari;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbpenumpang;
    private javax.swing.JTextField tcari;
    // End of variables declaration//GEN-END:variables
}
