package FactoryMethod;


public class Logistica {

    // Este método é quem decide qual produto concreto instanciar.
    public void planejarEntrega(String tipo) {
        ITransporte transporte;

        if (tipo.equals("TERRESTRE")) {
            // Criação RÍGIDA e explícita
            transporte = new Caminhao();
        } else if (tipo.equals("MARITIMO")) {
            // Criação RÍGIDA e explícita
            transporte = new Navio();
        } else {
            throw new IllegalArgumentException("Tipo de transporte desconhecido.");
        }

        // Utiliza o transporte (funcionalidade principal)
        transporte.entregar();
    }
}
