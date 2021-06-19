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
public class SegundaMano extends Concesionario {
    
    private String Kmhechos, AntiguoPropietario;

    public SegundaMano(String matrícula, String color, String modelo) {
        super(matrícula, color, modelo);
       Kmhechos ="Desconocido";
       AntiguoPropietario = "Desconocido";
        
    }


    public void setKmhechos(String kilometraje){
        Kmhechos = kilometraje;
    }
    
    public void setAntiguoPropietario(String AnProp){
        AntiguoPropietario = AnProp;
    }
    public String getKmhechos(){
        return Kmhechos;
    }
    
    public String getAntiguoPropietario(){
       return AntiguoPropietario;
    }
    public void MostrarDatos(){
        EnseñarDatos();
        System.out.println("Kilometros:" + getKmhechos() + "Antiguo propietario:" + getAntiguoPropietario() );
    }
}
