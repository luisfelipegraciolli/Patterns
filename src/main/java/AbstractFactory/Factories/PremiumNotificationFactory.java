package AbstractFactory.Factories;

import AbstractFactory.EmailPremium;
import AbstractFactory.Interfaces.CanalAdicional;
import AbstractFactory.Interfaces.Email;
import AbstractFactory.PushPremium;
import AbstractFactory.SMSSimples;

public class PremiumNotificationFactory implements NotificationFactory{

    @Override
    public Email criarEmail() {
        return new EmailPremium();
    }

    @Override
    public CanalAdicional criarCanalAdicional() {
        return new PushPremium();
    }

}
