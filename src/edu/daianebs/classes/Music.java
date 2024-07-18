package edu.daianebs.classes;

public class Music {
  private String nome;
  private String artista;
  
  public Music(String nome, String artista) {
    this.nome = nome;
    this.artista = artista;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getArtista() {
    return artista;
  }

  public void setArtista(String artista) {
    this.artista = artista;
  }

}
