package Comportamentais.Facade;

public class CarrinhoComprasCliente {
    public void finalizarCompra(String produtoId, double valor, String cliente) {
        GerenciadorEstoque estoque = new GerenciadorEstoque();
        ProcessadorPagamento pagamento = new ProcessadorPagamento();
        ServicoNotificacao notificacao = new ServicoNotificacao();

        if (estoque.verificarDisponibilidade(produtoId)) {
            if (pagamento.processarTransacao(valor)) {
                estoque.reservar(produtoId);
                notificacao.enviarConfirmacao(cliente);
                System.out.println("Sucesso! Compra finalizada para o cliente: " + cliente);
            } else {
                System.out.println("Falha: Processamento de pagamento negado.");
            }
        } else {
            System.out.println("Falha: Produto indisponível em estoque.");
        }
    }
}