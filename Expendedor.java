package org.example;
class Expendedor{
    private int preciosB;
    private int preciosD;

    private DepositoB depcoca;
    private DepositoB depsprite;
    private DepositoD depsnickers;
    private DepositoD depsuper8;
    public static final int  COCA=1;
    public static final int  SPRITE=2;

    public static final int  SNICKERS=3;
    public static final int  SUPER8=4;
    DepositoM monVu = new DepositoM();

    public Expendedor(int numProductos, int precioBebidas, int precioDulces){
        preciosB = precioBebidas;
        preciosD = precioDulces;
        depcoca = new DepositoB();
        depsprite = new DepositoB();
        depsnickers = new DepositoD();
        depsuper8 = new DepositoD();
        for (int i=0;i<numProductos;i++){
            Bebida b1 = new CocaCola(100 + i);
            depcoca.addBebida(b1);
            Bebida b2 = new Sprite(200 + i);
            depsprite.addBebida(b2);
            Dulce d1 = new Snickers(300 + i);
            depsnickers.addDulce(d1);
            Dulce d2 = new Super8(300 + i);
            depsuper8.addDulce(d2);
        }
    }
    public Bebida comprarProducto(Moneda mon, int cualP){
        Bebida b = null;
        Dulce d = null;
        if (mon!=null){
            if ((cualP==1)||(cualP==2)){
                if (mon.getValor()>=preciosB){
                    switch (cualP){
                        case 1:  b = depcoca.getBebida(); break;
                        case 2:  b = depsprite.getBebida(); break;
                        default: break;
                    }
                    if (b!=null){
                        for (int i = 0;i<(mon.getValor()-preciosB)/100;i++){
                            Moneda mon1 = new Moneda100();
                            monVu.addMoneda(mon1);
                        }
                    }else {
                        Moneda mon1 = mon;
                        monVu.addMoneda(mon1);
                    }
                }else{
                    Moneda mon1 = mon;
                    monVu.addMoneda(mon1);
                }
            }else{
                if (mon.getValor()>=preciosD){
                    switch (cualP){
                        case 3:  d = depsnickers.getDulce(); break;
                        case 4:  d = depsuper8.getDulce(); break;
                        default: break;
                    }
                    if(d!=null){
                        for (int i = 0;i<(mon.getValor()-preciosD)/100;i++){
                            Moneda mon1 = new Moneda100();
                            monVu.addMoneda(mon1);
                        }
                    }else {
                        Moneda mon1 = mon;
                        monVu.addMoneda(mon1);
                    }
                }else{
                    Moneda mon1 = mon;
                    monVu.addMoneda(mon1);
                }
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