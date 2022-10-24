
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */


package com.mycompany.centradadedatos;
import java.io.*;
import java.util.*;

/**
 *
 * @author Javier Villazana
 */
public class CEntradaDeDatos 
{

    public static void main(String[] args) throws IOExcepton, IOException
            
    {
    
        String nombre;
        String edad;
        
        InputStreamReader isr=new InputStreamReader(System.in); // aqui se realiza el constructor 
                BufferedReader br=new BufferedReader (isr);//Aqui se realiza el constructor ???
                
                System.out.print("Introduzca una linea por el teclado que indique tu nombre ");
                System.out.flush(); //ESta opcion para que sirve????? Es similar al System.exit en JOptionPane
                // Esta opcion de print realiza despues del mensaje la introduccion de datos
                nombre=br.readLine();
                // Para que sirve esta opcion???
                System.out.println("Proporciona tu edad: ");
                edad=br.readLine();
                //Esta opcion de println realiza un salto de linea 
                System.out.println("Tu nonbre es: "+ nombre);
                System.out.println("Tu edad es: "+ edad);
    }
            }
