package Criacionais.FactoryMethod;

public class FormatoTxt extends Formato{
    private String texto;

    public FormatoTxt(String texto){
        this.texto = texto;
    }

    @Override
    public void salvar() {
        System.out.println("Texto > " + texto + "\nSalvando em formato TXT!");
    }
}
