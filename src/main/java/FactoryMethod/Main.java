package FactoryMethod;


public class Main {
    public

    static void main() {
        LogisticaCreator logisticaTerrestre = new LogisticaTerrestre();
        logisticaTerrestre.planejarEntrega();

        LogisticaCreator logisticaMaritima = new LogisticaMaritima();
        logisticaMaritima.planejarEntrega();
    }
}
