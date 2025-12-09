package AbstractFactory;

import AbstractFactory.Interfaces.Email;

public class EmailSimples implements Email {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando EMAIL simples: " + mensagem);
    }
}

