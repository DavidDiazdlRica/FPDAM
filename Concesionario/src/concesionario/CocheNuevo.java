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
public class CocheNuevo extends Concesionario{
private double Nkm;
    public CocheNuevo(String matrícula, String color, String modelo) {
        super(matrícula, color, modelo);
        Nkm = 0;
    }
    public void setNkm(double kilometros){
        Nkm = kilometros;
    }
    
    public double getNkm(){
        return Nkm;
    }
    public void MostrarDatos(){
        EnseñarDatos();
        System.out.println("Kilometros:" + getNkm());
    }

}
