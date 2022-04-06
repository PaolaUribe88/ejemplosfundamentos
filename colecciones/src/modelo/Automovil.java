package modelo;

public class Automovil extends Terrestre {

	protected String ppu;
	protected int puertas = 4;

	//CONSTRUCTORES
	public Automovil(String tipoMotor, double capacidadCarga, int capacidadPasajero, int cantRuedas, int avaluo,
			String ppu, int puertas) {
		super("gasolina", capacidadCarga, 2, 4, avaluo);
		this.ppu = ppu;
		
	}

	public Automovil(double capacidadCarga, int avaluo) {		
		super("gasolina", capacidadCarga, 2, 4, avaluo);
	}
	
	public Automovil(double capacidadCarga, int avaluo,String ppu) {		
		super("gasolina", capacidadCarga, 2, 4, avaluo);
		this.ppu = ppu;
	}
	public Automovil(double capacidadCarga) {		
		super("gasolina", capacidadCarga, 2, 4);
	}

	public Automovil(String tipoMotor, double capacidadCarga, int capacidadPasajeros, int cantRuedas, int puertas, int avaluo) {
		super(tipoMotor, capacidadCarga, capacidadPasajeros, cantRuedas, avaluo);
		this.puertas = puertas;
	}
	//================================================================================================================================
	@Override
	public int hashCode() {
		//convierto todo a mayuscula antes de generar el Hash
		return ppu.toUpperCase().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		//si objeto no(!) es una instancia de la clase Moto
		if( ! (obj instanceof Automovil)) {
			return false;
		}	
		
		//casteo () el parametro obj a Moto
		//y lo asigno a la variable otraMoto
		Automovil otroAuto = (Automovil) obj;		
		
		//COMPARO LAS PLACAS PATENTES
		return this.ppu.equalsIgnoreCase(otroAuto.getPpu());
	}

	@Override
	public void trasladarse() {
		// super.trasladarse(); // print "Transporte: trasladándose....."
		System.out.println("Automovil: trasladándose ...");
	}
	//================================================================================================================================
	
	// GETTERS Y SETTERS
	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	public String getPpu() {
		return ppu;
	}

	public void setPpu(String ppu) {
		this.ppu = ppu;
	}

	@Override
	public String toString() {
		return String.format("Automovil PPU: %s avaluado en $%,d, con capacida de carga de %.2f kg y con motor a %s", ppu, avaluo, capacidadCarga, tipoMotor);
	}


	
	
}
