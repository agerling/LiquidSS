package br.com.liquid_ss.core;

public interface GenericDAO<T>  {

	T incluir(T objeto);
	
	void selecionar(T objeto);
	
	T alterar(T objeto);
	
	void excluir(T objeto);
	
	void removerPersistencia(T objeto);
	
	void fecharConexao();
}
