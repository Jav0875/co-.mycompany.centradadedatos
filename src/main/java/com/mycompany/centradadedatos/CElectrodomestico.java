 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.centradadedatos;

/**
 *
 * @author Javier Villazana
 */
public class CElectrodomestico {
    
    String marca;
    String nombre;
    String categoria;
    String color;
    String tamanyo;
    int modelo;
    
    
    public CElectrodomestico (String nombre, int modelo)
    {
    this.nombre=nombre;
    this.modelo=modelo;
    }
    
    public CElectrodomestico (String nombre, String marca, String tamanyo)
    {
        this.nombre=nombre;
        this.marca=marca;
        this.tamanyo=tamanyo;
    }
    public CElectrodomestico(String nombre, int modelo, String color,String marca)
    {
        this.nombre=nombre;
        this.modelo=modelo;
        this.color=color;
        this.color=marca;
        
    }
    public CElectrodomestico (String nombre, String categoria, int modelo, String color,String marca, String tamanyo)
    {
        this.nombre=nombre;
        this.marca=marca;
        this.categoria=categoria;
        this.modelo=modelo;
        this.color=color;
        this.tamanyo=tamanyo;
        
    }
    public CElectrodomestico (String nombre, String categoria, int modelo, String color,String marca)
    {
        this.nombre=nombre;
        this.marca=marca;
        this.categoria=categoria;
        this.modelo=modelo;
        this.color=color;
        
    }
}
