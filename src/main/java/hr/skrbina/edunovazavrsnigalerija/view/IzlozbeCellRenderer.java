/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.skrbina.edunovazavrsnigalerija.view;

import hr.skrbina.edunovazavrsnigalerija.model.Izlozba;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author Hrvoje
 */
public class IzlozbeCellRenderer extends JLabel implements ListCellRenderer<Izlozba> {

    @Override
    public Component getListCellRendererComponent(JList<? extends Izlozba> list, Izlozba value, int index, boolean isSelected, boolean cellHasFocus) {
        setText(value.getNaziv());
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
