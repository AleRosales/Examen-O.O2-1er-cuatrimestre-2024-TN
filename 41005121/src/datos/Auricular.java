package datos;

public class Auricular extends Audio{
	
	protected String tipoUso;
	
	protected boolean microfonoIncorporado;

	public Auricular() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Auricular(String codigo, String descripcion, String marca, boolean bluetooth, double precio,String tipoUso, boolean microfonoIncorporado) {
		super(codigo, descripcion, marca, bluetooth, precio);
		this.tipoUso = tipoUso;
		this.microfonoIncorporado = microfonoIncorporado;	
	}

	public String getTipoUso() {
		return tipoUso;
	}

	public void setTipoUso(String tipoUso) {
		this.tipoUso = tipoUso;
	}

	public boolean isMicrofonoIncorporado() {
		return microfonoIncorporado;
	}

	public void setMicrofonoIncorporado(boolean microfonoIncorporado) {
		this.microfonoIncorporado = microfonoIncorporado;
	}

	@Override
	public String toString() {
		return "Auricular ["+super.toString()+", tipoUso=" + tipoUso + ", microfonoIncorporado=" + microfonoIncorporado + "]";
	}
	
	
}
