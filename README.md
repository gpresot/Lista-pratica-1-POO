# Prática 1 - Criando Classes e Objetos Básicos

Repositório com as soluções da **Prática 1** da disciplina de Laboratório de Programação Modular, ministrada pelo professor Glender Brás — PUC Minas.

Os exercícios têm como objetivo fixar os conceitos fundamentais de **Programação Orientada a Objetos (POO)** em Java: criação de classes, encapsulamento (atributos `private` com `get`/`set`), construtores e métodos que realizam cálculos e regras de negócio.

## 📋 Exercícios

### Exercício 1 — IMC e Classificação Corporal

Sistema que calcula o Índice de Massa Corporal (IMC) de uma pessoa e informa em qual faixa de classificação ela se encontra.

**Classe `Pessoa`**

Atributos (encapsulados com `get`/`set` e inicializados via construtor):
- `nome`
- `sobrenome`
- `idade`
- `altura`
- `peso`
- `imc`

Métodos:
- `calculaIMC()` — calcula o IMC pela fórmula `peso / altura²`
- `informaObesidade()` — retorna a faixa de classificação com base no IMC calculado

**Tabela de classificação:**

| IMC | Resultado |
|---|---|
| Menor que 18,5 | Abaixo do peso |
| Entre 18,5 e 24,9 | Peso normal |
| Entre 25 e 29,9 | Sobrepeso |
| Entre 30 e 34,9 | Obesidade grau 1 |
| Entre 35 e 39,9 | Obesidade grau 2 |
| Maior que 40 | Obesidade grau 3 |

**Fluxo do `main`:** recebe nome, sobrenome, idade, altura e peso do usuário, calcula o IMC e exibe o resultado junto com a faixa de classificação correspondente.

---

### Exercício 2 — Chapéu Seletor de Hogwarts

Sistema que simula o Chapéu Seletor da escola de magia de Hogwarts, classificando cada aluno em uma das quatro casas com base em suas características.

**Classe `Aluno`**

Atributos:
- `nome`
- `idade`
- `coragem`
- `inteligencia`
- `ambicao`
- `lealdade`
- `estrategia`
- `criatividade`
- `casa`

Métodos:
- `exibirInformacoes()` — exibe as informações do aluno
- `calcularCasa()` — calcula a pontuação de cada casa e retorna aquela com a **maior pontuação**

**Fórmulas de pontuação por casa:**

| Casa | Fórmula |
|---|---|
| Grifinória | `(2 × coragem) + lealdade` |
| Sonserina | `(2 × ambição) + estratégia` |
| Corvinal | `(2 × inteligência) + criatividade` |
| Lufa-Lufa | `((2 × lealdade) + coragem) / 3` |

**Fluxo do `main`:** em loop, recebe os dados de cada aluno, calcula e exibe a casa correspondente. O programa se encerra quando o usuário digitar um comando de saída (ex: `"encerrar"`).

## 🛠️ Tecnologias

- Java

## 📂 Estrutura do repositório

```
.
├── Quest1.java      # Exercício 1 - IMC
├── Pessoa.java      # Classe Pessoa
├── Quest2.java      # Exercício 2 - Chapéu Seletor
├── Aluno.java       # Classe Aluno
└── README.md
```

## ▶️ Como executar

```bash
javac Quest1.java Pessoa.java
java Quest1
```

```bash
javac Quest2.java Aluno.java
java Quest2
```

## 👤 Autor

Guilherme Presot — Engenharia de Software, PUC Minas
