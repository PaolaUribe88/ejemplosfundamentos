package modelo;

public class Moto extends Terrestre{

	protected String ppu;
	
	//CONSTRUCTORES
	
	public Moto(double capacidadCarga, int avaluo, String ppu) {
		super("Gasolina", capacidadCarga, 2, 2, avaluo);
		this.ppu = ppu;
	}
	public Moto(String tipoMotor, double capacidadCarga, int capacidadPasajero, int cantRuedas, int avaluo) {
		super("Gasolina", capacidadCarga, 2, 2, avaluo);
		this.tipoMotor = tipoMotor;
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
		if( ! (obj instanceof Moto)) {
			return false;
		}	
		
		//casteo () el parametro obj a Moto
		//y lo asigno a la variable otraMoto
		Moto otraMoto = (Moto) obj;		
		
		//COMPARO LAS PLACAS PATENTES
		return this.ppu.equalsIgnoreCase(otraMoto.getPpu());
	}
	@Override
	public String toString() {
		return String.format("Moto PPU : %s avaluado en $%,d, con capacida de carga de %.2f kg y con motor a %s", ppu, avaluo, capacidadCarga, tipoMotor);
	}

	@Override
	public void trasladarse() {
		//super.trasladarse();
		System.out.println("Moto: trasladandose...");
	}
	//================================================================================================================================

	// GETTERS Y SETTERS
	public String getPpu() {
		return ppu;
	}

	public void setPpu(String ppu) {
		this.ppu = ppu;
	}
	
}
