package com.br.model;

public class Professor extends Pessoa{
    private double horasTrabalhadas;

    public Professor(String matricula, String nome, String cpf, int idade, double remuneracao, double horasTrabalhadas) {
        super(matricula, nome, cpf, idade, remuneracao);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Professor(String matricula, double horasTrabalhadas) {
        super(matricula);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Professor(){
        super();
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public void calcularRemuneracao(double valor){
        setRemuneracao(getHorasTrabalhadas() * valor);
    }
}
