package Criacionais.Singleton;

public class Main {

        public static void main(String[] args) {
            System.out.println("--- Início da Aplicação ---");

            // Módulo 1: Processamento
            ProcessadorPedidos p1 = new ProcessadorPedidos();
            p1.processar();

            System.out.println("---------------------------");

            // Módulo 2: Log
            GerenciadorLog log1 = new GerenciadorLog();
            log1.registrarLog("Pedido recebido.");

            System.out.println("---------------------------");

            // Módulo 3: Outro Processamento
            ProcessadorPedidos p2 = new ProcessadorPedidos();
            p2.processar();

            System.out.println("--- Fim da Aplicação ---");
        }

}
