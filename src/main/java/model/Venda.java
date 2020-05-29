package model;

import java.math.BigDecimal;

public class Venda {
	private Long operacao;
	private Long cliente;
	private Integer quantidadeIngressos;
	private BigDecimal valotTotal;
	private String status;
	
	public Venda(Long operacao, 
			Long cliente, 
			Integer quantidadeIngressos, 
			BigDecimal valotTotal) {
		super();
		this.operacao = operacao;
		this.cliente = cliente;
		this.quantidadeIngressos = quantidadeIngressos;
		this.valotTotal = valotTotal;
	}
	
	public Long getOperacao() {
		return operacao;
	}
	public void setOperacao(Long operacao) {
		this.operacao = operacao;
	}
	public Long getCliente() {
		return cliente;
	}
	public void setCliente(Long cliente) {
		this.cliente = cliente;
	}
	public Integer getQuantidadeIngressos() {
		return quantidadeIngressos;
	}
	public void setQuantidadeIngressos(Integer quantidadeIngressos) {
		this.quantidadeIngressos = quantidadeIngressos;
	}
	public BigDecimal getValotTotal() {
		return valotTotal;
	}
	public void setValotTotal(BigDecimal valotTotal) {
		this.valotTotal = valotTotal;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Venda [operacao=" + operacao + ", cliente=" + cliente + ", quantidadeIngressos=" + quantidadeIngressos
				+ ", valotTotal=" + valotTotal + ", status=" + status + "]";
	}
}
