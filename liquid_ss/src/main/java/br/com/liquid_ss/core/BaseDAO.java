package br.com.liquid_ss.core;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * 
 * @author Adriano
 * 
 *         Classe que cria funcionalidades de CRUD e retorna a conexão com o DB
 *
 */
public class BaseDAO<T> implements GenericDAO<T> {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("DaePU");

	EntityManager entityManager = factory.createEntityManager();

	
	@Override
	public T incluir(T objeto) {
		
		getEntityManager().getTransaction().begin();    
		getEntityManager().persist(objeto);
		getEntityManager().getTransaction().commit();
		
		getEntityManager().close();
		getFactory().close();
		
		return objeto;
	}

	@Override
	public void selecionar(T objeto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T alterar(T objeto) {
		getEntityManager().getTransaction().begin(); 
		getEntityManager().merge(objeto);
		getEntityManager().getTransaction().commit();
		
		getEntityManager().close();
		getFactory().close();
		
		return objeto;
	}

	@Override
	public void excluir(T objeto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removerPersistencia(T objeto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fecharConexao() {
		// TODO Auto-generated method stub
		
	}

	public EntityManagerFactory getFactory() {
		return factory;
	}

	public void setFactory(EntityManagerFactory factory) {
		this.factory = factory;
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	
	
}
