import br.com.alura.screematch.modelos.Filme;

public class Principal
{
    public static void main(String[] args)
    {
        // Criação do objeto 'Meu br.com.alura.screematch.modelos.Filme'
        Filme meuFilme = new Filme();
        meuFilme.setNome("Harry Potter e a Pedra Filosofal");
        meuFilme.setAnoDeLancamento(2001);
        meuFilme.setDuracaoEmMinutos(155);

        // Invocação do método
        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("O total de avaliações é: " + meuFilme.getTotalDeAvaliacoes() + ".");
        System.out.printf("A média das avaliações é %.2f.", meuFilme.pegaMedia());
    }
}
