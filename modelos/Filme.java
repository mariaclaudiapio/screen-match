package modelos;

import calculos.Classificavel;

public class Filme extends Titulo implements Classificavel // Essa linha é responsável pelo filme herdar as características de título
{
    private String diretor;

    public String getDiretor()
    {
        return diretor;
    }

    public void setDiretor(String diretor)
    {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) (pegaMedia() / 2);
    }
}
