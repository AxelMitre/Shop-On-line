/*
 * La clase Pantalon representa un producto de tipo pantalón con descripción, precio, talle y modelo.
 */
package com.mycompany.poo_shop_on_line;

/**
 * La clase Pantalon es una subclase de Producto que representa un pantalón.
 */
public class Pantalon extends Producto {
    private int talle; // Talle del pantalón.
    private String modelo; // Modelo del pantalón.

    /**
     * Constructor de la clase Pantalon.
     *
     * @param desc La descripción del pantalón.
     * @param precio El precio del pantalón.
     * @param t El talle del pantalón.
     * @param m El modelo del pantalón.
     */
    public Pantalon(String desc, double precio, int t, String m) {
        super(desc, precio); // Llama al constructor de la clase padre (Producto).
        this.talle = t;
        this.modelo = m;
    }

    // Métodos getter y setter para el talle.
    public int getTalle() {
        return talle;
    }

    public void setTalle(int talle) {
        this.talle = talle;
    }

    // Métodos getter y setter para el modelo.
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Implementación del método abstracto getPrecio de la clase Producto.
    public double getPrecio() {
        double precio = this.precio;
        if (this.modelo.equals("Oxford")) {
            precio = precio + (0.15 * precio);
        }
        if (this.modelo.equals("Skinny")) {
            precio = precio + (0.25 * precio);
        }
        if (this.modelo.equals("Recto")) {
            precio = precio - (0.15 * precio);
        }
        return precio;
    }

    // Sobrescritura del método toString para mostrar la información del Pantalón.
    @Override
    public String toString() {
        return "Pantalón: " + "Descripción: " + desc + " Talle: " + talle + " Modelo: " + modelo + '.';
    }
}
