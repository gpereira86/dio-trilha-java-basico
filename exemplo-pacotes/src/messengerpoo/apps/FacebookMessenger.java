package messengerpoo.apps;

public class FacebookMessenger extends ServicoMensagemInstantanea {

	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Facebook Messenger");		
	}

	public void receberMensagem() {
		System.out.println("Recebendo mensagem Facebook MSN Messenger");	
	}

	@Override
	public void salvarHistoricoMensagem() {
		// TODO Auto-generated method stub
		
	}

}