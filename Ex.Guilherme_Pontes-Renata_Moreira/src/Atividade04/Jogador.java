public class Jogador {


    private String nome;
    private int pontuacao;
    private int nivel;


    // Construtor
    public Jogador(String nome, int pontuacaoInicial, int nivelInicial) {
        this.nome = nome;
        this.pontuacao = pontuacaoInicial;
        this.nivel = nivelInicial;
    }


    // Método para aumentar a pontuação
    public void aumentarPontuacao(int pontos) {
        if (pontos > 0) {
            this.pontuacao += pontos;
            System.out.println(nome + " ganhou " + pontos + " pontos. Pontuação atual: " + this.pontuacao);
        } else {
            System.out.println("Aumento de pontos inválido.");
        }
    }


    // Método para subir de nível
    public void subirNivel() {
        this.nivel++;
        System.out.println(nome + " subiu para o nível " + this.nivel + "!");
    }


    // Método para exibir as informações do jogador
    public void exibirInfo() {
        System.out.println("--- Informações do Jogador ---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Pontuação: " + this.pontuacao);
        System.out.println("Nível: " + this.nivel);
        System.out.println("-----------------------------");
    }


    public static void main(String[] args) {
        // Criando alguns jogadores
        Jogador jogador1 = new Jogador("Hero123", 50, 2);
        Jogador jogador2 = new Jogador("NoobMaster", 10, 1);


        // Exibindo informações iniciais
        jogador1.exibirInfo();
        jogador2.exibirInfo();


        // Aumentando a pontuação
        jogador1.aumentarPontuacao(25);
        jogador2.aumentarPontuacao(5);
        jogador1.aumentarPontuacao(-10); // Tentativa inválida


        // Subindo de nível
        jogador2.subirNivel();


        // Exibindo informações atualizadas
        jogador1.exibirInfo();
        jogador2.exibirInfo();
    }
}
