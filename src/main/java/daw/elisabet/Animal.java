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
// Contructor animal
public class Animal {

    // Todos los datos están encapulados
    private LocalDate fechaNacimiento; // fecha de nacimiento
    private String nombre; // nombre
    private TipoAnimal tipo; // se restringe el tipo {GATO, PERRO, LAGARTO, COBAYA, PERIQUITO;} a un enum con esos valores
    private double peso; // en gramos
    private TipoEstado estado; // se restringe el tipo {COMIENDO,DURMIENDO,DESPIERTO-REPOSO,JUGANDO} a un enum con esos valores

    // Constructor por defecto.
    public Animal() {
    }
    
    // Constructor parametrizado con todos los atributos
    public Animal(LocalDate fechaNacimiento, String nombre, TipoAnimal tipo, double peso, TipoEstado estado) {
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.tipo = tipo;
        this.peso = peso;
        this.estado = estado;
    }

    // getter y setter
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

    // to string por defecto
    @Override
    public String toString() {
        return "Animal{" + "fechaNacimiento=" + fechaNacimiento + ", nombre=" + nombre + ", tipo=" + tipo + ", peso=" + peso + ", estado=" + estado + '}';
    }

    // método Incrementará el peso del animal, aumentándolo según el parámetro indicado en cantidad. 
    //Este método no devuelve nada. Si el parámetro es negativo se considera como positivo.
    public void comer(double cantidadGramos) {
        this.peso += Math.abs(cantidadGramos);
    }
    
    //método que pone a dormir al animal.
    public void dormir() {
        this.estado = TipoEstado.DURMIENDO;
    }

    //método que despierta al animal. (despierto y reposo según lo estipulado en el enunciado es lo mismo)
    public void despertar() {
        this.estado = TipoEstado.DESPIERTO_REPOSO;
    }
    
    //método que deja en reposo al animal. (despierto y reposo según lo estipulado en el enunciado es lo mismo)
    public void descansar() {
        this.estado = TipoEstado.DESPIERTO_REPOSO;
    }

    // método le indica a la mascota que está jugando y recibe como parámetro la cantidad de minutos que estará 
    //el animal jugando. Por cada 30 minutos completos de juego, el peso del animal se verá reducido en 20 gr. 
    //Si la cantidad es menor de 30 minutos, se reducirá en 10 gramos. Si la cantidad de minutos es negativa se considera positiva. 
    //Un animal no puede jugar más de 180 minutos, por lo tanto si se supera esa cantidad se lanzará una excepción de tipo IllegalArgument.
    public void jugar(int minutos) {
        // convertimos el número en positivo por si acaso
        int minutosEnteros = Math.abs(minutos);
        // cambiamos el estado a jugando
        this.estado = TipoEstado.JUGANDO;
        
        // si los minutos no llegan a 30 le bajamos 10 gr
        if (minutos < 30) {
            this.peso -= 10;
         // por encima de 180 minutos lanzamos una excepcion 
        } else if (minutos > 180) {
            throw new IllegalArgumentException("Un animal no puede jugar más de 180 minutos");
        } else {
            // calculamos el multiplicador
            int cantidad = minutos/30;
            // calculamos el pesoTotal aplicando la formula
            double totalPesoPerdido= this.peso - (cantidad*20);
            // si ha llegado a 0 el animal se debería desmayar, así muestro un mensaje informando
            if (totalPesoPerdido>0){
            this.peso=totalPesoPerdido;
            } else {
                System.out.println("El animal ha quedado exhausto, porfavor alimentalo");
                this.peso=0;
            }
        }
    }
    
    // método de clase para clonar Animales, que recibe el objeto Animal que queremos clonar, llamado pet, 
    //y devuelve el objeto con la copia de pet.
    public static Animal clonarAnimal(Animal pet){
        Animal clonado = new Animal();
        // controlamos que el parametro que recibimos no es null, si es nul lanza una exception.
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
