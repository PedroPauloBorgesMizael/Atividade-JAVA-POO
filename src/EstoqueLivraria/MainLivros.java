package EstoqueLivraria;

public class MainLivros {
  public static void main(String[] args) {
    EstoqueLivros estoque = new EstoqueLivros();

    Livro livro1 = new Livro("Dom Quixote", "Seu zé", 863, 50);
    Livro livro2 = new Livro("Diário de um banana", "Dona Maria", 328, 300);
    Livro livro3 = new Livro("O Senhor dos Anéis", "Joãozinho", 1216, 98);

    estoque.adicionarLivro(livro1);
    estoque.adicionarLivro(livro2);
    estoque.adicionarLivro(livro3);

    System.out.println("Estoque inicial:\n" + estoque.listarEstoque());

    estoque.removerLivro("Diário de um banana");
    System.out.println("\nEstoque após remover Diário de um banana:\n" + estoque.listarEstoque());

    System.out.println("\nBusca por Dom Quixote:\n" + estoque.buscarLivro("Dom Quixote"));

    System.out.println("\nBusca por Diário de um banana:\n" + estoque.buscarLivro("Diário de um banana"));

    //Teste da nova classe de serviço.
    EstoqueLivros estoque2 = new EstoqueLivros();
    estoque2.adicionarLivro(new Livro("Livro teste", "Autor Teste",100,2));
    System.out.println();
    System.out.println("Estoque com mais páginas: ");
    System.out.println(ComparadorDeEstoques.getEstoqueComMaisPaginas(estoque,estoque2).listarEstoque());
  }
}
