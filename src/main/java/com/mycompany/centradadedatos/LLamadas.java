/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.centradadedatos;

/**
 *
 * @author Javier Villazana
 */
public class LLamadas 
{
 // Atributos
 int tiempo;
 double costo;
//Constructores
 
 public LLamadas()
 {
     tiempo=0;
     costo=5;
 }
 public LLamadas(int tiempo, double costo)
 {
 this.tiempo=tiempo;
 this.costo=costo;
 }
   //métodos de acceso
 public int obtenTiempo(){
 return tiempo;} 
 
 public double obtenCosto(){
 return costo;} 
 
 public void ponTiempo(int tiempo){
 this.tiempo=tiempo;}
 
 public void ponCosto(double costo){
 this.costo=costo; }
 //métodos 
 public double calcularPrecio(){
 return obtenTiempo()* obtenCosto(); 
 }   
}
