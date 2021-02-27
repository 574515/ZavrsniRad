/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.skrbina.edunovazavrsnigalerija.view;

import hr.skrbina.edunovazavrsnigalerija.controller.ObradaAutor;
import hr.skrbina.edunovazavrsnigalerija.model.Autor;
import hr.skrbina.edunovazavrsnigalerija.utility.SkrbinaException;
import javax.swing.DefaultListModel;
import javax.swing.DefaultListSelectionModel;
import javax.swing.ImageIcon;

/**
 *
 * @author Hrvoje
 */
public class Autori extends javax.swing.JFrame {

    private ObradaAutor obrada;
    private Autor entitet;

    /* Creates new form Autori */
    public Autori() {
        initComponents();
        obrada = new ObradaAutor();
        setTitle("Gallery Exclusive - Autori");
        ucitajPodatke();
        
        autoriLst.setSelectionMode(DefaultListSelectionModel.SINGLE_SELECTION);
        if (autoriLst.isSelectionEmpty()) {
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

        porukaLbl = new javax.swing.JLabel();
        slikaLbl = new javax.swing.JLabel();
        ime = new javax.swing.JLabel();
        prezime = new javax.swing.JLabel();
        datum = new javax.swing.JLabel();
        oib = new javax.swing.JLabel();
        mjesto = new javax.swing.JLabel();
        iban = new javax.swing.JLabel();
        kontakt = new javax.swing.JLabel();
        imeTxt = new javax.swing.JTextField();
        prezimeTxt = new javax.swing.JTextField();
        oibTxt = new javax.swing.JTextField();
        mrTxt = new javax.swing.JTextField();
        ibanTxt = new javax.swing.JTextField();
        kontaktTxt = new javax.swing.JTextField();
        dodajBttn = new javax.swing.JButton();
        povratakBttn = new javax.swing.JButton();
        traziTxt = new javax.swing.JTextField();
        traziBttn = new javax.swing.JButton();
        izmijeniBttn = new javax.swing.JButton();
        obrisiBttn = new javax.swing.JButton();
        datumTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        autoriLst = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(685, 430));
        setMinimumSize(new java.awt.Dimension(685, 430));
        setName(""); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(685, 430));

        porukaLbl.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N
        porukaLbl.setText("jLabel9");

        slikaLbl.setBorder(new javax.swing.border.MatteBorder(null));
        slikaLbl.setMaximumSize(new java.awt.Dimension(150, 150));
        slikaLbl.setMinimumSize(new java.awt.Dimension(150, 150));
        slikaLbl.setPreferredSize(new java.awt.Dimension(150, 150));

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

        imeTxt.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        imeTxt.setText("ime");
        imeTxt.setMaximumSize(new java.awt.Dimension(239, 30));
        imeTxt.setMinimumSize(new java.awt.Dimension(239, 30));
        imeTxt.setName(""); // NOI18N
        imeTxt.setPreferredSize(new java.awt.Dimension(239, 30));

        prezimeTxt.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        prezimeTxt.setText("prezime");
        prezimeTxt.setMaximumSize(new java.awt.Dimension(239, 30));
        prezimeTxt.setMinimumSize(new java.awt.Dimension(239, 30));
        prezimeTxt.setName(""); // NOI18N
        prezimeTxt.setPreferredSize(new java.awt.Dimension(239, 30));

        oibTxt.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        oibTxt.setText("oib");
        oibTxt.setMaximumSize(new java.awt.Dimension(239, 30));
        oibTxt.setMinimumSize(new java.awt.Dimension(239, 30));
        oibTxt.setName(""); // NOI18N
        oibTxt.setPreferredSize(new java.awt.Dimension(239, 30));

        mrTxt.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        mrTxt.setText("mjesto");
        mrTxt.setMaximumSize(new java.awt.Dimension(239, 30));
        mrTxt.setMinimumSize(new java.awt.Dimension(239, 30));
        mrTxt.setName(""); // NOI18N
        mrTxt.setPreferredSize(new java.awt.Dimension(239, 30));

        ibanTxt.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        ibanTxt.setText("iban");
        ibanTxt.setMaximumSize(new java.awt.Dimension(239, 30));
        ibanTxt.setMinimumSize(new java.awt.Dimension(239, 30));
        ibanTxt.setName(""); // NOI18N
        ibanTxt.setPreferredSize(new java.awt.Dimension(239, 30));

        kontaktTxt.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        kontaktTxt.setText("kontakt");
        kontaktTxt.setMaximumSize(new java.awt.Dimension(239, 30));
        kontaktTxt.setMinimumSize(new java.awt.Dimension(239, 30));
        kontaktTxt.setName(""); // NOI18N
        kontaktTxt.setPreferredSize(new java.awt.Dimension(239, 30));

