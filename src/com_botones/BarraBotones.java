package com_botones;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URL;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class BarraBotones extends JPanel implements ActionListener{
    public Botoncito bAnadir, bConsultar, bModificar, bEliminar, bGuardar;
    int nBotones=0;
    public static final String EJEX = "X_AXIS", EJEY = "Y_AXIS";
    public static final String TIPO_1 = "only button", TIPO_2 = "icon", TIPO_3 = "string", TIPO_4 = "string w icon"; 
    private ImageIcon iAnadir = new ImageIcon("/src/iconos/anadir.png");
    private ImageIcon iGuardar = new ImageIcon("/src/iconos/guardar.png");
    private ImageIcon iModificar = new ImageIcon("/src/iconos/modificar.png");
    private ImageIcon iConsultar = new ImageIcon("/src/iconos/consultar.png");
    private ImageIcon iEliminar = new ImageIcon("/src/iconos/eliminar.png");
    
    public BarraBotones(){
        initButtons_2();
        this.setLayout(new FlowLayout());
        add(bAnadir);
        add(bGuardar);
        add(bModificar);
        add(bConsultar);
        add(bEliminar);
        nBotones = 5;
    }
    
    public BarraBotones(String eje, String tipo){ // en este constructor pregunta el eje del boxlayout
        GridLayout gl;
        if(eje == EJEX)
            gl = new GridLayout(1, 5, 3, 3);
        else if(eje == EJEY)
            gl = new GridLayout(5,1,3,3);
        else // posicion por defecto
            gl = new GridLayout(1,5,3,3);
        
        if(tipo == TIPO_1)
            initButtons_1();
        else if(tipo == TIPO_2)
            initButtons_2();
        else
            initButtons_1();
           
        setLayout(gl);
        activarActionListener();
        
    }
    
    
    private void initButtons_1(){
       
        bAnadir = new Botoncito("Añadir");
        bAnadir.setToolTipText("Añadir");
        bGuardar = new Botoncito("Guardar");
        bGuardar.setToolTipText("Guardar cambios");
        bModificar = new Botoncito("Modificar");
        bModificar.setToolTipText("Modificar elemento");
        bConsultar = new Botoncito("Consultar");
        bConsultar.setToolTipText("Consultar elemento");
        bEliminar = new Botoncito("Eliminar");
        bEliminar.setToolTipText("Eliminar elemento");
        
        bAnadir.setSize(25,25);
        bGuardar.setSize(25,25);
        bModificar.setSize(25,25);
        bConsultar.setSize(25,25);
        bEliminar.setSize(25,25);
        
        setIcon();
        this.add(bAnadir);
        this.add(bGuardar);
        this.add(bModificar);
        this.add(bConsultar);
        this.add(bEliminar);
    }
    
    private void initButtons_2(){
        bAnadir = new Botoncito(iAnadir);
        bAnadir.setToolTipText("Añadir");
        bGuardar = new Botoncito( iGuardar);
        bGuardar.setToolTipText("Guardar cambios");
        bModificar = new Botoncito( iModificar);
        bModificar.setToolTipText("Modificar elemento");
        bConsultar = new Botoncito( iConsultar);
        bConsultar.setToolTipText("Consultar elemento");
        bEliminar = new Botoncito( iEliminar);
        bEliminar.setToolTipText("Eliminar elemento"); 
        bAnadir.setSize(25,25);
        bGuardar.setSize(25,25);
        bModificar.setSize(25,25);
        bConsultar.setSize(25,25);
        bEliminar.setSize(25,25);
        
        setIcon();
        this.add(bAnadir);
        this.add(bGuardar);
        this.add(bModificar);
        this.add(bConsultar);
        this.add(bEliminar);
    }
    
    public void setIcon(){
        bAnadir.setIcon(new ImageIcon("src/iconos/anadir.png"));
        bGuardar.setIcon(new ImageIcon("src/iconos/guardar.png"));
        bModificar.setIcon(new ImageIcon("src/iconos/modificar.png"));
        bConsultar.setIcon(new ImageIcon("src/iconos/consultar.png"));
        bEliminar.setIcon(new ImageIcon("src/iconos/eliminar.png"));
        
        bAnadir.setHorizontalTextPosition(SwingConstants.RIGHT);
        bAnadir.setVerticalTextPosition(SwingConstants.EAST);
        bGuardar.setHorizontalTextPosition(SwingConstants.RIGHT);
        bGuardar.setVerticalTextPosition(SwingConstants.EAST);
        bModificar.setHorizontalTextPosition(SwingConstants.RIGHT);
        bModificar.setVerticalTextPosition(SwingConstants.EAST);
        bConsultar.setHorizontalTextPosition(SwingConstants.RIGHT);
        bConsultar.setVerticalTextPosition(SwingConstants.EAST);
        bEliminar.setHorizontalTextPosition(SwingConstants.RIGHT);
        bEliminar.setVerticalTextPosition(SwingConstants.EAST);
    }
    

    public void activarActionListener(){
        bAnadir.addActionListener(this);
        bGuardar.addActionListener(this);
        bModificar.addActionListener(this);
        bConsultar.addActionListener(this);
        bEliminar.addActionListener(this);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == bAnadir){
            anadirElem();
        }
        if(e.getSource() == bGuardar){
            guardarElem();
        }
        if(e.getSource() == bModificar){
            modificarElem();
        }
        if(e.getSource() == bConsultar){
            consultarElem();
        }
        if(e.getSource() == bEliminar){
            eliminarElem();
        }
    }

    private void anadirElem() {
        
    }
    private void guardarElem() {
        
    }
    private void modificarElem() {
       
    }
    private void consultarElem() {
       
    }
    private void eliminarElem() {
       
    }
    
    public void addButton(Botoncito boton) {
        if (nBotones < 5) {
            add(boton);
            nBotones++;
        }
    }
    
}
