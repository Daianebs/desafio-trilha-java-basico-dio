package edu.daianebs.interfaces;
import java.util.List;

import edu.daianebs.classes.URLFavorite;
public interface IWebBrowser {
  void exibirPagina(String url);
  void adicionarNovaAba();
  void atualizarPagina();
  void favoritarPagina(URLFavorite urlFavorite);
  void removerFavorito(String url);
  List<String>listarFavoritos();
}
