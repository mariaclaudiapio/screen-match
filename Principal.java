import calculos.FiltroDeRecomendacoes;
import modelos.Episodio;
import modelos.Filme;
import modelos.Serie;
import calculos.CalculadoraDeTempo;

public class Principal
{
    public static void main(String[] args)
    {
        // Criação do objeto 'MeuFilme'
        Filme meuFilme = new Filme();
        meuFilme.setNome("Harry Potter e a Pedra Filosofal");
        meuFilme.setAnoDeLancamento(2001);
        meuFilme.setDuracaoEmMinutos(155);

        Filme outroFilme = new Filme();
        outroFilme.setNome("Harry Potter e a Câmara Secreta");
        outroFilme.setAnoDeLancamento(2002);
        outroFilme.setDuracaoEmMinutos(161);

        // Invocação do método
        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("O total de avaliações é: " + meuFilme.getTotalDeAvaliacoes() + ".");
        System.out.printf("A média das avaliações é %.2f.%n", meuFilme.pegaMedia());

        Serie ruptura = new Serie();
        ruptura.setNome("Ruptura");
        ruptura.setAnoDeLancamento(2022);
        ruptura.exibeFichaTecnica();
        ruptura.setTemporadas(10);
        ruptura.setEpisodiosPorTemporada(10);
        ruptura.setMinutosPorEpisodio(50);

        System.out.println("Duração para maratonar Ruptura: " + ruptura.getDuracaoEmMinutos() + " minutos.");

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(ruptura);

        System.out.println(calculadora.getTempoTotal());

        FiltroDeRecomendacoes filtro = new FiltroDeRecomendacoes();
        filtro.filtre(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setTotalDeVisualizacoes(300);
        filtro.filtre(episodio);
    }
}
