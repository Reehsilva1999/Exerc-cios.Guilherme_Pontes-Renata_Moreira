public class Biblioteca {
    public static void main(String[] args){
 
             Livro livro1 = new Livro("A Seleção", "Kiera Cass ", 2012);
             Livro livro2 = new Livro("A Elite", "Kiera Cass ", 2013);

    
             System.out.println("Informações dos Livros:");
             livro1.exibirInfo();
             livro2.exibirInfo();



    }
}
