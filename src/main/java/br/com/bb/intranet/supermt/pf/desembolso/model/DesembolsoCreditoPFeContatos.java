package br.com.bb.intranet.supermt.pf.desembolso.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="desembolsoCreditoPFeContatos")
public class DesembolsoCreditoPFeContatos implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="grupo", length = 2)
	private char grupo;
	
	@NotEmpty
	@Size(max = 5)
	@Column(nullable = false, length = 5)
	private String prefixoSuperintendencia;
	
	@NotEmpty
	@Size(max = 150)
	@Column(length = 150)
	private String nomeSuperintendencia;
	
	@NotEmpty
	@Size(max = 5)
	@Column(nullable = false, length = 5)
	private String prefixoRegional;
	
	@NotEmpty
	@Size(max = 150)
	@Column(length = 150)
	private String nomeRegional;
	
	@NotEmpty
	@Size(max = 5)
	@Column(nullable = false, length = 5)
	private String prefixoAgencia;
	
	@NotEmpty
	@Size(max = 150)
	@Column(length = 150)
	private String nomeAgencia;
	
	
	@Column(precision = 30, scale = 12)
	private BigDecimal orcamentoPropostoAcumulado;
	
	@Column(precision = 30, scale = 12)
	private BigDecimal realizadoAtual;
	
	@Column(precision = 30, scale = 12)
	private BigDecimal percentualAtingimentoUm;
	
	@Column(precision = 30, scale = 12)
	private BigDecimal realizadoDmenosUm;
	
	@Column(precision = 30, scale = 12)
	private BigDecimal necessidadeDiaDmenosUm;
	
	@Column(precision = 30, scale = 12)
	private BigDecimal metaContatosAcumulada;
	
	@Column(precision = 30, scale = 12)
	private BigDecimal realizadoContatosMes;
	
	@Column(precision = 30, scale = 12)
	private BigDecimal percentualAtingimentoContatos;
	
	@Column(precision = 30, scale = 12)
	private BigDecimal contatosDmenosUm;
	
	@Column(precision = 30, scale = 12)
	private BigDecimal contatosDmenosDois;
	
	@NotEmpty
	@Size(max = 5)
	@Column(nullable = false, length = 5)
	private String prefixoRepete;
	
	@NotEmpty
	@Size(max = 150)
	@Column(length = 150)
	private String agenciaRepete;
	
	@Column(length = 10)
	private Integer codigoCarteira;
	
	@Column(nullable = false, length = 80)
	private String carteira;
	
	@Column(precision = 30, scale = 12)
	private BigDecimal orcamentoProporcionalAcumuladoDois;
	
	@Column(precision = 30, scale = 12)
	private BigDecimal realizadoAtualDois;
	
	@Column(precision = 30, scale = 12)
	private BigDecimal percentualAgintimentoDois;
	
	@Column(precision = 30, scale = 12)
	private BigDecimal metaContatosAcumuladaDois;
	
	@Column(precision = 30, scale = 12)
	private BigDecimal realizadoContatosMesDois;
	
	@Column(length = 5)
	private Integer percentualAtingimentoContatosDois;

	protected Long getId() {
		return id;
	}

	protected void setId(Long id) {
		this.id = id;
	}

	protected char getGrupo() {
		return grupo;
	}

	protected void setGrupo(char grupo) {
		this.grupo = grupo;
	}

	protected String getPrefixoSuperintendencia() {
		return prefixoSuperintendencia;
	}

	protected void setPrefixoSuperintendencia(String prefixoSuperintendencia) {
		this.prefixoSuperintendencia = prefixoSuperintendencia;
	}

	protected String getNomeSuperintendencia() {
		return nomeSuperintendencia;
	}

	protected void setNomeSuperintendencia(String nomeSuperintendencia) {
		this.nomeSuperintendencia = nomeSuperintendencia;
	}

	protected String getPrefixoRegional() {
		return prefixoRegional;
	}

	protected void setPrefixoRegional(String prefixoRegional) {
		this.prefixoRegional = prefixoRegional;
	}

	protected String getNomeRegional() {
		return nomeRegional;
	}

	protected void setNomeRegional(String nomeRegional) {
		this.nomeRegional = nomeRegional;
	}

	protected String getPrefixoAgencia() {
		return prefixoAgencia;
	}

	protected void setPrefixoAgencia(String prefixoAgencia) {
		this.prefixoAgencia = prefixoAgencia;
	}

	protected String getNomeAgencia() {
		return nomeAgencia;
	}

	protected void setNomeAgencia(String nomeAgencia) {
		this.nomeAgencia = nomeAgencia;
	}

	protected BigDecimal getOrcamentoPropostoAcumulado() {
		return orcamentoPropostoAcumulado;
	}

	protected void setOrcamentoPropostoAcumulado(BigDecimal orcamentoPropostoAcumulado) {
		this.orcamentoPropostoAcumulado = orcamentoPropostoAcumulado;
	}

	protected BigDecimal getRealizadoAtual() {
		return realizadoAtual;
	}

	protected void setRealizadoAtual(BigDecimal realizadoAtual) {
		this.realizadoAtual = realizadoAtual;
	}

	protected BigDecimal getPercentualAtingimentoUm() {
		return percentualAtingimentoUm;
	}

	protected void setPercentualAtingimentoUm(BigDecimal percentualAtingimentoUm) {
		this.percentualAtingimentoUm = percentualAtingimentoUm;
	}

	protected BigDecimal getRealizadoDmenosUm() {
		return realizadoDmenosUm;
	}

	protected void setRealizadoDmenosUm(BigDecimal realizadoDmenosUm) {
		this.realizadoDmenosUm = realizadoDmenosUm;
	}

	protected BigDecimal getNecessidadeDiaDmenosUm() {
		return necessidadeDiaDmenosUm;
	}

	protected void setNecessidadeDiaDmenosUm(BigDecimal necessidadeDiaDmenosUm) {
		this.necessidadeDiaDmenosUm = necessidadeDiaDmenosUm;
	}

	protected BigDecimal getMetaContatosAcumulada() {
		return metaContatosAcumulada;
	}

	protected void setMetaContatosAcumulada(BigDecimal metaContatosAcumulada) {
		this.metaContatosAcumulada = metaContatosAcumulada;
	}

	protected BigDecimal getRealizadoContatosMes() {
		return realizadoContatosMes;
	}

	protected void setRealizadoContatosMes(BigDecimal realizadoContatosMes) {
		this.realizadoContatosMes = realizadoContatosMes;
	}

	protected BigDecimal getPercentualAtingimentoContatos() {
		return percentualAtingimentoContatos;
	}

	protected void setPercentualAtingimentoContatos(BigDecimal percentualAtingimentoContatos) {
		this.percentualAtingimentoContatos = percentualAtingimentoContatos;
	}

	protected BigDecimal getContatosDmenosUm() {
		return contatosDmenosUm;
	}

	protected void setContatosDmenosUm(BigDecimal contatosDmenosUm) {
		this.contatosDmenosUm = contatosDmenosUm;
	}

	protected BigDecimal getContatosDmenosDois() {
		return contatosDmenosDois;
	}

	protected void setContatosDmenosDois(BigDecimal contatosDmenosDois) {
		this.contatosDmenosDois = contatosDmenosDois;
	}

	protected String getPrefixoRepete() {
		return prefixoRepete;
	}

	protected void setPrefixoRepete(String prefixoRepete) {
		this.prefixoRepete = prefixoRepete;
	}

	protected String getAgenciaRepete() {
		return agenciaRepete;
	}

	protected void setAgenciaRepete(String agenciaRepete) {
		this.agenciaRepete = agenciaRepete;
	}

	protected Integer getCodigoCarteira() {
		return codigoCarteira;
	}

	protected void setCodigoCarteira(Integer codigoCarteira) {
		this.codigoCarteira = codigoCarteira;
	}

	protected String getCarteira() {
		return carteira;
	}

	protected void setCarteira(String carteira) {
		this.carteira = carteira;
	}

	protected BigDecimal getOrcamentoProporcionalAcumuladoDois() {
		return orcamentoProporcionalAcumuladoDois;
	}

	protected void setOrcamentoProporcionalAcumuladoDois(BigDecimal orcamentoProporcionalAcumuladoDois) {
		this.orcamentoProporcionalAcumuladoDois = orcamentoProporcionalAcumuladoDois;
	}

	protected BigDecimal getRealizadoAtualDois() {
		return realizadoAtualDois;
	}

	protected void setRealizadoAtualDois(BigDecimal realizadoAtualDois) {
		this.realizadoAtualDois = realizadoAtualDois;
	}

	protected BigDecimal getPercentualAgintimentoDois() {
		return percentualAgintimentoDois;
	}

	protected void setPercentualAgintimentoDois(BigDecimal percentualAgintimentoDois) {
		this.percentualAgintimentoDois = percentualAgintimentoDois;
	}

	protected BigDecimal getMetaContatosAcumuladaDois() {
		return metaContatosAcumuladaDois;
	}

	protected void setMetaContatosAcumuladaDois(BigDecimal metaContatosAcumuladaDois) {
		this.metaContatosAcumuladaDois = metaContatosAcumuladaDois;
	}

	protected BigDecimal getRealizadoContatosMesDois() {
		return realizadoContatosMesDois;
	}

	protected void setRealizadoContatosMesDois(BigDecimal realizadoContatosMesDois) {
		this.realizadoContatosMesDois = realizadoContatosMesDois;
	}

	protected Integer getPercentualAtingimentoContatosDois() {
		return percentualAtingimentoContatosDois;
	}

	protected void setPercentualAtingimentoContatosDois(Integer percentualAtingimentoContatosDois) {
		this.percentualAtingimentoContatosDois = percentualAtingimentoContatosDois;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DesembolsoCreditoPFeContatos other = (DesembolsoCreditoPFeContatos) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
	
	
}
