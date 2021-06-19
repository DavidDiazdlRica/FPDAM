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
public class TestHerencia {
    public static void main(String[]args){
        km0 Citroen = new km0("34678C ","Azul ","Corsa ");
        SegundaMano Opel = new SegundaMano("42742C ","Plateado ","Astra");
        CocheNuevo Megane = new CocheNuevo("91873A ","Negro ","Marea");
        Citroen.setNumKm(0);
        Opel.setKmhechos("125.000");
        Opel.setAntiguoPropietario("Manolo García");
        System.out.println("Kilometro 0: ");
        Citroen.EnseñarDatos();
        System.out.println("Coche de segunda mano: ");
        Opel.EnseñarDatos();
        System.out.println("Coche nuevo: ");
        Megane.EnseñarDatos();
    }
}
