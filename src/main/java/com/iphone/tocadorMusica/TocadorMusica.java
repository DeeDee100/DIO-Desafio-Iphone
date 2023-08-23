package main.java.com.iphone.tocadorMusica;

public class TocadorMusica {

    // Tocar, Pausar, Selecionar

    
    private String musica;

    public TocadorMusica(String musica) {
        this.musica = musica;
    }

    public void tocar() {
        System.out.println("Tocando Gir in Red- October Passed Me By");
    }
    
    public void pausar() {
        System.out.println("Música pausada");
    }
    
    public void selecionar() {
        System.out.println("Música selecionada: " + musica);
    }
    
}