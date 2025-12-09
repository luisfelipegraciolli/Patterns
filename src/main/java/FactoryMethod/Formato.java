package FactoryMethod;

public abstract class Formato {
    private Texto texto;
    public abstract void salvar();

    public static Formato FormatoFactory(Texto texto){
        if( texto.getFormato().equals("PDF")){
            return new FormatoPdf(texto.t);

        }
        else if ( texto.getFormato().equals("TXT")) {
            return new FormatoTxt(texto.t);
        }
        else{
            throw  new RuntimeException("Formato não suportado!");
        }

    }
}