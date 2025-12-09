package Criacionais.FactoryMethod;

public class Main {
    static void main() {
        Texto texto = new Texto("O rato roeu a roupa do rei de roma", "TXT");
        Formato f = Formato.FormatoFactory(texto);
        f.salvar();

    }
}
