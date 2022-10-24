/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.centradadedatos;
/**
 *
 * @author Javier Villazana
 */
public class Persona {
    
    private String Nombre;
    private String DNI;
    private String sexo;
    private char Sexoh;
    
    private int edad;
    private int altura, peso;
    
    double Calculo_IMC;
    
    
    public Persona ()
    {
        
    }
    
    public Persona (String Nombre, int edad, char Sexoh)
    {
        this.Sexoh =Sexoh;
        this.Nombre=Nombre;
        this.edad=edad;
    }
    
    public double Calculo_IMC (double Calculo_IMC)
    {
        this.Calculo_IMC=Calculo_IMC;
        Calculo_IMC= peso/Math.pow(altura,2);
        return this.Calculo_IMC;
    }
    
    public int RegresaIMC ()
    {
        if (Calculo_IMC<20)
        {
            return -1;//peso ideal
        }
        else if (Calculo_IMC>=20|Calculo_IMC<=25)// debajo de peso ideal
            return 0;
        else if (Calculo_IMC>25)
        {
            return 1; //Sobre peso
        }
        return 0;
       }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getEdad() 
    {
        return edad;
    }

    public void setEdad(int edad)
    {
        this.edad = edad;
    }
    
    public Boolean  Mayor_edad ()
    {
        if (edad>18)
        {
            return (true);            
        }
        return null;
    }
    public void Comprobar_sexo (char Sexoh)
    {
        
    }
    public String toString()
    {
		return "Nombre = " + this.Nombre + " Sexo " + this.sexo 
                        + " Edad: " + this.edad+"Peso: "+this.peso+ "Altura: "+this.altura;

    }
}