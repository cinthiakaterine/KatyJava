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
        imprimeEdad(26);
    }
    
    public static void imprimir(String mensaje){
        System.out.println("Voy a imprir el mensaje ......");
        System.out.println("Este es mi mensaje: " + mensaje);
    }
    
    public static void imprimeEdad(int edad){
        System.out.println("Mi edad es: " + edad);
    }
    
    public static boolean eresMayorDeEdad(int edad){
        boolean valor = edad>=18;
        return valor; 
    }
    
    public static boolean esPar(int numero){
        int residuo = numero%2;
        boolean resultado = residuo == 0;
        return resultado;
    }
    
    public static double areaCirculo(double radio){
        double resultado = 3.1416*radio*radio;
        return resultado;
    }
    
    public static void imprimirArea(double radio){
        double resultado = 3.1416*radio*radio;
        System.out.println("El area es: " + resultado);
    }
}
