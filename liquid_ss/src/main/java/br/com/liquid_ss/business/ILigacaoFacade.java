package br.com.liquid_ss.business;

import br.com.liquid_ss.model.Pessoa;

public interface ILigacaoFacade {
	
	public Pessoa incluirPessoa(Pessoa pessoa);
	
	public Pessoa alterarPessoa(Pessoa pessoa);

}
