package com.company;
import java.util.Scanner;

public class Aluno {
    //variáveis
    private int matricula;
    private String nomeCompleto;
    private double notaPrimeiraProva;
    private double notaSegundaProva;
    private double notaTrabalho;
    //iniciando Scanner
    Scanner read = new Scanner(System.in);

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
        this.nomeCompleto = nomeCompleto;
        this.notaPrimeiraProva = notaPrimeiraProva;
        this.notaSegundaProva = notaSegundaProva;
        this.notaTrabalho = notaTrabalho;
    }

    public int getMatricula(){
        return matricula;
    }

    public int setMatricula(int numeroDaMatricula){
        return matricula;
    }

    public String getNomeCompleto() {
        return nomeCompleto ;
    }

    public double setNotaProva1(double notaProva1){
        return notaPrimeiraProva;
    }

    public double getNotaProva1(){
        return notaPrimeiraProva;
    }
    public double setnotaProva2(){
        return notaSegundaProva;
    }
    public double getProva2(){
        return notaSegundaProva;
    }
    public double setNotaTrabalho(double notaTrabalho){
        return notaTrabalho;
    }
    public double getNotaTrabalho(){
        return notaTrabalho;
    }


//Função para calcular a média do aluno 
    public double calcularMedia() {
        return (notaTrabalho * 2 + notaPrimeiraProva * 4 + notaSegundaProva * 4) / 10;
    }
}
