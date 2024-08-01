package edu.daianebs.classes;

import java.util.ArrayList;
import java.util.List;

import edu.daianebs.interfaces.IMusicPlayer;
import edu.daianebs.interfaces.IPhoneDevice;
import edu.daianebs.interfaces.IWebBrowser;

public class IPhone implements IPhoneDevice, IMusicPlayer, IWebBrowser {
  private List<Contact> contacts = new ArrayList<>();
  private List<Music> musics = new ArrayList<>();
  private List<URLFavorite> favorites = new ArrayList<>();

  // Funções de telefone
  @Override
  public void ligar(String numero) {
    Contact contact = contacts.stream().filter(contacts -> contacts.getNome().equals(numero)).findFirst().orElse(null);
    // Atualizado o método ligar para verificar se o número fornecido corresponde a
    // um contato existente e exibir o nome do contato, se encontrado.
    if (contact != null) {
      System.out.println("Ligando para " + contact.getNome() + " (" + contact.getNumero() + ")");
    } else {
      System.out.println("Ligando para " + numero);
    }
  }

  @Override
  public void atender() {
    System.out.println("Atendendo ligação...");
  }

  @Override
  public void iniciarCorreioVoz() {
    System.out.println("Acessando correio de voz");
  }

  @Override
  public void adicionarContato(Contact contato) {
    contacts.add(contato);
    System.out.println("Contato adicionado: " + contato.getNome());
  }

  @Override
  public void removerContato(String nome) {
    contacts.removeIf(contact -> contact.getNome().equals(nome));
    System.out.println("Contato removido: " + nome);
  }

  @Override
  public List<Contact> listarContatos() {
    return new ArrayList<>(contacts);
  }

  // Funções de música
  @Override
  public void tocarMusica(String musica) {
    System.out.println("Tocando música: " + musica);
  }

  @Override
  public void pausarMusica() {
    System.out.println("Música pausada");
  }

  @Override
  public void selecionarMusica(String musica) {
    System.out.println("Selecionando música: " + musica);
  }

  @Override
  public List<String> listarMusicas() {
    List<String> musicList = new ArrayList<>();
    for (Music music : musics) {
      musicList.add(music.getNome() + " - " + music.getArtista());
    }
    System.out.println("Minhas músicas: " + String.join("; "));
    return musicList;
  }

  @Override
  public void adicionarMusica(Music musica) {
    musics.add(musica);
    System.out.println("Música adicionada: " + musica.getNome());
  }

  @Override
  public void removerMusica(String nome) {
    musics.removeIf(music -> music.getNome().equals(nome));
    System.out.println("Música removida: " + nome);
  }

  // Funções de navegador
  @Override
  public void exibirPagina(String url) {
    System.out.println("Exibindo página: " + url);
  }

  @Override
  public void adicionarNovaAba() {
    System.out.println("Nova aba adicionada");
  }

  @Override
  public void atualizarPagina() {
    System.out.println("Página atualizada");
  }

  @Override
  public void favoritarPagina(URLFavorite urlFavorite){
  favorites.add(urlFavorite);
  System.out.println("Página favoritada: " + urlFavorite.getNome() + " (" + urlFavorite.getUrl() + ")");
}

  @Override
  public void removerFavorito(String url) {
    favorites.removeIf(favorite -> favorite.getUrl().equals(url));
    System.out.println("Favorito removido: " + url);
  }

  @Override
  public List<String> listarFavoritos() {
    List<String> favoriteUrls = new ArrayList<>();
    for (URLFavorite favorite : favorites) {
      favoriteUrls.add(favorite.getNome() + " (" + favorite.getUrl() + ")");
  }
  System.out.println("Minhas páginas favoritas: " + String.join(", "));
  return favoriteUrls;
  }
}
    