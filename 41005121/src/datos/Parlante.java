package datos;

public class Parlante extends Audio{
	
	private int potencia;
	
	private int entradasUSB;
	
	private boolean wifi;

	public Parlante() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Parlante(String codigo, String descripcion, String marca, boolean bluetooth, double precio,int potencia, int entradasUSB, boolean wifi) {
		super( codigo, descripcion, marca, bluetooth, precio);
		this.potencia = potencia;
		this.entradasUSB = entradasUSB;
		this.wifi = wifi;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getEntradasUSB() {
		return entradasUSB;
	}
	public void setEntradasUSB(int entradasUSB) {
		this.entradasUSB = entradasUSB;
	}
	public boolean isWifi() {
		return wifi;
	}
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}
	@Override
	public String toString() {
		return "Parlante ["+super.toString()+", potencia=" + potencia + ", entradaUSB=" + entradasUSB + ", wifi=" + wifi + "]";
	}
	
	
}
