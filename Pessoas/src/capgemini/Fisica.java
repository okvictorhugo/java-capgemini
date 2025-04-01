package capgemini;

public class Fisica extends Pessoa {
	
	public String cpf;
	public String identidade;
	@Override
	public String toString() {
		return "Fisica [CPF: " + cpf + ", Identidade: " + identidade + ", Nome: " + nome + ", Situação da Pessoa: "
				+ situacaoPessoa + "]";
	}
	
}
