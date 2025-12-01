package com.clase;

public class ComputadorPortatil extends ProductoElectrodomestico{
    private String marca;
    private int memoriaRam;
    private int numeroSerie;


    public ComputadorPortatil(String nombre, float precio, int cantidadDisponible, String marca, int memoriaRam, int numeroSerie){
        super( nombre, precio, cantidadDisponible);
        this.marca =marca;
        this.memoriaRam = memoriaRam;
        this.numeroSerie = numeroSerie;
    }

    public ComputadorPortatil(String nombre, float precio){
        super(nombre, precio);
        this.marca = "";
        this.memoriaRam = 0;
        this.numeroSerie = 0;
    }
    public String getmarca(){
        return marca;
    }
    public void setmarca(String marca){
    this.marca = marca;
    }


    public int getmemoriaRam(){
        return memoriaRam;
    }
    public void setmemoriaRam(int memoriaRam){
        this.memoriaRam = memoriaRam;
    }

    public int getnumeroSerie(){
        return numeroSerie;
    }
    public void setnumeroSerie(int numeroSerie){
        this.numeroSerie = numeroSerie;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("=== Computador ===");
        super.mostrarInformacion();
        System.out.println("Marca del Computador : " + marca);
        System.out.println("Memoria Ram del Computador : " + memoriaRam + "GB");
        System.out.println("Numero de Serie: " + numeroSerie);
        System.out.println("=============");
    }

}
