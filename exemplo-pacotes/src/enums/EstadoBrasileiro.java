package enums;

public enum EstadoBrasileiro {
	SAO_PAULO("SP", "São Paulo", 2424),
	RIO_JANEIRO("RJ", "Rio de Janeiro", 7171),
	PIAUI("PI", "Piaui", 1322),
	MARANHAO("MA", "Maranhão", 1313),
	CEARA("CE", "Ceará", 2222);
	
	private String nome;
	private String sigla;
	private int ibge;
	
	private EstadoBrasileiro(String sigla, String nome, int ibge) {
		this.sigla = sigla;
		this.nome = nome;
		this.ibge = ibge;
	}

	public String getNome() {
		return nome;
	}

	public String getSigla() {
		return sigla;
	}
	
	public int getIbge() {
		return ibge;
	}
	
	public String getNomeMaisculo() {
		return nome.toUpperCase();
	}
	
}
