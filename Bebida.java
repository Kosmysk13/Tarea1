package org.example;
public abstract class Bebida extends Producto{
    private int seriebebida;
    public Bebida(int numSerie){
        seriebebida = numSerie;
    }
    public abstract String consumir();
    public int getSerie(Bebida b){
        return seriebebida;
    }
}

