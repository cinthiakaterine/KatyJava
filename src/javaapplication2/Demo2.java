/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author leo
 */
public class Demo2 {
    
    public static void main(String[] args) {
        //DECLARACION DE OBJETO
        // INSTANCIA
        
    /*    Mesa mesa1 = new Mesa("Rojo", 20, 10);
        System.out.println(mesa1.color);   
        System.out.println(mesa1.largo);
        System.out.println(mesa1.ancho);
        
        double area = mesa1.area();
        
        
        System.out.println("El area es: " + area);

*/
        
        Persona jesus = new Persona(26);
        jesus.altura = 1.68;
        jesus.nombre = "Jesus";
        jesus.sexo = "M";
        jesus.peso = 72;
        
        Persona katy = new Persona();
        katy.altura = 1.55;
        katy.nombre = "Katherine";
        katy.peso = 60;
        katy.sexo = "F";
        
        jesus.imprimeDatos();
        katy.imprimeDatos();
        
        
    }
}
