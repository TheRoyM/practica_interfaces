package co.edu.unac.poo1;

import co.edu.unac.poo1.acciones.Movimiento;

public class Canino implements Movimiento{
    private String nombre;
    private Float altura;
    private Integer edad;

    public Canino() {
    }

    public Canino(String nombre, Float altura, Integer edad) {
        this.nombre = nombre;
        this.altura = altura;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public boolean correr() {
        return false;
    }

    @Override
    public boolean bajarEscaleras() {
        return false;
    }


    @Override
    public void verInformacion(){
        System.out.println("----------------------------------------------");
        System.out.println("La raza del perro es: " + this.nombre + ".");
        System.out.println("Con una altura de: " + this.altura + " Cms.");
        System.out.println("Y su edad es de " + this.edad + ".");
        System.out.println("----------------------------------------------");
    }
}
