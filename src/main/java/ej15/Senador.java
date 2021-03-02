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
public class Senador extends Legislador{
    private double salarioExtra;

    public Senador(String nombre, String apellidos, double salarioExtra, String provinciaQueRepresenta, String partidoPolitico) {
        super(nombre, apellidos, provinciaQueRepresenta, partidoPolitico);
        this.salarioExtra = salarioExtra;
    }
    
    

    public double getSalarioExtra() {
        return salarioExtra;
    }

    public void setSalarioExtra(double salarioExtra) {
        this.salarioExtra = salarioExtra;
    }

    @Override
    public String toString() {
        return "Senador{" + "salarioExtra=" + salarioExtra + '}';
    }

    @Override
    public String getCamaraEnQueTrabaja() {
        return "Senador";
    }
    
    
}
