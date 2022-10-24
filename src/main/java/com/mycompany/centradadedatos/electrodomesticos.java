import java.io.*;
public class electrodomesticos {
   String nombre,marca,categoría,color,fabricante,modelo;
   double tamaño;
   int precio; 

public electrodomesticos(){}
    public electrodomesticos(String nombre,String modelo){
    this.nombre=nombre;
    this.modelo=modelo;
}
    public electrodomesticos(String nombre,String marco,int tamaño){
            this.nombre=nombre;
this.marca=marca;
this.tamaño=tamaño;  }//5 constructores
   
    public electrodomesticos(String color,int precio){
        this.precio=precio;
        this.color=color;
    }

}
    
    


