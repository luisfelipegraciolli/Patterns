package FactoryMethod;

public abstract class LogisticaCreator {
    protected abstract ITransporte criarTransporte();

    public void planejarEntrega(){
        ITransporte transporte = criarTransporte();


        System.out.println("\n--- Planejamento de Entrega ---");
        transporte.entregar();
        System.out.println("-----------------------------");
    }
}
