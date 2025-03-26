package EstoqueLivraria;

public class Livro {
  private String titulo;
  private String autor;
  private int quantidade;
  private int numeroDePaginas;

  public Livro (String titulo, String autor, int quantidade, int numeroDePaginas) {
    this.titulo = titulo;
    this.autor = autor;
    this.quantidade = quantidade;
    this.numeroDePaginas = numeroDePaginas;
  }

  public String getTitulo() {
    return titulo;
  }

  public String getAutor() {
    return autor;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public int getNumeroDePaginas() {
    return numeroDePaginas;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }

  public void setNumeroDePaginas(int numeroDePaginas) {
    this.numeroDePaginas = numeroDePaginas;
  }

  @Override
  public String toString() {
    return "Titulo: " + titulo + ", Autor: " + autor + ", Páginas: " + numeroDePaginas + ", Em estoque: " + quantidade;
  }
}
