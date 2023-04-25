package org.example;

public class Moneda100 extends Moneda {
    private int valmon=100;
    public Moneda100(){
        super();
    }
    public int getValor(){
        return valmon;
    }
    @Override
    public int compareTo(Moneda o) {
        return 0;
    }
}