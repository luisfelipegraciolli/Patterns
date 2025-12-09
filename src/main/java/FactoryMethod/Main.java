package FactoryMethod;

public class Main {
    static void main() {
        Formato f;
        Texto texto = new Texto("O rato roeu a roupa do rei de roma", "TXT");

        if( texto.getFormato().equals("PDF")){
            f = new FormatoPdf(texto.t);
            f.salvar();
        }
        else if ( texto.getFormato().equals("TXT")) {
            f = new FormatoTxt(texto.t);
            f.salvar();
        }
    }
}
