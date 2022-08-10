package E02;

public class Pessoa
{
    private String nome, dataNascimento, estadoCivil = "Solteiro";
    private char gen;

    public void mudarNome(String nomeNovo)
    {
        nome = nomeNovo;
    }

    public void mudarGen(char genNov)
    {
        gen = genNov;
    }

    public void mudarES(String ES)
    {
        estadoCivil = ES;
    }

    public void mudarDataNascimento(String Nascimento)
    {
        dataNascimento = Nascimento;
    }
}
