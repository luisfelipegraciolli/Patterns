package Comportamentais.State;

public class Lampada {
    private String estadoAtual = "DESLIGADA"; // Rígido e baseado em string

    public void pressionarBotao() {
        if (estadoAtual.equals("DESLIGADA")) {
            estadoAtual = "LIGADA";
            System.out.println("Luz Ligada.");
        } else if (estadoAtual.equals("LIGADA")) {
            estadoAtual = "DESLIGADA";
            System.out.println("Luz Desligada.");
        } else if (estadoAtual.equals("COM_DEFEITO")) {
            System.out.println("Luz quebrada. Nada acontece.");
        }
    }
    // ... Problemas se adicionar mais estados (e.g., Modo Piscante, Modo Noturno)
}