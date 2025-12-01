package com;

import com.clase.ComputadorPortatil;
import com.clase.ProductoElectrodomestico;
import com.clase.Televisor;
import com.clase.TiendaElectronica;

public class Aplicacion {

    public static void main(String[] args) {

        // Crear la tienda
        TiendaElectronica tienda = new TiendaElectronica();

        // INSTANCIAR PRODUCTOS
        Televisor tv1 = new Televisor("Samsung Smart TV", 39990f, 5, 55.0, "4K UHD");
        Televisor tv2 = new Televisor("LG OLED", 59990f, 3, 65.0, "4K OLED");

        ComputadorPortatil laptop1 = new ComputadorPortatil("HP Pavilion", 499990f, 4,
                "HP", 16, 12345);

        ComputadorPortatil laptop2 = new ComputadorPortatil("Asus VivoBook", 429990f, 2,
                "Asus", 8, 98765);

        // AGREGAR PRODUCTOS
        tienda.addProducto(tv1);
        tienda.addProducto(tv2);
        tienda.addProducto(laptop1);
        tienda.addProducto(laptop2);

        // MOSTRAR INFORMACIÓN DE LA TIENDA
        tienda.mostrarInformacionDeTienda();
    }
}