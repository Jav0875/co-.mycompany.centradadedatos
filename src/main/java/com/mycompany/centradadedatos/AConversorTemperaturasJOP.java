/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.centradadedatos;
import javax.swing.*;
/**
 *
 * @author Javier Villazana
 */
public class AConversorTemperaturasJOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        String opcion;
        String cantidad;
        int valor;
        float convertir;
        
    
    opcion=JOptionPane.showInputDialog(null,"Menu de conversiones de temperaturas TECNM"
            + "\n\n1.- grados Celcius a grados Fahrenheit"
            + "\n2.- grados Celcius a grados Kelvin\n3.-grados Celcius a grados Rankine"
            + "\n4.- grados Fahrenheit a grados Celcius\n5.- grados Kelvin a grados Celcius"
            + "\n6.- grados Rankine a grados Celcius\n7.- Salir" 
            + "\n\n Elige una opción: ");
valor=Integer.parseInt(opcion);

switch (valor)
{
    case 1:
        
        cantidad=JOptionPane.showInputDialog(null,"Digita la cantidad de grados Celcius a convertir a grados Fahrenheit: ");
        convertir=Integer.parseInt(cantidad);
        float resultado= ((float)(convertir*9/5)+32);
        JOptionPane.showMessageDialog(null,"La conversion de grados Celcius a grados Fahrenheit es: "+ resultado +" °F");
        
        break;
        
    case 2:
        
        cantidad=JOptionPane.showInputDialog(null,"Digita la cantidad de grados Celcius a convertir a grados Kelvin: ");
        convertir=Integer.parseInt(cantidad);
        double resultadoKelvin= (double)convertir+273.15;
        JOptionPane.showMessageDialog(null,"La conversion de grados Celcius a grados Kelvin es: "+ resultadoKelvin +" °K");
        
        break;
    
    case 3:
        cantidad=JOptionPane.showInputDialog(null,"Digita la cantidad de grados Celcius a convertir a grados Rankine: ");
        convertir=Integer.parseInt(cantidad);
        double resultadoRankine= ((double)(convertir*9/5)+491.67);
        JOptionPane.showMessageDialog(null,"La conversion de grados Celcius a grados Rankine es: "+ resultadoRankine +" °R");
           
        break;
        
    case 4:
        cantidad=JOptionPane.showInputDialog(null,"Digita la cantidad de grados Fahrenheit a convertir a grados Celcius: ");
        convertir=Integer.parseInt(cantidad);
        double resultadoCel=((double)(convertir-32)*5/9);
        JOptionPane.showMessageDialog(null,"La conversion de grados Fahrenheit a grados Celcius es: "+ resultadoCel +" °C");
           
        break;
        
    case 5:
        cantidad=JOptionPane.showInputDialog(null,"Digita la cantidad de grados Kelvin a convertir a grados Celcius: ");
        convertir=Integer.parseInt(cantidad);
        double resultadoCelc= ((double)convertir-273.15);
        JOptionPane.showMessageDialog(null,"La conversion de grados Kelvin a grados Celcius es: "+ resultadoCelc +" °C");
           
        break;
        
    case 6:
        cantidad=JOptionPane.showInputDialog(null,"Digita la cantidad de grados Rankie a convertir a grados Celcius: ");
        convertir=Integer.parseInt(cantidad);
        double resultadoCelci=((double)(convertir-491.67)*5/9);
        JOptionPane.showMessageDialog(null,"La conversion de grados Rankine a grados Celcius es: "+ resultadoCelci +" °C");
           
        break; 
        
    case 7:
        
        JOptionPane.showMessageDialog(null,"¡¡¡ Hasta pronto !!!");
        
    default:
        JOptionPane.showMessageDialog(null, "No existe esa opción");
                System.exit(0);
   
        
}

}
    
}
    
    
