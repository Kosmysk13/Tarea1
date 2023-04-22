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