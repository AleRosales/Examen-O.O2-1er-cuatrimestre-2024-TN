package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.lang.reflect.ParameterizedType;

public abstract class Dao<T> {

	private Class<T> clasePersistente;
	protected static Session session;
	protected Transaction tx;

	@SuppressWarnings("unchecked")
	protected Dao() {
		this.clasePersistente = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass())
				.getActualTypeArguments()[0];
	}

	public Class<T> getClasePersistente() {
		return clasePersistente;
	}

	protected void iniciaOperacion() throws HibernateException {

		session = HibernateUtil.getSessionFactory().openSession();
		tx = session.beginTransaction();
	}

	protected void manejaExcepcion(HibernateException he) throws HibernateException {
		tx.rollback();
		throw new HibernateException("ERROR en la capa de acceso a datos", he);
	}

	public T traer(int id) {
		T objeto = null;
		try {
			iniciaOperacion();
			objeto =  session.get(getClasePersistente(), id);

		} finally {
			session.close();
		}
		return objeto;
	}
}