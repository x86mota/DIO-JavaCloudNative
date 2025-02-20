# Exercício Conta Bancária

## Descrição

Este exercício consiste em simular a criação de uma conta bancária a partir dos dados fornecidos pelo usuário e exibe uma mensagem de boas-vindas.

## O exercício é dividido em duas classes principais:

### 1. Classe `BankAccount`

A classe `BankAccount` representa uma conta bancária e possui os seguintes atributos privados:

- `accountNumber` (número da conta)
- `branchNumber` (número da agência)
- `customerName` (nome do cliente)
- `balance` (saldo da conta)

A classe contém um construtor que inicializa esses atributos com valores passados durante a criação do objeto. Além disso, possui métodos **getters** para acessar os valores desses atributos.

### 2. Classe `TerminalAccount`

A classe `TerminalAccount` interage com o usuário por meio de um terminal para coletar as informações necessárias para criar uma conta bancária. O programa solicita as seguintes informações ao usuário:

1. Número da conta
2. Número da agência
3. Nome do cliente
4. Saldo da conta

Após o preenchimento dos dados, o programa cria um objeto da classe `BankAccount` e imprime uma mensagem de boas-vindas, contendo todas as informações fornecidas.
