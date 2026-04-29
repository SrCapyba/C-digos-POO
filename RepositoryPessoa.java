package com.br.repository;

import com.br.interfaces.InterfacePessoa;
import com.br.model.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class RepositoryPessoa implements InterfacePessoa {
    List<Pessoa> pessoasList;

    public RepositoryPessoa(){
        pessoasList = new ArrayList<Pessoa>();
    }

    @Override
    public void inserir(Pessoa pessoa) {
        pessoasList.add(pessoa);
    }

    @Override
    public Pessoa procurar(String cpf) {

        Pessoa pessoaProcurada=null;

        for(Pessoa p: pessoasList){
            if(p.getCpf().equals(cpf)){
                pessoaProcurada = p;
                break;
            }
        }

        return pessoaProcurada;
    }

    @Override
    public void remover(String cpf) {

    }

    @Override
    public List<Pessoa> listarTodos() {
        return null;
    }
}
