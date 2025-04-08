public class Biblioteca {
    public static void main(String[] args){
             // Criando alguns objetos Livro
             Livro livro1 = new Livro("Dom Quixote", "Miguel de Cervantes", 1605);
             Livro livro2 = new Livro("1984", "George Orwell", 1949);
             Livro livro3 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943);
     
             // Exibindo as informações dos livros
             System.out.println("Informações dos Livros:");
             livro1.exibirInfo();
             livro2.exibirInfo();
             livro3.exibirInfo();


    }
}
