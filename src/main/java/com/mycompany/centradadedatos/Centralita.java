/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.centradadedatos;

/**
 *
 * @author Javier Villazana
 */
public class Centralita extends LLamadas
{
//Atributos
private int cont=0;
private double acum=0;

//Getters

public double getTotalLLamadas ()
{
    return cont;
}

public double getTotalFacturado()
{
    return acum;
}

//Metodos
public void registrarLlamada (LLamadas param)
{
    System.out.println(param);
    cont++;
    acum=param.calcularPrecio();
}
}
