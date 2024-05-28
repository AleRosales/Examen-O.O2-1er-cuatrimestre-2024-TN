package datos;

public abstract class Audio {
	
	private int idAudio;
	
	private String codigo;
	
	private String descripcion;
	
	private String marca;
	
	private boolean bluetooth;
	
	private double precio;

	public Audio() {
		super();
	}

	public Audio(String codigo, String descripcion, String marca, boolean bluetooth, double precio) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.marca = marca;
		this.bluetooth = bluetooth;
		this.precio = precio;
	}

	public int getIdAudio() {
		return idAudio;
	}

	public void setIdAudio(int idAudio) {
		this.idAudio = idAudio;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public boolean isBluetooth() {
		return bluetooth;
	}

	public void setBluetooth(boolean bluetooth) {
		this.bluetooth = bluetooth;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "idAudio=" + idAudio + ", codigo=" + codigo + ", descripcion=" + descripcion + ", marca=" + marca
				+ ", bluetooth=" + bluetooth + ", precio=" + precio ;
	}
	
	

}
