package datos;

public class ItemVenta {
	
	private int idItemVenta;
	
	private Venta venta;
	
	private Audio audio;
	
	private int cantidad;

	public ItemVenta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ItemVenta( Audio audio, int cantidad) {
		super();
		this.audio = audio;
		this.cantidad = cantidad;
	}

	public int getIdItemVenta() {
		return idItemVenta;
	}

	public void setIdItemVenta(int idItemVenta) {
		this.idItemVenta = idItemVenta;
	}

	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}

	public Audio getAudio() {
		return audio;
	}

	public void setAudio(Audio audio) {
		this.audio = audio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public float calcularTotalItem() {
		return (float) (cantidad*audio.getPrecio());
	}
	public float calcularDescuento502daMax6() {
		float total=0;
		float descuento=(float) (audio.getPrecio()/2);
		if(cantidad<=6) {
			total=descuento*((int)cantidad/2);
		}else {
			total=descuento*3;
		}
		return total;
	}
	@Override
	public String toString() {
		return "ItemVenta [idItemVenta=" + idItemVenta + ", audio=" + audio + ", cantidad="
				+ cantidad + "]";
	}


	
	
}
