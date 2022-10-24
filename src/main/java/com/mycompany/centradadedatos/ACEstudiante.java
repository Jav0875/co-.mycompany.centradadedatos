/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.centradadedatos;

/**
 *
 * @author Javier Villazana
 */
public class ACEstudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CEstudiante alumno1=new CEstudiante();
        CEstudiante alumno2=new CEstudiante ();
        
        
        alumno1.setNombre("Oscar Javier");
        alumno1.setApellido("Villazana Matias");
        alumno1.setCorreo("nombre@queretaro.tecnm,mx");
        alumno1.setNumControl(21141293);
        alumno1.setEdad(46);
        
        alumno2.setNombre("Santiago Alberto");
        alumno2.setApellido("Martinez");
        alumno2.setCorreo("nombre@queretaro.tecnm,mx");
        alumno2.setNumControl(21141299);
        alumno2.setEdad(19);
        
        System.out.println (alumno1.getNombre());
        System.out.println(alumno1.getApellido());
        System.out.println(alumno1.getCorreo());
        System.out.println(alumno1.getEdad());
        System.out.println(alumno1.getNumControl());
        
        System.out.println (alumno2.getNombre());
        System.out.println(alumno2.getApellido());
        System.out.println(alumno2.getCorreo());
        System.out.println(alumno2.getEdad());
        System.out.println(alumno2.getNumControl());
    }
    
}
