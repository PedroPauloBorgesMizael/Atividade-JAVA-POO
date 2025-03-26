package PartidadeDeFutebol;

import java.util.Random;

public class Partida {
  private boolean autorizada;


  void jogar(Equipe timeDaCasa, Equipe timeVisitante) {
    if (timeVisitante.getNome() == timeDaCasa.getNome() || timeVisitante.getDivisao() != timeDaCasa.getDivisao()) {
      autorizada = false;
    } else {
      autorizada = true;
    }

    if (autorizada) {

      System.out.println("Hoje teremos um grnade jogo entre essas duas equipes, temos hoje " + timeDaCasa.getNome() + " que vai jogar em casa e carrega a responsabilidade de ganhar, equanto do outro lado temos " + timeVisitante.getNome() + " que vem para tentar pontuar fora de casa.");

      Random sorteador = new Random();
      int resultado = sorteador.nextInt(3);

      switch (resultado) {
        case 0:
          timeDaCasa.ganharJogo();
          timeVisitante.perderJogo();
          break;
        case 1:
          timeDaCasa.perderJogo();
          timeVisitante.ganharJogo();
          break;
        case 2:
          timeDaCasa.empatarJogo();
          timeVisitante.empatarJogo();
          break;
      }
    } else if (!autorizada) {
      System.out.println("Partida não autorizada");
    } else {
      System.out.println("Ocorreu algum erro com o código");
    }
  }
}
