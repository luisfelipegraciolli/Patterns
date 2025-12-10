package Estruturais.Proxy;

public class GerenciadorDadosConfidenciais implements IGerenciadorDados {
    @Override
    public void exibirDados(int id) {
        System.out.println("Exibindo dados do pedido: " + id);
    }

    @Override
    public void excluirDados(int id) {
        // Lógica PESADA e IRREVERSÍVEL de exclusão.
        System.out.println("DADOS DELETADOS do pedido: " + id);
    }
}