package Singleton;

public class ProcessadorPedidos {
    public void processar() {

        // CADA INSTÂNCIA do processador PRECISA das configurações

        System.out.println("Processador usando URL: " + ConfiguracoesSistema.getInstance().getUrlServicoPagamento());
        // Lógica de processamento...
    }
}
