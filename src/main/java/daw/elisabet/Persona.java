/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.elisabet;

/**
 *
 * @author eli
 */
// contructor que crea un objeto de tipo persona con 2 atributos
public class Persona {

    private String nombre;
    private int edad;

    //constructor por defecto
    public Persona() {
    }

    // contructor parametrizado
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // getter y setter
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

    // toString por defecto
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }

    // metodo que permite que la persona en cuestión despierte al Animal pet. Llamando al método despertar de la clase Animal
    public void llamar(Animal pet) {
        pet.despertar();
    }

    // metodo que permite que la persona en cuestión le dé de comer al Animal pet.  Llamando al método comer de la clase Animal
    public void alimentar(Animal pet, double cantidadGramos) {
        pet.comer(cantidadGramos);
    }
    
    // metodo que permite que la persona en cuestión juegue con el Animal pet. Llamando al método jugar de la clase Animal
    // si la cantidad de minutos excede de lo permitido se captura la excepcion y se establece que los minutos máximos sean 180
    public void jugar(Animal pet, int cantidadMinutos) {
        try {
            pet.jugar(cantidadMinutos);
        } catch (Exception e) {
            pet.jugar(180);
            System.out.println("Los minutos máximos permitidos son 180");
        }
    }

}
