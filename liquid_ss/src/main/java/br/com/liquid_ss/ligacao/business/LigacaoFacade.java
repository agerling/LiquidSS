package br.com.liquid_ss.ligacao.business;

import br.com.liquid_ss.model.Pessoa;

public class LigacaoFacade {

	// TODO - Retirado Implements para Teste de DAO
	
	public Pessoa incluirPessoa(Pessoa pessoa) {
		return getPessoaRN().incluirPessoa(pessoa);
	}
	
	public Pessoa alterarPessoa(Pessoa pessoa) {
		return getPessoaRN().alterarPessoa(pessoa);
	}
	
	
	private PessoaRN getPessoaRN(){
		return new PessoaRN();
	}

}
