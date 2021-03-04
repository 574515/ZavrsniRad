/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.skrbina.edunovazavrsnigalerija.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author Hrvoje
 */
public class Izbornik extends javax.swing.JFrame {

    /**
     * Creates new form Izbornik
     */
    public Izbornik() {
        initComponents();
        setTitle(Aplikacija.NASLOV_APP + " - Izbornik");
        vrijemeLbl.setForeground(Color.white);
        SimpleDateFormat myTime = new SimpleDateFormat("HH:mm:ss" + "    " + "dd.MM.YYYY.");
        Timer SimpleTimer = new Timer(1000, (ActionEvent e) -> {
            vrijemeLbl.setText(myTime.format(new Date()));
        });
        SimpleTimer.start();        
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
        vrijemeLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        gallerMenu = new javax.swing.JMenu();
        djelaMenu = new javax.swing.JMenuItem();
        izlozbeMenu = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        exitG = new javax.swing.JMenuItem();
        adminMenu = new javax.swing.JMenu();
        autoriMenu = new javax.swing.JMenuItem();
        korisniciMenu = new javax.swing.JMenuItem();
        kustosiMenu = new javax.swing.JMenuItem();
        operateriMenu = new javax.swing.JMenuItem();
        transakcijeMenu = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        exitA = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Galerija Exclusive");
        setMaximumSize(new java.awt.Dimension(500, 400));
        setMinimumSize(new java.awt.Dimension(500, 400));
        setPreferredSize(new java.awt.Dimension(500, 400));
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vrijemeLbl.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N
        jPanel1.add(vrijemeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tenor.gif"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        gallerMenu.setText("Galerija");

        djelaMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, 0));
        djelaMenu.setText("Djela");
        djelaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                djelaMenuActionPerformed(evt);
            }
        });
        gallerMenu.add(djelaMenu);

        izlozbeMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, 0));
        izlozbeMenu.setText("Izložbe");
        izlozbeMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izlozbeMenuActionPerformed(evt);
            }
        });
        gallerMenu.add(izlozbeMenu);
        gallerMenu.add(jSeparator2);

        exitG.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        exitG.setText("Izlaz");
        exitG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitGActionPerformed(evt);
            }
        });
        gallerMenu.add(exitG);

        jMenuBar1.add(gallerMenu);

        adminMenu.setText("Administracija");

        autoriMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, 0));
        autoriMenu.setText("Autori");
        autoriMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autoriMenuActionPerformed(evt);
            }
        });
        adminMenu.add(autoriMenu);

        korisniciMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, 0));
        korisniciMenu.setText("Korisnici");
        korisniciMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                korisniciMenuActionPerformed(evt);
            }
        });
        adminMenu.add(korisniciMenu);

        kustosiMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, 0));
        kustosiMenu.setText("Kustosi");
        kustosiMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kustosiMenuActionPerformed(evt);
            }
        });
        adminMenu.add(kustosiMenu);

        operateriMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, 0));
        operateriMenu.setText("Operateri");
        operateriMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operateriMenuActionPerformed(evt);
            }
        });
        adminMenu.add(operateriMenu);

        transakcijeMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, 0));
        transakcijeMenu.setText("Transakcije");
        transakcijeMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transakcijeMenuActionPerformed(evt);
            }
        });
        adminMenu.add(transakcijeMenu);
        adminMenu.add(jSeparator1);

        exitA.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        exitA.setText("Izlaz");
        exitA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitAActionPerformed(evt);
            }
        });
        adminMenu.add(exitA);

        jMenuBar1.add(adminMenu);

        helpMenu.setText("Pomoć");
        jMenuBar1.add(helpMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Izbornik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Izbornik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Izbornik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Izbornik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Izbornik().setVisible(true);
        });
    }
    
    private void korisniciMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_korisniciMenuActionPerformed
        Korisnici kor = new Korisnici();
        kor.setVisible(true);
        kor.setLocationRelativeTo(null);
    }//GEN-LAST:event_korisniciMenuActionPerformed

    private void izlozbeMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izlozbeMenuActionPerformed
        Izlozbe izl = new Izlozbe();
        izl.setVisible(true);
        izl.setLocationRelativeTo(null);
    }//GEN-LAST:event_izlozbeMenuActionPerformed

    private void exitAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitAActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitAActionPerformed

    private void djelaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_djelaMenuActionPerformed
        Djela dj = new Djela();
        dj.setVisible(true);
        dj.setLocationRelativeTo(null);
    }//GEN-LAST:event_djelaMenuActionPerformed

    private void exitGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitGActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitGActionPerformed

    private void kustosiMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kustosiMenuActionPerformed
        Kustosi kust = new Kustosi();
        kust.setVisible(true);
        kust.setLocationRelativeTo(null);
    }//GEN-LAST:event_kustosiMenuActionPerformed

    private void autoriMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autoriMenuActionPerformed
        Autori aut = new Autori();
        aut.setVisible(true);
        aut.setLocationRelativeTo(null);
    }//GEN-LAST:event_autoriMenuActionPerformed

    private void transakcijeMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transakcijeMenuActionPerformed
        Transakcije trs = new Transakcije();
        trs.setVisible(true);
        trs.setLocationRelativeTo(null);
    }//GEN-LAST:event_transakcijeMenuActionPerformed

    private void operateriMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operateriMenuActionPerformed
        Operateri oper = new Operateri();
        oper.setVisible(true);
        oper.setLocationRelativeTo(null);
    }//GEN-LAST:event_operateriMenuActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu adminMenu;
    private javax.swing.JMenuItem autoriMenu;
    private javax.swing.JMenuItem djelaMenu;
    private javax.swing.JMenuItem exitA;
    private javax.swing.JMenuItem exitG;
    private javax.swing.JMenu gallerMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem izlozbeMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenuItem korisniciMenu;
    private javax.swing.JMenuItem kustosiMenu;
    private javax.swing.JMenuItem operateriMenu;
    private javax.swing.JMenuItem transakcijeMenu;
    private javax.swing.JLabel vrijemeLbl;
    // End of variables declaration//GEN-END:variables
}
