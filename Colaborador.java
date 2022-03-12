
public class Colaborador {
	
	//propiedades
	private String nombre;
	private int sueldoBase;
	private String afp;
	//fin propiedades

	//Constructor 1
	public Colaborador(String nombre, int sueldoBase) {// contructor solicita dos parametros
		this.nombre = nombre;
		this.sueldoBase = sueldoBase;
	}
	
	//Constructor 2
	public Colaborador() {//constructor en blanco, no solicita parametros solo genera instancia en memoria
	}
		
		public int calcularMontoAfp() {
			// validar la afp
			String[] afpsValidas = conseguirListaAfps();
			// ...... codigo que hace la validacion
			// ......
	
		switch(afp){
			case "habitat":
				return (int) (sueldoBase* 0.1127);
			case "cuprum":
				return (int) (sueldoBase * 0.1144);
				default:
					return 0;
			}
	}


	//Getters
	public String getAfp() {
		return afp;
	} 
	public String getNombre() {
		return nombre;
	}
	public int getSueldoBase() {
		return sueldoBase;
	}
	
	//SETTERS
	public void setSueldoBase(int sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	private String[] conseguirListaAfps() {
		return new String[]{
		"modelo",
		"cuprum",
		"habitat"
		// etc
		};
	}
}
