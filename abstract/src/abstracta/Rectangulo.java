package abstracta;

public class Rectangulo extends Figura {
	private double alto;
	private double base;
	
	public Rectangulo() {
	
	}

	public Rectangulo(double alto, double base) {
		
		this.alto = alto;
		this.base = base;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	@Override
	double calcularArea() {
	//METODO EN CLASE
		return this.base * this.alto;
		
	}

	@Override
	double calcularPerimetro() {
		
		return this.base*2 + this.alto*2;
	}
	
	
	
}
