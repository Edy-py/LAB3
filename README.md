# Laboratório de Programação 3 - Projetos em Java

Este repositório abriga os códigos-fonte desenvolvidos por mim durante o 3º período do curso de Ciência da Computação, com um foco central nos princípios e práticas da Programação Orientada a Objetos (POO) em Java. Cada conjunto de exercícios e atividades em sala de aula está organizado em pastas separadas para facilitar a navegação e a compreensão da evolução do aprendizado.

## Estrutura do Repositório

O código está organizado dentro do diretório `src/` em pacotes distintos. Cada pacote `ListaX_lab3` representa uma lista de exercícios, enquanto `ExerEmSala_lab3` contém atividades realizadas em aula. Dentro dessas pastas, você encontrará subdiretórios para exercícios específicos (Exer1, Exer2, etc.) e um pacote `Funcoes` que agrupa classes utilitárias reutilizáveis.

A estrutura de alto nível é a seguinte:

```
src/
├── ExerEmSala_lab3/
│   └── ... (arquivos relacionados a exercícios em sala)
├── Lista1_lab3/
│   └── ... (arquivos da Lista 1)
├── Lista2_lab3/
│   └── ... (arquivos da Lista 2)
├── Lista3_lab3/
│   └── ... (arquivos da Lista 3)
└── Lista4_lab3/
    └── ... (arquivos da Lista 4)

```

Cada subdiretório de exercício geralmente contém as classes relacionadas à sua implementação e uma classe `Principal.java` para a execução.

## Como Executar os Códigos

Para compilar e executar qualquer um dos exercícios, você precisará de um ambiente Java (JDK) configurado. Navegue até o diretório `src/` no seu terminal e siga os passos abaixo, substituindo `ListaX_lab3/ExerY/Principal.java` pelo caminho do arquivo principal que você deseja executar:

1. **Compile o(s) arquivo(s) Java:**

   ```bash
   javac Caminho/Para/Seu/Exercicio/Principal.java
   
   ```

   *Exemplo:*

   ```bash
   javac Lista4_lab3/Exer7/Principal.java
   
   ```

2. **Execute a classe compilada:**

   ```bash
   java Caminho.Para.Seu.Exercicio.Principal
   
   ```

   *Exemplo:*

   ```bash
   java Lista4_lab3.Exer7.Principal
   
   ```

## Observações e Futuras Melhorias

Este repositório serve como um registro do aprendizado e aplicação de conceitos de POO. Durante o desenvolvimento, foram explorados tópicos como:

* **Encapsulamento:** Utilização de getters e setters para controlar o acesso aos atributos das classes.

* **Herança:** Criação de hierarquias de classes para promover a reutilização de código.

* **Polimorfismo:** Implementação de métodos com o mesmo nome que se comportam de maneira diferente dependendo do tipo de objeto.

**Pontos para consideração e possíveis melhorias futuras:**

* **Consolidação de Utilitários:** As classes `Cabessalho` e `EntradaUsuario` estão presentes em múltiplos pacotes `Funcoes`. Uma otimização seria criar um único pacote de utilitários na raiz do projeto (`src/com/ufcat/lab3/utils`, por exemplo) e reutilizá-los a partir daí, evitando duplicação e facilitando a manutenção.

* **Tratamento de Exceções Robusto:** Aprimorar o tratamento de erros em operações de entrada do usuário (como `Scanner`) e validações (ex: idade, saldo bancário) para fornecer feedback mais amigável ao usuário e evitar que o programa encerre inesperadamente.

* **Fechamento de Recursos:** Garantir que recursos como o `Scanner` sejam fechados de forma adequada para evitar vazamento de recursos.

Espero que este repositório demonstre meu progresso e dedicação nos estudos de Programação Orientada a Objetos.
