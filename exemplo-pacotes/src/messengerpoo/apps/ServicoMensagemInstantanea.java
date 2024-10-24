package messengerpoo.apps;

public abstract class ServicoMensagemInstantanea {
	
	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	
	// Mais um método que todos os filhos deverão implementar
	public abstract void salvarHistoricoMensagem();
	
	
	// Somente os filhos conhecem este método
	protected void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}

	
//  HERANÇA:	
//	public void enviarMensagem() {
//		// Primeiro confirmar se está conectado a internet
//		validarConectadoInternet();
//		System.out.println("Enviando mensagem");
//		// Depois de enviada, salva o histórico da mensagem
//		salvarHistoricoMensagem();
//	}
//	
//	public void receberMensagem() {
//		System.out.println("Recebendo mensagem");
//	}
//	
//	// Métodos priovados, visiveis somente na classe
//	private void validarConectadoInternet() {
//		System.out.println("Validando se está conectado a internet");
//	}
//	
//	private void salvarHistoricoMensagem() {
//		System.out.println("Salvar histórico da mensagem");
//	}
	
	
}
