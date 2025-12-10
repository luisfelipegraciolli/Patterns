package Estruturais.Adapter;

public class LoggerAdapter implements ILoggerNovo{

    private LoggerAntigo loggerAntigo;

    public LoggerAdapter(LoggerAntigo loggerAntigo){
        this.loggerAntigo = loggerAntigo;
    }

    @Override
    public void gravarMensagem(String mensagem) {
        loggerAntigo.escreverLog(mensagem);
    }
}
