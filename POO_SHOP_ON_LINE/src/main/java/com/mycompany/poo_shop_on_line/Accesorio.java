package com.mycompany.poo_shop_on_line;

import javax.swing.JOptionPane;

// La clase Accesorio extiende de Producto e implementa la interfaz Interfas.
public class Accesorio extends Producto implements Interfas {
    private String metal; // Tipo de metal del accesorio.
    private int gramo; // Peso en gramos del accesorio.

    // Constructor de la clase Accesorio.
    public Accesorio(String desc, double precio, String m, int g) {
        super(desc, precio); // Llama al constructor de la clase base Producto.
        this.metal = m; // Inicializa el tipo de metal.
        this.gramo = g; // Inicializa el peso en gramos.
    }

    // Métodos getters y setters para metal, gramo, desc y codigo (heredados de Producto).

    // Método para calcular el precio del accesorio con base en el tipo de metal y peso en gramos.
    @Override
    public double getPrecio() {
        int gOro = 17300;
        int gPlata = 7000;
        int gMetal = 500;
        if (this.metal.equals("Acero")) {
            precio = precio + this.gramo * gMetal;
        }
        if (this.metal.equals("Plata")) {
            precio = precio + this.gramo * gPlata;
        }
        if (this.metal.equals("Oro")) {
            precio = precio + this.gramo * gOro;
        }
        return precio;
    }

    // Método para mostrar la información del accesorio como cadena de texto.
    @Override
    public String toString() {
        return "Accesorio: " + "Descripción: " + desc + " Precio: " + precio + " Metal: " + metal + " Gramos: " + gramo + '.';
    }

    // Implementación del método aduana de la interfaz Interfas.
    @Override
    public void aduana() {
        JOptionPane.showMessageDialog(null, this.precio + (this.precio * 0.10));
    }

    // Implementación del método ingreasr de la interfaz Interfas.

    @Override
    public void ingreasr() {
        JOptionPane.showMessageDialog(null, this.precio+(this.precio*0.2));
    }

    
    
}


