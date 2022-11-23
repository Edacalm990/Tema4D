/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.programa;

import daw.elisabet.Animal;
import daw.elisabet.TipoAnimal;
import daw.elisabet.TipoEstado;
import java.time.LocalDate;

/**
 *
 * @author eli
 */
/*    Crea dos objetos animal (a1 y a2) con los valores que tú quieras.
    Crea dos personas (p1 y p2) con los valores que tú quieras.
    Imprime por consola los valores de a1 y a2 usando toString.
    Crea una copia del animal a2 en un nuevo animal a3.
    p1 debe despertar a todos los animales.
    p2 juega con a2 durante 120 minutos.
    p1 alimenta a a1 1000 gramos. Imprime el nuevo peso de a1.
    p1 debe jugar con a1 200 minutos. Imprime el nuevo peso de a1.*/
public class Prueba {
    public static void main(String[] args) {
        Animal a1=new Animal(LocalDate.of(2021 , 5, 25), "Pepe", TipoAnimal.PERRO, 25.0 , TipoEstado.DESPIERTO);
        Animal a2=new Animal(LocalDate.of(2015 , 7, 25), "Pepe", TipoAnimal.PERRO, 25.0 , TipoEstado.DESPIERTO);
    }
}
