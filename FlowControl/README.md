### Descrição

Este exercício envolve a criação de um programa que recebe dois números inteiros e realiza algumas verificações e ações com base neles. Ele utiliza exceções personalizadas e laços de repetição para controlar o fluxo do programa.

### O exercício é dividido em duas classes principais:

#### 1. Classe `InvalidParameters`
Essa classe representa uma exceção personalizada, que é lançada quando o segundo número `number2` não é maior que o primeiro número `number1`. Quando a exceção é lançada, a mensagem "O segundo parâmetro deve ser maior que o primeiro" é exibida.

#### 2. Classe `FlowControl`
A classe principal possui o seguinte comportamento:
- Solicita ao usuário dois números inteiros.
- Verifica se o segundo número é maior que o primeiro, utilizando a exceção `InvalidParameters`.
- Se a verificação for bem-sucedida, imprime números de 1 até a diferença entre os dois números fornecidos.