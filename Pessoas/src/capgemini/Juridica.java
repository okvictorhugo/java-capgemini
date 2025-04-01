package capgemini;

public class Juridica extends Pessoa {
	
	public String cnpj;
	public String inscricaoEstadual;
	@Override
	public String toString() {
		return "Juridica [CNPJ: " + cnpj + ", Inscrição Estadual: " + inscricaoEstadual + ", Nome: " + nome
				+ ", Situação da Empresa: " + situacaoPessoa + "]";
	}

}
