package Comportamentais.State;

public class Desligada implements EstadoLamapada{
    @Override
    public void pressionarBotao(Lampada lampada) {
        System.out.println("Ação: Ligar a luz.");
        EstadoLamapada ligado = new Ligada();
        lampada.setNovoEstado(ligado);
    }
}
