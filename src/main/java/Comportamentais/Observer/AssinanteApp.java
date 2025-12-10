package Comportamentais.Observer;

public class AssinanteApp implements IObserver{

    private String nome;

    public AssinanteApp(String nome) {
        this.nome = nome;
    }


    @Override
    public void atualizar(String novaNoticia) {
        System.out.println("[App " + nome + "]: Alerta! Recebeu a notícia: " + novaNoticia);
    }
}
