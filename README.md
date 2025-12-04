# design-pattern-strategy
Repositório dedicado a explicar e demonstrar o uso do padrão de projeto **Strategy** por meio de exemplos simples e práticos.

## 📘 Definição do padrão
O padrão de projeto Strategy é um padrão comportamental que define um conjunto de algoritmos, os encapsula em classes separadas e permite que sejam intercambiáveis dentro de um determinado contexto.  
Ele facilita a variação de comportamento sem alterar o código que utiliza esses algoritmos.

## 💳 Uso no projeto
Este projeto simula um sistema no contexto de **pagamentos**.

Quando lidamos com pagamentos, normalmente existem diferentes formas de realizar a cobrança, como:
- Cartão de crédito
- PIX
- Boleto bancário

Cada método possui sua própria forma de processar o pagamento — e é justamente aí que o padrão Strategy entra em ação.

Com Strategy, definimos uma **interface comum** entre todos os métodos de pagamento (a estratégia). O contexto do pagamento recebe apenas uma implementação dessa interface, sem precisar conhecer seus detalhes internos.  
Assim, o código fica mais limpo, flexível e fácil de manter.

### Problemas evitados ao usar Strategy
- Código cheio de `if/else` ou `when` para tratar cada método de pagamento
- Dificuldade em estender e manter o código
- Violação do princípio do **Aberto/Fechado (OCP)**

## ⚖️ Vantagens e Desvantagens

### ✔️ Vantagens
- Facilidade para adicionar novos métodos de pagamento sem alterar o código existente
- Melhor organização e separação das responsabilidades
- Redução de condicionais complexas

### ❌ Desvantagens
- Aumento do número de classes
- Pode adicionar certa complexidade ao projeto quando usado sem necessidade

## 🧠 Quando usar?
- Quando existem múltiplas variações de um comportamento
- Quando comportamentos mudam com frequência
- Quando há necessidade de trocar implementação em tempo de execução

## 🧩 Componentes
- **Strategy**  
  Define o contrato para o algoritmo (ex.: `IPaymentType`)
- **Estratégias Concretas**  
  Implementações do contrato (ex.: `CreditCardPayment`, `PixPayment`)
- **Context**  
  Classe que utiliza a estratégia para executar a operação (ex.: `PaymentContext`)
