package com.clase;

public class ProductoElectrodomestico {
    private String nombre;
    private float precio;
    private int cantidadDisponible;

    public ProductoElectrodomestico(String nombre, float precio, int cantidadDisponible) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }

    public ProductoElectrodomestico(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadDisponible = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad disponible: " + cantidadDisponible);
    }
}