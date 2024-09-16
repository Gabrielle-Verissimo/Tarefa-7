public class DefaultPointsCalculator implements PointsCalculator {
    @Override
    public int calculaPontos(Rent rent) {
        int pontos = 1;
        if (rent.getTape().getCodigoDePreco() == Tape.LANCAMENTO && rent.getDiasAlugada() > 1) {
            pontos++;
        }
        return pontos;
    }
}
