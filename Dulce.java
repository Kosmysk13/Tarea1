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