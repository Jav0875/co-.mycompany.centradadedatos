/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.centradadedatos;

/**
 *
 * @author Javier Villazana
 */
public class Deportista2 
{
    protected String nombre;
    //Cuando se declara explicitamente un constructor, el constructor por
    //defecto no se declara. Si se necesita debe declararse
    public Deportista2()
    {
        //2.2.2.1 Se crea un registro de activacion para f.Deportistas2
    }
    public Deportista2(String nombre)
    {
        //2.2.2.2. Se asigna el valor del parametroal atributo
        this.nombre=nombre;
        //2.2.2.3. Se elimina el registro y regresa a f.Deportistas2
    }
}
