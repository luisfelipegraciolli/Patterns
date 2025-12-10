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
