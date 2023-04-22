import java.util.ArrayList;

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