package edu.daianebs.interfaces;

import java.util.List;
import edu.daianebs.classes.Contact;

public interface IPhoneDevice {
  void ligar(String numero);
    void atender();
    void iniciarCorreioVoz();
    void adicionarContato(Contact contato);
    void removerContato(String nome);
    List<Contact> listarContatos();
}
