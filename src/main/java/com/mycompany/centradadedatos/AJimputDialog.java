/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.centradadedatos;
import javax.swing.*;
/**
 *
 * @author Javier Villazana
 */
public class AJimputDialog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String entrada;
        int Numval;
        
        entrada=JOptionPane.showInputDialog(null,"Escribe un valor: ");
        Numval=Integer.parseInt(entrada);
        System.exit(0);
        
        // TODO code application logic here
    }
    
}
