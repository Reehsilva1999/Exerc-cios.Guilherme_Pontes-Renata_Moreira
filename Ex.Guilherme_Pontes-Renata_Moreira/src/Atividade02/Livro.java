public class Livro{


    String Titulo;
    String Autor;
    int AnoPublicacao;


    public Livro(String titulo, String Autor, int AnoPublicacao){
        this.Titulo = titulo;
        this.Autor = Autor;
        this.AnoPublicacao = AnoPublicacao;
    }


    public void exibirInfo(){
        System.out.println("Titulo: "+Titulo);
        System.out.println("Autor: "+Autor);
        System.out.println("Ano publicação: "+AnoPublicacao);
        System.out.println("--------------------");


    }
}
