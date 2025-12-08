package Singleton;

public class GerenciadorLog {
    public void registrarLog(String mensagem) {

        // CADA INSTÂNCIA do gerenciador PRECISA das configurações
        ConfiguracoesSistema config = new ConfiguracoesSistema();

        System.out.println("Escrevendo no diretório: " + config.getLogDirectory());
        System.out.println("Log: " + mensagem);
    }
}
