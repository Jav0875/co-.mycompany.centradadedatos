/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.centradadedatos;

import java.util.Scanner;

/**
 *
 * @author Javier Villazana
 */
public class APromedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    int sum=0, i, num;
    num=0;
    double prom;
    
    Scanner isc=new Scanner (System.in);
    
    int[ ] list1 = new int[10];
            for (i = 0; i < list1.length; i++) 
            {
                System.out.println("Ingresa un numero: ");
                 num= isc.nextInt();
                 list1[i]=num;
                 sum=sum+list1[i];
            }
            
prom=sum/10;
System.out. println ("El promedio es: " +prom);
                 
           for (i = 0; i < list1.length; i++)
           {
                  System.out.println( " es elem"+ " " + i + "=" + list1[i]);
           }

            System.out.println("Ingresa un numero a buscar");
            num=isc.nextInt();
            
           for (i=0; i<10; i++){
                if (list1[i]==num){
                    System.out.println("El numero se encuentra en la posicion "+" "+ i);
                    break;
                }
           }
           isc.close();
}
}       
