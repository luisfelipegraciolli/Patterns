package Criacionais.Singleton;

public class GerenciadorLog {
    public void registrarLog(String mensagem) {

        // CADA INSTÂNCIA do gerenciador PRECISA das configurações


        System.out.println("Escrevendo no diretório: " + ConfiguracoesSistema.getInstance().getLogDirectory());
        System.out.println("Log: " + mensagem);
    }
}
