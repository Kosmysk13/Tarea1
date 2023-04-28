package org.example;

public abstract class Bebida extends Producto{
    public Bebida(int numSerie){
        super(numSerie);
    }
    public abstract String consumir();
}

