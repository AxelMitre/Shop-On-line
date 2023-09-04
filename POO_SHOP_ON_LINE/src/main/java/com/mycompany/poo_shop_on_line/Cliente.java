/*
 * Esta clase representa un objeto Cliente con nombre, apellido y número de identificación (DNI).
 */
package com.mycompany.poo_shop_on_line;

/**
 * La clase Cliente representa a un cliente de la tienda en línea.
 */
public class Cliente {
    private String nombre; // Nombre del cliente.
    private String apellido; // Apellido del cliente.
    private int dni; // Número de identificación (DNI) del cliente.

    /**
     * Constructor de la clase Cliente.
     *
     * @param nombre El nombre del cliente.
     * @param apellido El apellido del cliente.
     * @param dni El número de identificación (DNI) del cliente.
     */
    public Cliente(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    // Métodos getter y setter para el nombre.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos getter y setter para el apellido.
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // Métodos getter y setter para el DNI.
public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
