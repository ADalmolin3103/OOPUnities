package correcaoProva;

import java.util.ArrayList;

public class TRESC {
	private ArrayList<Equipamento> listaEquipamentos = new ArrayList<Equipamento>();
	
	public String addEquipamento(Equipamento e) {
		if( e != null) {
			listaEquipamentos.add(e);
			return e.getChave(); //Polim�rfico :D
		} else {
			throw new IllegalArgumentException("Equipamento n�o pode ser nulo");
		}
	}
	
	public int getVolumeCarga() {
		int total =0;
		
		for(Equipamento e: listaEquipamentos) {
			total += e.getVolume(); //Polim�rfico
		}
		
		return total;
	}
	
	public String listarEquipamentos() {
		String string = "Tribunal Regional Eleitoral de Santa Catarina";
		
		for(Equipamento e: listaEquipamentos) {
			
		}
	}
}
