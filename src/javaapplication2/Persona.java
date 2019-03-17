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
public class Persona {
    String nombre;
    String apellido;
    int edad;
    double altura;
    String sexo;
    double peso;
    
    //CONSTRUCTOR
    //SOBRECARGA DE CONSTRUCTORES
    public Persona(int edad){
        this.edad = edad;
    }
    
    public Persona(){
    
    
   }
   
    
    //METODO
    
    public void imprimeDatos(){
        System.out.println("-------- Datos ---------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("Sexo: " + sexo);
        System.out.println("Peso: " + peso);
        System.out.println("------------------------");
    }
    
}
