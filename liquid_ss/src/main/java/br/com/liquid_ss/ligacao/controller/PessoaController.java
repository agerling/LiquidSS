package br.com.liquid_ss.ligacao.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

import br.com.liquid_ss.ligacao.business.LigacaoFacade;
import br.com.liquid_ss.model.Pessoa;

@ManagedBean
@ViewScoped
public class PessoaController {

	private Pessoa pessoa;
	private LigacaoFacade ligacaoFacade;

	@PostConstruct
	public void iniciar() {
		pessoa = new Pessoa();
		ligacaoFacade = new LigacaoFacade();
	}

	public void gravar() {
		pessoa = ligacaoFacade.incluirPessoa(pessoa);
	}
	
	public void alterar() {
		pessoa = ligacaoFacade.alterarPessoa(pessoa);
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public LigacaoFacade getLigacaoFacade() {
		return ligacaoFacade;
	}

	public void setLigacaoFacade(LigacaoFacade ligacaoFacade) {
		this.ligacaoFacade = ligacaoFacade;
	}

}
