package Estruturais.Proxy;

public class GerenciadorDadosProxy implements IGerenciadorDados{
    GerenciadorDadosConfidenciais realSubject;
    String nivelUsuario;
    public GerenciadorDadosProxy(String nivelUsuario){
        this.realSubject = new GerenciadorDadosConfidenciais();
        this.nivelUsuario = nivelUsuario;
    }

    @Override
    public void exibirDados(int id) {
        realSubject.exibirDados(id);
    }

    @Override
    public void excluirDados(int id) {
        if(nivelUsuario.equals("ADMIN")){
            realSubject.excluirDados(id);
        }else{
            System.out.println("ERRO: USER IS NOT ADMIN");
        }
    }
}
