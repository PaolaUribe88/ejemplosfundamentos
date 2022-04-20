
public class Bodega {
	private int id;
	private String nombre;
	private boolean estado;
	
	//CONSTRUCTOR VACIO
	public Bodega() {
		super();
	}
	//CONSTRUCTOR
	public Bodega(int id, String nombre, boolean estado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.estado = estado;
	}

	//GETTER Y SETTERS
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	

}
