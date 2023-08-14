/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poo_shop_on_line;

import java.util.ArrayList;

/**
 *
 * @author CS09
 */
public abstract class Producto {
    protected String desc;
    protected int codigo;
    protected double precio;

    public Producto(String desc,double precio) {
        this.desc = desc;
        this.codigo =(int) (Math.random() * 10000000) + 1; 
        this.precio = precio;
    }

    @Override
    public String toString() {
        return this.desc + "precio: " + this.precio;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public abstract double getPrecio();

    public void setPrecio(double precio) {
        this.precio = precio;
    } 
    
}
