/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.centradadedatos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Llamada 
{
 int tiempo;
double costo;
 public static void main(String[] args) throws IOException {
 LLamadas []arrellamada= new LLamadas [2]; 
 // ciclo para llenar el arreglo con los objetos de LLamadas 
 for (int i=0;i<arrellamada.length; i++){
 int t,tiempo;
 double c, costo;
 System.out.println("proporciona el tiempo del objeto"+ i );
 BufferedReader in=new BufferedReader(new 
InputStreamReader(System.in));
 tiempo=Integer.parseInt(in.readLine());
 System.out.println("proporciona el costo de la llamada del objeto " + i ); 
 costo=Double.parseDouble (in.readLine());
 arrellamada[i]= new LLamadas(tiempo,costo);
 }

 // ciclo que obtiene la impresión del arreglo 
 for (int i=0;i<arrellamada.length; i++){
 System.out.println("Datos del objeto"+ i ); 
 System.out.println(""+ arrellamada[i].obtenTiempo() );
 System.out.println(""+ arrellamada[i].obtenCosto());
 }
 
 double sumacosto=0.0;
 for (int i=0;i<arrellamada.length; i++)
 {
 System.out.println("Calcular costo de llamada del objeto"+ i ); 
 System.out.println(""+ arrellamada[i].calcularPrecio());
 sumacosto=sumacosto+ arrellamada[i].calcularPrecio();
 
 }
 System.out.println("El costo total de las llamadas es "+sumacosto );   
}
}

