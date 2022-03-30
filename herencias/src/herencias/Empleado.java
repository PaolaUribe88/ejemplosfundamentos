package herencias;

public class Empleado {//SUPER CLASE DE DOCENTE
    private String nombre;
    protected String rut;    
    protected int sueldo;
    
    public Empleado(
            String nombre, 
            String rut, 
            int sueldo) {
        this.nombre = nombre;
        this.rut    = rut;
        this.sueldo = sueldo; 
    }
 
    public String getNombre(){
        return this.nombre;
    }
    public String setNombre() {
    	return nombre;
    }

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}
    
 
// continuar la implementación ...
}
