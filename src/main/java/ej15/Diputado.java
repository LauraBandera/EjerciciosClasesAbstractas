/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej15;

/**
 *
 * @author laura
 */
public class Diputado extends Legislador{
    private int numAsiento;

    @Override
    public String getCamaraEnQueTrabaja() {
        return "Diputado";
    }

    public Diputado(int numAsiento, String nombre, String apellidos, String provinciaQueRepresenta, String partidoPolitico) {
        super(nombre, apellidos, provinciaQueRepresenta, partidoPolitico);
        this.numAsiento = numAsiento;
    }

    public int getNumAsiento() {
        return numAsiento;
    }

    public void setNumAsiento(int numAsiento) {
        this.numAsiento = numAsiento;
    }
    
    
    
}
