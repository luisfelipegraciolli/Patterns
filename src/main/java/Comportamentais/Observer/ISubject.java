package Comportamentais.Observer;

// ISubject.java (Sujeito)
public interface ISubject {
    void anexar(IObserver observer);   // Adicionar um observador
    void desanexar(IObserver observer); // Remover um observador
    void notificar();                 // Notificar todos os observadores
}
