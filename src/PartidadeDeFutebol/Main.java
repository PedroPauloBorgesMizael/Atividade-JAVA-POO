package PartidadeDeFutebol;

public class Main {
  public static void main(String[] args) {
    Equipe e1 = new Equipe("Atletico Goianiense", 2);
    Equipe e2 = new Equipe("Goiás", 2);

    System.out.println(e1);
    System.out.println(e2);

    Partida rodada1 = new Partida();
    rodada1.jogar(e1, e2);

    e1.apresentar();
    e2.apresentar();
  }
}
