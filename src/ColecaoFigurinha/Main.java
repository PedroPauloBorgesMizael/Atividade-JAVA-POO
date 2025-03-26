package ColecaoFigurinha;

import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    Figurinha figurinha1 = new Figurinha(1, "Neymar");
    figurinha1.setValorSentimental(95);

    Figurinha figurinha2 = new Figurinha(2, "Messi");
    figurinha2.setValorSentimental(98);

    Figurinha figurinha3 = new Figurinha(3, "Cristiano Ronaldo");
    figurinha3.setValorSentimental(92);

    Album album1 = new Album("Álbum da Copa do Mundo", 2022);
    List<Figurinha> listaFigurinhasAlbum1 = Arrays.asList(figurinha1, figurinha2, figurinha3);
    album1.setFigurinhas(listaFigurinhasAlbum1);

    Figurinha figurinha4 = new Figurinha(4,"Pelé");
    figurinha4.setValorSentimental(100);

    Figurinha figurinha5 = new Figurinha(5, "Maradona");
    figurinha5.setValorSentimental(85);

    Album album2 = new Album("Album Copa Mundo Legends", 2023);
    List<Figurinha> listaFigurinhasAlbum2 = Arrays.asList(figurinha4,figurinha5);
    album2.setFigurinhas(listaFigurinhasAlbum2);

    AvaliadorDeAlbum avaliador = new AvaliadorDeAlbum();
    double valorSentimentalAlbum1 = avaliador.avaliarAlbum(album1);
    double valorSentimentalAlbum2 = avaliador.avaliarAlbum(album2);

    System.out.println(album1);
    System.out.println("Valor Sentimental do álbum: " + valorSentimentalAlbum1);
    System.out.println();
    System.out.println(album2);
    System.out.println("Valor sentimental do álbum: "+ valorSentimentalAlbum2);

    List<Album> listaAlbums = Arrays.asList(album1,album2);
    System.out.println();
    System.out.println("O album com maior valor sentimental é:");
    System.out.println(avaliador.compararAlbuns(listaAlbums));

  }
}
