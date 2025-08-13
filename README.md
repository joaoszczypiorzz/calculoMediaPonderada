# calculoMediaPonderada
Aqui estão os códigos da atividade 03 de POO ( Programação orientada a Objetos ) 
O que esse código faz:
Este repositório contém a implementação de uma classe Aluno, que representa um estudante matriculado em uma disciplina. A classe permite calcular a média ponderada do aluno com base nas notas de provas e trabalho, e verificar sua aprovação.

Funcionalidades
Criação de objetos Aluno com os seguintes atributos:

Matrícula (inteiro): Deve ser um número positivo.

Nome completo (string): Deve conter pelo menos 2 palavras (nome e sobrenome).

Notas:

Primeira prova (decimal entre 0 e 10).

Segunda prova (decimal entre 0 e 10).

Trabalho (decimal entre 0 e 10).

Métodos:

calcularMedia(): Calcula a média ponderada com os pesos:

Trabalho: peso 2

Prova 1: peso 4

Prova 2: peso 4

alunoEstaAprovado(): Retorna true se a média for maior ou igual a 7.0, false caso contrário.

Validações
Matrícula: Número deve ser positivo.

Nome: Deve ter pelo menos dois nomes (nome e sobrenome).

Notas: Devem estar entre 0 e 10. Caso contrário, o programa lança uma exceção IllegalArgumentException.
