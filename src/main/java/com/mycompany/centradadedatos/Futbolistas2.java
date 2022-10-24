/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.centradadedatos;

/**
 *
 * @author Javier Villazana
 */
public class Futbolistas2 extends Deportista2 
{
    private String posicion;
    //2.2.1 SE crea un registro de activacion para f.Futbolistas2
    public Futbolistas2(String nombre, String posicion)
    {
        //2.2.2. Invoca al constructor de la clase padre, o sea Deportista2
        //Se le envia el valor del parametro nombre que es
        //Ronaldinho. La invocacion a "super" siempre debe ser la 
        //primera instruccion del constructor
        super (nombre);
        //2.2.3 Se asigna el valor del parametro al atributo
        this.posicion=posicion;
        //2.2.4. Se elimina el registro y se regresa a main
    }
    public String getDatos()
    {
        return "Futbolista: "+nombre+", "+posicion;
    }
}
