/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.ClaseA;
import ec.edu.intsuperior.modelo.ClaseB;
import ec.edu.intsuperior.modelo.ClaseC;
import ec.edu.intsuperior.modelo.ClaseD;
import ec.edu.intsuperior.modelo.ClaseE;

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
        
        //Clase C
        System.out.println("METODOS DE LA CLASE C");
        ClaseC.letrC();

        System.out.println(ClaseC.retornarC());

        ClaseC c = new ClaseC();
        c.instanciarC();

        ClaseC c1 = new ClaseC();
        System.out.println(c1.esverdadC());
        
         //Clase D
        System.out.println("METODOS DE LA CLASE D");
        ClaseD.letrD();

        System.out.println(ClaseD.retornarD());

        ClaseD d = new ClaseD();
        d.instanciarD();

        ClaseD d1 = new ClaseD();
        System.out.println(d1.esverdadD());
        
         //Clase E
        System.out.println("METODOS DE LA CLASE E");
        ClaseE.letrE();

        System.out.println(ClaseE.retornarE());

        ClaseE e = new ClaseE();
        e.instanciarE();

        ClaseE e1 = new ClaseE();
        System.out.println(e1.esverdadE());
    }

}
