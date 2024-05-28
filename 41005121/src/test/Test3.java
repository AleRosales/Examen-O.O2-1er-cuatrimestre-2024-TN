package test;

import datos.ItemVenta;
import datos.Venta;
import negocio.VentaABM;

public class Test3 {
	public static void main(String[] args) {
		Venta venta=VentaABM.getInstance().traer(2);
		System.out.println(venta);
		for (ItemVenta item : venta.getSetItems()) {
			System.out.println(item+", subtotalItem= $"+item.calcularTotalItem());
		}
		System.out.println("Total=$"+venta.calcularTotal());
		System.out.println("Descuento=$"+venta.getDescuento());
		System.out.println("Total a pagar=$"+venta.calcularTotalAPagar());

		
	}
}
