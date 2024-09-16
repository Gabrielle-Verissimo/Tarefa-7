import java.util.*;

public class Client {
  private String nome;
  private Collection TapesAlugadas = new Vector();

  public Client(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void adicionaRent(Rent Rent) {
    TapesAlugadas.add(Rent);
  }

  public String extrato(ExtractFormatter formatter) {
    double valorTotal = calcularValorTotal();
    int pontosDeAlugadorFrequente = calcularPontos();
    return formatter.generateExtract(this, valorTotal, pontosDeAlugadorFrequente);
  }

}

