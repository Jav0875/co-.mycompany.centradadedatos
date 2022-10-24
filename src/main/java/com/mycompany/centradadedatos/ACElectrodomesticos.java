 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.centradadedatos;

/**
 *
 * @author Javier Villazana
 */
public class ACElectrodomesticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        CElectrodomestico licuadora=new CElectrodomestico ("Licuadora", 7843);
        
        System.out.println("El articulo es: "+ licuadora.nombre);
        System.out.println("El modelo es: "+ licuadora.modelo);
        
        CElectrodomestico batidora=new CElectrodomestico ("Batidora", "Hamilton","chica");
        
        System.out.println("\nEl articulo es: "+batidora.nombre);
        System.out.println("La marca es; "+batidora.marca);
        System.out.println("El tamaño es; "+batidora.tamanyo);
        
        CElectrodomestico tv=new CElectrodomestico ("TV 4K", 56316, "Plata", "LG");
        
        System.out.println("\nEl articulo es;"+ tv.nombre);
        System.out.println("El modelo es: "+tv.modelo);
        System.out.println("El color de la TV es: "+tv.color);
        System.out.println("La marca de la tv es: "+tv.marca);
        
        CElectrodomestico refrigerador=new CElectrodomestico ("Refrigerador 3 puertas", "Familias grandes", 3432586, "Negro","Mabe", "Grande");
        
        System.out.println("\nEl articulo es;"+ refrigerador.nombre);
        System.out.println("El modelo es: "+refrigerador.modelo);
        System.out.println("La categoria es: "+refrigerador.categoria);
        System.out.println("El color de la TV es: "+refrigerador.color);
        System.out.println("La marca de la tv es: "+refrigerador.marca);
        System.out.println("El tamaño es: "+ refrigerador.tamanyo);
        
        CElectrodomestico xbox=new CElectrodomestico ("Consola de video juegos", "Entretenimiento", 2022, "Blanco","Xbox");
        
        System.out.println("\nEl articulo es;"+ xbox.nombre);
        System.out.println("El modelo es: "+xbox.modelo);
        System.out.println("La categoria es: "+xbox.categoria);
        System.out.println("El color de la TV es: "+xbox.color);
        System.out.println("La marca de la tv es: "+xbox.marca);
         
    }
    
}
