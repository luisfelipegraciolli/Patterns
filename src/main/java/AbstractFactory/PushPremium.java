package AbstractFactory;

import AbstractFactory.Interfaces.CanalAdicional;

public class PushPremium implements CanalAdicional {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando PUSH premium: " + mensagem);
    }
}

