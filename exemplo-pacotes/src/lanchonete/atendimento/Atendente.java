package lanchonete.atendimento;

public class Atendente {
	public void servirMesa() {
		// ...?
		pegarLancheCozinha();
		System.out.println("SERVINDO MESA");
	}

	private void pegarLancheCozinha() {
		System.out.println("PEGANDO LANCHE NA COZINHA");
	}

	public void receberPagamento() {
		System.out.println("RECEBENDO PAGAMENTO");
	}

	void trocarGas() {
		System.out.println("ATENDENTE TROCANDO GÁS");
	}

	private void pegarPedidoBalcao() {
		System.out.println("PEGANDO PEDIDO NO BALCÃO");
	}
}
