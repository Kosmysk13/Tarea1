package org.example;
public class Comprador{
    private String sonido=null;
    private int vuelto=0;
    public Comprador (Moneda m, int cualProducto, Expendedor exp) throws PagoIncorrectoException,NoHayProductoException,PagoInsuficienteException{
        Producto p = null;
        Moneda m1;
        if ((p = exp.comprarProducto(m,cualProducto))!=null){
            sonido = p.consumir();
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