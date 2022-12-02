package Servidor;

public class ServBase {
	
	private String cpf;
	private String nome;
	private String vinculo;
	

	//LISTA DADOS BASICOS DO SERVIDOR
	protected ServBase(String cpf, String nome, String vinculo) {
		
		this.cpf = cpf;
		this.nome = nome;
		this.vinculo = vinculo;
		
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getVinculo() {
		return vinculo;
	}


	public void setVinculo(String vinculo) {
		this.vinculo = vinculo;
	}
	

}
