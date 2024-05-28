package datos;

import java.time.LocalDate;
import java.util.Set;

public class Venta {
	
	private int idVenta;
	
	private LocalDate fecha;
	
	private String cliente;
	
	private float descuento;
	
	private Set<ItemVenta> setItems;

	public Venta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Venta(LocalDate fecha,String cliente, float descuento, Set<ItemVenta> setItems) {
		super();
		this.fecha = fecha;
		this.descuento = descuento;
		this.setItems = setItems;
		this.cliente=cliente;
	}

	public int getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public float getDescuento() {
		return descuento;
	}

	public void setDescuento(float descuento) {
		this.descuento = descuento;
	}

	public Set<ItemVenta> getSetItems() {
		return setItems;
	}

	public void setSetItems(Set<ItemVenta> setItems) {
		this.setItems = setItems;
	}

	public float calcularTotal() {
		float total=0;
		for (ItemVenta itemVenta : setItems) {
			total+=itemVenta.calcularTotalItem();
		}
		return total;
	}
	public float calcularTotalAPagar() {
		float total=calcularTotal()-descuento;
		return total;
	}
	public void calcularDescuento502daMax6() {
		float total=0;
		for (ItemVenta itemVenta : setItems) {
			total=total+itemVenta.calcularDescuento502daMax6();
		}
		descuento=total;
	}
	@Override
	public String toString() {
		return "Venta [idVenta=" + idVenta + ", fecha=" + fecha + ", cliente=" + cliente + ", descuento=" + descuento + "]";
	}
	
	
}
