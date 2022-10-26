import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import javax.swing.JOptionPane;

public class ProjetoDeLei {
	private String titulo;
	private Date dataApresentacao, dataAprovacao;
	private int numeroProjeto;
	
	public ProjetoDeLei(String tituloNovo, Date dataApresentacaoNovo, Date dataAprovacaoNovo, int numeroProjetoNovo) {
		this.titulo = tituloNovo;
		this.dataApresentacao=dataApresentacaoNovo;
		this.dataAprovacao=dataAprovacaoNovo;
		this.numeroProjeto = numeroProjetoNovo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String tituloNovo) throws IllegalArgumentException {
		if(tituloNovo.isBlank()) {
			throw new IllegalArgumentException("O título não pode ser vazio");
		} else {
			this.titulo = tituloNovo;
		}
	}
	
	public Date getDataApresentacao() {
		return dataApresentacao;
	}
	
	public void setDataApresentacao(Date dataApresentacaoNovo) {
		if(dataApresentacaoNovo == null) {
			throw new IllegalArgumentException("A data está em branco");
		} else {
			this.dataApresentacao = dataApresentacaoNovo;
		}

	}
	public Date getDataAprovacao() {
		return dataAprovacao;
	}
	public void setDataAprovacao(Date dataAprovacaoNovo) {
		if(dataAprovacaoNovo == null) {
			throw new IllegalArgumentException("A data está em branco");
		} else {
		this.dataAprovacao = dataAprovacaoNovo;
		}
	}
	public int getNumeroProjeto() {
		return numeroProjeto;
	}
	public void setNumeroProjeto(int numeroProjetoNovo) {
		this.numeroProjeto = numeroProjetoNovo;
	}
	
	public void mostrar() {
		DateFormat formatarData = new SimpleDateFormat("yyyy-mm-dd");
		if(dataAprovacao == null) {
			JOptionPane.showMessageDialog(null, String.format("O projeto %s apresentado no dia %s tem o numero %s", this.titulo, formatarData.format(this.dataApresentacao), this.numeroProjeto));
		} else {
			JOptionPane.showMessageDialog(null, String.format("O projeto %s apresentado no dia %s, aprovado no dia %s tem o numero %s", this.titulo, formatarData.format(this.dataApresentacao), formatarData.format(this.dataAprovacao), this.numeroProjeto));
		}
	}
}
