# Sistema de Livraria

## Descrição

Projeto desenvolvido para o desafio da formação Java que simula um sistema básico de gerenciamento de empréstimos de livros em uma biblioteca. O sistema permite listar livros disponíveis, realizar empréstimos e cadastrar novos livros de forma simples e interativa via console.

---

## Funcionalidades

- Listar livros disponíveis para empréstimo
- Realizar empréstimo de livros (atualizando a disponibilidade)
- Cadastrar novos livros na biblioteca (funcionalidade em desenvolvimento)
- Validação robusta de entradas do usuário para evitar erros

---

## Tecnologias Utilizadas

- Java 17+
- API de Datas `java.time.LocalDate`
- Manipulação de coleções (`ArrayList`)
- Tratamento de exceções para entrada de dados

---

## Estrutura do Projeto

| Classe       | Responsabilidade                                              |
|--------------|--------------------------------------------------------------|
| `Main`       | Ponto de entrada do programa; inicializa dados e executa o menu interativo. |
| `Autor`      | Representa o autor do livro, com atributos como id, nome e data de nascimento. |
| `Livro`      | Representa o livro, contendo id, título, autor, disponibilidade e datas de cadastro/atualização. |
| `Biblioteca` | Gerencia livros, empréstimos e operações relacionadas, como listagem e cadastro. |
| `Emprestimo` | Registra o empréstimo de um livro por um usuário, com data associada. |
| `Crud`       | Controla o fluxo principal do sistema, exibindo o menu e recebendo inputs do usuário. |
| `Tratamento` | Classe utilitária para leitura segura e validação dos dados de entrada do usuário. |

