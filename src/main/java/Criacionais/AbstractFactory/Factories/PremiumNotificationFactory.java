package Criacionais.AbstractFactory.Factories;

import Criacionais.AbstractFactory.EmailPremium;
import Criacionais.AbstractFactory.Interfaces.CanalAdicional;
import Criacionais.AbstractFactory.Interfaces.Email;
import Criacionais.AbstractFactory.PushPremium;

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
