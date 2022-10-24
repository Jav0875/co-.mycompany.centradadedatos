/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.centradadedatos;

/**
 *
 * @author Javier Villazana
 */
public class Aplicacion2 {
// 1. Crea un registro de activacion para main

    public static void main(String[] args) 
    {
     //2. Crea un objeto y lo asigna a f.
        //2.1 Se crea un objeto, poniendole una copia de nombre
        //posicion, getNombre y getPosicion
        //2.2 Se invoca al constructor
        Futbolistas2 f= new Futbolistas2 ("Ronaldinho", "delantero");
     //3. Imprime "Futbolista: Ronaldinho","delantero"
     System.out.println(f.getDatos());
     //4. Elimina el registro de activacion y termina
    }
}
