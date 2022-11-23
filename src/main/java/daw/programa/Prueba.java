/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.programa;

import daw.elisabet.Animal;
import daw.elisabet.Persona;
import daw.elisabet.TipoAnimal;
import daw.elisabet.TipoEstado;
import java.time.LocalDate;

/**
 *
 * @author eli
 */
/*   
    p2 juega con a2 durante 120 minutos.
    p1 alimenta a a1 1000 gramos. Imprime el nuevo peso de a1.
    p1 debe jugar con a1 200 minutos. Imprime el nuevo peso de a1.*/
public class Prueba {
    public static void main(String[] args) {
        // Creación de dos objetos animal (a1 y a2) con los valores que yo he querido.
        Animal a1=new Animal(LocalDate.of(2021 , 5, 25), "Peludo", TipoAnimal.PERRO, 1500.0 , TipoEstado.DESPIERTO_REPOSO);
        Animal a2=new Animal(LocalDate.of(2022 , 2, 28), "Copito", TipoAnimal.COBAYA, 500 , TipoEstado.JUGANDO);
        // Creación de dos objetos persona (a1 y a2) con los valores que yo he querido.
        Persona p1=new Persona( "Pepito", 12);
        Persona p2=new Persona( "Luna", 11);
        
        //  se imprime por consola los valores de a1 y a2 usando toString.
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        
        // se crea una copia del animal a2 en un nuevo animal a3.
        Animal a3 = Animal.clonarAnimal(a2);
        
        // p1 debe despertar a todos los animales.
        p1.llamar(a1);
        p1.llamar(a2);
        p1.llamar(a3);
        
        // p2 juega con a2 durante 120 minutos.
        p2.jugar(a2, 120);
        
        //p1 alimenta a a1 1000 gramos. Se imprime el nuevo peso de a1.
        p1.alimentar(a1, 1000);
        System.out.println("""
                           El peso de %s es de %.2f
                           """.formatted(a1.getNombre(),a1.getPeso()));
        
        //p1 debe jugar con a1 200 minutos. Se imprime el nuevo peso de a1
        p1.jugar(a1, 200);
         System.out.println("""
                           El peso de %s es de %.2f
                           """.formatted(a1.getNombre(),a1.getPeso()));
    }
}
