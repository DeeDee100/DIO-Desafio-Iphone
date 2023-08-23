package main.java.com.iphone.telefone;

public class Telefone {
    
    // Ligar, atender, correio de voz

    private String contato;

    public Telefone(String contato) {
        this.contato = contato;
    }

    public void ligar() {
        System.out.println("Ligando para: " + contato);
    }
    
    public void atender() {
        System.out.println("Ligação aceita");
    }

    public void correioDeVoz() {
        System.out.println("Encaminhando chamada apra correio de voz");
    }
}
