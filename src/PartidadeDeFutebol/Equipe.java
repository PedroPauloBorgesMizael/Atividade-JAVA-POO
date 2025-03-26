package PartidadeDeFutebol;

public class Equipe {
  private String nome;
  private int divisao;
  private int pontuacao;
  private int vitorias;
  private int derrotas;
  private int empates;

  public Equipe(String nome, int divisao, int pontuacao, int vitorias, int derrotas, int empates) {
    this.nome = nome;
    this.divisao = divisao;
    this.pontuacao = pontuacao;
    this.vitorias = vitorias;
    this.derrotas = derrotas;
    this.empates = empates;
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

  public void setPontuacao(int pontuacao) {
    this.pontuacao = pontuacao;
  }

  public void setVitorias(int vitorias) {
    this.vitorias = vitorias;
  }

  public void setDerrotas(int derrotas) {
    this.derrotas = derrotas;
  }

  public void setEmpates(int empates) {
    this.empates = empates;
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
