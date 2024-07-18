package edu.daianebs.interfaces;
import java.util.List;

public interface IWebBrowser {
  void exibirPagina(String url);
  void adicionarNovaAba();
  void atualizarPagina();
  void favoritarPagina(String url);
  void removerFavorito(String url);
  List<String>listarFavoritos();
}
