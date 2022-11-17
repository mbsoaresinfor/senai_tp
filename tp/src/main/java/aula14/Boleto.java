package aula14;

public class Boleto {

	private Integer codigoTitulo;
	private String nomeCliente;
	private String emailCliente;
	private Double valor;
	private boolean boletoEnviado;
	public Integer getCodigoTitulo() {
		return codigoTitulo;
	}
	public void setCodigoTitulo(Integer codigoTitulo) {
		this.codigoTitulo = codigoTitulo;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getEmailCliente() {
		return emailCliente;
	}
	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public boolean isBoletoEnviado() {
		return boletoEnviado;
	}
	public void setBoletoEnviado(boolean boletoEnviado) {
		this.boletoEnviado = boletoEnviado;
	}
	
	

}
