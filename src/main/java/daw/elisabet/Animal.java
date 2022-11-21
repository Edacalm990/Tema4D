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
/*
    Fecha de nacimiento, un objeto de tipo LocalDate
    Nombre
    Tipo, que puede ser: "gato", "perro", "lagarto", "cobaya", "periquito"
    Peso en gramos
    Estado, que podrá ser: "comiendo", "durmiendo", "despierto/reposo" o "jugando".
*/
public class Animal {

    private LocalDate fechaNacimiento;
    private String nombre;
    private String tipo;
    private double peso;
    private enum estado;

    public Animal() {
    }

    public Animal(LocalDate fechaNacimiento, String nombre, String tipo, int peso, String estado) {
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Animal{" + "fechaNacimiento=" + fechaNacimiento + ", nombre=" + nombre + ", tipo=" + tipo + ", peso=" + peso + ", estado=" + estado + '}';
    }
    
    /*
    comer(double cantidadGramos). Incrementará el peso del animal, aumentándolo según el parámetro 
    indicado en cantidad. Este método no devuelve nada. Si el parámetro es negativo se considera como 
    positivo.
    dormir(), que pone a dormir al animal.
    despertar(), que despierta al bicho.
    descansar(), que pone al animal en reposo.
    jugar(int cantidadMinutos), este método le indica a la mascota que está jugando y recibe como 
    parámetro la cantidad de minutos que estará el animal jugando. Por cada 30 minutos completos de juego, el peso del animal se verá reducido en 20 gr. Si la cantidad es menor de 30 minutos, se reducirá en 10 gramos. Si la cantidad de minutos es negativa se considera positiva. Un animal no puede jugar más de 180 minutos, por lo tanto si se supera esa cantidad se lanzará una excepción de tipo IllegalArgument.
    Animal clonar(Animal pet), método de clase para clonar Animales, que recibe el objeto Animal que 
    queremos clonar, llamado pet, y devuelve el objeto con la copia de pet. Ten en cuenta que este método 
    crea un objeto nuevo. Controla excepciones NullPointer en este método.
    */
    public void comer(double cantidadGramos) {
    this.peso+=Math.abs(cantidadGramos);
    }
    
    public void dormir() {
    this.estado="dormir";
    }
    
    public void despertar() {
    this.estado="despertar";
    }
    
    public void descansar() {
    this.estado=TipoEstado.DURMIENDO;
    }
}
