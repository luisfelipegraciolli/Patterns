package Comportamentais.Observer;

import java.util.ArrayList;

public class AgenciaNoticias implements ISubject{

    private ArrayList<IObserver> observadores = new ArrayList<>();
    // O estado que os observadores estão interessados
    private String ultimaNoticia;
    @Override
    public void anexar(IObserver observer) {
        observadores.add(observer);
    }

    @Override
    public void desanexar(IObserver observer) {
        observadores.remove(observer);
    }

    @Override
    public void notificar() {

    }

    public void publicarNovaNoticia(String noticia) {
        System.out.println(">>> AGÊNCIA: Nova notícia publicada: " + noticia);
        this.ultimaNoticia = noticia;
        notificar(); // Chama a notificação após a mudança de estado
    }
}
