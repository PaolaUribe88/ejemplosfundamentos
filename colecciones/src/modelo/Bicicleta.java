package modelo;

public class Bicicleta extends Terrestre {

	public Bicicleta(String tipoMotor, double capacidadCarga, int capacidadPasajero, int cantRuedas, int avaluo) {
		super(tipoMotor, capacidadCarga, capacidadPasajero, cantRuedas, avaluo);
	
	}

	@Override
	public void trasladarse() {
		//super.trasladarse();
		System.out.println("Bicicleta : trasladandose...");
	}
	//Metodo to 

	@Override
	public String toString() {
		return String.format("Bicicleta Avaluada en : %d, con Capacidad de carga de %.2f kg ", avaluo, capacidadCarga);
	}
	
	
}
