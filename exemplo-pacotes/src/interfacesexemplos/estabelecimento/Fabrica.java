package interfacesexemplos.estabelecimento;

import interfacesexemplos.equipamentos.impressora.Impressora;
import interfacesexemplos.equipamentos.impressora.Laserjet;
import interfacesexemplos.equipamentos.multifuncional.EquipamentoMultifuncional;
import interfacesexemplos.equipamentos.copiadora.Copiadora;
import interfacesexemplos.equipamentos.digitalizadora.Digitalizadora;
import interfacesexemplos.equipamentos.digitalizadora.Scanner;
import interfacesexemplos.equipamentos.impressora.Deskjet;

public class Fabrica {
	public static void main(String[] args) {
		EquipamentoMultifuncional em =new EquipamentoMultifuncional();
		
		Deskjet deskjet = new Deskjet();
		Scanner scanner = new Scanner();
		
		Impressora impressora = deskjet;
		Digitalizadora digitalizadora = em;
		Copiadora copiadora = em;
		
		
		impressora.imprimir();
		digitalizadora.digitalizar();
		copiadora.copiar();
		
	}
}
