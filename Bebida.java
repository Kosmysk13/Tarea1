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