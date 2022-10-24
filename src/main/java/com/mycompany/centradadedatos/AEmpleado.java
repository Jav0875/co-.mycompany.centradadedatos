/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.centradadedatos;

import java.util.Scanner;
import static com.mycompany.centradadedatos.Empleado.horas_trabajadas;
//import static com.mycompany.centradadedatos.Empleado.salario_diario;

/**
 *
 * @author Javier Villazana
 */
public class AEmpleado  {

    private static double hora_normal_imss;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        double enthrs=0;
        double hora_normal=70;
        double hora_extra=85;
        double entsal=0;
        double Ispt_menor=1;
        double Ispt_mayor=1;
        
        //metodo set y get 
        //Empleado salario=new Empleado();
        Empleado horas_trabajo=new Empleado();
        Empleado imss=new Empleado();
        Empleado ispt_menor=new Empleado();
        Empleado ispt_mayor=new Empleado();
        
        horas_trabajo.setHoras_trabajadas(40);
        imss.setImss(0.05);
        ispt_menor.SSN_ispt_menor(hora_normal_imss);
        ispt_mayor.SSN_ispt_mayor(hora_normal_imss);
        
        enthrs=horas_trabajadas("");//Esta es la entrada de datos
        
        if (enthrs<=40)
        {
            double subtotal1=enthrs*hora_normal;
            System.out.println("El salario son impuestos es de:$ "+subtotal1);
            if(subtotal1<=2000)
            {
                double subtotal2=subtotal1*imss.getImss();
                double total=subtotal1-subtotal2;
                System.out.println("\nEl pago del IMSS es de:$ "+subtotal2);
                System.out.println("\nEl pago del neto es de:$ "+total+
                        "\nEsta exento de ISPT");
            }
            
            else if (subtotal1>=2001||subtotal1<=5000)
            {
                double subtotal2=subtotal1*imss.getImss();
                double subtotal3=subtotal1*ispt_menor.SSN_ispt_menor(Ispt_menor);
                double total=(subtotal1-subtotal2)-subtotal3;
                System.out.println("\nEl pago del IMSS es de:$ "+subtotal2);
                System.out.println("\nEl pago del ISPT es de:$ "+subtotal3);
                System.out.println("\nEl pago del neto es de:$ "+total);
            }
            
          }
        else
            {
                double subtotal11=enthrs*hora_extra;
            System.out.println("El salario son impuestos es de:$ "+subtotal11);
            if (subtotal11>=2001||subtotal11<=5000)
            {
                double subtotal2=subtotal11*imss.getImss();
                double subtotal3=subtotal11*ispt_menor.SSN_ispt_menor(Ispt_menor);
                double total=(subtotal11-subtotal2)-subtotal3;
                System.out.println("\nEl pago del IMSS es de:$ "+subtotal2);
                System.out.println("\nEl pago del ISPT es de:$ "+subtotal3);
                System.out.println("\nEl pago del neto es de:$ "+total);
            }
            else if (subtotal11>=2001||subtotal11<=5000)
            {
                double subtotal2=subtotal11*imss.getImss();
                double subtotal3=subtotal11*ispt_mayor.SSN_ispt_mayor(Ispt_mayor);
                double total=(subtotal11-subtotal2)-subtotal3;
                System.out.println("\nEl pago del IMSS es de:$ "+subtotal2);
                System.out.println("\nEl pago del ISPT es de:$ "+subtotal3);
                System.out.println("\nEl pago del neto es de:$ "+total);
                
            }
       }  
    }
}
        

        
           
    
    
