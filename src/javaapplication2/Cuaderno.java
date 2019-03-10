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
public class Cuaderno {
    
    //ATRIBUTOS
    
    // MODIFICADORES DE ACCESO
    
    // default, private, public, protected
    
    public String color;
    public int cantidadHojas;
    public double largo;
    public double ancho;
    public double alto;
    
    //CONSTRUCTOR
    public Cuaderno(String color){
        this.color = color;
    }
    
   
    public Cuaderno(String color, double largo){
        this.color = color;
        this.largo = largo;
    }
    
    
    //METODOS
    
    
    
}
