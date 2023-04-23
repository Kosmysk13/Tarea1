package org.example;
import java.util.ArrayList;

class DepositoD{
    Dulce dul = null;
    ArrayList<Dulce> almD = new ArrayList<Dulce>();
    public DepositoD(){
    }
    public void addDulce(Dulce dulce){
        almD.add(dulce);
    }
    public Dulce getDulce(){
        if (almD.size()>0){
            Dulce d1 = almD.get(0);
            almD.remove(0);
            return d1;
        }else{
            return null;
        }
    }
}