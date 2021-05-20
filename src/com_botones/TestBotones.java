/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com_botones;

import java.awt.BorderLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.text.AbstractDocument.Content;

/**
 *
 * @author whoAngel
 */
public class TestBotones extends JFrame{
    public Botoncito b1, b2;
    
    public TestBotones(){
        
        b1 = new Botoncito();
       //b1.setText("Botoncito");
        b1.setIcon(new ImageIcon("src/iconos/anadir.png"));
        b1.setHorizontalTextPosition( SwingConstants.RIGHT );
        b1.setVerticalTextPosition(SwingConstants.EAST);
        b2 = new Botoncito("Boton");
        
        add(b1, BorderLayout.EAST);
        add(b2, BorderLayout.WEST);
        
        pack();
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new TestBotones();
    }
    
}
