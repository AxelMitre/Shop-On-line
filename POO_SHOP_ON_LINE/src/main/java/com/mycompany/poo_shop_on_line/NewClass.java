package com.mycompany.poo_shop_on_line;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
// Bloque principal

// Esta es la clase principal del programa.
public class NewClass {
    public static void main(String[] args) {
        Venta ventas = null;
        cagarVenta(ventas);
    }

    // Este método se utiliza para cargar una venta (Venta) e interactuar con el usuario.
    private static void cagarVenta(Venta ventas) {
        Scanner lector = new Scanner(System.in);
        Cliente cliente = null;
        ArrayList<Producto> producto = new ArrayList<>();
        
        // Cargar información del cliente.
        cargarCliente(cliente, lector);
        
        System.out.println("Cuantos productos quieres ingresar: ");
        int res = lector.nextInt();
        
        // Cargar información del producto.
        for (int i = 0; i < res; i++) {
            cargarProducto(producto, lector);
        }
        
        LocalDate hoy = LocalDate.now();
        ventas = new Venta(cliente, hoy);
        ventas.agregarProducto(producto);
        ventas.imprimirFactura();
    }

    // Este método carga la información del cliente.
    private static void cargarCliente(Cliente cliente, Scanner lector) {
        System.out.println("Datos del cliente:");
        System.out.println("Cual es tu nombre:");
        String nom = lector.next();
        System.out.println("Cual es apellido:");
        String ape = lector.next();
        System.out.println("Cual es el dni");
        int Dni = lector.nextInt();
        cliente = new Cliente(nom, ape, Dni);
    }

    // Este método carga la información del producto según la elección del usuario.
    private static void cargarProducto(ArrayList<Producto> producto, Scanner lector) {
        System.out.println("Datos del Producto");
        System.out.println("Que tipo de producto busca\n"
                + "1) Remeras\n"
                + "2) Pantalones\n"
                + "3) Accesorios");
        int res = lector.nextInt();
        switch (res) {
            case 1:
                MostrarRemera(lector, producto);
                break;
            case 2:
                MostrarPantalones(lector, producto);
                break;
            case 3:
                MostrarAccesorios(lector, producto);
                break;
        }
    }

    // Este método carga información para un producto "Remera".
    private static void MostrarRemera(Scanner lector, ArrayList<Producto> producto) {
        System.out.println("Describe la remera que buscas");
        String des = lector.next();
        double pres = 7500.00;
        System.out.println("Qué talla buscas: S, M, L, XL");
        String ta = lector.next();
        Remera remera = new Remera(des, pres, ta);
        producto.add(remera);
    }

    // Este método carga información para un producto "Pantalón".
    private static void MostrarPantalones(Scanner lector, ArrayList<Producto> producto) {
        System.out.println("Describe qué tipo de pantalón buscas");
        String des = lector.next();
        double pres = 7500.00;
        System.out.println("Qué talla buscas: 4, 5");
        int ta = lector.nextInt();
        String mo = null;
        System.out.println("Qué tipo de modelo de pantalón buscas \n"
                + "1) Oxford \n"
                + "2) Skinny \n"
                + "3) Recto ");
        int res = lector.nextInt();
        switch (res) {
            case 1:
                mo = "Oxford";
                break;
            case 2:
                mo = "Skinny";
                break;
            case 3:
                mo = "Recto";
                break;
        }
        Pantalon pantalon = new Pantalon(des, pres, ta, mo);
        producto.add(pantalon);
    }

    // Este método carga información para un producto "Accesorio".
    private static void MostrarAccesorios(Scanner lector, ArrayList<Producto> producto) {
        System.out.println("Describe el Accesorio que buscas: ");
        String des = lector.next();
        double pres = 8500.00;
        String ma = null;
        System.out.println("Qué tipo de material quieres que tenga: \n"
                + "1) Acero \n"
                + "2) Plata \n"
                + "3) Oro");
        int res = lector.nextInt();
        switch (res) {
            case 1:
                ma = "Acero";
                break;
            case 2:
                ma = "Plata";
                break;
            case 3:
                ma = "Oro";
                break;
        }
        System.out.println("Cuantos gramos de ese material quieres que tenga: ");
