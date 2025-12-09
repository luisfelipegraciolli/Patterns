package AbstractFactory;

import AbstractFactory.Interfaces.Email;

public class EmailPremium implements Email {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando EMAIL premium (HTML + tracking): " + mensagem);
    }
}

