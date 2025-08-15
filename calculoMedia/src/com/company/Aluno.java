package com.company;

public class Aluno {
    private int matricula;
    private String nomeCompleto;
    private double notaPrimeiraProva;
    private double notaSegundaProva;
    private double notaTrabalho;

    public Aluno(int matricula, String nome, double notaPrimeiraProva, double notaSegundaProva, double notaTrabalho) {
        setMatricula(matricula);
        setNomeCompleto(nome);
        setNotaProva1(notaPrimeiraProva);
        setNotaProva2(notaSegundaProva);
        setNotaTrabalho(notaTrabalho);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int numeroDaMatricula) {
        if (numeroDaMatricula < 0) {
            throw new IllegalArgumentException("Número de matrícula deve ser positivo.");
        }
        this.matricula = numeroDaMatricula;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public Aluno setNomeCompleto(String nomeCompleto) {
        if (nomeCompleto == null || nomeCompleto.trim().split(" ").length < 2) {
            throw new IllegalArgumentException("Nome deve conter pelo menos duas palavras.");
        }
        this.nomeCompleto = nomeCompleto;
        return this;
    }

    public double getNotaProva1() {
        return notaPrimeiraProva;
    }

    public Aluno setNotaProva1(double notaProva1) {
        if (notaProva1 < 0 || notaProva1 > 10) {
            throw new IllegalArgumentException("Nota da prova 1 deve estar entre 0 e 10.");
        }
        this.notaPrimeiraProva = notaProva1;
        return this;
    }

    public double getNotaProva2() {
        return notaSegundaProva;
    }

    public Aluno setNotaProva2(double notaProva2) {
        if (notaProva2 < 0 || notaProva2 > 10) {
            throw new IllegalArgumentException("Nota da prova 2 deve estar entre 0 e 10.");
        }
        this.notaSegundaProva = notaProva2;
        return this;
    }

    public double getNotaTrabalho() {
        return notaTrabalho;
    }

    public Aluno setNotaTrabalho(double notaTrabalho) {
        if (notaTrabalho < 0 || notaTrabalho > 10) {
            throw new IllegalArgumentException("Nota do trabalho deve estar entre 0 e 10.");
        }
        this.notaTrabalho = notaTrabalho;
        return this;
    }

    public double calcularMedia() {
        return (notaTrabalho * 2 + notaPrimeiraProva * 4 + notaSegundaProva * 4) / 10;
    }

    public boolean alunoEstaAprovado() {
        return calcularMedia() >= 7.0;
    }
}
