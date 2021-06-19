/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

/**
 *
 * @author Usuario
 */
public abstract class Concesionario extends Object{
    private String matrícula;
    private String color;
    private String modelo;
    
    public Concesionario (String matrícula, String color, String modelo){
        this.matrícula = matrícula;
        this.color = color;
        this.modelo = modelo;
    }
    
    public void setmatrícula(String matriculacion){
        matrícula = matriculacion;
    }
     public void setcolor(String coloracion){
        color = coloracion;
    }
     public void setmodelo(String mod){
        modelo = mod;
    }
     public String getmatrícula(){
         return matrícula;
     }
     public String getcolor(){
         return color;
     }   
     public String getmodelo(){
         return modelo;
     }
     public void EnseñarDatos(){
         System.out.println("matrícula: " + getmatrícula() + "color: " + getcolor() + "modelo: " + getmodelo());
     }
}