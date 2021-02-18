/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej11;

import java.util.ArrayList;

/**
 *
 * @author laura
 */
public class Jerarquia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(new Rectangulo(10,12)); //Base = 10 Altura = 12
        figuras.add(new Triangulo(10,5)); //Base = 15 Altura = 5
        figuras.add(new Romboide(15,5));
        for(Figura f: figuras){
            System.out.println("Área: " + f.calcularArea());
        }
    }
    
}
