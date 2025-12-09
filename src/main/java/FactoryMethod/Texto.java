package FactoryMethod;

public class Texto {
    String t;
    String formato;
    public Texto(String t, String formato){
        this.t = t;
        this.formato = formato;
    }

    public String getFormato(){
        return formato;
    }
}
