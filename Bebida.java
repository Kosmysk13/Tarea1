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