package modelo;

public class Automovil extends Terrestre {

	protected int puertas = 4;
	
	
	public Automovil(double capacidadCarga, int avaluo) {
		super("Gasolina", capacidadCarga, 2, 4, avaluo);
				
	}

	public Automovil(String tipoMotor, double capacidadCarga, int capacidadPasajero, int cantRuedas, int avaluo) {
		super(tipoMotor, capacidadCarga, capacidadPasajero, cantRuedas, avaluo);
		this.puertas = puertas;
	}

	@Override
	public void trasladarse() {
		//super.trasladarse();//print de system de trasladarse
		System.out.println("Automovil: trasladandose...");
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	@Override
	public String toString() {
		return String.format("Automovil Avaluado en : %d, con Capacidad de carga de %.2f kg y con motor %s",avaluo, capacidadCarga, tipoMotor);
	}

	
	
		
	

}
