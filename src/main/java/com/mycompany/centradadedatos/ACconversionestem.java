/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.centradadedatos;
import java.util.*;



/**
 *
 * @author Javier Villazana
 */
public class ACconversionestem 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    
    double Farenheit=36;
    double Celcius=-3;
    double Kelvin=5;    
    
    int seleccion;
    
    Scanner entrada_menu=new Scanner (System.in);
    
        System.out.println("""
                           Menu de conversiones de temperaturas TECNM
                           
                           1.- grados Celcius a grados Fahrenheit
                           2.- grados Fahrenheit a grados Celcius
                           3.- grados Kelvin a grados Celcius
                           4.- grados Celcius a grados Kelvin
                           5.- grados Kelvin a grados Fahrenheit
                           6.- Salir
                           
                           Selecciona una opcion del menu: """);
      
        seleccion=entrada_menu.nextInt();
        
        if (seleccion==1)
        {
            Cconversionestem fahrenheit=new Cconversionestem();
            System.out.println("\nLa conversión de grados es: "
                    +fahrenheit.Cel_a_Fah(Farenheit)+"°");
        }
        else if (seleccion==2)
        {
            Cconversionestem celcius=new Cconversionestem();
            System.out.println("\nLa conversión de grados es: "+celcius.Fah_a_Cel(Celcius)+"°");
        }
        
        else if (seleccion==3)
        {
            Cconversionestem celcius=new Cconversionestem();
            System.out.println("\nLa conversión de grados es: "+celcius.Fah_a_Cel(Celcius)+"°");
        }
        else if (seleccion==4)
        {
            Cconversionestem kelvin=new Cconversionestem();
            System.out.println("\nLa conversión de grados es: "+kelvin.Cel_a_Kelvin(Kelvin)+"°");
        }
        else if (seleccion==5)
        {
            Cconversionestem fahrenheit1=new Cconversionestem();
            System.out.println("\nLa conversión de grados es: "+fahrenheit1.Kel_a_Fah(Farenheit)+"°");
        }
         else if (seleccion==6)
        {
            
            System.out.println("¡¡¡ Hasta pronto !!!");
        }    
        else
         {
             System.out.println("Opcion invalida");
         }
    }
    }


   
       
    
    

