package com.company;

public class Main {
    public static void main(String[] args) {
        //definindo valor para as variaveis da classe aluno
        Aluno aluno1 = new Aluno(1, "Maria Silva", 8.0, 7.5, 6.0);
        Aluno aluno2 = new Aluno(2, "João Souza", 5.5, 6.0, 7.0);
        Aluno aluno3 = new Aluno(3, "Ana Lima", 9.0, 8.5, 9.0);
        Aluno aluno4 = new Aluno(4, "Carlos Mendes", 6.0, 5.0, 5.0);
        Aluno aluno5 = new Aluno(5, "Fernanda Costa", 7.0, 7.0, 8.0);

        // Alterando nota do trabalho
        aluno1.setNotaTrabalho(7.0);
        aluno2.setNotaTrabalho(6.5);
        aluno3.setNotaTrabalho(9.5);
        aluno4.setNotaTrabalho(4.5);
        aluno5.setNotaTrabalho(8.5);

        //Criando um array para guardar as informações dos alunos
        Aluno[] alunos = { aluno1, aluno2, aluno3, aluno4, aluno5 };

        //For par percorrer o array e imprimir as informações dos aluno na tela ao usuário
        for (Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getNomeCompleto());
            System.out.println("Média: " + aluno.calcularMedia());
            System.out.println("Situação: " + (aluno.alunoEstaAprovado() ? "Aprovado" : "Reprovado"));
            System.out.println("-----------------------------");
        }
    }
}
