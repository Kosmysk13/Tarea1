package org.example;
public abstract class Moneda implements Comparable<Moneda>{
    public Moneda(){

    }
    public Moneda getSerie(){
        return this.getSerie();
    }
    public abstract int getValor();
}


