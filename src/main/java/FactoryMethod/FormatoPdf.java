package FactoryMethod;

public class FormatoPdf extends Formato{
    private String texto;

    public FormatoPdf(String texto){
        this.texto = texto;
    }

    @Override
    public void salvar() {
        System.out.println("Texto > " + texto + "Salvando em formato PDF!");
    }

}
