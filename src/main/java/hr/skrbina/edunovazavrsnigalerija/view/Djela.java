/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.skrbina.edunovazavrsnigalerija.view;

import hr.skrbina.edunovazavrsnigalerija.controller.ObradaDjelo;
import hr.skrbina.edunovazavrsnigalerija.model.Autor;
import hr.skrbina.edunovazavrsnigalerija.model.Djelo;
import hr.skrbina.edunovazavrsnigalerija.utility.SkrbinaException;
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
    ImageIcon dflt = new ImageIcon(getClass().getResource("/default.jpg"));

    /**
     * Creates new form Djela
     */
    public Djela() {
        initComponents();
        lstDjela.setSelectionMode(DefaultListSelectionModel.SINGLE_SELECTION);
        pregled.setIcon(dflt);
        if (lstDjela.isSelectionEmpty()) {
            izmijeniBttn.setEnabled(false);
            obrisiBttn.setEnabled(false);
        }
        //obrada = new ObradaDjelo();
        //ucitajPodatke();
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
        lstDjela = new javax.swing.JList<>();
        pregled = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        datum = new javax.swing.JFormattedTextField();
        naziv = new javax.swing.JTextField();
        opis = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dodajBttn = new javax.swing.JButton();
        izmijeniBttn = new javax.swing.JButton();
        obrisiBttn = new javax.swing.JButton();
        povratakBttn = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lstDjela.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N
        lstDjela.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Vincent", "Dali", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstDjela.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstDjelaValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstDjela);

        jLabel2.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        jLabel2.setText("Naziv:");

        jLabel3.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        jLabel3.setText("Autor:");

        jLabel4.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        jLabel4.setText("Datum:");

        datum.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd.MM.yyyy."))));
        datum.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N

        naziv.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        naziv.setText("Unesite naziv...");

        opis.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        opis.setText("Unesite opis...");

        jLabel5.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        jLabel5.setText("Opis:");

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

        povratakBttn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        povratakBttn.setText("Povratak");
        povratakBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                povratakBttnActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pregled, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(datum)
                            .addComponent(opis, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(naziv)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(obrisiBttn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(povratakBttn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(izmijeniBttn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dodajBttn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(pregled, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(naziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(datum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(opis)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dodajBttn, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(izmijeniBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(obrisiBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(povratakBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void povratakBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_povratakBttnActionPerformed
        this.dispose();
    }//GEN-LAST:event_povratakBttnActionPerformed

    private void lstDjelaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstDjelaValueChanged
        String slika = lstDjela.getSelectedValue();
        ImageIcon image = new ImageIcon(
                getClass().getResource(
                        "/" + slika + ".jpg"));
        if (image != null) {
            pregled.setIcon(image);
            pregled.setText("");
            izmijeniBttn.setEnabled(true);
            obrisiBttn.setEnabled(true);
        } else {
            pregled.setIcon(dflt);
            pregled.setText("");
            //izmijeniBttn.setEnabled(false);
        }
    }//GEN-LAST:event_lstDjelaValueChanged

    private void dodajBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dodajBttnActionPerformed
        entitet = new Djelo();
        postaviVrijednostiUEntitet();
        obrada.setEntitet(entitet);
        try {
            obrada.create();
            ucitajPodatke();
            ocistiPolja();
        } catch (SkrbinaException ex) {
            jLabel2.setText(ex.getPoruka()); //provjera
        }
    }//GEN-LAST:event_dodajBttnActionPerformed

    private void izmijeniBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izmijeniBttnActionPerformed
        //entitet = lstDjela.getSelectedValue();
        if (entitet == null) {
            return;
        }
        postaviVrijednostiUEntitet();

        try {
            obrada.update();
            ucitajPodatke();
            ocistiPolja();
        } catch (SkrbinaException e) {
            jLabel2.setText(e.getPoruka()); //provjera
        }
    }//GEN-LAST:event_izmijeniBttnActionPerformed

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
        //lstDjela.setModel(d);
    }

    private void ocistiPolja() {
        naziv.setText("");
        autorIme.setText("");
        datum.setText("");
        opis.setText("");
    }

    private void postaviVrijednostiUEntitet() {
        Autor a = new Autor();
        a.setImePrezime(autorIme.getText(), autorPrez.getText());        
        entitet.setAutor(a);
        entitet.setNaziv(naziv.getText());
        entitet.setOpis(opis.getText());
        obrada.setEntitet(entitet);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField datum;
    private javax.swing.JButton dodajBttn;
    private javax.swing.JButton izmijeniBttn;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstDjela;
    private javax.swing.JTextField naziv;
    private javax.swing.JButton obrisiBttn;
    private javax.swing.JTextField opis;
    private javax.swing.JButton povratakBttn;
    private javax.swing.JLabel pregled;
    // End of variables declaration//GEN-END:variables
}
