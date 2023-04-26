package org.example;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Moneda mon3 = new Moneda1000();
        Moneda mon4 = new Moneda1500();
        System.out.println(mon3.getValor());
        System.out.println(mon4.getValor());
        Expendedor ex = new Expendedor(10,1000,500);
        Comprador c = new Comprador(mon3,3,ex);
        System.out.println(c.queBebiste()+" "+c.cuantoVuelto());
    }
}
