package correcaoProva;

import java.time.LocalDate;

public class Urna extends Equipamento{
	
	//Atributo
	private int secao;
	private int qtdEleitores;
	private String versaoSoftware;
	
	//Construtor
	public Urna(String codPatrimonio, int zonaEleitoral, LocalDate dataFabricação, int secao, int qtdEleitores, String versaoSoftware) {
		super(codPatrimonio, zonaEleitoral, dataFabricação);
		this.setSecao(secao);
		this.setQtdEleitores(qtdEleitores);
		this.setVersaoSoftware(versaoSoftware);
	}	
	
	public int getSecao() {
		return secao;
	}

	public void setSecao(int secao) {
		this.secao = secao;
	}

	public int getQtdEleitores() {
		return qtdEleitores;
	}

	public void setQtdEleitores(int qtdEleitores) {
		this.qtdEleitores = qtdEleitores;
	}

	public String getVersaoSoftware() {
		return versaoSoftware;
	}

	public void setVersaoSoftware(String versaoSoftware) {
		this.versaoSoftware = versaoSoftware;
	}
	
	//Métodos
	@Override
	public String getChave() {
		String chave = "UE"+this.versaoSoftware;
		LocalDate data = LocalDate.parse("2020-10-31"); //LocalDate.of(2020, 10, 31);
		if(this.getDataFabricação().isAfter(data)) {
			chave += "ATU";
		} else {
			chave += "ANT";
		}
		chave += this.getZonaEleitoral()+this.secao;
		return chave;
	}

	@Override
	public int getVolume() {
		return 489060;
	}
	
	
}
