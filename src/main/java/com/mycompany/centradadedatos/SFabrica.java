
package com.mycompany.centradadedatos;

public class SFabrica {
    float p1=450;   
    float p2=550;
    float p3=350;
    float p4=300;
    float p5=400;
    float p6=500;
    float p7=425;
    float p8=480;
    float p9=370;
    float p10=290;
    float total,total1,total2,total3,total4,total5,total6,total7,total8,total9,total10;
    
    public void pro1(){
        System.out.println("Samsung Galaxi S21");
        float res1=p1*40;
        float mes1=(res1*31)*6;
        float mes2=res1*28;
        float mes3=(res1*30)*5;
        total1=mes1+mes2+mes3;
        System.out.println("Costo de produccion por año "+total1);
    }
    public void pro2(){
        System.out.println("Samsung Galaxi S22");
        float res1=p2*40;
        float mes1=(res1*31)*6;
        float mes2=res1*28;
        float mes3=(res1*30)*5;
        total2=mes1+mes2+mes3;
        System.out.println("Costo de produccion por año "+total2);
    }
    public void pro3(){
        System.out.println("Motorola Edge 20");
        float res1=p3*40;
        float mes1=(res1*31)*6;
        float mes2=res1*28;
        float mes3=(res1*30)*5;
        total3=mes1+mes2+mes3;
        System.out.println("Costo de produccion por año "+total3);
    }
    public void pro4(){
        System.out.println("Motorola Edge 20 Lite");
        float res1=p4*40;
        float mes1=(res1*31)*6;
        float mes2=res1*28;
        float mes3=(res1*30)*5;
        total4=mes1+mes2+mes3;
        System.out.println("Costo de produccion por año "+total4);
    }
    public void pro5(){
        System.out.println("Samsung Galaxi Note 10");
        float res1=p5*40;
        float mes1=(res1*31)*6;
        float mes2=res1*28;
        float mes3=(res1*30)*5;
        total5=mes1+mes2+mes3;
        System.out.println("Costo de produccion por año "+total5);
    }
    public void pro6(){
        System.out.println("Motorola Edge 20 Pro");
        float res1=p6*40;
        float mes1=(res1*31)*6;
        float mes2=res1*28;
        float mes3=(res1*30)*5;
        total6=mes1+mes2+mes3;
        System.out.println("Costo de produccion por año "+total6);
    }
    public void pro7(){
        System.out.println("Motorola G60");
        float res1=p7*40;
        float mes1=(res1*31)*6;
        float mes2=res1*28;
        float mes3=(res1*30)*5;
        total7=mes1+mes2+mes3;
        System.out.println("Costo de produccion por año "+total7);
    }
    public void pro8(){
        System.out.println("OPPO Reno 7");
        float res1=p8*40;
        float mes1=(res1*31)*6;
        float mes2=res1*28;
        float mes3=(res1*30)*5;
        total8=mes1+mes2+mes3;
        System.out.println("Costo de produccion por año "+total8);
    }
    public void pro9(){
        System.out.println("Samsung Galaxi A52");
        float res1=p9*40;
        float mes1=(res1*31)*6;
        float mes2=res1*28;
        float mes3=(res1*30)*5;
        total9=mes1+mes2+mes3;
        System.out.println("Costo de produccion por año "+total9);
    }
    public void pro10(){
        System.out.println("Honor X8");
        float res1=p10*40;
        float mes1=(res1*31)*6;
        float mes2=res1*28;
        float mes3=(res1*30)*5;
        total10=mes1+mes2+mes3;
        System.out.println("Costo de produccion por año "+total10);
    }
    public void suma(){
        total=total1+total2+total3+total4+total5+total6+total7+total8+total9+total10;
        System.out.println("El costo total de la produccion es ");
        System.out.printf("%.1f",total);
    }
    public void mes(){
        System.out.println("Los meses con mayor costo de produccion son aquellos con 31 dias");
    }
    public void comp(){
        if(total10>total4)
        {
            System.out.println("El Producto 10 es el que mayor costo de produccion representa");
        }else if(total4>total3)
        {
            System.out.println("El Producto 4 es el que mayor costo de produccion representa");
        }else if(total3>total9)
        {
            System.out.println("El Producto 3 es el que mayor costo de produccion representa");
        }else if(total9>total5)
        {
            System.out.println("El Producto 9 es el que mayor costo de produccion representa");
        }else if(total5>total7)
        {
            System.out.println("El Producto 5 es el que mayor costo de produccion representa");
        }else if(total7>total1)
        {
            System.out.println("El Producto 7 es el que mayor costo de produccion representa");
        }else if(total1>total8)
        {
            System.out.println("El Producto 1 es el que mayor costo de produccion representa");
        }else if(total8>total6)
        {
            System.out.println("El Producto 8 es el que mayor costo de produccion representa");
        }else if(total6>total2)
        {
            System.out.println("El Producto 6 es el que mayor costo de produccion representa");
        }else
        {
            System.out.println("El Producto 2 es el que mayor costo de produccion representa");
        }
    
    }
}
