package com.company;

public class Main {
    public static void main(String[] args) {
        // Criando um aluno com dados válidos
        Aluno aluno1 = new Aluno(12345, "João Silva", 8.0, 7.0, 9.0);

        // Imprimindo as informações do aluno
        System.out.println("Nome do aluno: " + aluno1.getNome());

        // Calculando e mostrando a média
        double media = aluno1.calcularMedia();
        System.out.println("Média do aluno: " + media);

        // Verificando se está aprovado
        if (aluno1.alunoEstaAprovado()) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado.");
        }
    }
}