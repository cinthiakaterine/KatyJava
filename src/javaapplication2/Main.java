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
public class Main {
    
    public static void main(String[] args) {
        
        
        // CREACION E INICIALIZACION DE VARIABLE
        Cuaderno cuaderno1 = new Cuaderno("rosado");
           
        Cuaderno cuarderno2 = new Cuaderno("rosado", 10.0);
        // LLENANDO SUS ATRIBUTOS
        
        cuaderno1.ancho = 10.0;
        cuaderno1.alto = 8.0;
        cuaderno1.largo = 20.0;
        cuaderno1.cantidadHojas = 160;
        
        System.out.println(cuaderno1.color);
        
        System.out.println(cuarderno2.largo);
        
        
        
    }
}
