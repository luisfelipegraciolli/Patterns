package Singleton;

public class ProcessadorPedidos {
    public void processar() {

        // CADA INSTÂNCIA do processador PRECISA das configurações
        ConfiguracoesSistema config = new ConfiguracoesSistema();

        System.out.println("Processador usando URL: " + config.getUrlServicoPagamento());
        // Lógica de processamento...
    }
}
