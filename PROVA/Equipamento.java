package correcaoProva;

import java.time.LocalDate;

abstract class Equipamento {
	
	//Atributos
	private String codPatrimonio;
	private int zonaEleitoral;
	private LocalDate dataFabrica��o;
	
	//Construtor
	public Equipamento(String codPatrimonio, int zonaEleitoral, LocalDate dataFabrica��o) {
		super();
		this.setCodPatrimonio(codPatrimonio);
		this.setZonaEleitoral(zonaEleitoral);
		this.setDataFabrica��o(dataFabrica��o);
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
	public LocalDate getDataFabrica��o() {
		return dataFabrica��o;
	}
	public void setDataFabrica��o(LocalDate dataFabrica��o) {
		this.dataFabrica��o = dataFabrica��o;
	}
	
	//M�todos
	public abstract String getChave();
	
	public abstract  int getVolume();
}
