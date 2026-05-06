package com.br.controller;

import com.br.interfaces.InterfacePessoa;
import com.br.model.Pessoa;
import com.br.model.Professor;
import com.br.repository.RepositoryPessoa;

import java.util.Scanner;

public class PessoaController {
    Scanner input = new Scanner(System.in);
    String matricula, nome, cpf;
    int idade,horas;
    Pessoa professor;

    public void inserirRegistro(RepositoryPessoa repoPessoa){
        professor = new Professor();
        input.nextLine();
        System.out.println("Insira o nome: ");
        nome = input.nextLine();
        professor.setNome(nome);
        System.out.println("Insira o CPF: ");
        cpf = input.next();
        professor.setCpf(cpf);
        System.out.println("Insira a idade");
        idade = input.nextInt();
        System.out.println("Insira as horas trabalhadas: ");
        horas = input.nextInt();
        ((Professor)professor).setHorasTrabalhadas(30);
        repoPessoa.inserir(professor);
    }

}
