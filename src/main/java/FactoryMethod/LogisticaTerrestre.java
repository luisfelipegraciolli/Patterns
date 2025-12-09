package FactoryMethod;

public class LogisticaTerrestre extends LogisticaCreator{


    @Override
    protected ITransporte criarTransporte() {
        return new Caminhao();
    }



}
