public class HtmlExtract implements ExtractFormatter{
    @Override
    public String generateExtract(Client client, double valorTotal, int pontosDeAlugadorFrequente){
        String resultado = "<h1>Registro de Alugueis de " + client.getNome() + "</h1>";
        // Gera o restante do extrato em formato HTML
        resultado += "<p>Valor total devido: " + valorTotal + "</p>";
        resultado += "<p>Você acumulou " + pontosDeAlugadorFrequente + " pontos de alugador frequente</p>";
        return resultado;
    }
}
