package Estruturais.Facade;

public class GerenciadorEstoque {
    public boolean verificarDisponibilidade(String produtoId) {
        System.out.println("-> [Estoque]: Verificando disponibilidade do produto " + produtoId);
        return true; // Simula que está disponível
    }
    public void reservar(String produtoId) {
        System.out.println("-> [Estoque]: Produto " + produtoId + " reservado.");
    }
}
