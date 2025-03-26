package PartidadeDeFutebol;

public class Equipe {
  private String nome;
  private int divisao;
  private int pontuacao;
  private int vitorias;
  private int derrotas;
  private int empates;

  public Equipe(String nome, int divisao) {
    this.nome = nome;
    this.divisao = divisao;
  }

  int ganharJogo() {
    this.pontuacao += 3;
    return vitorias++;
  }

  int empatarJogo() {
    this.pontuacao += 1;
    return empates++;
  }

  int perderJogo() {
    return derrotas++;
  }

  public String getNome() {
    return nome;
  }

  public int getDivisao() {
    return divisao;
  }

  public int getPontuacao() {
    return pontuacao;
  }

  public int getEmpates() {
    return empates;
  }

  public int getDerrotas() {
    return derrotas;
  }

  public int getVitorias() {
    return vitorias;
  }

  public String setNome() {
    return nome;
  }

  public int setDivisao() {
    return divisao;
  }

  public void apresentar() {
    System.out.println(this);
  }

  @Override
  public String toString() {
    return "Equipe{" +
      "Nome='" + nome + '\'' +
      ", divisao=" + divisao +
      ", pontuacao=" + pontuacao +
      ", vitorias=" + vitorias +
      ", derrotas=" + derrotas +
      ", empates=" + empates +
      '}';
  }
}
