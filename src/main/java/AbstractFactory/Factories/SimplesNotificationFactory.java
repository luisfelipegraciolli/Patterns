package AbstractFactory.Factories;

import AbstractFactory.EmailSimples;
import AbstractFactory.Interfaces.CanalAdicional;
import AbstractFactory.Interfaces.Email;
import AbstractFactory.SMSSimples;

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
