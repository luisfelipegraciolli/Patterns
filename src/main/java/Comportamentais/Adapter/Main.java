package Comportamentais.Adapter;

public class Main {
    static void main() {
        LoggerAntigo loggerAntigo = new LoggerAntigo();

        ILoggerNovo loggerNovo = new LoggerAdapter(loggerAntigo);

        ServicoDeMensagens s = new ServicoDeMensagens(loggerNovo);
        s.enviarNotificacao("Mensagem enviada com sucesso!!!");
    }
}
