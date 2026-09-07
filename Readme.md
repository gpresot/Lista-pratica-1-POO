# Sistema de Cadastro de Bruxos de Hogwarts

Prática desenvolvida para a disciplina de **Laboratório de Programação Modular** (PUC Minas), referente à **Prática 1 (parte 2) — Tratamento de Strings e Datas**, sob orientação do professor Glender Brás.

## 📖 Contexto

Antes de serem selecionados pelo Chapéu Seletor, todos os alunos de Hogwarts precisam ser cadastrados no sistema da escola. O Ministério da Magia identificou diversos erros nos cadastros existentes, como:

- Nomes escritos de formas diferentes (`harry`, `HARRY`, `Harry`);
- Casas informadas incorretamente (`grifinoria`, `GRIFINORIA`, `Grifinória`);
- Datas de nascimento inválidas;
- Códigos de matrícula preenchidos incorretamente.

Este projeto implementa um sistema que valida e organiza essas informações, aplicando conceitos de **Orientação a Objetos (OO)** em Java.

## 🎯 Objetivos

- Praticar tratamento de **Strings** (normalização de texto, busca de substrings);
- Praticar manipulação de **datas** com `LocalDate`;
- Reforçar conceitos de **Orientação a Objetos**;
- Trabalhar com **vetores de objetos** e controle de fluxo (`break`, laços, menus).

## 🧩 Funcionalidades da classe `Aluno`

Novos atributos:

- `dataNascimento` — do tipo `LocalDate`;
- `codigoMatricula` — do tipo `String`.

Novos métodos:

| Método | Descrição |
|---|---|
| `calcularIdade()` | Calcula a idade do aluno a partir da data de nascimento. |
| `verificarMaioridadeMagica()` | Verifica se o aluno tem 17 anos ou mais (maioridade mágica). |
| `formatarCasa()` | Retorna o nome da casa em letras maiúsculas. |
| `gerarNomeUsuario()` | Gera um login automático: primeira letra do nome + sobrenome completo, em minúsculo. |
| `gerarCodigoMatricula()` | Gera o código de matrícula no formato `INICIAIS-ANO-POSIÇÃO` (ex: `HP-2026-01` para Harry Potter, primeiro cadastrado). |
| `verificarCasa(String casa)` | Verifica se o aluno pertence à casa informada. Retorna `true` ou `false`. |
| `verificarPresencaPalavra(String palavra)` | Verifica se o sobrenome do aluno contém a string informada (ex: `"black"`, `"malfoy"`). |

## 🖥️ Menu do sistema

O programa principal (`Pratica12`) permite o cadastro de **até 10 alunos**, podendo o usuário encerrar o cadastro antes disso. Ao final, todos os alunos cadastrados são exibidos na tela.

```
1. Cadastrar aluno
2. Listar todos os alunos
3. Exibir alunos de uma determinada casa (com total de alunos da casa)
4. Exibir alunos por casa
5. Exibir alunos maiores de idade
6. Exibir alunos menores de idade
7. Buscar alunos por sobrenome (mesmo que composto, buscando por parte do nome)
8. Encerrar
```

Durante o cadastro, o sistema recebe a data de nascimento do aluno e calcula automaticamente sua idade.

## 🛠️ Tecnologias utilizadas

- **Java**
- Orientação a Objetos (classes, atributos, métodos)
- `LocalDate` para tratamento de datas
- Vetores de objetos (`Aluno[]`)

## 🌿 Controle de versão

Conforme instrução da prática, o desenvolvimento foi realizado em uma **nova branch** do repositório GitHub já utilizado na aula anterior.

```bash
git checkout -b pratica1-parte2
```

## ▶️ Como executar

```bash
javac Pratica12.java
java Pratica12
```


## 📌 Exemplo de saída esperada

```
=== Menu ===
1. Cadastrar aluno
2. Listar todos os alunos
...
8. Encerrar

```
---

**Disciplina:** Laboratório de Programação Modular
**Instituição:** Pontifícia Universidade Católica de Minas Gerais (PUC Minas)
**Professor:** Glender Brás