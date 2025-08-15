# 📘 Projeto: Sistema de Cadastro e Avaliação de Alunos

Este projeto implementa um sistema simples de cadastro e avaliação de alunos utilizando os princípios da **Programação Orientada a Objetos (POO)** em Java. O programa permite armazenar os dados dos alunos, calcular médias ponderadas e verificar se cada aluno está aprovado ou reprovado com base em suas notas.

## 🧠 Conceitos Aplicados

Este projeto foi desenvolvido com foco em aplicar os seguintes conceitos fundamentais da programação:

### ✅ Encapsulamento
- Os atributos da classe `Aluno` são privados (`private`) e só podem ser acessados/modificados por meio de **métodos públicos** (`getters` e `setters`).
- Isso garante proteção e controle sobre os dados internos da classe.

### ✅ Validação de Dados
- Os métodos `set` validam as regras de negócio:
  - Matrícula deve ser positiva.
  - Nome deve conter pelo menos duas palavras.
  - Notas devem estar entre 0 e 10.

### ✅ Orientação a Objetos (POO)
- O projeto utiliza os principais pilares da POO:
  - **Classe** (`Aluno`)
  - **Objetos** (instâncias criadas no `Main.java`)
  - **Métodos** (como `calcularMedia`, `setNotaTrabalho`, etc.)
  - **Construtor** com validações de entrada
  - **Encapsulamento** para garantir segurança dos dados

### ✅ Reutilização de Código
- O uso de métodos como `calcularMedia()` e `alunoEstaAprovado()` evita repetição e melhora a organização do código.

---

## 🚀 Funcionalidades

- Criar alunos com nome, matrícula e três notas (duas provas e um trabalho)
- Alterar notas com validação de entrada
- Calcular média ponderada (P1 e P2 com peso 4, trabalho com peso 2)
- Verificar automaticamente se o aluno foi aprovado (média >= 7)

---
