package Atividade08;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String nome;
    private double valor;
    private List<String> ingredientes;

    // Construtor para inicializar nome, valor e ingredientes
    public Pizza(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
        this.ingredientes = new ArrayList<>();
    }

    // Método para adicionar um ingrediente à pizza
    public void adicionarIngrediente(String ingrediente) {
        this.ingredientes.add(ingrediente);
    }

    // Métodos getters para acessar os atributos da pizza
    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public String toString() {
        return "Pizza: " + nome + " (R$" + String.format("%.2f", valor) + ") Ingredientes: " + ingredientes;
    }
}