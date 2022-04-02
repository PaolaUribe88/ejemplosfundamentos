package modelo;

public class Bicicleta extends Terrestre {

	public Bicicleta(String tipoMotor, double capacidadCarga, int capacidadPasajero, int cantRuedas) {
		super(tipoMotor, capacidadCarga, capacidadPasajero, cantRuedas);
	
	}

	@Override
	public void trasladarse() {
		//super.trasladarse();
		System.out.println("Bicicleta : trasladandose...");
	}
	
}
