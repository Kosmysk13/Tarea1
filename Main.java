package org.example;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Moneda mon3 = new Moneda1000();
        Moneda mon4 = new Moneda1500();
        System.out.println(mon3.getValor());
        System.out.println(mon4.getValor());
        Expendedor ex = new Expendedor(10,500);
        Bebida b1 = ex.comprarBebida(mon3,1);
        System.out.println(b1.getSerie(b1) + " " + b1.beber());
    }
}
class Expendedor{
    private int precios;
    private Deposito depcoca;
    private Deposito depsprite;
    public static final int  COCA=1;
    public static final int  SPRITE=2;
    DepositoM monVu = new DepositoM();

    public Expendedor(int numBebidas, int precioBebidas){
        precios = precioBebidas;
        depcoca = new Deposito();
        depsprite = new Deposito();
        for (int i=0;i<numBebidas;i++){
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
abstract class Moneda{
    public Moneda(){

    }
    public Moneda getSerie(){
        return this.getSerie();
    }
    public abstract int getValor();
}
abstract class Bebida{
    private int seriebebida;
    public Bebida(int numSerie){
        seriebebida = numSerie;
    }
    public abstract String beber();
    public int getSerie(Bebida b){
        return seriebebida;
    }
}
abstract class Dulce{
    private int seriedulce;
    public Dulce(int numSerie){
        seriedulce = numSerie;
    }
    public abstract String comer();
    public int getSerie(Dulce d){
        return seriedulce;
    }
}
class DepositoB{
    Bebida b = null;
    ArrayList<Bebida> al = new ArrayList<Bebida>();
    public DepositoB(){
    }
    public void addBebida(Bebida beb){
        al.add(beb);
    }
    public Bebida getBebida(){
        if (al.size()>0){
            Bebida b1 = al.get(0);
            al.remove(0);
            return b1;
        }else{
            return null;
        }
    }
}
class DepositoM{
    Moneda mon = null;
    ArrayList<Moneda> alm = new ArrayList<Moneda>();
    public DepositoM(){
    }
    public void addMoneda(Moneda mone){
        alm.add(mone);
    }
    public Moneda getMoneda(){
        if (alm.size()>0){
            Moneda m1 = alm.get(0);
            alm.remove(0);
            return m1;
        }else{
            return null;
        }
    }
}
class CocaCola extends Bebida{
    public CocaCola(int serie){
        super(serie);
    }
    public String beber(){
        return "cocacola";
    }
}
class Sprite extends Bebida{
    public Sprite(int serie){
        super(serie);
    }
    public String beber(){
        return "sprite";
    }
}
class Snickers extends Dulce{
    public Snickers(int serie){
        super(serie);
    }
    public String comer(){
        return "snickers";
    }
}
class Super8 extends Dulce{
    public Super8(int serie){
        super(serie);
    }
    public String comer(){
        return "super8";
    }
}
class Moneda1500 extends Moneda{
    private int valmon=1500;
    public Moneda1500(){
        super();
    }
    public int getValor(){
        return valmon;
    }
}
class Moneda1000 extends Moneda{
    private int valmon=1000;
    public Moneda1000(){
        super();
    }
    public int getValor(){
        return valmon;
    }
}
class Moneda500 extends Moneda{
    private int valmon=500;
    public Moneda500(){
        super();
    }
    public int getValor(){
        return valmon;
    }
}
class Moneda100 extends Moneda{
    private int valmon=100;
    public Moneda100(){
        super();
    }
    public int getValor(){
        return valmon;
    }
}