package com.clase;

import java.util.ArrayList;

public class TiendaElectronica {
    private ArrayList<ProductoElectrodomestico> listadoDeProductos;

    public TiendaElectronica() {
        this.listadoDeProductos = new ArrayList<>();
    }

    public void addProducto(ProductoElectrodomestico producto) {
        if (producto != null) {
            listadoDeProductos.add(producto);
            System.out.println("Producto Agregado: " + producto.getNombre());
        }
    }

public void realizarVenta(ProductoElectrodomestico producto, int cantidad) {

    if (!listadoDeProductos.contains(producto)) {
        System.out.println("El producto no está en el inventario.");
        return;
    }

    int stockActual = producto.getCantidadDisponible();

    if (stockActual <= 0) {
        System.out.println("Producto agotado: " + producto.getNombre());
        return;
    }

    if (cantidad > stockActual) {
        System.out.println("No hay suficiente stock para vender " + cantidad 
            + " unidades de " + producto.getNombre());
        System.out.println("Stock disponible: " + stockActual);
        return;
    }

    // Reducir stock
    producto.setCantidadDisponible(stockActual - cantidad);

    System.out.println("Venta realizada: " + producto.getNombre() 
        + " | Cantidad vendida: " + cantidad
        + " | Stock restante: " + producto.getCantidadDisponible());
}

    public void mostrarInformacionDeTienda(){
        System.out.println("\n=== Informacion de toda la Tienda ===");
        if (listadoDeProductos.isEmpty()) {
            System.out.println("No hay Productos");
        } else {
            for (int i = 0; i < listadoDeProductos.size(); i++) {
                ProductoElectrodomestico producto = listadoDeProductos.get(i);
                System.out.println("Producto #" + (i + 1) + ":");
                // Suponiendo que ProductoElectrodomestico tiene un método mostrarInformacion()
                if (producto != null) {
                    producto.mostrarInformacion();
                }
                System.out.println();
            }
        }
        System.out.println();
    }
}
