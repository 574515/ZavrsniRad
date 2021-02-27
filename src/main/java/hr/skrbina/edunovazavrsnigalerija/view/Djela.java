/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.skrbina.edunovazavrsnigalerija.view;

import hr.skrbina.edunovazavrsnigalerija.controller.ObradaAutor;
import hr.skrbina.edunovazavrsnigalerija.controller.ObradaDjelo;
import hr.skrbina.edunovazavrsnigalerija.model.Autor;
import hr.skrbina.edunovazavrsnigalerija.model.Djelo;
import hr.skrbina.edunovazavrsnigalerija.utility.SkrbinaException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListSelectionModel;
import javax.swing.ImageIcon;
import javax.swing.DefaultListModel;

/**
 *
 * @author Hrvoje
 */
public class Djela extends javax.swing.JFrame {

    private ObradaDjelo obrada;
    private Djelo entitet;
    private ImageIcon img;

    /**
     * Creates new form Djela
     */
    public Djela() {
        initComponents();
        obrada = new ObradaDjelo();
        setTitle("Gallery Exclusive - Djela");
        ucitajPodatke();
        checkAndEmpty();
        
        /*ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Selected: " + autorCmb.getSelectedItem());
                System.out.println(", Position: " + autorCmb.getSelectedIndex());
            }
        };
        autorCmb.addActionListener(actionListener);*/
        
        djelaLst.setSelectionMode(DefaultListSelectionModel.SINGLE_SELECTION);
        pregledLbl.setIcon(new ImageIcon(getClass().getResource("/default.jpg")));
        if (djelaLst.isSelectionEmpty()) {
            izmijeniBttn.setEnabled(false);
            obrisiBttn.setEnabled(false);
        }

        DefaultComboBoxModel<Autor> mr = new DefaultComboBoxModel<>();
        new ObradaAutor().getPodaci().forEach(r -> {
            mr.addElement(r);
        });
        autorCmb.setModel(mr);
        autorCmb.setSelectedIndex(-1);
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
        djelaLst = new javax.swing.JList<>();
        pregledLbl = new javax.swing.JLabel();
        naziv = new javax.swing.JLabel();
        autor = new javax.swing.JLabel();
        datum = new javax.swing.JLabel();
        datumTxt = new javax.swing.JFormattedTextField();
        nazivTxt = new javax.swing.JTextField();
        opisTxt = new javax.swing.JTextField();
        opis = new javax.swing.JLabel();
        dodajBttn = new javax.swing.JButton();
        izmijeniBttn = new javax.swing.JButton();
        obrisiBttn = new javax.swing.JButton();
        povratakBttn = new javax.swing.JButton();
        autorCmb = new javax.swing.JComboBox<>();
        porukaLbl = new javax.swing.JLabel();
        cijenaTxt = new javax.swing.JTextField();
        cijena = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        djelaLst.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N        
        djelaLst.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        djelaLst.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                djelaLstValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(djelaLst);

        pregledLbl.setMaximumSize(new java.awt.Dimension(536, 300));
        pregledLbl.setMinimumSize(new java.awt.Dimension(536, 300));
        pregledLbl.setName(""); // NOI18N
        pregledLbl.setPreferredSize(new java.awt.Dimension(536, 300));

        naziv.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        naziv.setText("Naziv:");

        autor.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        autor.setText("Autor:");

        datum.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        datum.setText("Datum:");

        datumTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd.MM.yyyy."))));
        datumTxt.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N

        nazivTxt.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        nazivTxt.setText("Unesite naziv...");

        opisTxt.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        opisTxt.setText("Unesite opis...");

        opis.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        opis.setText("Opis:");

        dodajBttn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        dodajBttn.setText("Dodaj");
        dodajBttn.setMaximumSize(new java.awt.Dimension(96, 40));
        dodajBttn.setMinimumSize(new java.awt.Dimension(96, 40));
        dodajBttn.setPreferredSize(new java.awt.Dimension(96, 40));
        dodajBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dodajBttnActionPerformed(evt);
            }
        });

        izmijeniBttn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        izmijeniBttn.setText("Izmijeni");
        izmijeniBttn.setMaximumSize(new java.awt.Dimension(96, 40));
        izmijeniBttn.setMinimumSize(new java.awt.Dimension(96, 40));
        izmijeniBttn.setPreferredSize(new java.awt.Dimension(96, 40));
        izmijeniBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izmijeniBttnActionPerformed(evt);
            }
        });

        obrisiBttn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        obrisiBttn.setText("Obriši");
        obrisiBttn.setMaximumSize(new java.awt.Dimension(96, 40));
        obrisiBttn.setMinimumSize(new java.awt.Dimension(96, 40));
        obrisiBttn.setPreferredSize(new java.awt.Dimension(96, 40));
        obrisiBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obrisiBttnActionPerformed(evt);
            }
        });

        povratakBttn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        povratakBttn.setText("Povratak");
        povratakBttn.setMaximumSize(new java.awt.Dimension(96, 40));
        povratakBttn.setMinimumSize(new java.awt.Dimension(96, 40));
        povratakBttn.setPreferredSize(new java.awt.Dimension(96, 40));
        povratakBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                povratakBttnActionPerformed(evt);
            }
        });

        autorCmb.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N

        porukaLbl.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N
        porukaLbl.setText("jLabel1");

        cijenaTxt.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        cijenaTxt.setText("jTextField1");

        cijena.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        cijena.setText("Cijena:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pregledLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(naziv)
                            .addComponent(autor)
                            .addComponent(datum)
                            .addComponent(opis)
                            .addComponent(cijena))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(datumTxt)
                            .addComponent(opisTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nazivTxt)
                            .addComponent(autorCmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cijenaTxt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(obrisiBttn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(povratakBttn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dodajBttn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(izmijeniBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(porukaLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(pregledLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(porukaLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nazivTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(naziv))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(autor)
                            .addComponent(autorCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(datumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(datum))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opis)
                            .addComponent(opisTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cijenaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cijena)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dodajBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(izmijeniBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(obrisiBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(povratakBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void povratakBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_povratakBttnActionPerformed
        this.dispose();
    }//GEN-LAST:event_povratakBttnActionPerformed

    private void djelaLstValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_djelaLstValueChanged
        try {
            String slika = djelaLst.getSelectedValue().getNaziv();
            img = new ImageIcon(getClass().getResource("/" + slika + ".jpg"));
            if (img != null) {
                pregledLbl.setIcon(img);
                pregledLbl.setText("");
                izmijeniBttn.setEnabled(true);
                obrisiBttn.setEnabled(true);
            } else {
                pregledLbl.setIcon(new ImageIcon(getClass().getResource("/default.jpg")));
                pregledLbl.setText("");
                izmijeniBttn.setEnabled(false);
            }
        } catch (java.lang.ClassCastException x) {
            System.out.println("SKRTSKRT");
        }
    }//GEN-LAST:event_djelaLstValueChanged

    private void dodajBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dodajBttnActionPerformed
        porukaLbl.setText("");
        entitet = new Djelo();

        postaviVrijednostiUEntitet();

        obrada.setEntitet(entitet);
        try {
            obrada.create();
            ucitajPodatke();
            ocistiPolja();
        } catch (SkrbinaException ex) {
            porukaLbl.setText(ex.getPoruka());
        }
    }//GEN-LAST:event_dodajBttnActionPerformed

    private void izmijeniBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izmijeniBttnActionPerformed
        entitet = djelaLst.getSelectedValue();
        if (entitet == null) {
            return;
        }
        postaviVrijednostiUEntitet();

        try {
            obrada.update();
            ucitajPodatke();
            ocistiPolja();
        } catch (SkrbinaException e) {
            porukaLbl.setText(e.getPoruka());
        }
    }//GEN-LAST:event_izmijeniBttnActionPerformed

    private void obrisiBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obrisiBttnActionPerformed
        entitet = djelaLst.getSelectedValue();
        if (entitet == null) {
            return;
        }

        obrada.setEntitet(entitet);

        try {
            obrada.delete();
            ucitajPodatke();
            ocistiPolja();
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
            java.util.logging.Logger.getLogger(Djela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Djela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Djela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Djela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Djela().setVisible(true);
            }
        });
    }

    private void ucitajPodatke() {
        DefaultListModel<Djelo> d = new DefaultListModel<>();
        obrada.getPodaci().forEach(k -> d.addElement(k));
        djelaLst.setModel(d);
    }

    private void ocistiPolja() {
        nazivTxt.setText("");
        autorCmb.setSelectedIndex(-1);
        datumTxt.setText("");
        opisTxt.setText("");
        cijenaTxt.setText("");
    }

    private void postaviVrijednostiUEntitet() {
        entitet.setNaziv(nazivTxt.getText());
        // set autor
        entitet.setAutor((Autor)autorCmb.getSelectedItem()); // ???
        entitet.setDatum(datumTxt.getText());
        entitet.setOpis(opisTxt.getText());
        entitet.setCijena(Double.parseDouble(cijenaTxt.getText()));
        obrada.setEntitet(entitet);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel autor;
    private javax.swing.JComboBox<Autor> autorCmb;
    private javax.swing.JLabel cijena;
    private javax.swing.JTextField cijenaTxt;
    private javax.swing.JLabel datum;
    private javax.swing.JFormattedTextField datumTxt;
    private javax.swing.JList<Djelo> djelaLst;
    private javax.swing.JButton dodajBttn;
    private javax.swing.JButton izmijeniBttn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel naziv;
    private javax.swing.JTextField nazivTxt;
    private javax.swing.JButton obrisiBttn;
    private javax.swing.JLabel opis;
    private javax.swing.JTextField opisTxt;
    private javax.swing.JLabel porukaLbl;
    private javax.swing.JButton povratakBttn;
    private javax.swing.JLabel pregledLbl;
    // End of variables declaration//GEN-END:variables

    private void checkAndEmpty() {
        if (djelaLst.isSelectionEmpty()) {
            obrisiBttn.setEnabled(false);
            izmijeniBttn.setEnabled(false);
        }
        nazivTxt.setText("");
        datumTxt.setText("");
        opisTxt.setText("");
        autorCmb.setSelectedIndex(-1);
        porukaLbl.setText("");
        cijenaTxt.setText("");
    }
}