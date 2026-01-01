public class Principal
{
    public static void main(String[] args)
    {
        // Criação do objeto 'Meu Filme'
        Filme meuFilme = new Filme();
        meuFilme.nome = "Harry Potter e a Pedra Filosofal";
        meuFilme.anoDeLancamento = 2001;
        meuFilme.duracaoEmMinutos = 155;

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.printf("A média das avaliações é %.2f.", meuFilme.pegaMedia());
    }
}
