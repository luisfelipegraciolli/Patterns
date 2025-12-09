package AbstractFactory.Factories;

import AbstractFactory.Interfaces.CanalAdicional;
import AbstractFactory.Interfaces.Email;

public interface NotificationFactory {
    public Email criarEmail();
    public CanalAdicional criarCanalAdicional();
}
