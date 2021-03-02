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
public abstract class Legislador extends Persona{
    private String provinciaQueRepresenta, partidoPolitico;

    public Legislador(String nombre, String apellidos, String provinciaQueRepresenta, String partidoPolitico) {
        super(nombre, apellidos);
        this.provinciaQueRepresenta = provinciaQueRepresenta;
        this.partidoPolitico = partidoPolitico;
    }
    
    public abstract String getCamaraEnQueTrabaja();
    
    public String getProvinciaQueRepresenta() {
        return provinciaQueRepresenta;
    }

    public void setProvinciaQueRepresenta(String provinciaQueRepresenta) {
        this.provinciaQueRepresenta = provinciaQueRepresenta;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    @Override
    public String toString() {
        return "Legislador{" + "provinciaQueRepresenta=" + provinciaQueRepresenta + ", partidoPolitico=" + partidoPolitico + '}';
    }
    
}
