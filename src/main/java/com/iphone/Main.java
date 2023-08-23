package com.iphone;

import main.java.com.iphone.telefone.Telefone;
import main.java.com.iphone.navegador.Navegador;
import main.java.com.iphone.tocadorMusica.TocadorMusica;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iphone demo");

        Telefone telefone = new Telefone("Dee");
        Navegador navegador = new Navegador("www.google.com");
        TocadorMusica ipod = new TocadorMusica("30PRAUM - Flow Espacial");

        System.out.println("\n------- Utilizando o telefone -------");
        telefone.ligar();
        telefone.atender();
        telefone.correioDeVoz();

        System.out.println("\n------- Utilizando o navegador -------");
        navegador.exibirPagina();
        navegador.recarregar();
        navegador.novaAba();

        System.out.println("\n------- Utilizando o ipod -------");
        ipod.tocar();
        ipod.pausar();
        ipod.selecionar();
    }
}