package org.example;
public class Comprador{
    private String sonido=null;
    private int vuelto=0;
    public Comprador (Moneda m, int cualProducto, Expendedor exp){
        Bebida b = null;
        Moneda m1;
        if ((b = exp.comprarProducto(m,cualProducto))!=null){
            sonido = b.consumir();
        }
        while ((m1 = exp.getVuelto())!=null){
            vuelto = vuelto + m1.getValor();
        }

    }
    public int cuantoVuelto(){
        return vuelto;
    }
    public String queBebiste(){
        return sonido;
    }
}