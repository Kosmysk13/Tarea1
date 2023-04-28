package org.example;
public class Main {
    public static void main(String[] args){
        Moneda mon3 = new Moneda1000();
        Expendedor ex = new Expendedor(10,1000,500);
        Comprador c = null;
        try {
            c = new Comprador(mon3,3,ex);
        } catch (PagoIncorrectoException e) {
            throw new RuntimeException(e);
        }
        System.out.println(c.queBebiste()+" $"+c.cuantoVuelto());
    }
}
