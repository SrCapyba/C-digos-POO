package com.br.model;

public class Administrativo extends Pessoa{

    public Administrativo(String matricula, String nome, String cpf, int idade, double remuneracao) {
        super(matricula, nome, cpf, idade, remuneracao);
    }

    public Administrativo(String matricula) {
        super(matricula);
    }

    @Override
    public void calcularRemuneracao(double valor){
        setRemuneracao(valor);
    }
}
