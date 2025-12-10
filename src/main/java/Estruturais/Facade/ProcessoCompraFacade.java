package Estruturais.Facade;

public class ProcessoCompraFacade {
    private GerenciadorEstoque estoque;
    private ProcessadorPagamento pagamento;
    private ServicoNotificacao notificacao;

    public ProcessoCompraFacade(){
        this.estoque = new GerenciadorEstoque();
        this.pagamento = new ProcessadorPagamento();
        this.notificacao = new ServicoNotificacao();
    }

    public boolean finalizarCompra(String produtoId, double valor, String cliente){
        if (estoque.verificarDisponibilidade(produtoId)) {
            if (pagamento.processarTransacao(valor)) {
                estoque.reservar(produtoId);
                notificacao.enviarConfirmacao(cliente);
                System.out.println("Sucesso! Compra finalizada para o cliente: " + cliente);
                return true;
            } else {
                System.out.println("Falha: Processamento de pagamento negado.");
                return false;
            }
        } else {
            System.out.println("Falha: Produto indisponível em estoque.");
            return false;
        }
    }
}
