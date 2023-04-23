package org.example;
import java.util.ArrayList;

class DepositoM{
    Moneda mon = null;
    ArrayList<Moneda> almM = new ArrayList<Moneda>();
    public DepositoM(){
    }
    public void addMoneda(Moneda mone){
        almM.add(mone);
    }
    public Moneda getMoneda(){
        if (almM.size()>0){
            Moneda m1 = almM.get(0);
            almM.remove(0);
            return m1;
        }else{
            return null;
        }
    }
}