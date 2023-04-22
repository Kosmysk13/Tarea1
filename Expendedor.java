class Expendedor{
    private int precios;
    private Deposito depcoca;
    private Deposito depsprite;
    public static final int  COCA=1;
    public static final int  SPRITE=2;
    DepositoM monVu = new DepositoM();

    public Expendedor(int numProductos, int precioBebidas, int precioDulces){
        preciosB = precioBebidas;
        preciosD = precioDulces;
        depcoca = new Deposito();
        depsprite = new Deposito();
        for (int i=0;i<numProductos;i++){
            Bebida b1 = new CocaCola(100 + i);
            depcoca.addBebida(b1);
            Bebida b2 = new Sprite(200 + i);
            depsprite.addBebida(b2);
        }
    }
    public Bebida comprarBebida(Moneda mon, int cualB){
        Bebida b = null;
        if (mon!=null){
            if (mon.getValor()>=precios){
                switch (cualB){
                    case 1:  b = depcoca.getBebida(); break;
                    case 2:  b = depsprite.getBebida(); break;
                    default: break;
                }
                if (b!=null){
                    for (int i = 0;i<(mon.getValor()-precios)/100;i++){
                        Moneda mon1 = new Moneda100();
                        monVu.addMoneda(mon1);
                    }
                }else{
                    Moneda mon1 = mon;
                    monVu.addMoneda(mon1);
                }
            }else{
                Moneda mon1 = mon;
                monVu.addMoneda(mon1);
            }
        }else{
            return b;
        }
        return b;
    }
    public Moneda getVuelto(){
        Moneda m = monVu.getMoneda();
        return m;
    }
}