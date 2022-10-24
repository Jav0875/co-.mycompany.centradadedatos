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
public class ACOperaciones_basicas {

   
    /**
     * @param args the command line arguments 
    
     */
    public static void main(String[] args) 
            
    
    {
        int opcion, i = 1;
        double a = 0, b = 0;
        
    COperaciones_basicas operaciones=new COperaciones_basicas();
    COperaciones_basicas suma1=new COperaciones_basicas();
    
    Scanner entrada_menu=new Scanner (System.in);
    //Declarando los arreglos
    String [] operacion={"1.- Suma", "2.- Resta","3.- Multiplicación","4.- División"};
        
    System.out.println("Menu de operaciones básicas TecNM");
    for ( String basicas:operacion)
    {
    System.out.println("\n"+basicas);
    }
    System.out.println("\nElige una opcion: ");
        opcion=entrada_menu.nextInt();
        
        switch (opcion)
        {
            case 1:
                operaciones.Calcular_suma(a, b);
                System.out.println("Introduce el primer número a sumar: ");
                a=entrada_menu.nextDouble();
                System.out.println("Introduce el segundo número a sumar: ");
                b=entrada_menu.nextDouble();
                double total=a+b;
                System.out.println("El resultado de la suma es: "+total);
                break;
            case 2:
                operaciones.Calcular_resta(a, b);
                System.out.println("Introduce el primer número a restar: ");
                a=entrada_menu.nextDouble();
                System.out.println("Introduce el segundo número a restar: ");
                b=entrada_menu.nextDouble();
                double totalr=a-b;
                System.out.println("El resultado de la resta es: "+totalr);
                break;
            case 3:
                operaciones.Calcular_multiplicacion(a, b);
                System.out.println("Introduce el primer número a multiplicar: ");
                a=entrada_menu.nextDouble();
                System.out.println("Introduce el segundo número a multiplicar: ");
                b=entrada_menu.nextDouble();
                double totalm=a-b;
                System.out.println("El resultado de la suma es: "+totalm);
                break;
            case 4:
                operaciones.Calcular_division(a, b);
                System.out.println("Introduce el dividendo: ");
                a=entrada_menu.nextDouble();
                System.out.println("Introduce el divisor: ");
                b=entrada_menu.nextDouble();
                double totald=a-b;
                System.out.println("El resultado de la suma es: "+totald);
                break;
            default:
                System.out.println("Opcion invalida");
        }
    }
    
}
