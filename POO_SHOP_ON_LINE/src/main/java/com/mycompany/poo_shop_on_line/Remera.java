/*
 * La clase "Remera" es una subclase de la clase "Producto" y representa un tipo específico de producto,
 * en este caso, una remera con atributos adicionales como el tamaño (talle). La clase calcula el precio
 * de la remera en función de su tamaño.
 */

// Declaración del paquete donde se encuentra la clase
package com.mycompany.poo_shop_on_line;

/**
 * La clase "Remera" hereda de la clase "Producto" y agrega la funcionalidad de manejar el tamaño (talle) de la remera.
 */
public class Remera extends Producto {
    private String talle; // Tamaño de la remera (S, M, L, XL)

    /**
     * Constructor de la clase "Remera".
     *
     * @param desc La descripción de la remera.
     * @param precio El precio base de la remera.
     * @param t El tamaño de la remera (S, M, L, XL).
     */
    public Remera(String desc, double precio, String t) {
        // Llama al constructor de la clase base "Producto" para inicializar la descripción y el precio.
        super(desc, precio);
        this.talle = t;
    }

    /**
     * Método para obtener el tamaño de la remera.
     *
     * @return El tamaño de la remera (S, M, L, XL).
     */
    public String getTalle() {
        return talle;
    }

    /**
     * Método para establecer el tamaño de la remera.
     *
     * @param talle El nuevo tamaño de la remera (S, M, L, XL).
     */
    public void setTalle(String talle) {
        this.talle = talle;
    }

    /**
     * Método para obtener el precio de la remera. El precio se calcula en función del tamaño de la remera.
     *
     * @return El precio de la remera calculado según el tamaño.
     */
    public double getPrecio() {
        if (this.talle.equals("S")) {
            precio = precio; // Sin cambios en el precio para talla S.
        } if (this.talle.equals("M")) {
            precio = precio + 0.05 * precio; // Aumento del 5% para talla M.
        } if (this.talle.equals("L")) {
            precio = precio + 0.10 * precio; // Aumento del 10% para talla L.
        } if (this.talle.equals("XL")) {
            precio = precio + 0.15 * precio; // Aumento del 15% para talla XL.
        }
        return precio;
    }

    /**
     * Sobrescribe el método "toString" para proporcionar una representación en cadena de la remera.
     *
     * @return Una cadena que describe la remera con su descripción, tamaño y precio.
     */
    @Override
    public String toString() {
        return "Remera: " + "Descripcion: " + desc + " Talle: " + talle + " Precio: " + precio + '.';
    }
}
