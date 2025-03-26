package PartidadeDeFutebol;

public class Main {
  public static void main(String[] args) {
    Equipe e1 = new Equipe("Atletico Goianiense", 2, 32, 8, 3, 6);
    Equipe e2 = new Equipe("Goiás", 2, 24, 5, 3, 9);

    System.out.println(e1);
    System.out.println(e2);

    Partida rodada18 = new Partida();
    rodada18.jogar(e1, e2);

    System.out.println(e1);
    System.out.println(e2);
  }
}
