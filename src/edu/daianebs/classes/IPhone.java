package edu.daianebs.classes;

import java.util.ArrayList;
import java.util.List;

import edu.daianebs.interfaces.IMusicPlayer;
import edu.daianebs.interfaces.IPhoneDevice;
import edu.daianebs.interfaces.IWebBrowser;

public class IPhone implements IPhoneDevice , IMusicPlayer, IWebBrowser {
  private List<Contact> contacts = new ArrayList<>();
  private List<Music> musics = new ArrayList<>();
  private List<URLFavorite> favorites = new ArrayList<>();
  
  @Override
  public void exibirPagina(String url) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'exibirPagina'");
  }
  @Override
  public void adicionarNovaAba() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'adicionarNovaAba'");
  }
  @Override
  public void atualizarPagina() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'atualizarPagina'");
  }
  @Override
  public void favoritarPagina(String url) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'favoritarPagina'");
  }
  @Override
  public void removerFavorito(String url) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'removerFavorito'");
  }
  @Override
  public List<String> listarFavoritos() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'listarFavoritos'");
  }
  @Override
  public void tocarMusica(String musica) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'tocarMusica'");
  }
  @Override
  public void pausarMusica() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'pausarMusica'");
  }
  @Override
  public void selecionarMusica(String musica) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'selecionarMusica'");
  }
  @Override
  public List<String> listarMusicas() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'listarMusicas'");
  }
  @Override
  public void adicionarMusica(Music musica) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'adicionarMusica'");
  }
  @Override
  public void removerMusica(String nome) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'removerMusica'");
  }
  @Override
  public void ligar(String numero) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'ligar'");
  }
  @Override
  public void atender() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'atender'");
  }
  @Override
  public void iniciarCorreioVoz() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'iniciarCorreioVoz'");
  }
  @Override
  public void adicionarContato(Contact contato) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'adicionarContato'");
  }
  @Override
  public void removerContato(String nome) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'removerContato'");
  }
  @Override
  public List<Contact> listarContatos() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'listarContatos'");
  }

  
  
}
