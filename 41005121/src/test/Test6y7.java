package test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import datos.Audio;
import datos.ItemVenta;
import datos.Venta;
import negocio.AudioABM;
import negocio.VentaABM;

public class Test6y7 {
	public static void main(String[] args) {
		Audio a1 = AudioABM.getInstance().traer(1);
		Audio a2 = AudioABM.getInstance().traer(3);
		Set<ItemVenta> set = new HashSet<ItemVenta>();
		set.add(new ItemVenta(a1, 1));
		set.add(new ItemVenta(a2, 11));
		Venta ventaToPersist = new Venta(LocalDate.of(2024, 5, 24), "Alejandro Rosales", 0, set);
		int id = VentaABM.getInstance().agregar(ventaToPersist);
		Venta venta = VentaABM.getInstance().traer(id);
		System.out.println(venta);
		for (ItemVenta item : venta.getSetItems()) {
			System.out.println(item + ", subtotalItem= $" + item.calcularTotalItem());
		}
		System.out.println("Total=$"+venta.calcularTotal());
		System.out.println("Descuento=$"+venta.getDescuento());
		System.out.println("Total a pagar=$"+venta.calcularTotalAPagar());
	}
}
