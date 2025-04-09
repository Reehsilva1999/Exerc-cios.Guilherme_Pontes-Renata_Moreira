package Atividade06;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        this.contatos.add(contato);
        System.out.println("Contato " + contato.getNome() + " adicionado à agenda.");
    }

    public List<Contato> buscarContatoPorNome(String nomeBusca) {
        List<Contato> resultados = new ArrayList<>();
        for (Contato contato : this.contatos) {
            if (contato.getNome().toLowerCase().contains(nomeBusca.toLowerCase())) {
                resultados.add(contato);
            }
        }
        return resultados;
    }
    public void listarTodosContatos() {
        if (contatos.isEmpty()) {
            System.out.println("A agenda está vazia.");
        } else {
            System.out.println("--- Lista de Contatos ---");
            for (Contato contato : contatos) {
                System.out.println(contato); // Utiliza o toString da classe Contato
            }
            System.out.println("-----------------------");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da Agenda
        Agenda minhaAgenda = new Agenda();

        Contato contato1 = new Contato("João Silva", "1234-5678");
        Contato contato2 = new Contato("Maria Oliveira", "9876-5432");


        minhaAgenda.adicionarContato(contato1);
        minhaAgenda.adicionarContato(contato2);

        minhaAgenda.listarTodosContatos();

        String nomeParaBuscar = "joão";
        List<Contato> resultadosBusca = minhaAgenda.buscarContatoPorNome(nomeParaBuscar);

        if (!resultadosBusca.isEmpty()) {
            System.out.println("\nContatos encontrados com o nome '" + nomeParaBuscar + "':");
            for (Contato contato : resultadosBusca) {
                System.out.println(contato);
            }
        } else {
            System.out.println("\nNenhum contato encontrado com o nome '" + nomeParaBuscar + "'.");
        }
    }
}