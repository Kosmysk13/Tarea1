public interface Moneda{
    public Moneda(){

    }
    public Moneda getSerie(){
        return this.getSerie();
    }
    public abstract int getValor();
}
class Moneda1500 implements Moneda{
    private int valmon=1500;
    public Moneda1500(){
        super();
    }
    public int getValor(){
        return valmon;
    }
}
class Moneda1000 implements Moneda{
    private int valmon=1000;
    public Moneda1000(){
        super();
    }
    public int getValor(){
        return valmon;
    }
}
class Moneda500 implements Moneda{
    private int valmon=500;
    public Moneda500(){
        super();
    }
    public int getValor(){
        return valmon;
    }
}
class Moneda100 implements Moneda{
    private int valmon=100;
    public Moneda100(){
        super();
    }
    public int getValor(){
        return valmon;
    }
}