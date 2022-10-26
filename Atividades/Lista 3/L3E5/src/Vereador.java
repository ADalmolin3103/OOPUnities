import java.util.ArrayList;
import java.util.Date;

public class Vereador { // contribuição Nicolas
    private String nome;
    private Partido partido;
    private int qtdProjApres;
    private int qtdProjAprov;
    ArrayList<ProjetoDeLei> listaPL = new ArrayList<>();
    ProjetoDeLei projetoDeLei;
    
    //Projeto lei
    public void incPL(String tituloNovo, Date dataApresentacaoNovo, Date dataAprovacaoNovo) {
    	int numeroProjetoNovo = listaPL.size(); //Código é o tamanho do array antes da inclusão
		projetoDeLei = new ProjetoDeLei(tituloNovo, dataApresentacaoNovo, dataAprovacaoNovo, numeroProjetoNovo);
		listaPL.add(projetoDeLei);
		
	}
    
    //PL Complementar
    public void incPL(String tituloNovo, Date dataApresentacaoNovo, Date dataAprovacaoNovo, String ArtigosLONovo, int qtdVotosFavoraveisNovo) {
    	int numeroProjetoNovo = listaPL.size(); //Código é o tamanho do array antes da inclusão
		projetoDeLei = new ProjetoDeLeiComplementar(tituloNovo, dataApresentacaoNovo, dataAprovacaoNovo, numeroProjetoNovo, ArtigosLONovo, qtdVotosFavoraveisNovo);
		listaPL.add(projetoDeLei);
	}
    
    public Vereador(String nome, Partido partido) {
        this.setNome(nome);
        this.setPartido(partido);
    }
    
    public void setNome(String nome) {
        if (nome != null && !nome.isBlank()) {
            this.nome = nome;
        }
    }
    
    public void setPartido(Partido partido) {
        if (partido != null) {
            this.partido = partido;
            partido.addVereador(this); // em razão da navegabilidade bidirecional
        }
    }
    
    public void addProjApres() {
        this.qtdProjApres++;
    }

    public void setQtdProjApres(int qtde) {
    	if (qtde >= 0) {
    		this.qtdProjApres = qtde;
    	}
    }

    public void addProjAprov() {
        this.qtdProjAprov++;
    }
    
    public void setQtdProjAprov(int qtde) {
    	if (qtde >= 0) {
    		this.qtdProjAprov = qtde;
    	}
    }
    
    public String getNome() {
        return nome;
    }
    
    public Partido getPartido() {
        return partido;
    }
    
    public int getQtdProjApres() {
        return qtdProjApres;
    }
    
    public int getQtdProjAprov() {
        return qtdProjAprov;
    }
    
    public double getIndiceTrabalho() {
        if (qtdProjApres > 17) {
            return 1.22d;
        } else if (qtdProjApres > 10) {
            return 1.08d;
        } else if (qtdProjApres > 5) {
            return 1d;
        } else if (qtdProjApres > 0) {
            return 0.8d;
        }
        return 0;
    }
    
    public double getDesempenho() {
    	if (qtdProjApres == 0) {
    		return 0;
    	}
        return ((double)qtdProjAprov/qtdProjApres)*getIndiceTrabalho();
    }
    
}