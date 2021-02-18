/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej07;

/**
 *
 * @author laura
 */
public class Profesor extends Trabajador{
    
    private String clase;
    private String rango;

    public Profesor(String clase, String rango, String nombre, String apellido1, String NIF) {
        super(nombre, apellido1, NIF);
        this.clase = clase;
        this.rango = rango;
    }

    //Método propio de clase
    public void darClase(){
        System.out.println("Profesor dando clase.");
    }
    
    @Override
    // Método sobrescrito
    public void cotizar() {
        System.out.println("Cotizando como Profesor");
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

}
