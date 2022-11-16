package correcaoProva;

import java.time.LocalDate;

abstract class Equipamento {
	
	//Atributos
	private String codPatrimonio;
	private int zonaEleitoral;
	private LocalDate dataFabricação;
	
	//Construtor
	public Equipamento(String codPatrimonio, int zonaEleitoral, LocalDate dataFabricação) {
		super();
		this.setCodPatrimonio(codPatrimonio);
		this.setZonaEleitoral(zonaEleitoral);
		this.setDataFabricação(dataFabricação);
	}
	
	//Getters && setters
	public String getCodPatrimonio() {
		return codPatrimonio;
	}
	public void setCodPatrimonio(String codPatrimonio) {
		this.codPatrimonio = codPatrimonio;
	}
	public int getZonaEleitoral() {
		return zonaEleitoral;
	}
	public void setZonaEleitoral(int zonaEleitoral) {
		if (zonaEleitoral > 0 && zonaEleitoral < 107) {
			this.zonaEleitoral = zonaEleitoral;
		} else {
			throw new IllegalArgumentException();
		}
	}
	public LocalDate getDataFabricação() {
		return dataFabricação;
	}
	public void setDataFabricação(LocalDate dataFabricação) {
		this.dataFabricação = dataFabricação;
	}
	
	//Métodos
	public abstract String getChave();
	
	public abstract  int getVolume();
}
