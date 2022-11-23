/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.elisabet;

/**
 *
 * @author eli
 */
public class Persona {

    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }

    public void llamar(Animal pet) {
        pet.despertar();
    }

    public void alimentar(Animal pet, double cantidadGramos) {
        pet.comer(cantidadGramos);
    }

    public void jugar(Animal pet, int cantidadMinutos) {
        try {
            pet.jugar(cantidadMinutos);
        } catch (Exception e) {
            pet.jugar(180);
        }
    }

}
