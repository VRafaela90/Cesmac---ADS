package Folha;

public class FolhaInativos extends FolhaBase {
	
	private Double proventos;
	private Double totalLiquido;
	
	
	
	public FolhaInativos(String periodo, Double eventuais, Double judiciais, Double tetoRedutor, Double irrf, Double previdencia, Double proventos) {
		
		super(periodo, eventuais, judiciais, tetoRedutor, irrf, previdencia);
		this.proventos = proventos;
		
		this.totalLiquido = proventos + (eventuais) - (irrf+judiciais+previdencia);
		
	}



	public Double getProventos() {
		return proventos;
	}



	public void setProventos(Double proventos) {
		this.proventos = proventos;
	}



	public Double getTotalLiquido() {
		return totalLiquido;
	}



	public void setTotalLiquido(Double totalLiquido) {
		this.totalLiquido = totalLiquido;
	}
	
	
	
}
