package Criacionais.AbstractFactory.Factories;

import Criacionais.AbstractFactory.EmailSimples;
import Criacionais.AbstractFactory.Interfaces.CanalAdicional;
import Criacionais.AbstractFactory.Interfaces.Email;
import Criacionais.AbstractFactory.SMSSimples;

public class SimplesNotificationFactory implements NotificationFactory{

    @Override
    public Email criarEmail() {
        return new EmailSimples();
    }

    @Override
    public CanalAdicional criarCanalAdicional() {
        return new SMSSimples();
    }
}
