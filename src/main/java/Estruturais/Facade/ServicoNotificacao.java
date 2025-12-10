package Estruturais.Facade;

public class ServicoNotificacao {
    public void enviarConfirmacao(String cliente) {
        System.out.println("-> [Notificação]: Enviando email de confirmação para " + cliente);
    }
}
