public class Filme
{
    // Criação de classes
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    int duracaoEmMinutos;

    // métodos acessores
    int getTotalDeAvaliacoes()
    {
        return totalDeAvaliacoes;
    }

    // Criação de métodos
    void exibeFichaTecnica()
    {
        System.out.printf("""
                ***
                Nome: %s
                Ano: %d
                Duracao: %d minutos
                ***
                """, nome, anoDeLancamento, duracaoEmMinutos);
    }
    
    void avalia(double nota)
    {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia()
    {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
