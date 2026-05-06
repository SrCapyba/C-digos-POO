package com.br;

import com.br.model.Administrativo;
import com.br.model.Aluno;
import com.br.model.Pessoa;
import com.br.model.Professor;

public class AplicationTest {

    public static void main(String[] args) {
        Pessoa alunoComBolsa = new Aluno("RF3493094",50);
        Pessoa professor = new Professor("2100012",50);
        Pessoa adm = new Administrativo("2656266",null,null,0,2500.00);

        alunoComBolsa.setNome("Joao Henrique");
        alunoComBolsa.setCpf("548.365.568-95");
        alunoComBolsa.setIdade(20);
        alunoComBolsa.calcularRemuneracao(255.00);
        System.out.println("Informações: " + alunoComBolsa.toString());

        professor.setNome("");
    }
}
