package br.com.sistemakarina.model;

public class Gato {
    private String nome;
    private String cor;
    private Integer idade;

    public Gato(String nome, String cor, Integer idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    public String falaNome() {
        return this.nome;

    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", idade=" + idade +
                '}';
    }

    public void mia() {
        System.out.println("miau, miau, miau!");
    }

    public void corre() {
        System.out.println("gato correndo");
    }
}

