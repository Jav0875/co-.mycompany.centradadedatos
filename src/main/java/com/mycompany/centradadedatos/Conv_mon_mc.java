/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.centradadedatos;
import java.util.*;

/**
 *
 * @author Javier Villazana
 */
public class Conv_mon_mc 
        
{
        
static Scanner entrada=new Scanner (System.in);    
    
public static float dolares (float dolar)
{
    float conversion=(float) (dolar*0.050);
    return conversion;
}

public static float peseta (float peseta)
        
    {
    float conversion=(float)(peseta*8.29);
    return conversion;
    }

public static float yen (float yen)
{
    float conversion =(float)(yen*7.13);
    return conversion;
}

public static float libra (float libra)    
{
    float conversion=(float)(libra*0.044);
    return conversion;
}

public static float euro (float euro)
{
    float conversion=(float)(euro*0.050);
    return conversion;
}

public static float dolarpeso (float dolarpeso)
{
    float conversion=(float)(dolarpeso*20.04);
    return conversion;
}
public static float pesetap (float pesetap)
{
    float conversion=(float)(pesetap*0.12);
    return conversion;
}

public static float yenp (float yenpeso)
{
    float conversion=(float)(yenpeso*0.14);
    return conversion;
}
public static float librapeso (float librapeso)
{
    float conversion=(float)(librapeso*22.87);
    return conversion;
}
public static float europeso (float europeso)
{
    float conversion=(float)(europeso*20.07);
    return conversion;
}

static double Cantidad_a_convertir (String convertir) //Esta es la entrada de datos
{
        System.out.println("Introduce la cantidad a convertir "
                +convertir);
        double cantidad = entrada.nextDouble();
        return cantidad;
}
static void resultado (double resultado, String convertir)//Aqui esta la salida
{
        System.out.println("La conversion es "+resultado ); //+convertir+"es: "
}

}

