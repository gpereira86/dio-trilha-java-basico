package interfacesexemplos.equipamentos.multifuncional;

import interfacesexemplos.equipamentos.copiadora.Copiadora;
import interfacesexemplos.equipamentos.digitalizadora.Digitalizadora;
import interfacesexemplos.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {

	public void copiar() {
		System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
	}

	public void digitalizar() {
		System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
	}

	public void imprimir() {
		System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL");
	}
	
}
