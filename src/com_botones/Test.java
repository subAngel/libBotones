/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com_botones;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author whoAngel
 */
public class Test extends JFrame{
    public Test(){
        
        BarraBotones botones = new BarraBotones(BarraBotones.EJEX, BarraBotones.TIPO_1);
        
        
        add(botones, BorderLayout.NORTH);
        
        botones = new BarraBotones(BarraBotones.EJEY, BarraBotones.TIPO_2);
        add(botones, BorderLayout.WEST);
        
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        
    }
    public static void main(String[] args) {
        new Test();
    }
}
