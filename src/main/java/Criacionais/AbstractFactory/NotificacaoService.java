package Criacionais.AbstractFactory;

import Criacionais.AbstractFactory.Factories.NotificationFactory;
import Criacionais.AbstractFactory.Interfaces.CanalAdicional;
import Criacionais.AbstractFactory.Interfaces.Email;

public class NotificacaoService {

    private NotificationFactory factory;

    public NotificacaoService(NotificationFactory factory){
        this.factory = factory;
    }

    public void enviarNotificacao(String mensagem){
        Email email = factory.criarEmail();
        CanalAdicional canalAdicional = factory.criarCanalAdicional();

        email.enviar(mensagem);
        canalAdicional.enviar(mensagem);
    }
}
