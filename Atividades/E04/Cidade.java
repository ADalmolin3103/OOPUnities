package E04;

public class Cidade {
    private String nome, UF;
    private int populacaoMasc, populacaoFem;
    private boolean calculado;
    
    public Cidade (){

    }
    public Cidade(String NovoNome, String novaUF, int NovaPopMasc, int NovaPopFem, boolean NovoCalculado){
        this.setNome(NovoNome);
        this.setUF(novaUF);
        this.setPopMasc(NovaPopMasc);
        this.setPopFem(NovaPopFem);
        this.setCalculado(NovoCalculado);
    }
    public void setNome(String NovoNome){
        this.nome = NovoNome;
    }

    public void setUF(String novaUF){
        this.UF = novaUF;
    }

    public void setPopMasc(int NovaPopMasc){
        this.populacaoMasc = NovaPopMasc;
    }

    public void setPopFem(int NovaPopFem){
        this.populacaoFem = NovaPopFem;
    }

    public void setCalculado(boolean NovoCalculado){
        this.calculado=NovoCalculado;
    }
}
