package FactoryMethod;

public class Navio implements ITransporte{
    @Override
    public void entregar() {
        System.out.println("Entrega feita por navio (Transporte Marítimo).");
    }
}
