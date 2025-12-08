package Singleton;

public class ConfiguracoesSistema {
    private String urlServicoPagamento;
    private int maxThreads;
    private String logDirectory;

    public ConfiguracoesSistema() {
        // Simulação de carregamento de um arquivo de configuração pesado
        System.out.println("Carregando configurações do sistema do disco...");
        this.urlServicoPagamento = "https://api.pagamento.com/v1";
        this.maxThreads = 50;
        this.logDirectory = "/var/log/pedidos";
    }

    public String getUrlServicoPagamento() {
        return urlServicoPagamento;
    }

    public void setUrlServicoPagamento(String urlServicoPagamento) {
        this.urlServicoPagamento = urlServicoPagamento;
    }

    public int getMaxThreads() {
        return maxThreads;
    }

    public void setMaxThreads(int maxThreads) {
        this.maxThreads = maxThreads;
    }

    public String getLogDirectory() {
        return logDirectory;
    }

    public void setLogDirectory(String logDirectory) {
        this.logDirectory = logDirectory;
    }
}
