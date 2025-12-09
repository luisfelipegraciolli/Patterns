package Singleton;

public class ConfiguracoesSistema {
    private static ConfiguracoesSistema instance;

    private String urlServicoPagamento;
    private int maxThreads;
    private String logDirectory;

    private ConfiguracoesSistema() {
        if(instance != null){
            throw new RuntimeException("Use getInstancia() para obter a instância.");
        }
        // Simulação de carregamento de um arquivo de configuração pesado
        System.out.println("Carregando configurações do sistema do disco...");
        this.urlServicoPagamento = "https://api.pagamento.com/v1";
        this.maxThreads = 50;
        this.logDirectory = "/var/log/pedidos";
    }

    public static ConfiguracoesSistema getInstance() {
        if(instance == null){
            instance = new ConfiguracoesSistema();
        }

        return instance;
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
