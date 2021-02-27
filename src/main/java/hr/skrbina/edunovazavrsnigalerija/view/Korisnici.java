/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.skrbina.edunovazavrsnigalerija.view;

import hr.skrbina.edunovazavrsnigalerija.controller.ObradaKorisnik;
import hr.skrbina.edunovazavrsnigalerija.model.Korisnik;
import hr.skrbina.edunovazavrsnigalerija.utility.SkrbinaException;
import javax.swing.DefaultListModel;
import javax.swing.DefaultListSelectionModel;
import javax.swing.ImageIcon;

/**
 *
 * @author Hrvoje
 */
public class Korisnici extends javax.swing.JFrame {
    /* Creates new form Korisnici */
        
    private ObradaKorisnik obrada;
    private Korisnik entitet;
    
    public Korisnici() {        
        initComponents();
        obrada = new ObradaKorisnik();
        setTitle("Gallery Exclusive - Korisnici");
        ucitajPodatke();
        
        korisniciLst.setSelectionMode(DefaultListSelectionModel.SINGLE_SELECTION);
        if (korisniciLst.isSelectionEmpty()) {
            obrisiBttn.setEnabled(false);
            izmijeniBttn.setEnabled(false);
        }
        
        slikaLbl.setIcon(new ImageIcon(getClass().getResource("/osoba_def.jpg")));
        traziTxt.requestFocus();
        
        emptyFields();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ime = new javax.swing.JLabel();
        prezime = new javax.swing.JLabel();
        datum = new javax.swing.JLabel();
        oib = new javax.swing.JLabel();
        mjesto = new javax.swing.JLabel();
        iban = new javax.swing.JLabel();
        kontakt = new javax.swing.JLabel();
        kontaktTxt = new javax.swing.JTextField();
        ibanTxt = new javax.swing.JTextField();
        mjestoTxt = new javax.swing.JTextField();
        oibTxt = new javax.swing.JTextField();
        prezimeTxt = new javax.swing.JTextField();
        imeTxt = new javax.swing.JTextField();
        slikaLbl = new javax.swing.JLabel();
        dodajBttn = new javax.swing.JButton();
        obrisiBttn = new javax.swing.JButton();
        izmijeniBttn = new javax.swing.JButton();
        povratakBttn = new javax.swing.JButton();
        datumTxt = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        korisniciLst = new javax.swing.JList<>();
        porukaLbl = new javax.swing.JLabel();
        traziTxt = new javax.swing.JTextField();
        traziBttn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        ime.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        ime.setText("Ime:");

        prezime.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        prezime.setText("Prezime:");

        datum.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        datum.setText("Datum rođenja:");

        oib.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        oib.setText("OIB:");

        mjesto.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        mjesto.setText("Mjesto rođenja:");

        iban.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        iban.setText("IBAN:");

        kontakt.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        kontakt.setText("Kontakt:");

        kontaktTxt.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        kontaktTxt.setText("kntkt");
        kontaktTxt.setMaximumSize(new java.awt.Dimension(81, 22));
        kontaktTxt.setMinimumSize(new java.awt.Dimension(81, 22));
        kontaktTxt.setPreferredSize(new java.awt.Dimension(81, 22));

        ibanTxt.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        ibanTxt.setText("iban");
        ibanTxt.setMaximumSize(new java.awt.Dimension(81, 22));
        ibanTxt.setMinimumSize(new java.awt.Dimension(81, 22));
        ibanTxt.setPreferredSize(new java.awt.Dimension(81, 22));

        mjestoTxt.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        mjestoTxt.setText("mr");
        mjestoTxt.setMaximumSize(new java.awt.Dimension(81, 22));
        mjestoTxt.setMinimumSize(new java.awt.Dimension(81, 22));
        mjestoTxt.setPreferredSize(new java.awt.Dimension(81, 22));

        oibTxt.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        oibTxt.setText("oib");
        oibTxt.setMaximumSize(new java.awt.Dimension(81, 22));
        oibTxt.setMinimumSize(new java.awt.Dimension(81, 22));
        oibTxt.setPreferredSize(new java.awt.Dimension(81, 22));

        prezimeTxt.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        prezimeTxt.setText("prezime");
        prezimeTxt.setMaximumSize(new java.awt.Dimension(81, 22));
        prezimeTxt.setMinimumSize(new java.awt.Dimension(81, 22));
        prezimeTxt.setPreferredSize(new java.awt.Dimension(81, 22));

        imeTxt.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        imeTxt.setText("ime");
        imeTxt.setMaximumSize(new java.awt.Dimension(81, 22));
        imeTxt.setMinimumSize(new java.awt.Dimension(81, 22));
        imeTxt.setPreferredSize(new java.awt.Dimension(81, 22));

        slikaLbl.setMaximumSize(new java.awt.Dimension(150, 150));
        slikaLbl.setMinimumSize(new java.awt.Dimension(150, 150));
        slikaLbl.setPreferredSize(new java.awt.Dimension(150, 150));

        dodajBttn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        dodajBttn.setText("Dodaj");
        dodajBttn.setMaximumSize(new java.awt.Dimension(127, 24));
        dodajBttn.setMinimumSize(new java.awt.Dimension(127, 24));
        dodajBttn.setPreferredSize(new java.awt.Dimension(127, 24));
        dodajBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dodajBttnActionPerformed(evt);
            }
        });

        obrisiBttn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        obrisiBttn.setText("Obriši");
        obrisiBttn.setMaximumSize(new java.awt.Dimension(127, 24));
        obrisiBttn.setMinimumSize(new java.awt.Dimension(127, 24));
        obrisiBttn.setPreferredSize(new java.awt.Dimension(127, 24));
        obrisiBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obrisiBttnActionPerformed(evt);
            }
        });

        izmijeniBttn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        izmijeniBttn.setText("Izmijeni");
        izmijeniBttn.setMaximumSize(new java.awt.Dimension(127, 24));
        izmijeniBttn.setMinimumSize(new java.awt.Dimension(127, 24));
        izmijeniBttn.setPreferredSize(new java.awt.Dimension(127, 24));
        izmijeniBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izmijeniBttnActionPerformed(evt);
            }
        });

        povratakBttn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        povratakBttn.setText("Povratak");
        povratakBttn.setMaximumSize(new java.awt.Dimension(127, 50));
        povratakBttn.setMinimumSize(new java.awt.Dimension(127, 50));
        povratakBttn.setPreferredSize(new java.awt.Dimension(127, 50));
        povratakBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                povratakBttnActionPerformed(evt);
            }
        });

        datumTxt.setText("datum");

        korisniciLst.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N
        korisniciLst.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        korisniciLst.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                korisniciLstValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(korisniciLst);

        porukaLbl.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N
        porukaLbl.setText("jLabel8");

        traziTxt.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        traziTxt.setText("jTextField1");

        traziBttn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        traziBttn.setText("Traži");
        traziBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                traziBttnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(slikaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(porukaLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dodajBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(izmijeniBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(obrisiBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(povratakBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(traziBttn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(traziTxt))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ime)
                                    .addComponent(prezime)
                                    .addComponent(oib)
                                    .addComponent(mjesto)
                                    .addComponent(iban)
                                    .addComponent(kontakt)
                                    .addComponent(datum))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(mjestoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(imeTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(prezimeTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ibanTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(kontaktTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(oibTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(datumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(slikaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(porukaLbl))
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
                                    .addComponent(datum)
                                    .addComponent(datumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(oibTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(oib))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(mjestoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mjesto))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ibanTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(iban))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(kontaktTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kontakt))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(povratakBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(obrisiBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(izmijeniBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dodajBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(traziTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(traziBttn)))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void povratakBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_povratakBttnActionPerformed
        this.dispose();
    }//GEN-LAST:event_povratakBttnActionPerformed

    private void dodajBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dodajBttnActionPerformed
        porukaLbl.setText("");
        entitet = new Korisnik();

        postaviVrijednostiUEntitet();

        obrada.setEntitet(entitet);
        try {
            obrada.create();
            ucitajPodatke();
            emptyFields();
        } catch (SkrbinaException ex) {
            porukaLbl.setText(ex.getPoruka());
        }       
    }//GEN-LAST:event_dodajBttnActionPerformed

    private void obrisiBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obrisiBttnActionPerformed
        entitet = korisniciLst.getSelectedValue();
        if (entitet == null) {
            return;
        }

        obrada.setEntitet(entitet);

        try {
            obrada.delete();
            ucitajPodatke();
            emptyFields();
        } catch (SkrbinaException e) {
            porukaLbl.setText(e.getPoruka());
        }
    }//GEN-LAST:event_obrisiBttnActionPerformed

    private void izmijeniBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izmijeniBttnActionPerformed
        entitet = korisniciLst.getSelectedValue();
        if (entitet == null) {
            return;
        }
        postaviVrijednostiUEntitet();

        try {
            obrada.update();
            ucitajPodatke();
            emptyFields();
        } catch (SkrbinaException e) {
            porukaLbl.setText(e.getPoruka());
        }
    }//GEN-LAST:event_izmijeniBttnActionPerformed

    private void traziBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_traziBttnActionPerformed
        ucitajZaTrazi();
    }//GEN-LAST:event_traziBttnActionPerformed

    private void korisniciLstValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_korisniciLstValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }

        entitet = korisniciLst.getSelectedValue();
        if (entitet == null) {
            return;
        }
        imeTxt.setText(entitet.getIme());
        prezimeTxt.setText(entitet.getPrezime());
        datumTxt.setText(entitet.getRodjendan());
        oibTxt.setText(entitet.getOib());
        mjestoTxt.setText(entitet.getMjesto_Rodjenja());
        ibanTxt.setText(entitet.getIBAN());
        kontaktTxt.setText(entitet.getKontakt());
    }//GEN-LAST:event_korisniciLstValueChanged

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
            java.util.logging.Logger.getLogger(Korisnici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Korisnici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Korisnici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Korisnici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Korisnici().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel datum;
    private javax.swing.JTextField datumTxt;
    private javax.swing.JButton dodajBttn;
    private javax.swing.JLabel iban;
    private javax.swing.JTextField ibanTxt;
    private javax.swing.JLabel ime;
    private javax.swing.JTextField imeTxt;
    private javax.swing.JButton izmijeniBttn;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel kontakt;
    private javax.swing.JTextField kontaktTxt;
    private javax.swing.JList<Korisnik> korisniciLst;
    private javax.swing.JLabel mjesto;
    private javax.swing.JTextField mjestoTxt;
    private javax.swing.JButton obrisiBttn;
    private javax.swing.JLabel oib;
    private javax.swing.JTextField oibTxt;
    private javax.swing.JLabel porukaLbl;
    private javax.swing.JButton povratakBttn;
    private javax.swing.JLabel prezime;
    private javax.swing.JTextField prezimeTxt;
    private javax.swing.JLabel slikaLbl;
    private javax.swing.JButton traziBttn;
    private javax.swing.JTextField traziTxt;
    // End of variables declaration//GEN-END:variables

    private void emptyFields() {
        traziTxt.setText("");
        imeTxt.setText("");
        prezimeTxt.setText("");
        datumTxt.setText("");
        oibTxt.setText("");
        mjestoTxt.setText("");
        ibanTxt.setText("");
        kontaktTxt.setText("");
        porukaLbl.setText("");
    }

    private void ucitajPodatke() {
        DefaultListModel<Korisnik> m = new DefaultListModel<>();
        obrada.getPodaci().forEach(r -> m.addElement(r));
        korisniciLst.setModel(m);
    }

    private void ucitajZaTrazi() {
        DefaultListModel<Korisnik> m = new DefaultListModel<>();
        obrada.getPodaci(traziTxt.getText()).forEach(k -> m.addElement(k));
        korisniciLst.setModel(m);
    }

    private void postaviVrijednostiUEntitet() {
        entitet.setIme(imeTxt.getText());
        entitet.setPrezime(prezimeTxt.getText());
        entitet.setRodjendan(datumTxt.getText());
        entitet.setOib(oibTxt.getText());
        entitet.setMjesto_Rodjenja(mjestoTxt.getText());
        entitet.setIBAN(ibanTxt.getText());
        entitet.setKontakt(kontaktTxt.getText());
        entitet.setUlogaGalerija("korisnik");        

        obrada.setEntitet(entitet);
    }    
}
