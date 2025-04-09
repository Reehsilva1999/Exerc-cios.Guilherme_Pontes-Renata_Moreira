package Atividade08;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Pizza pizza;
    private String enderecoEntrega;
    private double valorTotal;
    private boolean cancelado;

    private static List<Pedido> pedidosRealizados = new ArrayList<>();
    private static int totalPedidos = 0;
    private static double somaValoresPedidos = 0;

    // Construtor para inicializar um pedido
    public Pedido(Pizza pizza, String enderecoEntrega) {
        this.pizza = pizza;
        this.enderecoEntrega = enderecoEntrega;
        this.valorTotal = pizza.getValor(); 
        this.cancelado = false;
        pedidosRealizados.add(this);
        totalPedidos++;
        somaValoresPedidos += this.valorTotal;
        System.out.println("Pedido para " + pizza.getNome() + " criado para " + enderecoEntrega + ".");
    }

    // Método para cancelar o pedido
    public void cancelarPedido() {
        if (!cancelado) {
            this.cancelado = true;
            totalPedidos--;
            somaValoresPedidos -= this.valorTotal;
            System.out.println("Pedido para " + this.pizza.getNome() + " cancelado.");
        } else {
            System.out.println("Este pedido já foi cancelado.");
        }
    }

    public static int getTotalPedidosRealizados() {
        return totalPedidos;
    }

    public static double getMediaPrecoPedidos() {
        if (totalPedidos > 0) {
            return somaValoresPedidos / totalPedidos;
        } else {
            return 0;
        }
    }

    public void exibirDetalhesPedido() {
        System.out.println("--- Detalhes do Pedido ---");
        System.out.println("Pizza: " + this.pizza.getNome());
        System.out.println("Valor: R$" + String.format("%.2f", this.valorTotal));
        System.out.println("Endereço de Entrega: " + this.enderecoEntrega);
        System.out.println("Status: " + (this.cancelado ? "Cancelado" : "Ativo"));
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        // Criando algumas pizzas do menu
        Pizza calabresa = new Pizza("Calabresa", 35.00);
        calabresa.adicionarIngrediente("Calabresa");
        calabresa.adicionarIngrediente("Cebola");
        calabresa.adicionarIngrediente("Azeitona");

        Pizza marguerita = new Pizza("Marguerita", 30.00);
        marguerita.adicionarIngrediente("Mussarela");
        marguerita.adicionarIngrediente("Tomate");
        marguerita.adicionarIngrediente("Manjericão");

        Pizza pepperoni = new Pizza("Pepperoni", 40.00);
        pepperoni.adicionarIngrediente("Pepperoni");
        pepperoni.adicionarIngrediente("Queijo");

        // Criando alguns pedidos
        Pedido pedido1 = new Pedido(calabresa, "Rua das Flores, 123");
        Pedido pedido2 = new Pedido(marguerita, "Avenida Principal, 456");
        Pedido pedido3 = new Pedido(pepperoni, "Travessa da Paz, 789");

        // Exibindo detalhes dos pedidos
        pedido1.exibirDetalhesPedido();
        pedido2.exibirDetalhesPedido();
        pedido3.exibirDetalhesPedido();

        // Cancelando um pedido
        pedido2.cancelarPedido();
        pedido2.exibirDetalhesPedido(); // Mostrar status cancelado

        // Gerando relatórios
        System.out.println("\n--- Relatório ---");
        System.out.println("Total de pedidos realizados: " + Pedido.getTotalPedidosRealizados());
        System.out.println("Média do preço dos pedidos: R$" + String.format("%.2f", Pedido.getMediaPrecoPedidos()));
        System.out.println("------------------");
    }
}
