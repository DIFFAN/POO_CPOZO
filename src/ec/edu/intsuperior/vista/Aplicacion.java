/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.ClaseA;
import ec.edu.intsuperior.modelo.ClaseB;

/**
 *
 * @author DIFFAN
 */
public class Aplicacion {

    public static void main(String[] args) {
        //Clase A
        System.out.println("METODOS DE LA CLASE A");
        ClaseA.letrA();

        System.out.println(ClaseA.retornarA());

        ClaseA a = new ClaseA();
        a.instanciarA();

        ClaseA a1 = new ClaseA();
        System.out.println(a1.esverdadA());
        

        //Clase B
        System.out.println("METODOS DE LA CLASE B");
        ClaseB.letrB();

        System.out.println(ClaseB.retornarB());

        ClaseB b = new ClaseB();
        b.instanciarB();

        ClaseB b1 = new ClaseB();
        System.out.println(b1.esverdadB());
    }

}
