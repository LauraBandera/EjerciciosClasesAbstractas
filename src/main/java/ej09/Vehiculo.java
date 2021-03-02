/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej09;

/**
 *
 * @author laura
 */
public abstract class Vehiculo {
    
    //Esta clase si puede tener descendencia siempre y cuando se implemente el
    // método getVelocidad, el cual es abstracto.
    
    //Se puede sobre escribir únicamente el método getVelocidad()
    private int bastidor;
    
    //Este método posteriormente no puede ser sobreescrito por tener el final
    //No puede sufrir modificaciones
    public final void setBastidor(int bastidor){
        this.bastidor = bastidor;
    }
    
    public abstract int getVelocidad();
}
