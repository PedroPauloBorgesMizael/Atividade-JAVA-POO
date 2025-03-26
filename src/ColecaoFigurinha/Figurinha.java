package ColecaoFigurinha;

public class Figurinha {
  private int numero;
  private String nome;
  private int valorSentimental;

  public Figurinha(int numero, String nome) {
    this.numero = numero;
    this.nome = nome;
    this.valorSentimental = 50;
  }

  public int getValorSentimental() {
    return valorSentimental;
  }

  public void setValorSentimental(int valorSentimental) {
    if (valorSentimental >= 0 && valorSentimental <= 100) {
      this.valorSentimental = valorSentimental;
    } else {
      System.out.println("Valor sentimental inválido. Deve estar entre 0 e 100.");
    }
  }

  public int getNumero() {
    return numero;
  }

  public String getNome() {
    return nome;
  }

  @Override
  public String toString() {
    return "Número: " + numero + ", Nome: " + nome + ", Valor sentimental: " + valorSentimental;
  }
}
