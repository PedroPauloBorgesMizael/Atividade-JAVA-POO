package EstoqueLivraria;

import java.util.List;

public class ComparadorDeEstoques {

  public static EstoqueLivros getEstoqueComMaisPaginas(EstoqueLivros estoque1, EstoqueLivros estoque2) {

    int totalPaginas1 = calculaTotalPaginas(estoque1.getLivros());
    int totalPaginas2 = calculaTotalPaginas(estoque2.getLivros());

    if (totalPaginas1 > totalPaginas2) {
      return estoque1;
    } else {
      return estoque2;
    }
  }

  private static int calculaTotalPaginas(List<Livro> livros) {
    int totalPaginas = 0;
    for (Livro livro : livros) {
      totalPaginas += livro.getNumeroDePaginas() * livro.getQuantidade();
    }
    return totalPaginas;
  }
}
