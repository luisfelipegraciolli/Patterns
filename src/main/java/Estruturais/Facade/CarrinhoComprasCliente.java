package Estruturais.Facade;

public class CarrinhoComprasCliente {
    public void executarCompra(String produtoId, double valor, String cliente) {
        ProcessoCompraFacade facade = new ProcessoCompraFacade();

        boolean sucesso = facade.finalizarCompra("101", 12.99, "Julia Temoteo"); // :p

        if(sucesso){
            System.out.println("Status final: Pedido Concluído.");
        } else {
            System.out.println("Status final: Pedido Cancelado.");
        }
    }
}