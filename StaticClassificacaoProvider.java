public class StaticClassificacaoProvider implements ClassificationProvider {
    @Override
    public int getClassificacao(Tape tape) {
        return tape.getCodigoDePreco();
    }
}