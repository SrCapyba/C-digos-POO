package com.br.model;

public abstract class Pessoa {
    private String matricula;
    private String nome;
    private String cpf;
    private int idade;
    private double remuneracao;

    public Pessoa(String matricula, String nome, String cpf, int idade, double remuneracao) {
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.remuneracao = remuneracao;
    }

    public Pessoa(){

    }


    public Pessoa(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getRemuneracao() {
        return remuneracao;
    }

    public void setRemuneracao(double remuneracao) {
        this.remuneracao = remuneracao;
    }

    public abstract void calcularRemuneracao(double valor);


    @Override
    public  String toString(){
        return "Matricula: " + getMatricula() + "- Nome: " + getNome() + "- Idade: " + getIdade() +
                "- Remuneracao " + getRemuneracao();
    }
}
