import java.util.ArrayList;

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