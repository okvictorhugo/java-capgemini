package capgemini;

public class Pessoas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fisica fis = new Fisica();
	
		
		//pessoa fisica da classe Fisica
		fis.nome = "Victor Hugo B. Soares";
		fis.cpf = "426589789-55";
		fis.identidade = "1505258";
		fis.situacaoPessoa = "A";
		
		Juridica jur = new Juridica();
		
		
		// pessoa juridica da classe Juridica
		
		jur.nome = "JCS Piscinas";
		jur.cnpj = "426564500-0001/78";
		jur.inscricaoEstadual = "426564789";
		jur.situacaoPessoa = "I";
		
		System.out.println("Dados da pessoa fisica: ");
		System.out.println(fis.toString());
		System.out.println("Dados da pessoa juridica: ");
		System.out.println(jur.toString());
		
	}

}
