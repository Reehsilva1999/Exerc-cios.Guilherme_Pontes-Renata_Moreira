package Atividade06;

public class Contato {
    private String nome;
    private String telefone;

    // Construtor para inicializar nome e telefone
    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    // Métodos getters para acessar o nome e o telefone (boa prática para encapsulamento)
    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }


    public String toString() {
        return "Nome: " + nome + ", Telefone: " + telefone;
    }
}