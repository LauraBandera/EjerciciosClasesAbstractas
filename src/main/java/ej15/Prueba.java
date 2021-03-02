/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej15;

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
        
        ArrayList <Legislador> lista = new ArrayList<>();
        
        Senador l1 = new Senador("Pepe", "Flores", 700, "Málaga", "Málaga");
        Senador l2 = new Senador("Juan", "Gómez", 700, "Córdoba", "Córdoba");
        Senador l3 = new Senador("María", "González", 700, "Granda", "Granada");
        Diputado l4 = new Diputado(3, "Ana", "Fernández", "Cádiz", "Cádiz");
        
        lista.add(l1);
        lista.add(l2);
        lista.add(l3);
        lista.add(l4);
        /*
        System.out.println("El Legislador l1 es " + l1.getCamaraEnQueTrabaja());
        System.out.println("El Legislador l2 es " + l2.getCamaraEnQueTrabaja());
        System.out.println("El Legislador l3 es " + l3.getCamaraEnQueTrabaja());
        System.out.println("El Legislador l4 es " + l4.getCamaraEnQueTrabaja());
        */
        
        for(Legislador l : lista){
            System.out.println("Es un " + l.getCamaraEnQueTrabaja());
            if(l instanceof Diputado){
                ((Diputado)l).getNumAsiento();
            } else if(l instanceof Senador){
                ((Senador)l).getSalarioExtra();
            }
        }
    }
    
}
