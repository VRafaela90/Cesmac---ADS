package Folha;

public class FolhaAtivos extends FolhaBase {
	
	private Double remuneracao;
	private Double comissao;
	private Double beneficios;
	private Double valorHoras;
	private Double totalLiquido;

	
	
	public FolhaAtivos(String periodo, Double eventuais, Double judiciais, Double tetoRedutor, Double irrf, Double previdencia, Double remuneracao, Double comissao, Double beneficios, Double valorHoras) {
		
		super(periodo, eventuais, judiciais, tetoRedutor, irrf, previdencia);
		this.remuneracao = remuneracao;
		this.comissao = comissao;
		this.beneficios = beneficios;
		this.valorHoras = valorHoras;
		this.remuneracao = remuneracao;
		
		this.totalLiquido = remuneracao + (comissao+beneficios+valorHoras+eventuais) - (irrf+judiciais+previdencia);
		
	}



	public Double getRemuneracao() {
		return remuneracao;
	}



	public void setRemuneracao(Double remuneracao) {
		this.remuneracao = remuneracao;
	}



	public Double getComissao() {
		return comissao;
	}



	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}



	public Double getBeneficios() {
		return beneficios;
	}



	public void setBeneficios(Double beneficios) {
		this.beneficios = beneficios;
	}



	public Double getValorHoras() {
		return valorHoras;
	}



	public void setValorHoras(Double valorHoras) {
		this.valorHoras = valorHoras;
	}



	public Double getTotalLiquido() {
		return totalLiquido;
	}



	public void setTotalLiquido(Double totalLiquido) {
		this.totalLiquido = totalLiquido;
	}
	
	
	
}
