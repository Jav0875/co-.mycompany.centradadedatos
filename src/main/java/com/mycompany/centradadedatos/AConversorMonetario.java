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
public class AConversorMonetario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
    
    {
        String peso;
        String dolar;
        String libra;
        String yen;
                

        final double pesos=1.00;
        final double dolares=19.94;
        final double libras=23.07;
        final double yens=0.14;
        
        String seleccion;
             
        InputStreamReader isr=new InputStreamReader (System.in);
        BufferedReader  br=new BufferedReader (isr);
        
        System.out.println("Convetidor de Monetario ITQ\n\nMenu de conversiones\n");
        System.out.println("1.- Pesos mexicanos a dolares\n2.- Dolares a libras\n3.- Pesos mexicanos a libras\n4.- Pesos mexicanos a yen japones\n5.-Salir"
                + "\n\nSelecciona una opcion por favor: ");
        System.out.flush();
        
        seleccion=br.readLine();
        
        if (seleccion.equals("1"))
        {
            System.out.println("Introduce la cantidad de pesos a convertir a dolares: ");
            System.out.flush();
            peso=br.readLine();
            float peso1=Integer.parseInt(peso);
            float pesoadolar=(float) (peso1*dolares);
            System.out.println("La conversion de pesos a dolares es:$ "+pesoadolar);
        }
        else if(seleccion.equals("2"))
        {
            System.out.println("Introduce la cantidad de dolares a convertir a libras: ");
            System.out.flush();
            dolar=br.readLine();
            float dolar1=Integer.parseInt(dolar);
            float dolaralibra=(float) (dolares/libras)*dolar1;
            System.out.println("La conversion de dolares a libras es:£ "+dolaralibra);
        }
        else if(seleccion.equals("3"))
        {
            System.out.println("Introduce la cantidad de pesos a convertir a libras: ");
            System.out.flush();
            peso=br.readLine();
            float peso2=Integer.parseInt(peso);
            float pesoalibra=(float)((float) (pesos/libras)*peso2);
            System.out.println("La conversion de pesos a libras es:£ "+pesoalibra);
        }
        else if(seleccion.equals("4"))
        {
            System.out.println("Introduce la cantidad de pesos a convertir a yen japones: ");
            System.out.flush();
            yen=br.readLine();
            float peso3=Integer.parseInt(yen);
            float pesoayen=(float)((float) (pesos/yens)*peso3);
            System.out.println("La conversion de pesos a yen japones es:¥ "+pesoayen);
        }
        else if (seleccion.equals("5"))
                {
                    System.out.println("Hasta luego");
                } 
                else 
                    
                {
                    System.out.println("Opción no permitida");
                }               
        
                
    }
    
}
