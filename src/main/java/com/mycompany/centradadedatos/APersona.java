/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.centradadedatos;

/**
 *
 * @author Javier Villazana
 */
public class APersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
    Cpersona humano1=new Cpersona (); // aqui podemos dar valores dentro del parentesis sintaxis public pastel() puede ser vacio o asignar valores, el constructor a dentro dle main
    
    System.out.println("Tu nombre es: "+humano1.nombre);
    System.out.println("Tu edad es: "+humano1.edad + "años");
    System.out.println("Tu genero es: "+humano1.genero);
    System.out.println("Tu estatura es: "+humano1.estatura + "mts.");
    System.out.println("Tu peso es: "+humano1.peso + "kg");
    
    }
    
}
