/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.centradadedatos;

import static com.mycompany.centradadedatos.Conv_mon_mc.Cantidad_a_convertir;
import static com.mycompany.centradadedatos.Conv_mon_mc.entrada;
import static com.mycompany.centradadedatos.Conv_mon_mc.dolares;
import static com.mycompany.centradadedatos.Conv_mon_mc.dolarpeso;
import static com.mycompany.centradadedatos.Conv_mon_mc.euro;
import static com.mycompany.centradadedatos.Conv_mon_mc.europeso;
import static com.mycompany.centradadedatos.Conv_mon_mc.libra;
import static com.mycompany.centradadedatos.Conv_mon_mc.librapeso;
import static com.mycompany.centradadedatos.Conv_mon_mc.peseta;
import static com.mycompany.centradadedatos.Conv_mon_mc.pesetap;
import static com.mycompany.centradadedatos.Conv_mon_mc.resultado;
import static com.mycompany.centradadedatos.Conv_mon_mc.yen;
import static com.mycompany.centradadedatos.Conv_mon_mc.yenp;

/**
 *
 * @author Javier Villazana
 */
public class AConv_mon_mc {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
     System.out.println("""
                           Menu de conversiones de temperaturas TECNM
                           
                           1.- Peso a dolar
                           2.- Peso a peseta española
                           3.- Peso a yen japones
                           4.- Peso a libra
                           5.- Peso a euro
                           6.- Dolar a peso
                           7.- Peseta a peso
                           8.- yen japones a peso
                           9.- Libra a peso
                           10.- Euro a peso
                           11.- Salir
                        
                           """);
     do{
          System.out.println("\nElige una opcion: ");
            int opcion = entrada.nextInt();
            double numero = 0;
            
            switch(opcion)
            {
                case 1: 
                    numero = Cantidad_a_convertir("de Pesos a dolares");
                    resultado (dolares ((float) numero), "dolares");
                    break;
                    
                case 2: 
                numero = Cantidad_a_convertir("de Pesos a pesetas");
                resultado (peseta ((float) numero), "pesetas");
                    break;
                
                case 3: 
                numero = Cantidad_a_convertir("de Pesos a yen japones");
                resultado (yen ((float) numero), "yenes");
                    break;
                    
                case 4: 
                numero = Cantidad_a_convertir("de Pesos a libra estrlina");
                resultado (libra ((float) numero), "libras");
                    break; 
                    
                case 5: 
                numero = Cantidad_a_convertir("de Pesos a euros");
                resultado (euro ((float) numero), "euros");
                    break; 
                    
                case 6: 
                numero = Cantidad_a_convertir("de Dolar a peso");
                resultado (dolarpeso ((float) numero), "pesos");
                    break; 
                
                case 7: 
                numero = Cantidad_a_convertir("de Peseta a peso");
                resultado (pesetap ((float) numero), "pesos");
                    break;
                    
                case 8: 
                numero = Cantidad_a_convertir("de Yen a peso");
                resultado (yenp ((float) numero), "pesos");
                    break;
                    
                case 9: 
                numero = Cantidad_a_convertir("de Libra a peso");
                resultado (librapeso ((float) numero), "pesos");
                    break;
                    
                case 10: 
                numero = Cantidad_a_convertir("de Euro a peso");
                resultado (europeso ((float) numero), "pesos");
                    break;
                    
                case 11:
                    System.out.println("¡¡¡ Hasta pronto !!!");
                    break;
                    
                default:
                    System.out.println("Opcion invalida");
                    
     }
    }
     while (true);
  }
}
