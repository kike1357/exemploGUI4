/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui4;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author epastorizalorenzo
 */
public class Ventana {
    

public void crearVenta(){
    
    JFrame marco = new JFrame ("ventana con compoñentes");
    JPanel panel = new JPanel();
    JButton boton = new JButton("PREME");
    JLabel etiqueta = new JLabel("esto e unha etiqueta");
    JTextField casilla = new JTextField(30);
    JPasswordField contrasinal=new JPasswordField(6);
    //marco.setSize(800, 800);
    panel.setBounds(5,25,50,50);
    boton.setSize(50,50);
    contrasinal.setSize(50,50);
    boton.setBackground(Color.red);
    boton.setMnemonic('a');//activamos boton con a
    boton.setToolTipText("esto e un boton");
    panel.setBackground(Color.green);
    panel.add(boton);
    panel.add(etiqueta);
    panel.add(casilla);
    panel.add(contrasinal);
    marco.add(panel);
    marco.pack();//autoaxusta o marco
    marco.setLocationRelativeTo(null);//centrar ventá
    marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    marco.setVisible(true);
    
}
}