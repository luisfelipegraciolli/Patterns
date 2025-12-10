package Estruturais.Facade;

public class ProcessadorPagamento {
    public boolean processarTransacao(double valor) {
        System.out.println("-> [Pagamento]: Processando transação de R$" + valor);
        return true; // Simula sucesso
    }
}
