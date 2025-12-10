package Comportamentais.State;

public class Ligada implements EstadoLamapada{
    @Override
    public void pressionarBotao(Lampada lampada) {
        System.out.println("Ação: Desligar a luz.");

        lampada.setNovoEstado(new Desligada());
    }
}
