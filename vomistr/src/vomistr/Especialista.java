package vomistr;

public class Especialista {
	
	private String rutEspecialista;
	private String nombreEspecialista;
	
	public Especialista() {
		
	}

	public Especialista(String rutEspecialista, String nombreEspecialista) {
		this.rutEspecialista = rutEspecialista;
		this.nombreEspecialista = nombreEspecialista;
	}

	public String getRutEspecialista() {
		return rutEspecialista;
	}

	public void setRutEspecialista(String rutEspecialista) {
		this.rutEspecialista = rutEspecialista;
	}

	public String getNombreEspecialista() {
		return nombreEspecialista;
	}

	public void setNombreEspecialista(String nombreEspecialista) {
		this.nombreEspecialista = nombreEspecialista;
	}
	
	
	

}
