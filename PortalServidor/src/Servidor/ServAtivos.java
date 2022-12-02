package Servidor;

public class ServAtivos extends ServBase {
	
	private String orgao;
	private String cargo;
	private String funcao;
	
	public ServAtivos(String cpf, String nome, String vinculo, String orgao, String cargo, String funcao) {
		
		super(cpf, nome, vinculo);
		this.orgao = orgao;
		this.cargo = cargo;
		this.funcao = funcao;
	}

	public String getOrgao() {
		return orgao;
	}

	public void setOrgao(String orgao) {
		this.orgao = orgao;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	

}
