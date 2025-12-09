package Criacionais.AbstractFactory.Factories;

import Criacionais.AbstractFactory.Interfaces.CanalAdicional;
import Criacionais.AbstractFactory.Interfaces.Email;

public interface NotificationFactory {
    public Email criarEmail();
    public CanalAdicional criarCanalAdicional();
}
