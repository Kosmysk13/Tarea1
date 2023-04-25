package org.example;

public class Moneda500 extends Moneda{
    private int valmon=500;
    public Moneda500(){
        super();
    }
    public int getValor(){
        return valmon;
    }
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
