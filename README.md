# Repositório criado para o acompanhamento das aulas de OO (Orientação a Objetos)

Em construção...

Astah sendo usado para a geração de diagrams UML.

# Passo a passo da classe `Passenger`

A classe `Passenger` representa um **passageiro de um aplicativo de transporte**, armazenando seus dados pessoais, saldo disponível, quantidade de corridas realizadas e sua avaliação.

## Atributos

* `name`: nome do passageiro.
* `balance`: saldo disponível para realizar corridas.
* `gender`: gênero do passageiro (`M` ou `F`).
* `rides`: quantidade de corridas realizadas.
* `stars`: avaliação do passageiro.

## Métodos

### `Passenger(...)`

É o construtor da classe. Ele cria um novo passageiro recebendo nome, saldo, gênero, quantidade de corridas e avaliação inicial.

**Exemplo:**

```java
Passenger passenger = new Passenger("João", 50.0, 'M', 0, 5.0f);
```

### `addCash(double value)`

Adiciona saldo à conta do passageiro.

A regra é que o valor adicionado deve ser **maior que zero**. Caso contrário, uma mensagem de erro é exibida e o saldo não é alterado.

**Exemplo:**

```java
passenger.addCash(30.0);
```

### `getRide(double cost)`

Realiza o pagamento de uma corrida.

Para realizar a corrida:

* O valor da corrida deve ser maior que zero.
* O passageiro precisa ter saldo suficiente.

Quando a corrida é realizada, o valor é descontado do saldo e a quantidade de corridas (`rides`) é aumentada em 1.

**Exemplo:**

```java
passenger.getRide(20.0);
```

### `rate(float rate)`

Atualiza a avaliação do passageiro.

A nota informada deve estar entre **0 e 5**. A nova avaliação é calculada fazendo a média entre a avaliação atual e a nova nota.

**Exemplo:**

```java
passenger.rate(4.5f);
```

### `updateProfile(String newName, char newGender)`

Atualiza o nome e o gênero do passageiro.

O gênero deve ser informado como `M` ou `F`. Caso seja informado outro valor, uma mensagem de erro é exibida.

**Exemplo:**

```java
passenger.updateProfile("Carlos", 'M');
```

## Regras de proteção

A classe possui algumas regras para evitar dados inválidos:

* Não é possível adicionar um valor de saldo menor ou igual a `0`.
* Não é possível realizar uma corrida com custo menor ou igual a `0`.
* Não é possível realizar uma corrida sem saldo suficiente.
* A avaliação deve estar entre `0` e `5`.
* O gênero aceito pela versão atual é `M` ou `F`.
* As validações utilizam **Guard Clauses**, interrompendo o método quando uma informação inválida é encontrada.

## Exemplo de uso completo

```java
Passenger passenger = new Passenger("João", 50.0, 'M', 0, 5.0f);

passenger.addCash(30.0);
passenger.getRide(20.0);
passenger.rate(4.0f);
passenger.updateProfile("Carlos", 'M');
```

Nesse exemplo, um passageiro é criado com saldo inicial de `50.0`, adiciona `30.0` de saldo, realiza uma corrida de `20.0`, recebe uma nova avaliação e atualiza seu perfil.
