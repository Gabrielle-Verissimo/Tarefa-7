public class StringExtract implements ExtractFormatter{
    @Override
    public String generateExtract(Client client, double valorTotal, int pontosDeAlugadorFrequente){
        final String fimDeLinha = System.getProperty("line.separator");
        String resultado = "Registro de Alugueis de " + client.getNome() + fimDeLinha;
        // Gera o restante do extrato em formato de texto
        resultado += "Valor total devido: " + valorTotal + fimDeLinha;
        resultado += "Você acumulou " + pontosDeAlugadorFrequente + " pontos de alugador frequente";
        return resultado;
    }
}
