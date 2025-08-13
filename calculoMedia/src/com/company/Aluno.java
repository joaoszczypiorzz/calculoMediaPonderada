package com.company;

public class Aluno {
    private int matricula;
    private String nome;
    private double notaPrimeiraProva;
    private double notaSegundaProva;
    private double notaTrabalho;

    public Aluno(int matricula , String nome , double notaPrimeiraProva , double notaSegundaProva , double notaTrabalho ){
        if (matricula < 0 ){
            throw new IllegalArgumentException("Numero de matricula deve ser positivo.");
        }
        if (nome == null || nome.trim().indexOf(" ") == -1){
            throw new IllegalArgumentException("Deve conter nome e sobrenome");
        }
        if(notaPrimeiraProva > 10 || notaPrimeiraProva < 0){
            throw new IllegalArgumentException("Nota deve estar entre 0 e 10");
        }
        if(notaSegundaProva > 10 || notaSegundaProva < 0){
            throw new IllegalArgumentException("Nota deve estar entre 0 e 10");
        }
        if(notaTrabalho > 10 || notaTrabalho < 0){
            throw new IllegalArgumentException("Nota deve estar entre 0 e 10");
        }

        this.matricula = matricula;
        this.nome = nome;
        this.notaPrimeiraProva = notaPrimeiraProva;
        this.notaSegundaProva = notaSegundaProva;
        this.notaTrabalho = notaTrabalho;
    }

    public double calcularMedia() {
        return (notaTrabalho * 2 + notaPrimeiraProva * 4 + notaSegundaProva * 4) / 10;
    }

    public boolean alunoEstaAprovado() {
        return calcularMedia() >= 7.0;
    }

    public String getNome() {
        return nome;
    }
}