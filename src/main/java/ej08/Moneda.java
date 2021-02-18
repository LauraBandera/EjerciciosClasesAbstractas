/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej08;

import java.util.Random;

/**
 *
 * @author laura
 */
public class Moneda extends Azar{

    @Override
    public int lanzar() {
        Random aleatorio = new Random();
        return aleatorio.nextInt(3);      
    }
    
}
