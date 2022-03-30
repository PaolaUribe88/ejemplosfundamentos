package abstracta;

public class Circulo extends Figura{
	
	private double diametro;
	//Constructores
	public Circulo() {
		
	}
	
	public Circulo(double diametro) {
		
		this.diametro = diametro;
	}
	//Metodos
	@Override
	double calcularArea() {
		double radio = this.calcularRadio();
		return Math.PI * Math.pow(radio,2);
	}
	public double calcularRadio() {
		return this.diametro / 2;
	}
	@Override
	public double calcularPerimetro() {
		return Math.PI * this.diametro / 2;
	}

	//Getter y Setter 
	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

	
}
