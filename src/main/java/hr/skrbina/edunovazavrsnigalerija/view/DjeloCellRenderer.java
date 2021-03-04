/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.skrbina.edunovazavrsnigalerija.view;

import hr.skrbina.edunovazavrsnigalerija.model.Djelo;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author User
 */
public class DjeloCellRenderer extends JLabel implements ListCellRenderer<Djelo> {

    @Override
    public Component getListCellRendererComponent(JList<? extends Djelo> list, Djelo value, int index, boolean isSelected, boolean cellHasFocus) {
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