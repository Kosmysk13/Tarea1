class Comprador{
    private String sonido=null;
    private int vuelto=0;
    public Comprador (Moneda m, int cualBebida, Expendedor exp){
        Bebida b = null;
        Moneda m1;
        if ((b = exp.comprarBebida(m,cualBebida))!=null){
            sonido = b.beber();
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