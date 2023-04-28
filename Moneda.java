package org.example;
public abstract class Moneda implements Comparable<Moneda>{
    public Moneda(){
    }
    public Moneda getSerie(){
        return this;
    }
    public abstract int getValor();
    @Override
    public String toString(){
        return ("Valor: " + getValor() + " Serie: " + getSerie().toString()); //Agregar cómo mostrar numero de serie
    }
    @Override
    public int compareTo(Moneda auxmon){
        return Integer.compare(this.getValor(), auxmon.getValor());
    }
}


