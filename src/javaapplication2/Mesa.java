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
public class Mesa {
    
    //MODIFICADORES DE ACCESO
    String color;
    double largo;
    double ancho;
    double altura;
    double peso;
    
    //CONSTRUCTOR VACIO, POR DEFAULT
    public Mesa(String miColor, double miLargo, double miAncho){
        color = miColor;
        largo = miLargo;
        ancho = miAncho;
    }
    
    //METODOS
    public double area(){
        double resultado = this.largo * this.ancho;
        return resultado;
    }
    
    
}
