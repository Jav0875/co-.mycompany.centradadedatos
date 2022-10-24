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
public class AConversorMetricoSC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    
    float cantidad;
    int seleccion;    
    
    Scanner entrada=new Scanner (System.in);
    
    System.out.println("Menu de Conversiones metricas ITQ\n\n"
            + "1.- Centímetros a metros\n2. Metros a kilometros\n3.- Metros a yardas"
            + " \n4.- Metros  a pies\n5.- Pies a yardas\n6.- salir"
            + "\n\nSelecciona una opción ");
    
    seleccion=entrada.nextInt();
    if (seleccion==1)
    {
        System.out.println("Digita el cuantos centimetros deseas convertir a metros: ");
        cantidad=entrada.nextFloat();
        float conversion= cantidad*1/100;
        System.out.println("La conversion de centimetros a metros es: ");
        System.out.printf("%1.3f",conversion);
        
    }
    
    else if(seleccion==2)
    {
        System.out.println("Digita el cuantos metros deseas convertir a kilometros: ");
        cantidad=entrada.nextFloat();
        float conversion= cantidad*1/1000;
        System.out.println("La conversion de metros a kilometros es: ");
        System.out.printf("%1.3f",conversion);
    }
    else if(seleccion==3)
    {
        System.out.println("Digita el cuantos metros deseas convertir a yardas: ");
        cantidad=entrada.nextFloat();
        float conversion= (float) (cantidad*1.094);
        System.out.println("La conversion de metros a yardas es: ");
        System.out.printf("%1.3f",conversion );
    }
    else if(seleccion==4)
    {
        System.out.println("Digita el cuantos metros deseas convertir a pies: ");
        cantidad=entrada.nextFloat();
        float conversion= (float) (cantidad*3.281);
        System.out.println("La conversion de metros a pies es: ");
        System.out.printf("%1.3f",conversion );
    }
    else if(seleccion==5)
    {
        System.out.println("Digita el cuantos pies deseas convertir a yardas: ");
        cantidad=entrada.nextFloat();
        float conversion= (float) (cantidad/3);
        System.out.println("La conversion de pies a yardas es: ");
        System.out.printf("%1.3f",conversion );
    }
    else if(seleccion==6)
    {
        System.out.println("¡¡¡ Hasta pronto!!!");
    }
    else
    {
        System.out.println("Opcion invalida");
    }
    }
    
}
