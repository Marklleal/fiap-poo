package br.com.fiapride.model;

public class Passageiro {

    // Trancado: só código DESTA classe enxerga estes atributos
    private String nome;
    private String cpf;
    private double saldo;

    // Construtor: roteia tudo pelos setters (ponto único de validação)
    public Passageiro(String nome, String cpf) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setSaldo(0);   // todo mundo começa zerado — passando pela guarda
    }

    // Getters públicos: leitura liberada
    public double getSaldo() {
        return this.saldo;
    }

    // Setters PRIVADOS: escrita só acontece dentro da classe
    private void setSaldo(double valor) {
        if (valor >= 0) {
            this.saldo = valor;
        } else {
            System.out.println("Erro de Segurança: Tentativa de definir saldo negativo bloqueada!");
        }
    }

    public String getNome() {
        return this.nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    private void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Métodos de negócio da aula 02 — o mundo externo escreve SÓ por aqui
    public void adicionarSaldo(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: O valor de recarga deve ser maior que zero.");
            return;
        }
        setSaldo(valor);
        System.out.println("Recarga realizada. Novo saldo: " + getSaldo());
    }

    public void pagarViagem(double custo) {
        if (custo <= 0) {
            System.out.println("Erro: O custo da viagem é inválido.");
            return;
        }
        if (this.saldo < custo) {
            System.out.println("Erro: Saldo insuficiente para realizar a viagem.");
            return;
        }
        setSaldo(getSaldo() - custo);
        System.out.println("Viagem paga. Saldo restante: " + getSaldo());
    }
}
