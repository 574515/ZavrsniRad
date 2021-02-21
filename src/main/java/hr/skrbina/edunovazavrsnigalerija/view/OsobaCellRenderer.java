/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.skrbina.edunovazavrsnigalerija.view;

import hr.skrbina.edunovazavrsnigalerija.model.Osoba;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author Hrvoje
 */
public class OsobaCellRenderer extends JLabel implements ListCellRenderer<Osoba> {

    OsobaCellRenderer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends Osoba> list, Osoba value, int index, boolean isSelected, boolean cellHasFocus) {
        setText(value.getIme() + " " + value.getPrezime());
        if (isSelected) {
            setBackground(Color.BLUE);
            setForeground(Color.RED);
        } else {
            setBackground(Color.WHITE);
            setForeground(Color.BLACK);
        }
        return this;
    }

}
