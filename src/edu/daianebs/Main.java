package edu.daianebs;

import edu.daianebs.classes.Contact;
import edu.daianebs.classes.IPhone;
import edu.daianebs.classes.Music;
import edu.daianebs.classes.URLFavorite;

public class Main {
    public static void main(String[] args) {
        IPhone iphone = new IPhone();
        
        System.out.println("Testando funcionalidades de reprodutor musical");
        iphone.adicionarMusica(new Music("Song 1", "Artist 1"));
        iphone.tocarMusica("Song 1");
        iphone.pausarMusica();
        iphone.listarMusicas().forEach(System.out::println);
        iphone.adicionarMusica(new Music("Song 2", "Artist 1"));
        iphone.removerMusica("Song 1");
        iphone.adicionarMusica(new Music("Song 3", "Artist 1"));
        iphone.adicionarMusica(new Music("Song 1", "Artist 2"));
        iphone.listarMusicas().forEach(System.out::println);

        System.out.println("Testando funcionalidades de Navegador na Internet.");
        iphone.iniciarCorreioVoz();
        iphone.ligar("123456789");
        iphone.atender();
        iphone.adicionarContato(new Contact("mãe", "(--)123456789"));
        iphone.ligar("mãe");

        System.out.println("Testando funcionalidades de Aparelho Telefônico");
        iphone.exibirPagina("https://www.dio.me");
        iphone.atualizarPagina();
        iphone.favoritarPagina(new URLFavorite("dio.me","https://www.dio.me"));
        iphone.adicionarNovaAba();
        iphone.exibirPagina("https://github.com/Daianebs");
        iphone.favoritarPagina(new URLFavorite("meuGithub","https://github.com/Daianebs"));
        iphone.listarFavoritos().forEach(System.out::println);
    }
}
