package main.java.com.iphone.navegador;

public class Navegador {

    // exibir pagina, nova aba, F5
    private String url;


    public Navegador(String url) {
        this.url = url;
    }

    public void exibirPagina() {
        System.out.println("exibindo página: " + url);
    }

    public void novaAba() {
        System.out.println("Abrindo nova aba");
    }

    public void recarregar() {
        System.out.println("Recarregando aba");
    }

}
