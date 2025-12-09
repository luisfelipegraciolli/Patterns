package FactoryMethod;

public class Caminhao implements ITransporte {
    @Override
    public void entregar() {
        System.out.println("Entrega feita por caminhão (Transporte Terrestre).");
    }
}
