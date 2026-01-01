public class Filme
{
    // Criação de classes
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

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
