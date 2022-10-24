/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.centradadedatos;

/**
 *
 * @author Javier Villazana
 */
public class Aplicacion {
// 1. Crea registro de activación para main y recibe los parámetros de
// línea de comando.

    public static void main(String[] args)
    {
// 2. Se crea un objeto de la clase Futbolista con una copia de
// nombre, posición, setNombre, setPosición, getNombre y
// getPosición. Se asigna a la referencia f.
    Futbolista f=new Futbolista();
// 3. Se asigna valor al atributo nombre del objeto apuntado por
// f. Para ello se invoca setNombre del objeto apuntado por f.
f.setNombre("Ronaldinho");
// 4. Se asigna valor al atributo posición del objeto apuntado por
// f. Para ello se invoca setPosición del objeto apuntado por f.
f.setPosicion("delantero");
// 5. Se muestra el valor del atributo nombre asociado con f
// ("Ronaldinho").
System.out.println("Nombre: " + f.getNombre());
// 6. Imprime "Futbolista: Ronaldinho, medio".
System.out.println(f.getDatos());
// 7. Se elimina el registro de activación y termina.
    }
}
