package modelo;

public abstract class Transporte implements Comparable<Transporte> {
	protected String tipoMotor;
	protected double capacidadCarga;
	protected int capacidadPasajero;
	protected int avaluo;
	//METODOS
	public void trasladarse(){
		System.out.println("Transporte: trasladandose...");
	}
	
	
	public Transporte(String tipoMotor, double capacidadCarga, int capacidadPasajero, int avaluo) {
		super();
		this.tipoMotor = tipoMotor;
		this.capacidadCarga = capacidadCarga;
		this.capacidadPasajero = capacidadPasajero;
		this.avaluo = avaluo;
	}

	@Override
	public int compareTo(Transporte otroTransporte) {
		if (this.avaluo > otroTransporte.getAvaluo()) {
			return -1;
		}else if (this.avaluo < otroTransporte.getAvaluo()) {
			return 1;
		}else {
		return 0;
	}
	
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


	public int getAvaluo() {
		return avaluo;
	}


	public void setAvaluo(int avaluo) {
		this.avaluo = avaluo;
	}
	
}
