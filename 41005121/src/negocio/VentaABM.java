package negocio;

import java.util.List;

import dao.VentaDao;
import datos.Venta;

public class VentaABM {
	private static VentaABM instancia = null; // Patrón Singleton

	protected VentaABM() {
	}

	public static VentaABM getInstance() {
		if (instancia == null)
			instancia = new VentaABM();
		return instancia;
	}
	
	public Venta traer(int id) {
		return VentaDao.getInstance().traer(id);

	}
	public List<Venta> traer() {
		return VentaDao.getInstance().traer();
	}
	public int agregar(Venta objeto) {
		objeto.calcularDescuento502daMax6();
		return VentaDao.getInstance().agregar(objeto);
	}
}
