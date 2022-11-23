/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package daw.elisabet;

import java.time.LocalDate;

/**
 *
 * @author elisabet
 */
public class Animal {

    private LocalDate fechaNacimiento;
    private String nombre;
    private TipoAnimal tipo;
    private double peso;
    private TipoEstado estado;

    public Animal() {
    }

    public Animal(LocalDate fechaNacimiento, String nombre, TipoAnimal tipo, double peso, TipoEstado estado) {
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.tipo = tipo;
        this.peso = peso;
        this.estado = estado;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoAnimal getTipo() {
        return tipo;
    }

    public void setTipo(TipoAnimal tipo) {
        this.tipo = tipo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public TipoEstado getEstado() {
        return estado;
    }

    public void setEstado(TipoEstado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Animal{" + "fechaNacimiento=" + fechaNacimiento + ", nombre=" + nombre + ", tipo=" + tipo + ", peso=" + peso + ", estado=" + estado + '}';
    }

    public void comer(double cantidadGramos) {
        this.peso += Math.abs(cantidadGramos);
    }

    public void dormir() {
        this.estado = TipoEstado.DURMIENDO;
    }

    public void despertar() {
        this.estado = TipoEstado.DESPIERTO;
    }

    public void descansar() {
        this.estado = TipoEstado.REPOSO;
    }

    public void jugar(int minutos) {
        int minutosEnteros = Math.abs(minutos);
        this.estado = TipoEstado.JUGANDO;
        
        if (minutos < 30) {
            this.peso -= 10;
        } else if (minutos > 180) {
            throw new IllegalArgumentException("Un animal no puede jugar más de 180 minutos");
        } else {
            int cantidad = minutos%30;
            double totalPesoPerdido= this.peso - (cantidad*20);
            if (totalPesoPerdido>0){
            this.peso-=totalPesoPerdido;
            } 
        }
    }
    
    public Animal clonarAnimal(Animal pet){
        Animal clonado = new Animal();
        try {
            clonado= new Animal(pet.fechaNacimiento, pet.nombre, 
            pet.tipo, pet.peso, pet.estado);
            return clonado;
        } catch (NullPointerException  npe) {
            System.out.println("El objeto no puede ser nulo");
        } 
        return clonado;
    }
    
}
