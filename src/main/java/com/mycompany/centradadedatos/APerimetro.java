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
public class APerimetro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    
    {
    int lado;
    float radio;
    
    String opcion;
    int valor;
    
    JOptionPane.showMessageDialog(null,"Menu de perimetro\n de figuras geometricas\n1.- Cuadrado\n2.- Triangulo\n3.-Circulo");
opcion=JOptionPane.showInputDialog(null,"Introduce una opcion; ");
valor=Integer.parseInt(opcion);


switch(valor)
{
          case 1:
              lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado del cuadrado: "));
              int perimetrocuadrado=lado+lado+lado+lado;
              JOptionPane.showMessageDialog(null, "El perimetro del cuadrado es: "+ perimetrocuadrado);
              break;
          
           case 2:
              lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado del triangulo: "));
              int perimetrotriangulo=lado+lado+lado;
              JOptionPane.showMessageDialog(null, "El perimetro del triangulo es: "+ perimetrotriangulo);
              break;
              
            case 3:
              radio=Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio del circulo: "));
              float perimetrocirculo=(float) ((2*3.1416)*radio);
              JOptionPane.showMessageDialog(null, "El perimetro del triangulo es: "+ perimetrocirculo);
              break;
              
            default:
                JOptionPane.showMessageDialog(null, "No existe esa opción");
                System.exit(0);
}         
 } 
  }