        dodajBttn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        dodajBttn.setText("Dodaj");
        dodajBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dodajBttnActionPerformed(evt);
            }
        });

        povratakBttn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        povratakBttn.setText("Povratak");
        povratakBttn.setMaximumSize(new java.awt.Dimension(72, 23));
        povratakBttn.setMinimumSize(new java.awt.Dimension(72, 23));
        povratakBttn.setPreferredSize(new java.awt.Dimension(72, 23));
        povratakBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                povratakBttnActionPerformed(evt);
            }
        });

        traziTxt.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        traziTxt.setText("trazi");
        traziTxt.setMaximumSize(new java.awt.Dimension(220, 30));
        traziTxt.setMinimumSize(new java.awt.Dimension(220, 30));
        traziTxt.setPreferredSize(new java.awt.Dimension(220, 30));

        traziBttn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        traziBttn.setText("Traži");
        traziBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                traziBttnActionPerformed(evt);
            }
        });

        izmijeniBttn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        izmijeniBttn.setText("Izmijeni");
        izmijeniBttn.setMaximumSize(new java.awt.Dimension(72, 23));
        izmijeniBttn.setMinimumSize(new java.awt.Dimension(72, 23));
        izmijeniBttn.setPreferredSize(new java.awt.Dimension(72, 23));
        izmijeniBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izmijeniBttnActionPerformed(evt);
            }
        });

        obrisiBttn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        obrisiBttn.setText("Obriši");
        obrisiBttn.setMaximumSize(new java.awt.Dimension(72, 23));
        obrisiBttn.setMinimumSize(new java.awt.Dimension(72, 23));
        obrisiBttn.setPreferredSize(new java.awt.Dimension(72, 23));
        obrisiBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obrisiBttnActionPerformed(evt);
            }
        });

        datumTxt.setText("datum");
        datumTxt.setMaximumSize(new java.awt.Dimension(239, 30));
        datumTxt.setMinimumSize(new java.awt.Dimension(239, 30));
        datumTxt.setName(""); // NOI18N
        datumTxt.setPreferredSize(new java.awt.Dimension(239, 30));

        autoriLst.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N
        autoriLst.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                autoriLstValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(autoriLst);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(traziTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(traziBttn))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(obrisiBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(izmijeniBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(dodajBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(povratakBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(porukaLbl))
                        .addGap(18, 18, 18)
                        .addComponent(slikaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kontakt)
                            .addComponent(iban)
                            .addComponent(mjesto)
                            .addComponent(oib)
                            .addComponent(datum)
                            .addComponent(prezime)
                            .addComponent(ime))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(oibTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mrTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ibanTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(prezimeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(datumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(kontaktTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(imeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(slikaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(traziTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(traziBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(izmijeniBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(obrisiBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(dodajBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(povratakBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(porukaLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(imeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ime))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(prezimeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(prezime))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(datumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(datum))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(oibTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(oib))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(mrTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mjesto))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ibanTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(iban))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(kontaktTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kontakt)))
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void povratakBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_povratakBttnActionPerformed
        this.dispose();
    }//GEN-LAST:event_povratakBttnActionPerformed

    private void dodajBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dodajBttnActionPerformed
        porukaLbl.setText("");
        entitet = new Autor();

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

    private void autoriLstValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_autoriLstValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }

        entitet = autoriLst.getSelectedValue();
        if (entitet == null) {
            return;
        }
        imeTxt.setText(entitet.getIme());
        prezimeTxt.setText(entitet.getPrezime());
        datumTxt.setText(entitet.getRodjendan());
        oibTxt.setText(entitet.getOib());
        mrTxt.setText(entitet.getMjesto_Rodjenja());
        ibanTxt.setText(entitet.getIBAN());
        kontaktTxt.setText(entitet.getKontakt());
    }//GEN-LAST:event_autoriLstValueChanged

    private void izmijeniBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izmijeniBttnActionPerformed
        entitet = autoriLst.getSelectedValue();
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

    private void obrisiBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obrisiBttnActionPerformed
        entitet = autoriLst.getSelectedValue();
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

    private void traziBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_traziBttnActionPerformed
        ucitajZaTrazi();
    }//GEN-LAST:event_traziBttnActionPerformed
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
 /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Autori().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<Autor> autoriLst;
    private javax.swing.JLabel datum;
    private javax.swing.JTextField datumTxt;
    private javax.swing.JButton dodajBttn;
    private javax.swing.JLabel iban;
    private javax.swing.JTextField ibanTxt;
    private javax.swing.JLabel ime;
    private javax.swing.JTextField imeTxt;
    private javax.swing.JButton izmijeniBttn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel kontakt;
    private javax.swing.JTextField kontaktTxt;
    private javax.swing.JLabel mjesto;
    private javax.swing.JTextField mrTxt;
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
        mrTxt.setText("");
        ibanTxt.setText("");
        kontaktTxt.setText("");
        porukaLbl.setText("");
    }

    private void ucitajPodatke() {
        DefaultListModel<Autor> m = new DefaultListModel<>();
        obrada.getPodaci().forEach(r -> m.addElement(r));
        autoriLst.setModel(m);
    }

    private void ucitajZaTrazi() {
        DefaultListModel<Autor> m = new DefaultListModel<>();
        obrada.getPodaci(traziTxt.getText()).forEach(k -> m.addElement(k));
        autoriLst.setModel(m);
    }

    private void postaviVrijednostiUEntitet() {
        entitet.setIme(imeTxt.getText());
        entitet.setPrezime(prezimeTxt.getText());
        entitet.setRodjendan(datumTxt.getText());
        entitet.setOib(oibTxt.getText());
        entitet.setMjesto_Rodjenja(mrTxt.getText());
        entitet.setIBAN(ibanTxt.getText());
        entitet.setKontakt(kontaktTxt.getText());
        entitet.setUlogaGalerija("autor");        

        obrada.setEntitet(entitet);
    }
}
