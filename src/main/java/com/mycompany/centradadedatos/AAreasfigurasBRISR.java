/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.centradadedatos;
import java.io.*;
import java.util.*;
/**
 *
 * @author Javier Villazana
 */
public class AAreasfigurasBRISR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {
         String lado;
        String radio;
        String altura;
        
        String opcion;
        
            InputStreamReader isr=new InputStreamReader(System.in); // aqui se realiza el constructor 
                BufferedReader br=new BufferedReader (isr);//Aqui se realiza el constructor ???
                
                System.out.print("Menu de áreas geometricas\n1.-Cuadrado\n2.- Triangulo\n3.-Circulo\n4.-Salir\n\nSelecciona una opción: ");
                System.out.flush();
                opcion=br.readLine();
                
                Integer.parseInt(opcion);
                
                if (opcion.equals("1"))
                {
                   
                    System.out.println("Introduce el lado del cuadrado: ");
                    System.out.flush();
                    lado=br.readLine();
                    int lado1=Integer.parseInt(lado);
                    int areacuadrado=lado1*lado1;
                    System.out.println("El área del cuadrado es: "+ areacuadrado);
                           
                }
                else if (opcion.equals("2"))
                {
                    System.out.println("Introduce el lado del triangulo: ");
                    System.out.flush();
                    lado=br.readLine();
                    System.out.println("Introduce la altura del triangulo: ");
                    System.out.flush();
                    altura=br.readLine();
                    
                    int lado1=Integer.parseInt(lado);
                    int altura1=Integer.parseInt(altura);
                    int areatriangulo=lado1*altura1/2;
                    System.out.println("El área del triangulo es: "+ areatriangulo);
                    
                }
                else if (opcion.equals("3"))
                {
                    System.out.println("Introduce el radio del circulo: ");
                    System.out.flush();
                    radio=br.readLine();
                    int radio1=Integer.parseInt(radio);
                    float areacirculo=(float) (3.1416*Math.pow(radio1,2));
                    System.out.println("El área del cuadrado es: "+ areacirculo);
                }
                else if (opcion.equals("4"))
                {
                    System.out.println("Hasta luego");
                } 
                else 
                    
                {
                    System.out.println("Opción no permitida");
                }               
    }
    
}
