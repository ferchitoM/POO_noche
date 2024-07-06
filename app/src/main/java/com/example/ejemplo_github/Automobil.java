package com.example.ejemplo_github;

public class Automobil extends Carro{

    int cilindraje;

    public Automobil(String color, String marca, int modelo, int velocidadActual){
        super(color, marca, modelo, velocidadActual); //el constructor de mi la superclase o de mi clase padre
        cilindraje = 1200;
    }

    public String mostrarCarro(){
        return  "Atributos del Automobil: " +
                "Color:     " + color           + ", " +
                "Marca:     " + marca           + ", " +
                "Modelo:    " + modelo          + ", " +
                "Velocidad: " + velocidadActual + ", " +
                "Encendido: " + isEstaEncendido() + ", " +
                "Cilindraje: " + cilindraje;
    }

}
