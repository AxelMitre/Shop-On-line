
package com.mycompany.poo_shop_on_line;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class NewClass {
    public static void main(String[] args) {
        Venta ventas = null;
        cagarVenta(ventas);
    }

    private static void cagarVenta(Venta ventas) {
        Scanner lector = new Scanner(System.in);
        Cliente cliente = null;
        ArrayList<Producto> producto =new ArrayList<>();
        cargarCliente(cliente, lector);
        System.out.println("Cuantos productos quieres ingresar: ");
        int res = lector.nextInt();
        for (int i = 0; i < res; i++) {
            cargarProducto(producto, lector);
        }
        LocalDate hoy = LocalDate.now();
        ventas = new Venta(cliente, hoy);
        ventas.agregarProducto(producto);
        ventas.imprimirFactura();
    }

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

    private static void MostrarRemera(Scanner lector, ArrayList<Producto> producto) {
        System.out.println("describe la remera buscas");
        String des = lector.next();
        double pres = 7500.00;
        System.out.println("Que talla busca: S, M, L, XL");
        String ta = lector.next();
        Remera remera = new Remera(des, pres, ta);
        producto.add(remera);
    }

    private static void MostrarPantalones(Scanner lector, ArrayList<Producto> producto) {
        System.out.println("describe que tipo de pantalon busca ");
        String des = lector.next();
        double pres = 7500.00;
        System.out.println("Que talla busca: 4, 5");
        int ta = lector.nextInt();
        String mo = null;
        System.out.println("Que tipo de modelo de pantalon busca \n"
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

    private static void MostrarAccesorios(Scanner lector, ArrayList<Producto> producto) {
        //(String desc,double precio, String m, int g)
        System.out.println("Describe el Accesorio de busca: ");
        String des = lector.next();
        double pres = 8500.00;
        String ma = null;
        System.out.println("Que tipo de materia quieres que tenga: \n"
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
        System.out.println("Cuantos Gramos de ese material quieres que tenga: ");
        int gra = lector.nextInt();
        Accesorio accesorio = new Accesorio(des, pres, ma, gra);
        accesorio.aduana();
    }
}
