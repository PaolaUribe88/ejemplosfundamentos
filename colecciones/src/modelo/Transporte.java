package modelo;

public abstract class Transporte {
	protected String tipoMotor;
	protected double capacidadCarga;
	protected int capacidadPasajero;
	
	//METODOS
	public void trasladarse(){
		System.out.println("Transporte: trasladandose...");
	}
	
	
	
	public Transporte(String tipoMotor, double capacidadCarga, int capacidadPasajero) {
		super();
		this.tipoMotor = tipoMotor;
		this.capacidadCarga = capacidadCarga;
		this.capacidadPasajero = capacidadPasajero;
	}

	
	
	//getter y setters
	public String getTipoMotor() {
		return tipoMotor;
	}

	public void setTipoMotor(String tipoMotor) {
		this.tipoMotor = tipoMotor;
	}

	public double getCapacidadCarga() {
		return capacidadCarga;
	}

	public void setCapacidadCarga(double capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}

	public int getCapacidadPasajero() {
		return capacidadPasajero;
	}

	public void setCapacidadPasajero(int capacidadPasajero) {
		this.capacidadPasajero = capacidadPasajero;
	}
	
}
