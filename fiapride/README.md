# Repositório criado para o acompanhamento das aulas de OO (Orientação a Objetos)

Em construção...

Astah sendo usado para a geração de diagrams UML.

# Passo a passo da classe `Passageiro`

A classe `Passageiro` representa um **passageiro do aplicativo FiapRide**, armazenando seus dados pessoais e saldo disponível, com encapsulamento total e validações de regras de negócio.

## Atributos (privados — encapsulamento)

* `nome`: nome do passageiro (`String`).
* `cpf`: CPF do passageiro (`String`).
* `saldo`: saldo disponível para realizar viagens (`double`).

> **Regra de ouro do encapsulamento:** todos os atributos são `private`. O mundo externo **não** acessa atributos diretamente — só via getters (leitura) e métodos de negócio (escrita controlada).

## Construtor

### `Passageiro(String nome, String cpf)`

Cria um novo passageiro com nome e CPF. O saldo **sempre inicia em 0.0** (roteado pelo setter privado com validação).

**Exemplo:**
```java
Passageiro passageiro = new Passageiro("Ana Silva", "222.222.222-22");
// saldo = 0.0 automaticamente
```

## Getters (leitura pública)

| Método | Retorno | Descrição |
|--------|---------|-----------|
| `getNome()` | `String` | Retorna o nome do passageiro. |
| `getCpf()` | `String` | Retorna o CPF do passageiro. |
| `getSaldo()` | `double` | Retorna o saldo atual. |

## Setters (privados — escrita controlada internamente)

* `setNome(String)` — atribui o nome.
* `setCpf(String)` — atribui o CPF.
* `setSaldo(double)` — **valida**: só permite valor `>= 0`; caso contrário, imprime erro de segurança e não altera.

> O construtor **roteia todos os atributos pelos setters privados**, garantindo ponto único de validação.

## Métodos de negócio (escrita pública com Guard Clauses)

### `adicionarSaldo(double valor)`

Adiciona valor ao saldo (recarga).

**Regras (guard clauses no topo):**
- `valor` deve ser **maior que zero** — senão imprime erro e retorna sem alterar.

**Exemplo:**
```java
passageiro.adicionarSaldo(50.0);
// Saída: "Recarga realizada. Novo saldo: 50.0"
```

### `pagarViagem(double custo)`

Realiza o pagamento de uma viagem.

**Regras (guard clauses no topo):**
- `custo` deve ser **maior que zero** — senão imprime erro e retorna.
- `saldo` deve ser **>= custo** — senão imprime erro de saldo insuficiente e retorna.

Se passar nas validações: desconta do saldo e imprime saldo restante.

**Exemplo:**
```java
passageiro.pagarViagem(20.0);
// Saída: "Viagem paga. Saldo restante: 30.0"
```

## Regras de proteção (resumo)

1. **Encapsulamento real:** atributos `private` — acesso direto externo **não compila** (erro de compilador: `saldo has private access in Passageiro`).
2. **Recarga inválida bloqueada:** `valor <= 0` não altera saldo.
3. **Viagem inválida bloqueada:** `custo <= 0` não processa.
4. **Viagem sem saldo bloqueada:** `saldo < custo` não processa.
5. **Saldo negativo bloqueado no setter:** `setSaldo(-x)` imprime erro de segurança e não altera.
6. **Todas as validações usam Guard Clauses** — valida primeiro, altera estado depois, sem aninhamento.

## Exemplo de uso completo

```java
Passageiro passageiro1 = new Passageiro("Ana Silva", "222.222.222-22");
Passageiro passageiro2 = new Passageiro("Carlos Souza", "333.333.333-33");

passageiro1.adicionarSaldo(50.0);   // Recarga realizada. Novo saldo: 50.0
passageiro2.adicionarSaldo(12.5);   // Recarga realizada. Novo saldo: 12.5

System.out.println(passageiro1.getNome() + " | Saldo: R$ " + passageiro1.getSaldo());
// Ana Silva | Saldo: R$ 50.0

passageiro1.pagarViagem(20.0);      // Viagem paga. Saldo restante: 30.0
passageiro2.pagarViagem(20.0);      // Erro: Saldo insuficiente para realizar a viagem.

// Teste de invasão (descomente para ver erro de compilação):
// passageiro1.saldo = 999999.0;  // error: saldo has private access in Passageiro
```

## Como compilar e rodar (terminal, sem IDE)

```bash
# Da raiz do projeto (onde está a pasta src/)
javac -d bin src/br/com/fiapride/model/Passageiro.java src/br/com/fiapride/main/SistemaPrincipal.java

java -cp bin br.com.fiapride.main.SistemaPrincipal
```

## Estrutura do projeto

```
fiap-poo-externo/
├── src/
│   └── br/com/fiapride/
│       ├── model/Passageiro.java
│       └── main/SistemaPrincipal.java
├── Passageiro.asta          # Diagrama UML (Astah)
├── .gitignore               # bin/, *.class, out/, IDEs
└── README.md
```

## Git — fluxo limpo (`.gitignore` ANTES do `add`)

```bash
git add .
git commit -m "refactor: aplica encapsulamento na classe Passageiro"
git push origin main
```

> **Commit `refactor:`** — mudou estrutura interna (encapsulamento), não comportamento externo.