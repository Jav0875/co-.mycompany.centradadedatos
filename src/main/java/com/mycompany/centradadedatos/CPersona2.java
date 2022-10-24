/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.centradadedatos;

/**
 *
 * @author Javier Villazana
 */
public class CPersona2 {
 
    private String nombre;
    //Sobrecargando al constructor
    public CPersona2(String nombre)
    {
        this.nombre=nombre;
    }
    
    public void setNombre (String nombre)
    {
        this.nombre=nombre;
    }
    
    public String getNombre()
    {
        return nombre;
    }
}
