package edu.daianebs.interfaces;
import java.util.List;

import edu.daianebs.classes.Music;

public interface IMusicPlayer {
    void tocarMusica(String musica);
    void pausarMusica();
    void selecionarMusica(String musica);
    List<String> listarMusicas(Music musica);
    void adicionarMusica(Music musica);
    void removerMusica(String nome);
}
