/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.skrbina.edunovazavrsnigalerija.view;

import hr.skrbina.edunovazavrsnigalerija.controller.ObradaOperater;
import hr.skrbina.edunovazavrsnigalerija.model.Operater;
import hr.skrbina.edunovazavrsnigalerija.model.Operater.Uloga;
import hr.skrbina.edunovazavrsnigalerija.utility.SkrbinaException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author User
 */
public class Operateri extends javax.swing.JFrame {
    
    private ObradaOperater obrada;
    private Operater entitet;
    /**
     * Creates new form Operater
     */
    public Operateri() {
        initComponents();
        clearFields();
        //obrada = new ObradaOperater();        
        setTitle("Gallery Exclusive - Operateri");
        //ucitajPodatke();
        ulogaCmb.setModel(new DefaultComboBoxModel(Operater.Uloga.values()));
        ulogaCmb.setSelectedIndex(-1);
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
        operLst = new javax.swing.JList<>();
        dodajBttn = new javax.swing.JButton();
        izmijeniBttn = new javax.swing.JButton();
        obrisiBttn = new javax.swing.JButton();
        povratakBttn = new javax.swing.JButton();
        ime = new javax.swing.JLabel();
        prezime = new javax.swing.JLabel();
        oib = new javax.swing.JLabel();
        kontakt = new javax.swing.JLabel();
        uloga = new javax.swing.JLabel();
        pwd = new javax.swing.JLabel();
        imeTxt = new javax.swing.JTextField();
        prezimeTxt = new javax.swing.JTextField();
        oibTxt = new javax.swing.JTextField();
        kontaktTxt = new javax.swing.JTextField();
        ulogaCmb = new javax.swing.JComboBox<>();
        pwdTxt = new javax.swing.JPasswordField();
        porukaLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        operLst.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N
        operLst.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        operLst.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                operLstValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(operLst);

        dodajBttn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        dodajBttn.setText("Dodaj");
        dodajBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dodajBttnActionPerformed(evt);
            }
        });

        izmijeniBttn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        izmijeniBttn.setText("Izmijeni");
        izmijeniBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izmijeniBttnActionPerformed(evt);
            }
        });

        obrisiBttn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        obrisiBttn.setText("Obriši");
        obrisiBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obrisiBttnActionPerformed(evt);
            }
        });

        povratakBttn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        povratakBttn.setText("Povratak");
        povratakBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                povratakBttnActionPerformed(evt);
            }
        });

        ime.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        ime.setText("Ime:");

        prezime.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        prezime.setText("Prezime:");

        oib.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        oib.setText("OIB:");

        kontakt.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        kontakt.setText("Kontakt:");

        uloga.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        uloga.setText("Uloga:");

        pwd.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        pwd.setText("Lozinka:");

        imeTxt.setText("jTextField1");

        prezimeTxt.setText("jTextField2");

        oibTxt.setText("jTextField3");

        kontaktTxt.setText("jTextField4");

        pwdTxt.setText("jPasswordField1");

        porukaLbl.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N
        porukaLbl.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(porukaLbl)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(pwd)
                                .addComponent(oib)
                                .addComponent(prezime)
                                .addComponent(kontakt)
                                .addComponent(uloga)
                                .addComponent(ime))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(pwdTxt)
                                .addComponent(ulogaCmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(oibTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                                    .addComponent(prezimeTxt)
                                    .addComponent(imeTxt))
                                .addComponent(kontaktTxt)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(dodajBttn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(izmijeniBttn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(obrisiBttn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(povratakBttn))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(imeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ime))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prezimeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prezime))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(oibTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(oib))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kontaktTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kontakt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ulogaCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uloga))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pwdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pwd))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dodajBttn)
                            .addComponent(izmijeniBttn)
                            .addComponent(obrisiBttn)
                            .addComponent(povratakBttn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(porukaLbl))
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void povratakBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_povratakBttnActionPerformed
        this.dispose();
    }//GEN-LAST:event_povratakBttnActionPerformed

    private void operLstValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_operLstValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }
        
        entitet = operLst.getSelectedValue();
        if (entitet == null) {
            return;
        }
        
        imeTxt.setText(entitet.getIme());
        prezimeTxt.setText(entitet.getPrezime());
        oibTxt.setText(entitet.getOib());
        kontaktTxt.setText(entitet.getKontakt());
        ulogaCmb.setSelectedItem(entitet.getUloga());
        pwdTxt.setText(entitet.getLozinka());
    }//GEN-LAST:event_operLstValueChanged

    private void dodajBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dodajBttnActionPerformed
        porukaLbl.setText("");
        entitet = new Operater();
        
        postaviVrijednostiUEntitet();
        
        obrada.setEntitet(entitet);
        try {
            obrada.create();
            ucitajPodatke();
            clearFields();
        } catch (SkrbinaException ex) {
            porukaLbl.setText(ex.getPoruka());
        }
    }//GEN-LAST:event_dodajBttnActionPerformed

    private void izmijeniBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izmijeniBttnActionPerformed
        entitet = operLst.getSelectedValue();
        if (entitet == null) {
            return;
        }
        postaviVrijednostiUEntitet();
        
        try {
            obrada.update();
            ucitajPodatke();
            clearFields();
        } catch (SkrbinaException e) {
            porukaLbl.setText(e.getPoruka());
        }
    }//GEN-LAST:event_izmijeniBttnActionPerformed

    private void obrisiBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obrisiBttnActionPerformed
        entitet = operLst.getSelectedValue();
        if (entitet == null) {
            return;
        }
        
        obrada.setEntitet(entitet);
        
        try {
            obrada.delete();
            ucitajPodatke();
            clearFields();
        } catch (SkrbinaException e) {
            porukaLbl.setText(e.getPoruka());
        }
    }//GEN-LAST:event_obrisiBttnActionPerformed

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
            java.util.logging.Logger.getLogger(Operateri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Operateri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Operateri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Operateri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Operateri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dodajBttn;
    private javax.swing.JLabel ime;
    private javax.swing.JTextField imeTxt;
    private javax.swing.JButton izmijeniBttn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel kontakt;
    private javax.swing.JTextField kontaktTxt;
    private javax.swing.JButton obrisiBttn;
    private javax.swing.JLabel oib;
    private javax.swing.JTextField oibTxt;
    private javax.swing.JList<Operater> operLst;
    private javax.swing.JLabel porukaLbl;
    private javax.swing.JButton povratakBttn;
    private javax.swing.JLabel prezime;
    private javax.swing.JTextField prezimeTxt;
    private javax.swing.JLabel pwd;
    private javax.swing.JPasswordField pwdTxt;
    private javax.swing.JLabel uloga;
    private javax.swing.JComboBox<String> ulogaCmb;
    // End of variables declaration//GEN-END:variables

    private void ucitajPodatke() {
        DefaultListModel<Operater> m = new DefaultListModel<>();
        obrada.getPodaci().forEach(o -> m.addElement(o));        
        operLst.setModel(m);        
    }
    
    private void clearFields() {
        imeTxt.setText("");
        prezimeTxt.setText("");
        oibTxt.setText("");
        kontaktTxt.setText("");
        ulogaCmb.setSelectedIndex(-1);
        pwdTxt.setText("");
        porukaLbl.setText("");        
    }
    
    private void postaviVrijednostiUEntitet() {
        entitet.setIme(imeTxt.getText());
        entitet.setPrezime(prezimeTxt.getText());
        entitet.setOib(oibTxt.getText());
        entitet.setKontakt(kontaktTxt.getText());
        entitet.setUloga((Uloga) ulogaCmb.getSelectedItem());
        entitet.setLozinka(BCrypt.hashpw(pwdTxt.getText(), BCrypt.gensalt()));
        
        obrada.setEntitet(entitet);
    }
    
}