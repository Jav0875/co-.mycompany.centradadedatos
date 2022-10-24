/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.centradadedatos;

/**
 *
 * @author Javier Villazana
 */
public class ACPersona2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CPersona2[]lasPersonas=new CPersona2[10];
        CPersona2 pers1=new CPersona2("Luis");
        lasPersonas[4]=pers1; //Este codigo puede ser tambien 
                
        //lasPersonas[4]=new CPersona2("Luis");        
        //lasPersonas[4].setNombre("Luis");
        System.out.println(lasPersonas[4].getNombre());
    }
    
}
