package Comportamentais.Adapter;

public class ServicoDeMensagens {
    private ILoggerNovo logger;
    public ServicoDeMensagens(ILoggerNovo logger) {
        this.logger = logger;
    }

    public void enviarNotificacao(String conteudo) {
        // O cliente só conhece este método
        logger.gravarMensagem("NOTIFICACAO: " + conteudo);
    }
}

// Não consigo passar uma instancia do LoggerAntigo pois ele não implementa a interface ILoggerNovo