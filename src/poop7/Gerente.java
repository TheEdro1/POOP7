/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 * Clase que representa a un Gerente, que extiende de Empleado y tiene un atributo presupuesto.
 * 
 * @author Ethan
 */
public class Gerente extends Empleado {
    private float presupuesto;

    // Constructor vacío
    public Gerente() {
        super();  // Llama al constructor de Empleado
    }

    // Constructor con todos los parámetros
    public Gerente(String nombre, int NumEmpleado, float sueldo, float presupuesto) {
        super(nombre, NumEmpleado, sueldo);  // Llama al constructor de Empleado
        this.presupuesto = presupuesto;
    }

    // Getters y Setters
    public float getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(float presupuesto) {
        this.presupuesto = presupuesto;
    }

    public float asignarPresupuesto(float presupuesto) {
        this.presupuesto = presupuesto;
        return presupuesto;
    }

    // Sobreescribiendo toString para incluir presupuesto
    @Override
    public String toString() {
        return super.toString() + " Gerente{" + "presupuesto=" + presupuesto + '}';
    }
}