/*
 * Este código define la clase abstracta "Producto" que sirve como una base
 * para representar productos en un sistema de tienda en línea.
 */

// Declaración del paquete donde se encuentra la clase
package com.mycompany.poo_shop_on_line;

// Importación de la clase ArrayList del paquete java.util (aunque no se usa en este código)
import java.util.ArrayList;

/**
 * La clase abstracta "Producto" representa un producto genérico con atributos
 * como descripción, código y precio. No se pueden crear objetos directamente
 * a partir de esta clase, sino que debe ser extendida por subclases que
 * implementen el método abstracto "getPrecio".
 */
public abstract class Producto {
    // Atributos protegidos de la clase Producto
    protected String desc; // Descripción del producto
    protected int codigo; // Código único del producto
    protected double precio; // Precio del producto

    /**
     * Constructor de la clase Producto.
     *
     * @param desc La descripción del producto.
     * @param precio El precio del producto.
     */
    public Producto(String desc, double precio) {
        // Inicializa los atributos con los valores proporcionados
        this.desc = desc;
        // Genera un código de producto aleatorio
        this.codigo = (int) (Math.random() * 10000000) + 1;
        this.precio = precio;
    }

    /**
     * Método para obtener la descripción del producto.
     *
     * @return La descripción del producto.
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Método para establecer la descripción del producto.
     *
     * @param desc La nueva descripción del producto.
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * Método para obtener el código único del producto.
     *
     * @return El código único del producto.
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Método para establecer el código único del producto.
     *
     * @param codigo El nuevo código único del producto.
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Método abstracto que debe ser implementado por las subclases para
     * obtener el precio del producto específico.
     *
     * @return El precio del producto.
     */
    public abstract double getPrecio();

    /**
     * Método para establecer el precio del producto.
     *
     * @param precio El nuevo precio del producto.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Sobrescribe el método "toString" para proporcionar una representación
     * en cadena del objeto Producto.
     *
     * @return Una cadena que describe el producto con su descripción, código y precio.
     */
