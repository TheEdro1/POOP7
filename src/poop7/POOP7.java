/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop7;

import zoologico.Animal;

/**
 * Clase principal que prueba las clases Empleado, Gerente y Animal.
 * 
 * @author poo03alu13
 */
public class POOP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un empleado y mostrar su información
        Empleado empleado = new Empleado("Lizbeth", 3247, 2000f);
        System.out.println(empleado);
        
        // Aumentar sueldo del empleado y mostrar la información actualizada
        empleado.aumentarSueldo(10);
        System.out.println(empleado);
        
        // Crear dos gerentes y mostrar su información
        Gerente gerente1 = new Gerente("Ethan", 1234, 25000, 100);
        System.out.println(gerente1);

        Gerente gerente2 = new Gerente(); 
        System.out.println(gerente2);
        
        // Modificar atributos del segundo gerente
        gerente2.setPresupuesto(100);
        System.out.println(gerente2);
        
        gerente2.setNombre("Duriel");
        System.out.println(gerente2);
        
        System.out.println("Nombre del gerente 2: " + gerente2.getNombre());
        
        // Crear un animal y mostrar su información
        Animal animal = new Animal();
        System.out.println(animal);
        
        // Crear un animal con nombre y mostrar su información
        Animal otroAnimal = new Animal("Leon");
        System.out.println(otroAnimal);
    }
}
