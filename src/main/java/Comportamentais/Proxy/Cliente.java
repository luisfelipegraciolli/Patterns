package Comportamentais.Proxy;

public class Cliente {
    static void main() {
        IGerenciadorDados genDados = new GerenciadorDadosProxy("ADMIN");
        genDados.excluirDados(101);

        IGerenciadorDados genDados1 = new GerenciadorDadosProxy("USER");
        genDados1.excluirDados(201); // Não dá certo pq o Proxy checa o nivel;

        genDados.exibirDados(201);
    }
}
