package org.example;

public class Moneda1000 extends Moneda{
    private int valmon=1000;
    public Moneda1000(){
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
