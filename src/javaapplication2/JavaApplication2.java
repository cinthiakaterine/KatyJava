/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author EQUIPO
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        //dameColor(3);      
        String cadena = dameColorCadena(3);
        System.out.println(cadena);
        
        
        

        
    }
    
   
    public static void dameColor(int color){
        switch (color){
            case 1:
                System.out.println("rojo");
                break;
            case 2:
                System.out.println("azul");
                break;
            case 3:
                System.out.println("amarillo");
                break;
        }
    }
    
    
    public static String dameColorCadena(int color){
        String resultado = "";
        switch (color){
            case 1:
                resultado = "rojo";
                break;
            case 2:
                resultado = "azul";
                break;
            case 3:
                resultado = "amarillo";
                break;
        }
        return resultado;
    }
    
    public static double areaCuadrado(double base, double altura){
        
        return base*altura;
    }
    
    
    public static double suma(double numero1, double numero2){
        return numero1 + numero2;
    }
    
    
    public static double resta(double numero1, double numero2){
        return numero1 - numero2;
    }
    
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();
        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
    
    
    
}
