package AbstractFactory;
public class SMSSimples implements SMS {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando SMS simples: " + mensagem);
    }
}

