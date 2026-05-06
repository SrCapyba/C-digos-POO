package com.br.model;

public class Aluno extends Pessoa{
    private Curso curso;
    private int percentagemBolsa;
    private double[] notas = new double[3];

    public Aluno(String matricula, String nome, String cpf, int idade, double remuneracao, Curso curso, double[] notas) {
        super(matricula, nome, cpf, idade, remuneracao);
        this.curso = curso;
        this.notas = notas;
    }

    public Aluno(String matricula, Curso curso, int percentagemBolsa, double[] notas) {
        super(matricula);
        this.curso = curso;
        this.percentagemBolsa = percentagemBolsa;
        this.notas = notas;
    }

    public Aluno(String matricula, int percentagemBolsa) {
        super(matricula);
        this.percentagemBolsa = percentagemBolsa;
    }

    public Aluno(String matricula) {
        super(matricula);
    }

    @Override
    public void calcularRemuneracao(double valor){
        if(percentagemBolsa == 50){
            setRemuneracao(valor/2);
        }
        else if (percentagemBolsa == 100){
            setRemuneracao(valor);
        }
        else {
            setRemuneracao(0);
        }
    }

    @Override
    public  String toString(){
        return super.toString();
    }

}
