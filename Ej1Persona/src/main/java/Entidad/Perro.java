/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author monte
 */
public class Perro {

    private String nombre, raza,tamano;
    private double  edad;
    private Persona persona;

    public Perro() {
    }

    public Perro(String nombre, String raza, String tamano, double edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.tamano = tamano;
        this.edad = edad;
        //this.persona = persona;
    }

 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

   
    public double getEdad() {
        return edad;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Datos Perro"
                + "\nnombre=" + nombre + ", raza=" + raza + ", tamano=" + tamano + ", edad=" + edad ;
    }




    
    
}
