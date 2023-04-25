package org.example;
public abstract class Dulce extends Producto{
    private int seriedulce;
    public Dulce(int numSerie){
        seriedulce = numSerie;
    }
    public abstract String consumir();
    public int getSerie(Dulce d){
        return seriedulce;
    }
}

