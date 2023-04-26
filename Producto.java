package org.example;

public abstract class Producto{
    private int numserie;
    public Producto(int Serie){
        numserie=Serie;
    }
    public abstract String consumir();
    public int getSerie(Producto p){
        return numserie;
    }
}