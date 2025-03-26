package EstoqueLivraria;

import java.util.ArrayList;
import java.util.List;

public class EstoqueLivros {
  private List<Livro> livros;

  public List<Livro> getLivros() {
    return this.livros;
  }

  public EstoqueLivros() {
    this.livros = new ArrayList<>();
  }

  public void adicionarLivro(Livro livro) {
    this.livros.add(livro);
  }

  public void removerLivro(String titulo) {
    livros.removeIf(livro -> livro.getTitulo().equalsIgnoreCase(titulo));
  }

  public String buscarLivro(String titulo) {
    for (Livro livro : livros) {
      if (livro.getTitulo().equalsIgnoreCase(titulo)) {
        return livro.toString();
      }
    }
      return "Livro não encontrado";
  }

  public String listarEstoque() {
    StringBuilder sb = new StringBuilder();
    if (livros.isEmpty()) {
      return "Estoque vazio.";
    }
    for (Livro livro : livros) {
      sb.append(livro.toString()).append("\n");
    }
    return sb.toString();
  }

}
