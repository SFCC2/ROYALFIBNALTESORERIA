/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import MODELO.Conexion;

/**
 *
 * @author Sulay2016
 */
public class PruebaDB {
    public PruebaDB() {}
    
    /**
     * Create a GUI Window
     */
    public void createWindow()
    {
        /**
         * 
         * Creata and init JFrame 
         */
        JFrame w = new JFrame("Prueba inserción DB");
        w.setAlwaysOnTop(true);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setBounds(0, 0, 600, 300);
        w.setLocationRelativeTo(null);
        
        /**
         * Assign layout to panel
         */
        JPanel p = new JPanel(new GridBagLayout());
        
        /**
         * Grid constraints (positioning for each elements)
         */
        GridBagConstraints ct = new GridBagConstraints();
        
        ct.fill = GridBagConstraints.HORIZONTAL;
        ct.gridx = 1;
        ct.gridy = 0;
        ct.insets = new Insets(5,10,5,10);
        
        JTextField txt = new JTextField(10);
        
        txt.setBounds(0, 0, 100, 30);
        
        p.add(txt, ct);
        
        JButton btn = new JButton();
        
        btn.setText("Guardar");
        
        /**
         * Action that register a data into database
         */
        btn.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                /**
                 * Get a value
                 */
                if (txt.getText() != null)
                {
                    /**
                     * Insert data given.
                     */
                    Conexion ctx = new Conexion();
                    ctx.startDB();
                    ctx.insertar(2, txt.getText());
                    ctx.desconectar();
                }
            }
        });
        
        ct.fill =  GridBagConstraints.HORIZONTAL;
        ct.gridx = 1;
        ct.gridy = 1;
        
        p.add(btn, ct);
        w.add(p);
        w.setVisible(true);
    }
}
