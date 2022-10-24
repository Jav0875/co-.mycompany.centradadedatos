/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.centradadedatos;

/**
 *
 * @author Javier Villazana
 */
public class Futbolista extends Deportista
        //Los atributos marcados como private solo se pueden usar en las clases
        //donde se definen
{
    private String posicion;

    public String getDatos() 
    {
        return "Futbolista "+nombre+", "+posicion;
    }

    public void setPosicion(String posicion)
    {
        this.posicion=posicion;
    }
    
}
