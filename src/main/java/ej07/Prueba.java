/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej07;

import java.util.ArrayList;

/**
 *
 * @author laura
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Trabajador> lista = new ArrayList<>();
        lista.add(new Profesor("1º DAW", "Jefe de estudios", "Juan Carlos", "Vico", "045745539s"));
        lista.add(new Profesor("2º ESO", "Director", "Pepito", "Grillo", "54542454p"));
        lista.add(new Camarero("Jefe de Camareros", "Antonio", "Rodriguez", "049855539s"));
        lista.add(new Camarero("Camarero en la barra", "María", "Gómez", "045962539u"));
        
        for (Trabajador tra : lista) {
            tra.cotizar();
        }
    }
    
}
