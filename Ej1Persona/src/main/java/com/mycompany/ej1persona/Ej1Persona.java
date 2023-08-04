/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ej1persona;

import Entidad.Perro;
import Entidad.Persona;

/**
 *
 * @author monte
 */
public class Ej1Persona {

    public static void main(String[] args) {
         Perro p2=new Perro("luna","bulldog","pequeño",4);
         Persona p1=new Persona("juan","lopez",33,"1245",p2);
     
         Perro p=new Perro("queso","pug","pequeño",5);
         Persona p3=new Persona("ana","ruiz",23,"5487",p);
        System.out.println(p1);
        System.out.println(p3);
       
    }
}
