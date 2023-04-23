package org.example;

interface Producto{
    public void Bebida();

    public void Dulce();
    public Producto getSerie();
    public abstract int getValor();
    public abstract String consumir();
}