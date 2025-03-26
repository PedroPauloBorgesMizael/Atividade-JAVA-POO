package ColecaoFigurinha;

import java.util.List;

public class AvaliadorDeAlbum {

  public double avaliarAlbum(Album album) {
    List<Figurinha> figurinhas = album.getFigurinhas();
    if (figurinhas.isEmpty()) {
      return 0.0;
    }

    int somaValores = 0;
    for (Figurinha figurinha : figurinhas) {
      somaValores += figurinha.getValorSentimental();
    }

    return (double) somaValores / figurinhas.size();
  }

  public Album compararAlbuns(List<Album> albuns) {

    if (albuns == null || albuns.isEmpty()) return null;

    Album albumComMaiorValor = albuns.get(0);
    double maiorValorSentimental = this.avaliarAlbum(albuns.get(0));

    for (Album album : albuns) {
      double valorAlbum = this.avaliarAlbum(album);
      if (valorAlbum > maiorValorSentimental) {
        maiorValorSentimental = valorAlbum;
        albumComMaiorValor = album;
      }

    }
    return albumComMaiorValor;
  }
}
