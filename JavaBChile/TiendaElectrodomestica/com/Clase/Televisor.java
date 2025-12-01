package com.clase;
public class Televisor extends ProductoElectrodomestico{
    private Double tamanoPantalla;
    private String resolucion;


    public Televisor(String nombre, float precio, int cantidadDisponible, Double tamanoPantalla, String resolucion){
        super(nombre, precio, cantidadDisponible);
        this.tamanoPantalla = tamanoPantalla;
        this.resolucion = resolucion;
    }

    public Televisor(String nombre, float precio){
        super(nombre, precio);
        this.tamanoPantalla = 0.0;
        this.resolucion = "";
    }

    public Double gettamanoPantalla(){
        return tamanoPantalla;
    }
    public void settamanoPantalla(Double tamanoPantalla){
        this.tamanoPantalla = tamanoPantalla;
    }

    public String getresolucion(){
        return resolucion;
    }
    public void setresolucion(String resolucion){
    this.resolucion = resolucion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("=== Televisor ===");
        super.mostrarInformacion();
        System.out.println("Tamaño de Pantalla: " + tamanoPantalla);
        System.out.println("Resolucion : " + resolucion);
        System.out.println("=============");
    }

}                                                                                   
