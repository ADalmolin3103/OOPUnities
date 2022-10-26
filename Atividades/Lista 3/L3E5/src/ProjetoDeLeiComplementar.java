import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class ProjetoDeLeiComplementar extends ProjetoDeLei {
	private String ArtigosLO;
	private int qtdVotosFavoraveis;
	
	public ProjetoDeLeiComplementar(String tituloNovo, Date dataApresentacaoNovo, Date dataAprovacaoNovo, int numeroProjetoNovo, String ArtigosLONovo, int qtdVotosFavoraveisNovo) {
		super(tituloNovo, dataApresentacaoNovo, dataAprovacaoNovo, numeroProjetoNovo);
		this.ArtigosLO = ArtigosLONovo;
		this.qtdVotosFavoraveis = qtdVotosFavoraveisNovo;
	}
	
	@Override
	public void mostrar() {
		DateFormat formatarData = new SimpleDateFormat("yyyy-mm-dd");
		if(super.getDataAprovacao() == null) {
			JOptionPane.showMessageDialog(null, String.format("O projeto %s apresentado no dia %s tem o numero %s teve %s votos aprovados", super.getTitulo(), formatarData.format(super.getDataApresentacao()), super.getNumeroProjeto()));
		} else {
			JOptionPane.showMessageDialog(null, String.format("O projeto %s apresentado no dia %s, aprovado no dia %s tem o numero %s, teve %s votos aprovados", super.getTitulo(), formatarData.format(super.getDataApresentacao()), formatarData.format(super.getDataAprovacao()), super.getNumeroProjeto(), String.valueOf(this.qtdVotosFavoraveis)));
		}
	}
	
	

	public String getArtigosLO() {
		return ArtigosLO;
	}

	public void setArtigosLO(String artigosLONovo) {
		ArtigosLO = artigosLONovo;
	}

	public int getQtdVotosFavoraveis() {
		return qtdVotosFavoraveis;
	}

	public void setQtdVotosFavoraveis(int qtdVotosFavoraveisNovo) {
		this.qtdVotosFavoraveis = qtdVotosFavoraveisNovo;
	}
	
	
}
