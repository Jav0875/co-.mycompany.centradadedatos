/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.centradadedatos;

import java.util.Scanner;

/**
 *
 * @author Javier Villazana
 */
public class Empleado 
{
    static Scanner entrada_horas=new Scanner (System.in);

    private double horas_trabajadas;
    private double imss;

    public double getImss() {
        return imss;
    }

    public void setImss(double imss) {
        this.imss = imss;
    }

    public double getHoras_trabajadas() {
        return horas_trabajadas;
    }

    public void setHoras_trabajadas(double horas_trabajadas) {
        this.horas_trabajadas = horas_trabajadas;
    }

     public double SSN_ispt_menor(double hora_normal_imss)
    {
       double salario1=(hora_normal_imss*0.03);
       return salario1;
    }
    
    public double SSN_ispt_mayor(double hora_extra_imss)
    {
       double salario_extra=(hora_extra_imss*0.05);
       return salario_extra;
    }    
    // Entrada de datos

    static double horas_trabajadas (String HT) //Esta es la entrada de horas de trabajo
{
        System.out.println("Introduce la cantidad de horas trabajadas: "
                +HT);
        double cantidad_horas = entrada_horas.nextDouble();
        return cantidad_horas;
}

}
