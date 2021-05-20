/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com_botones;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

/**
 *
 * @author whoAngel
 */
public class Botoncito extends JButton implements MouseListener {
    private String txtBoton;
    private int ancho;
    private int alto;
    private Color colorMover = new Color(68, 71, 90);
    private Color colorPressed = new Color(98, 114, 164);
    private Color colorNormal = new Color(40, 42, 54);
    
    private Color colorTxtMover = new Color(248, 248, 242);
    private Color colorTxtPressed = new Color(248, 248, 242);
    private Color colorTxtNormal = new Color(248, 248, 242);
    
    
    // tipo 1
    public Botoncito(){
        super();
        txtBoton = "Button";
        super.setText(txtBoton);
        apariencia();
    }
    // tipo 2
    public Botoncito(String txtBoton){
        super(txtBoton);
        this.txtBoton = txtBoton;
        
        apariencia();
    }
    // tipo 3 
    public Botoncito(ImageIcon icon) {
        super(new ImageIcon(icon.getImage()));
        //this.txtBoton = txtBoton;
        this.setSize(ancho, alto);
        apariencia();
    }
    
    
    private void apariencia(){
        ancho = 100;
        alto = 50;
        this.setSize(ancho, alto);
        this.setBorder(null);
        this.setContentAreaFilled(false);
        this.setOpaque(true);
        this.setFont(new Font("Tahoma", Font.BOLD, 14));
        this.setBackground(new Color(40, 42, 54));
        this.setForeground(new Color(248, 248, 242));
        this.setPreferredSize(new Dimension(100, 40));
        
        this.setHorizontalTextPosition(SwingConstants.CENTER);
        this.setVerticalTextPosition(SwingConstants.BOTTOM);
        
        addMouseListener(this);
    }
    
  

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        this.setBackground(this.colorPressed);
        this.setForeground(this.colorTxtPressed);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        this.setBackground(this.colorMover);
        this.setForeground(this.colorTxtMover);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.setBackground(this.colorMover);
        this.setForeground(this.colorTxtMover);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.setBackground(this.colorNormal);
        this.setForeground(this.colorTxtNormal);
    }

    public Color getColorMover() {
        return colorMover;
    }
    public void setColorMover(Color colorMover) {
        this.colorMover = colorMover;
    }
    public Color getColorNormal() {
        return colorNormal;
    }
    public void setColorNormal(Color colorNormal) {
        this.colorNormal = colorNormal;
        this.setBackground(this.colorNormal);
    }
    public Color getColorTxtMover() {
        return colorTxtMover;
    }
    public void setColorTxtMover(Color colorTxtMover) {
        this.colorTxtMover = colorTxtMover;
    }
    public Color getColorTxtNormal() {
        return colorTxtNormal;
    }
    public void setColorTxtNormal(Color colorTxtNormal) {
        this.colorTxtNormal = colorTxtNormal;
        this.setForeground(this.colorTxtNormal);
    }
    public Color getColorPressed() {
        return colorPressed;
    }
    public void setColorPressed(Color colorPressed) {
        this.colorPressed = colorPressed;
        this.setBackground(this.colorPressed);
    }
    public Color getColorTxtPressed() {
        return colorTxtPressed;
    }
    public void setColorTxtPressed(Color colorTxtPressed) {
        this.colorTxtPressed = colorTxtPressed;
        this.setForeground(this.colorTxtPressed);
    }
}
