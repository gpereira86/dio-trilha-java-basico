package escola;

public class Aluno {
	private String nome;
	private int idade;
			
	// O padrão java beans pede a utilização de getters and setters
	// No Eclipse é possível clica com botão direito do mouse e procurar Source e depois Generate Getters and Setters
	// Também é possível criar o método de forma individual usando o autocomplete disiganto get ou set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
		
	
}
