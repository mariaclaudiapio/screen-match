package br.com.alura.screematch.modelos;

public class Filme
{
    // Criação de classes
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    // métodos acessores
    public int getTotalDeAvaliacoes()
    {
        return totalDeAvaliacoes;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento)
    {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos (int duracaoEmMinutos)
    {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    // Criação de métodos
    public void exibeFichaTecnica()
    {
        System.out.printf("""
                ***
                Nome: %s
                Ano: %d
                Duracao: %d minutos
                ***
                """, nome, anoDeLancamento, duracaoEmMinutos);
    }
    
    public void avalia(double nota)
    {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia()
    {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
