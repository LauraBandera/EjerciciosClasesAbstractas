/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej11;

/**
 *
 * @author laura
 */
public class Romboide extends Figura{
    public Romboide(double base, double altura) {
        super();
    }    
    
    @Override
    public double calcularArea() {
        return (getBase()*getAltura());
    } 
}