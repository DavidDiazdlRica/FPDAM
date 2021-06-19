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
public class km0 extends Concesionario{
    private double NumKm;
    

    public km0(String matrícula, String color, String modelo) {
        super(matrícula, color, modelo);
        NumKm = 0;
    }


	public void setNumKm(double kilometros){
        NumKm = kilometros;
    }
    
    public double getNumKm(){
        return NumKm;
    }
    public void MostrarDatos(){
        EnseñarDatos();
        System.out.println("Kilometros:" + getNumKm());
    }

}