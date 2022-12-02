package Folha;

public class FolhaBase {
	
	private String periodo;
	private Double eventuais;
	private Double judiciais;
	private Double tetoRedutor;
	private Double irrf;
	private Double previdencia;

	public FolhaBase(String periodo, Double eventuais, Double judiciais, Double tetoRedutor, Double irrf, Double previdencia) {
		
		this.periodo = periodo;
		this.eventuais = eventuais;
		this.judiciais = judiciais;
		this.tetoRedutor = tetoRedutor;
		this.irrf = irrf;
		this.previdencia = previdencia;
		
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public Double getEventuais() {
		return eventuais;
	}

	public void setEventuais(Double eventuais) {
		this.eventuais = eventuais;
	}

	public Double getJudiciais() {
		return judiciais;
	}

	public void setJudiciais(Double judiciais) {
		this.judiciais = judiciais;
	}

	public Double getTetoRedutor() {
		return tetoRedutor;
	}

	public void setTetoRedutor(Double tetoRedutor) {
		this.tetoRedutor = tetoRedutor;
	}

	public Double getIrrf() {
		return irrf;
	}

	public void setIrrf(Double irrf) {
		this.irrf = irrf;
	}

	public Double getPrevidencia() {
		return previdencia;
	}

	public void setPrevidencia(Double previdencia) {
		this.previdencia = previdencia;
	}
	
	
	
}
