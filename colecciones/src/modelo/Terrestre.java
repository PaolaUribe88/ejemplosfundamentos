package modelo;

public class Terrestre extends Transporte {
	//VARIABLES DE INSTANCIA O ATRIBUTOS O PROPIEDADES
	protected int cantRuedas;
	
	public Terrestre(String tipoMotor, double capacidadCarga, int capacidadPasajero, int cantRuedas) {
		super(tipoMotor, capacidadCarga, capacidadPasajero);
		this.cantRuedas = cantRuedas;
		
	}

	public int getCantRuedas() {
		return cantRuedas;
	}

	public void setCantRuedas(int cantRuedas) {
		this.cantRuedas = cantRuedas;
	}
		
}
