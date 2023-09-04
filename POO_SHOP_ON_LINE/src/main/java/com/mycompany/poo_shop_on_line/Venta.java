/*
 * La clase "Venta" representa una transacción de venta en un sistema de tienda en línea.
 * Cada venta tiene una lista de productos, un cliente asociado, un número de factura único y una fecha.
 */

// Declaración del paquete donde se encuentra la clase
package com.mycompany.poo_shop_on_line;

// Importación de las clases LocalDate y ArrayList del paquete java.time y java.util respectivamente
import java.time.LocalDate;
import java.util.ArrayList;

/**
 * La clase "Venta" se utiliza para registrar y gestionar las ventas de productos a clientes.
 */
public class Venta {
    private ArrayList<Producto> listaProd; // Lista de productos vendidos en esta venta
    private Cliente cliente; // Cliente que realizó la compra
    private static int cantVenta = 1090; // Contador de ventas (incrementado automáticamente)
    private static int nroFact; // Número de factura único
    private LocalDate fecha; // Fecha de la venta

    /**
     * Constructor de la clase "Venta".
     *
     * @param cliente El cliente que realiza la compra.
     * @param fecha La fecha de la venta.
     */
    public Venta(Cliente cliente, LocalDate fecha) {
        this.cliente = cliente;
        this.cantVenta++;
        this.nroFact++; // Incrementa el número de factura para cada nueva venta
        this.fecha = fecha;
    }

    /**
     * Método para agregar productos a la lista de productos vendidos en esta venta.
     *
     * @param p La lista de productos a agregar.
     */
    public void agregarProducto(ArrayList<Producto> p) {
        this.listaProd = p;
    }

    /**
     * Método para calcular el total a pagar por los productos vendidos en esta venta.
     *
     * @return El total a pagar por los productos.
     */
    public double calcularTotal() {
        double totalPrecio = 0;
        for (Producto prod : listaProd) {
            totalPrecio += prod.getPrecio();
        }
        return totalPrecio;
    }

    /**
     * Método para imprimir una factura que muestra detalles de la venta, incluyendo el número de venta,
     * la fecha, la lista de productos y el total a pagar.
     */
    public void imprimirFactura() {
        System.out.println("Número de venta: " + cantVenta + " | Fecha: " + fecha);
        System.out.println("Productos:");
        for (Producto prod : listaProd) {
            System.out.println(prod);
        }
        System.out.println("Total a pagar: " + calcularTotal());
    }
}
