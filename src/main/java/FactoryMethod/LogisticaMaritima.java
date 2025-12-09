package FactoryMethod;

public class LogisticaMaritima extends LogisticaCreator {
    @Override
    public ITransporte criarTransporte(){
        return new Navio();
    }
}
