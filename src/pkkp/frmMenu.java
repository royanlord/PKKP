/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pkkp;

/**
 *
 * @author ROYAN FARID
 */
public class frmMenu extends javax.swing.JFrame {

    /**
     * Creates new form frmMenu
     */
    public frmMenu() {
        initComponents();
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
        jMenuBar1 = new javax.swing.JMenuBar();
        mnData = new javax.swing.JMenu();
        mnPeserta = new javax.swing.JMenuItem();
        mnUser = new javax.swing.JMenuItem();
        mnKabKot = new javax.swing.JMenuItem();
        mnKec = new javax.swing.JMenuItem();
        mnKel = new javax.swing.JMenuItem();
        mnSeleksi = new javax.swing.JMenu();
        mnSeleksiAdm = new javax.swing.JMenuItem();
        mnPenilaian = new javax.swing.JMenuItem();
        mnLaporan = new javax.swing.JMenu();
        mnDataPeserta = new javax.swing.JMenuItem();
        mnDatUser = new javax.swing.JMenuItem();
        mnLolosAdm = new javax.swing.JMenuItem();
        mnLolosNilai = new javax.swing.JMenuItem();
        mnLolosFinal = new javax.swing.JMenuItem();
        mnUtility = new javax.swing.JMenu();
        cmdExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form Menu");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 565, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 0));

        mnData.setBackground(new java.awt.Color(255, 255, 255));
        mnData.setText("Data Master");
        mnData.setOpaque(true);

        mnPeserta.setBackground(new java.awt.Color(255, 255, 0));
        mnPeserta.setText("Data Peserta");
        mnPeserta.setOpaque(true);
        mnPeserta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnPesertaActionPerformed(evt);
            }
        });
        mnData.add(mnPeserta);

        mnUser.setBackground(new java.awt.Color(255, 255, 0));
        mnUser.setText("Data User");
        mnUser.setOpaque(true);
        mnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnUserActionPerformed(evt);
            }
        });
        mnData.add(mnUser);

        mnKabKot.setBackground(new java.awt.Color(255, 255, 0));
        mnKabKot.setText("Data Kabupaten/Kota");
        mnKabKot.setOpaque(true);
        mnKabKot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnKabKotActionPerformed(evt);
            }
        });
        mnData.add(mnKabKot);

        mnKec.setBackground(new java.awt.Color(255, 255, 0));
        mnKec.setText("Data Kecamatan");
        mnKec.setOpaque(true);
        mnKec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnKecActionPerformed(evt);
            }
        });
        mnData.add(mnKec);

        mnKel.setBackground(new java.awt.Color(255, 255, 0));
        mnKel.setText("Data Kelurahan");
        mnKel.setOpaque(true);
        mnKel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnKelActionPerformed(evt);
            }
        });
        mnData.add(mnKel);

        jMenuBar1.add(mnData);

        mnSeleksi.setBackground(new java.awt.Color(255, 255, 255));
        mnSeleksi.setText("Seleksi");
        mnSeleksi.setOpaque(true);

        mnSeleksiAdm.setBackground(new java.awt.Color(255, 255, 0));
        mnSeleksiAdm.setText("Seleksi Administrasi");
        mnSeleksiAdm.setOpaque(true);
        mnSeleksiAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSeleksiAdmActionPerformed(evt);
            }
        });
        mnSeleksi.add(mnSeleksiAdm);

        mnPenilaian.setBackground(new java.awt.Color(255, 255, 0));
        mnPenilaian.setText("Seleksi Nilai");
        mnPenilaian.setOpaque(true);
        mnPenilaian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnPenilaianActionPerformed(evt);
            }
        });
        mnSeleksi.add(mnPenilaian);

        jMenuBar1.add(mnSeleksi);

        mnLaporan.setBackground(new java.awt.Color(255, 255, 255));
        mnLaporan.setText("Laporan");
        mnLaporan.setOpaque(true);

        mnDataPeserta.setBackground(new java.awt.Color(255, 255, 0));
        mnDataPeserta.setText("Laporan Data Peserta");
        mnDataPeserta.setOpaque(true);
        mnDataPeserta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnDataPesertaActionPerformed(evt);
            }
        });
        mnLaporan.add(mnDataPeserta);

        mnDatUser.setBackground(new java.awt.Color(255, 255, 0));
        mnDatUser.setText("Laporan Data User");
        mnDatUser.setOpaque(true);
        mnDatUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnDatUserActionPerformed(evt);
            }
        });
        mnLaporan.add(mnDatUser);

        mnLolosAdm.setBackground(new java.awt.Color(255, 255, 0));
        mnLolosAdm.setText("Laporan Lolos Seleksi Administrasi");
        mnLolosAdm.setOpaque(true);
        mnLolosAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnLolosAdmActionPerformed(evt);
            }
        });
        mnLaporan.add(mnLolosAdm);

        mnLolosNilai.setBackground(new java.awt.Color(255, 255, 0));
        mnLolosNilai.setText("Laporan Nilai");
        mnLolosNilai.setOpaque(true);
        mnLolosNilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnLolosNilaiActionPerformed(evt);
            }
        });
        mnLaporan.add(mnLolosNilai);

        mnLolosFinal.setBackground(new java.awt.Color(255, 255, 0));
        mnLolosFinal.setText("Laporan Peserta Lolos");
        mnLolosFinal.setOpaque(true);
        mnLolosFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnLolosFinalActionPerformed(evt);
            }
        });
        mnLaporan.add(mnLolosFinal);

        jMenuBar1.add(mnLaporan);

        mnUtility.setBackground(new java.awt.Color(255, 255, 255));
        mnUtility.setText("Utility");
        mnUtility.setOpaque(true);

        cmdExit.setBackground(new java.awt.Color(255, 255, 0));
        cmdExit.setText("Keluar");
        cmdExit.setOpaque(true);
        cmdExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdExitActionPerformed(evt);
            }
        });
        mnUtility.add(cmdExit);

        jMenuBar1.add(mnUtility);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnKabKotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnKabKotActionPerformed
        // TODO add your handling code here:
        new frmKabKota().setVisible(true);
    }//GEN-LAST:event_mnKabKotActionPerformed

    private void mnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnUserActionPerformed
        // TODO add your handling code here:
        new frmUser().setVisible(true);
    }//GEN-LAST:event_mnUserActionPerformed

    private void cmdExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_cmdExitActionPerformed

    private void mnPesertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnPesertaActionPerformed
        // TODO add your handling code here:
        new frmPeserta().setVisible(true);
    }//GEN-LAST:event_mnPesertaActionPerformed

    private void mnKecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnKecActionPerformed
        // TODO add your handling code here:
        new frmKecamatan().setVisible(true);
    }//GEN-LAST:event_mnKecActionPerformed

    private void mnKelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnKelActionPerformed
        // TODO add your handling code here:
        new frmKelurahan().setVisible(true);
    }//GEN-LAST:event_mnKelActionPerformed

    private void mnSeleksiAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSeleksiAdmActionPerformed
        // TODO add your handling code here:
        new frmSeleksiAdm().setVisible(true);
    }//GEN-LAST:event_mnSeleksiAdmActionPerformed

    private void mnPenilaianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnPenilaianActionPerformed
        // TODO add your handling code here:
        new frmSeleksiNilai().setVisible(true);
    }//GEN-LAST:event_mnPenilaianActionPerformed

    private void mnDataPesertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnDataPesertaActionPerformed
        // TODO add your handling code here:
        new frmSelectPeserta().setVisible(true);
    }//GEN-LAST:event_mnDataPesertaActionPerformed

    private void mnDatUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnDatUserActionPerformed
        // TODO add your handling code here:
        new frmDataUser().setVisible(true);
    }//GEN-LAST:event_mnDatUserActionPerformed

    private void mnLolosAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnLolosAdmActionPerformed
        // TODO add your handling code here:
        new frmSelectLolosAdm().setVisible(true);
    }//GEN-LAST:event_mnLolosAdmActionPerformed

    private void mnLolosNilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnLolosNilaiActionPerformed
        // TODO add your handling code here:
        new frmLolosSeleksiNilai().setVisible(true);
    }//GEN-LAST:event_mnLolosNilaiActionPerformed

    private void mnLolosFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnLolosFinalActionPerformed
        // TODO add your handling code here:
        new frmLolosFinal().setVisible(true);
    }//GEN-LAST:event_mnLolosFinalActionPerformed

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
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cmdExit;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem mnDatUser;
    private javax.swing.JMenu mnData;
    private javax.swing.JMenuItem mnDataPeserta;
    private javax.swing.JMenuItem mnKabKot;
    private javax.swing.JMenuItem mnKec;
    private javax.swing.JMenuItem mnKel;
    private javax.swing.JMenu mnLaporan;
    private javax.swing.JMenuItem mnLolosAdm;
    private javax.swing.JMenuItem mnLolosFinal;
    private javax.swing.JMenuItem mnLolosNilai;
    private javax.swing.JMenuItem mnPenilaian;
    private javax.swing.JMenuItem mnPeserta;
    private javax.swing.JMenu mnSeleksi;
    private javax.swing.JMenuItem mnSeleksiAdm;
    private javax.swing.JMenuItem mnUser;
    private javax.swing.JMenu mnUtility;
    // End of variables declaration//GEN-END:variables
}