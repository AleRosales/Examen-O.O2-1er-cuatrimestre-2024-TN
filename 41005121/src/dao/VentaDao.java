package dao;

import java.util.List;
import java.util.Set;

import org.hibernate.HibernateException;

import datos.ItemVenta;
import datos.Venta;

public class VentaDao extends Dao<Venta> {
	private static VentaDao instancia = null; // Patrón Singleton

	protected VentaDao() {
	}

	public static VentaDao getInstance() {
		if (instancia == null)
			instancia = new VentaDao();
		return instancia;
	}

	public Venta traer(int idVenta) {
		Venta objeto = null;
		try {
			iniciaOperacion();
			objeto = session
					.createQuery("from Venta v left join fetch v.setItems it where v.idVenta=:idVenta", Venta.class)
					.setParameter("idVenta", idVenta).uniqueResult();

		} finally {
			session.close();
		}
		return objeto;
	}

	public List<Venta> traer() throws HibernateException {
		List<Venta> lista = null;
		try {
			iniciaOperacion();
			lista = session.createQuery("from Venta", Venta.class).list();
		} finally {
			session.close();
		}
		return lista;
	}

	public int agregar(Venta objeto) {
		int id = 0;
		try {
			iniciaOperacion();
			Set<ItemVenta> items=objeto.getSetItems();
			objeto.setSetItems(null);
			id = Integer.parseInt(session.save(objeto).toString());
			Venta venta=session.find(Venta.class,id);
			for (ItemVenta itemVenta : items) {
				itemVenta.setVenta(venta);
				agregarItem(itemVenta);
			}
			tx.commit();
		} catch (HibernateException he) {
			manejaExcepcion(he);
			throw he;
		} finally {
			session.close();
		}
		return id;
	}
	public int agregarItem(ItemVenta itemVenta) {
		int id = 0;
		try {
			id = Integer.parseInt(session.save(itemVenta).toString());
		} catch (HibernateException he) {
			manejaExcepcion(he);
			throw he;
		}
		return id;
	}
}
