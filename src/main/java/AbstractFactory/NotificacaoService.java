package AbstractFactory;

public class NotificacaoService {
    public void enviarNotificacaoSimples(String mensagem) {
        Email email = new EmailSimples();
        SMS sms = new SMSSimples();

        email.enviar(mensagem);
        sms.enviar(mensagem);
    }

    public void enviarNotificacaoPremium(String mensagem) {
        Email email = new EmailPremium();
        Push push = new PushPremium();

        email.enviar(mensagem);
        push.enviar(mensagem);
    }
}
