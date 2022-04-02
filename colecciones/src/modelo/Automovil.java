package modelo;

public class Automovil extends Terrestre {
	protected int puertas = 4;
	
	
	public Automovil(double capacidadCarga) {
		super("Gasolina", capacidadCarga, 2, 4);
				
	}

	public Automovil(String tipoMotor, double capacidadCarga, int capacidadPasajero, int cantRuedas) {
		super(tipoMotor, capacidadCarga, capacidadPasajero, cantRuedas);
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

	
	
		
	

}
