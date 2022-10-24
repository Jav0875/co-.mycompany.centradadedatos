/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.centradadedatos;
import java.io.*;
import java.util.*;
import javax.swing.*;
                
/**
 *
 * @author Javier Villazana
 */
public class ASumaEnteros {
    
    public static void main (String []x) throws IOExeption, IOException
    {
        String op1, op2;
        int ent1, ent2;
       
        
        op1=JOptionPane.showInputDialog("Escribe el primer valor: ");
        ent1=Integer.parseInt(op1);
        op2=JOptionPane.showInputDialog("Escribe el segundo valor: ");
        ent2=Integer.parseInt(op2);
        
        int total=ent1+ent2;
        
        JOptionPane.showMessageDialog(null, "El resultado es; "+ total);
        
        
        
      
        
        //InputStreamReader isc=new InputStreamReader(System.in);
        //BufferedReader cd=new BufferedReader (isc);
        //System.out.flush();
        //System.out.println("Proporciona el operador 1 de la suma");
        //op1=cd.readLine();
        //ent1=Integer.parseInt(op1); //Concierte un caracter alfanumerico a un caracter numerico
        //System.out.println("Proporciona el operador 2 de la suma");
        //op2=cd.readLine();
        //ent2=Integer.parseInt(op2);
        //int resultado=ent1+ent2;
        //System.out.printf("El resultado de la suma es; "+ resultado );
        
    }
}
