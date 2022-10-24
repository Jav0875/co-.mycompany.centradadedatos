/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.centradadedatos;

/**
 *
 * @author Javier Villazana
 */
public class Practica7a {

    public static void main(String[] args)
    {
     Centralita c=new Centralita();
             
    LLamadas l1=new LLamadaLocal ("911234567","919876543",67);
     c.registrarLlamada(l1);
     LLamadas l2=new LLamadaLocal ("919876543","911234567",43);
     c.registrarLlamada(l2);
     LLamadas p1=new LLamadaProvicional("911234567","939876543",12,3);
     c.registrarLlamada(p1);
     c.registrarLlamada(new LLamadaProvicional("939876543","911234567",1,1));
        System.out.println();
        System.out.println("Numero total de llamadas"+c.getTotalLLamadas());
        System.out.println("Total facturado"+c.getTotalFacturado());
    }

    private static class LLamadaLocal extends LLamadas {

        public LLamadaLocal(String string, String string0, int i) {
        }
    }

    private static class LLamadaProvicional extends LLamadas {

        public LLamadaProvicional(String string, String string0, int i, int i0) {
        }
    }

    
    }
    

