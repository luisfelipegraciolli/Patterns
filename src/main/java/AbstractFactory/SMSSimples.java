package AbstractFactory;

import AbstractFactory.Interfaces.CanalAdicional;

public class SMSSimples implements CanalAdicional {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando SMS simples: " + mensagem);
    }
}

