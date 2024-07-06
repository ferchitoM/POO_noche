package com.example.ejemplo_github;

public class Carro {
    String color;
    String marca;
    int modelo;
    int velocidadActual;
    private boolean estaEncendido;

    //Constructor vacío
    public Carro(){
        this.color              = "";
        this.marca              = "";
        this.modelo             = 0;
        this.velocidadActual    = 0;
        this.estaEncendido      = false;
    }

    //constructor con parámetros
    public Carro(String color, String marca, int modelo, int velocidadActual){
        this.color              = color;
        this.marca              = marca;
        this.modelo             = modelo;
        this.velocidadActual    = velocidadActual;
        this.estaEncendido      = false;
    }

    public String mostrarCarro(){
        return  "Atributos del carro: " +
                "Color:     " + color           + ", " +
                "Marca:     " + marca           + ", " +
                "Modelo:    " + modelo          + ", " +
                "Velocidad: " + velocidadActual + ", " +
                "Encendido: " + estaEncendido;
    }

    public void encenderCarro(){
        estaEncendido = true;
    }

    public void apagarCarro(){
        estaEncendido = false;
    }

    public boolean isEstaEncendido() {
        return estaEncendido;
    }

    public void setEstaEncendido(boolean estaEncendido) {
        this.estaEncendido = estaEncendido;
    }
}
