package br.com.liquid_ss.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "pessoa", schema = "daers")
@SequenceGenerator(name = "seqPkPessoa", sequenceName = "daers.seq_pk_pessoa", allocationSize = 1, initialValue = 1)
public class Pessoa {

	private Integer pkPessoa;
	private String nome;
	private String cpf;
	private String rg;
	private String ufrg;
	private String cnpj;
	private Date dtCriacao;
	private Integer criadoPor;
	private Date dtAlteracao;
	private Integer alteradoPor;
		
	private Integer version;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqPkPessoa")
	@Column(name = "pk_pessoa", nullable = false)
	public Integer getPkPessoa() {
		return pkPessoa;
	}

	public void setPkPessoa(Integer pkPessoa) {
		this.pkPessoa = pkPessoa;
	}

	@NotNull(message="Nome da Pessoa deve ser informado")
	@Column(name = "pessoa_nome", length = 100, nullable = false)
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name = "pessoa_cpf", length = 11)
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Column(name = "pessoa_rg", length = 20)
	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	@Column(name = "pessoa_uf_rg", length = 2)
	public String getUfrg() {
		return ufrg;
	}

	public void setUfrg(String ufrg) {
		this.ufrg = ufrg;
	}

	@Column(name = "pessoa_cnpj", length = 14)
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	

	@NotNull
	@Column(name = "pessoa_dt_criacao", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	public Date getDtCriacao() {
		return dtCriacao;
	}

	public void setDtCriacao(Date dtCriacao) {
		this.dtCriacao = dtCriacao;
	}

	@NotNull
	@Column(name = "pessoa_criado_por", nullable = false)
	public Integer getCriadoPor() {
		return criadoPor;
	}

	public void setCriadoPor(Integer criadoPor) {
		this.criadoPor = criadoPor;
	}

	@Column(name = "pessoa_dt_alteracao")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getDtAlteracao() {
		return dtAlteracao;
	}

	public void setDtAlteracao(Date dtAlteracao) {
		this.dtAlteracao = dtAlteracao;
	}

	@Column(name = "pessoa_alterado_por")
	public Integer getAlteradoPor() {
		return alteradoPor;
	}

	public void setAlteradoPor(Integer alteradoPor) {
		this.alteradoPor = alteradoPor;
	}

	@NotNull
	@Version
	@Column(name = "version", nullable = false)
	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((pkPessoa == null) ? 0 : pkPessoa.hashCode());
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

		Pessoa other = (Pessoa) obj;

		if (pkPessoa == null) {
			if (other.pkPessoa != null)
				return false;
		} else if (!pkPessoa.equals(other.pkPessoa))
			return false;
		return true;
	}

	
}

