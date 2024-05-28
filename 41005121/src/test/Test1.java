package test;

import java.util.List;

import datos.Venta;
import negocio.VentaABM;

public class Test1 {
	public static void main(String[] args) {
		List<Venta> ventas=VentaABM.getInstance().traer();
		for (Venta venta : ventas) {
			System.out.println(venta);
		}
	}
}
