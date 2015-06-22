package br.com.liquid_ss.ligacao.business;

import java.util.Date;

import br.com.liquid_ss.model.Pessoa;

class PessoaRN {

	public Pessoa incluirPessoa(Pessoa pessoa){
    	
		validarPessoa(pessoa);
		pessoa = getPessoaDAO().incluir(pessoa);
		
		return pessoa;
    }
	
	public Pessoa alterarPessoa(Pessoa pessoa){
    	
		validarPessoa(pessoa);
		pessoa = getPessoaDAO().alterar(pessoa);
		
		return pessoa;
    }
	
	
	private void validarPessoa(Pessoa pessoa){
	
		//Inclusão
		if(pessoa.getPkPessoa() == null){
			//TODO - Substituir por usuário Logado (Contexto de Sessão)
			pessoa.setCriadoPor(1);
			pessoa.setDtCriacao(new Date());
		}else{
			//Alteração
			//TODO - Substituir por usuário Logado (Contexto de Sessão)
			pessoa.setAlteradoPor(99);
			pessoa.setDtAlteracao(new Date());
		}
	}
    
    private PessoaDAO getPessoaDAO(){
    	return new PessoaDAO();
    }
	
}
