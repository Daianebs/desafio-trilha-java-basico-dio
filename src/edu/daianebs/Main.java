package edu.daianebs;

import edu.daianebs.classes.Contact;
import edu.daianebs.classes.IPhone;
import edu.daianebs.classes.Music;

public class Main {
    public static void main(String[] args) {
        IPhone iphone = new IPhone();
        
        // Testando funcionalidades de música
        iphone.adicionarMusica(new Music("Song 1", "Artist 1"));
        iphone.tocarMusica("Song 1");
        iphone.pausarMusica();
        iphone.listarMusicas().forEach(System.out::println);
        //TODO: "minhas músicas: Song1 - Artist 1; Song2 - Artist 2"
        iphone.adicionarMusica(new Music("Song 2", "Artist 1"));
        iphone.removerMusica("Song 1");
        iphone.adicionarMusica(new Music("Song 3", "Artist 1"));
        iphone.adicionarMusica(new Music("Song 1", "Artist 2"));
        iphone.listarMusicas().forEach(System.out::println);

        // Testando funcionalidades de telefone
        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.adicionarContato(new Contact("mãe", "(--)123456789"));
        iphone.ligar("mãe");

        // Testando funcionalidades de navegador
        iphone.exibirPagina("http://example.com");
        iphone.atualizarPagina();
        iphone.favoritarPagina("http://example.com");
    }
}
