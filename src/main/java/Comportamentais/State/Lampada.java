package Comportamentais.State;

public class Lampada {
    public EstadoLamapada estadoAtual;

    public Lampada() {
        this.estadoAtual = new Desligada();
    }

    public void setNovoEstado(EstadoLamapada novoEstado) {
        this.estadoAtual = novoEstado;
    }

    public void pressionarBotao(){
        estadoAtual.pressionarBotao(this);
    }
}