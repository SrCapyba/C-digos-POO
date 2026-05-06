package com.br.interfaces;

import com.br.model.Pessoa;

import java.util.List;

public interface InterfacePessoa {
    void inserir(Pessoa pessoa);
    Pessoa procurar(String cpf);
    void  remover(String cpf);
    List<Pessoa> listarTodos();
}
