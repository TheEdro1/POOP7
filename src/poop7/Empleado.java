/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 * Clase que representa a un empleado con nombre, número de empleado y sueldo.
 * Proporciona métodos para modificar y consultar estos atributos.
 * 
 * @author Ethan
 */
public class Empleado {
    private String nombre;
    private int NumEmpleado;
    private float sueldo;

    // Constructor vacío
    public Empleado() {
    }

    // Constructor con parámetros
    public Empleado(String nombre, int NumEmpleado, float sueldo) {
        this.nombre = nombre;
        this.NumEmpleado = NumEmpleado;
        this.sueldo = sueldo;
    }

    // Getters y Setters
    public int getNumEmpleado() {
        return NumEmpleado;
    }

    public void setNumEmpleado(int NumEmpleado) {
        this.NumEmpleado = NumEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * Aumenta el sueldo del empleado en función de un porcentaje.
     * @param porcentajeDeAumento El porcentaje en que se debe aumentar el sueldo.
     */
    public void aumentarSueldo(int porcentajeDeAumento) {
        if (porcentajeDeAumento < 0) {
            System.out.println("El porcentaje de aumento no puede ser negativo.");
            return;
        }
        sueldo += sueldo * porcentajeDeAumento / 100;
    }

    // Sobreescribiendo toString
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", NumEmpleado=" + NumEmpleado + ", sueldo=" + sueldo + '}';
    }
}
