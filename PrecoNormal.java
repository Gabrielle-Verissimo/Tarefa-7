public class PrecoNormal implements Price {
    @Override
    public double calcularPreco(int diasAlugada) {
        double valor = 2;
        if (diasAlugada > 2) {
            valor += (diasAlugada - 2) * 1.5;
        }
        return valor;
    }
}
