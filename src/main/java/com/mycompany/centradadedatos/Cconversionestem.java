/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.centradadedatos;
import java.util.*;

/**
 *
 * @author Javier Villazana
 */
public class Cconversionestem 
{
    
    double grados;
    
   
    
public double Cel_a_Fah (double grados)
{
   // Celcius a Fahrenheit
   
    double conversion1=(grados*9/5)+32; 
    return conversion1;
    
}
public double Fah_a_Cel (double grados)
{
    
    double conversion2=(grados-32)*5/9;
    return conversion2;
    //Se manda llamarf de main por medio de esta clase.metodo o sumas.sumas2 (x y z)
}

public double Kel_a_Cel (double grados)
{
  
    double conversion3= grados-273.15;
    return conversion3;
}
public double Cel_a_Kelvin (double grados)
{
    
    double conversion4=grados+273.15;
    return conversion4;
       
 }

public double Kel_a_Fah (double grados)
{
    
    double conversion5=(grados-273.15)*9/5+32;
    return conversion5;
}

 }
