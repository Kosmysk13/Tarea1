package org.example;
import java.util.ArrayList;

public class DepositoB{
    Bebida b = null;
    ArrayList<Bebida> almB = new ArrayList<Bebida>();
    public DepositoB(){
    }
    public void addBebida(Bebida beb){
        almB.add(beb);
    }
    public Bebida getBebida(){
        if (almB.size()>0){
            Bebida b1 = almB.get(0);
            almB.remove(0);
            return b1;
        }else{
            return null;
        }
    }
}