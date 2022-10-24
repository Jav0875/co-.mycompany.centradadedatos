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
public class COperaciones_basicas 
{
        
        
        public  double Calcular_suma(double num1, double num2)
        {
            double calculo= num1+num2;
            return calculo;
        }
        
        public double Calcular_resta(double num1, double num2)
        {
            double calculo= num1-num2;
            return calculo;
        }
        public double Calcular_multiplicacion(double num1, double num2)
        {
            double calculo= num1*num2;
            return calculo;
        }
        public double Calcular_division(double num1, double num2)
        {
            double calculo= num1/num2;
            return calculo;
        }
        static void resultado (double resultado, String convertir)//Aqui esta la salida
{
        System.out.println("La conversion es "+resultado ); //+convertir+"es: "
}
    }
    

