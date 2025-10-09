# Projeto Zoo: Herança e Polimorfismo em Java

## Objetivo

Modelar um sistema de gerenciamento de Zôo em Java para demonstrar os conceitos de **Herança** e **Polimorfismo**, criando classes hierárquicas para diferentes tipos de animais.

---

## Estrutura e Requisitos das Classes

O projeto deve ser construído com uma classe base (`Animal`) e classes filhas (`Peixe` e `Mamifero`).

### 1. Classe Base: Animal

* **Atributos:** Deve ter atributos privados para `nome`, `comprimento`, `patas`, `cor`, `ambiente` e `velocidade`.
* **Métodos Requeridos:**
    * Construtor para inicializar todos os atributos.
    * `void dados()` para imprimir as informações básicas do animal.

### 2. Classe Filha: Peixe (Herda de Animal)

* **Padrões Fixos:** `patas` = 0, `ambiente` = "Mar", `cor` = "Cinzento".
* **Atributo Próprio:** Uma `String` para armazenar a **característica** (ex: "Barbatanas e cauda").
* **Métodos Requeridos:** Construtor e `void dados()` (sobrescrito) que inclua a característica extra.

### 3. Classe Filha: Mamifero (Herda de Animal)

* **Padrão Fixo:** `ambiente` = "Terra".
* **Atributo Próprio:** Uma `String` para armazenar o **alimento** preferido.
* **Subclasse:** O Urso é um Mamífero com a cor "Castanho" e alimento "Mel".
* **Métodos Requeridos:** Construtor e `void dados()` (sobrescrito) que inclua o alimento.

---

## Classe Principal (Main)

A classe principal deve gerenciar o plantel do Zôo.

* **Armazenamento:** Deve usar um **`ArrayList<Animal>`** para armazenar todos os animais.
* **Funcionalidades:** Adicionar e remover animais do plantel.
* **Impressão:** Imprimir a lista completa de animais, utilizando o **Polimorfismo** (chamando o método `dados()` de cada objeto), seguindo o formato de impressão do exemplo.