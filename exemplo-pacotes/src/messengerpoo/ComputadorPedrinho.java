package messengerpoo;

import messengerpoo.apps.FacebookMessenger;
import messengerpoo.apps.MSNMessenger;
import messengerpoo.apps.ServicoMensagemInstantanea;
import messengerpoo.apps.Telegram;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		
		ServicoMensagemInstantanea smi = null;
		/*
		 * NÃO SE SABE QUAL APP
		 * MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM 		
		*/
		String appEscolhidoString = "tlg";
		
		if (appEscolhidoString.equals("msn")) {
			smi = new MSNMessenger();
		} else if (appEscolhidoString.equals("fbm")){  
			smi = new FacebookMessenger();
		} else if (appEscolhidoString.equals("tlg")) {
			smi = new Telegram();
		}
		
		smi.enviarMensagem();
		smi.receberMensagem();
		
		
//		// Abrindo MSN Messenger
//		System.out.println("\nMSN");
//		MSNMessenger msn = new MSNMessenger();
//
//		msn.enviarMensagem();
//		msn.receberMensagem();
//
//		// Abrindo Facebook Messenger
//		System.out.println("\nFACEBOOK");
//		FacebookMessenger fcb = new FacebookMessenger();
//
//		fcb.enviarMensagem();
//		fcb.receberMensagem();
//
//		// Abrindo Telegram
//		System.out.println("\nTELEGRAM");
//		Telegram tlg = new Telegram();
//
//		tlg.enviarMensagem();
//		tlg.receberMensagem();
	}
}
