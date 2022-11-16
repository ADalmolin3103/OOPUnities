package correcaoProva;

import java.time.LocalDate;

public class Computador extends Equipamento {
	
	//Atributos
	private String endereco;
	private int qtdUrnas;
	private String sistOp;
	private String versaoSO;

	//Construtor
	public Computador(String codPatrimonio, int zonaEleitoral, LocalDate dataFabricação, String endereco, int qtdUrnas,
			String sistOp, String versaoSO) {
		super(codPatrimonio, zonaEleitoral, dataFabricação);
		this.endereco = endereco;
		this.qtdUrnas = qtdUrnas;
		this.sistOp = sistOp;
		this.versaoSO = versaoSO;
	}

	//Getters && Setters
	public String getEndereco() {
		return endereco;
	}



	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}



	public int getQtdUrnas() {
		return qtdUrnas;
	}



	public void setQtdUrnas(int qtdUrnas) {
		this.qtdUrnas = qtdUrnas;
	}



	public String getSistOp() {
		return sistOp;
	}



	public void setSistOp(String sistOp) {
		this.sistOp = sistOp;
	}



	public String getVersaoSO() {
		return versaoSO;
	}



	public void setVersaoSO(String versaoSO) {
		this.versaoSO = versaoSO;
	}


	//Metodos
	@Override
	public String getChave() {
		return "CA"+this.endereco.charAt(4) + this.getZonaEleitoral() + this.getQtdUrnas() + this.getCodPatrimonio().length();
	}

	@Override
	public int getVolume() {
		return 352000;
	}
	
}
