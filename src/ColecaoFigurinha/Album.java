package ColecaoFigurinha;

import java.util.ArrayList;
import java.util.List;

public class Album {
  private String titulo;
  private int ano;
  private List<Figurinha> figurinhas;

  public Album(String titulo, int ano) {
    this.titulo = titulo;
    this.ano = ano;
    this.figurinhas = new ArrayList<>();
  }

  public void setFigurinhas(List<Figurinha> figurinhas) {
    this.figurinhas = figurinhas;
  }

  public List<Figurinha> getFigurinhas() {
    return this.figurinhas;
  }

  @Override
  public String toString() {
    return "Album{" +
      "titulo= '" + titulo + '\'' +
      ", ano= " + ano +
      ", figurinhas= " + figurinhas +
      '}';
  }
}
