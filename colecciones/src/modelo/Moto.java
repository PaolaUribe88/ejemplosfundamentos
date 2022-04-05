package modelo;

public class Moto extends Terrestre{

	public Moto(String tipoMotor, double capacidadCarga, int capacidadPasajero, int cantRuedas, int avaluo) {
		super(tipoMotor, capacidadCarga, capacidadPasajero, cantRuedas, avaluo);
		this.tipoMotor = "no tiene";
	}

	@Override
	public void trasladarse() {
		//super.trasladarse();
		System.out.println("Moto: trasladandose...");
	}
	
}
