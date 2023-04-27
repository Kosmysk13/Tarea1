package org.example;
public class Main {
    public static void main(String[] args) {
        Moneda mon3 = new Moneda1000();
        //System.out.println(mon3.toString());
        //System.out.println(mon3.getSerie());
        Expendedor ex = new Expendedor(10,1000,500);
        Comprador c = new Comprador(mon3,3,ex);
        System.out.println(c.queBebiste()+" $"+c.cuantoVuelto());
        Comprador c2 = new Comprador(mon3,3,ex);
        System.out.println(c2.queBebiste()+" $"+c2.cuantoVuelto());
    }
}
