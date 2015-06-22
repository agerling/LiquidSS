package br.com.liquid_ss.core;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {

	private static EntityManagerFactory factory;

	static {
		factory = Persistence.createEntityManagerFactory("DaePU");
	}

	public static EntityManager getEntityManager() {
		return factory.createEntityManager();
	}

}
