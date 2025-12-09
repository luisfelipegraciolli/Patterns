package AbstractFactory;

public class PushPremium implements Push {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando PUSH premium: " + mensagem);
    }
}

