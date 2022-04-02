package interfaces;

public class Circulo implements Figura{
	
	private double diametro;
	//Constructores
	public Circulo() {
		
	}
	
	public Circulo(double diametro) {
		
		this.diametro = diametro;
	}
	//Metodos

	public double calcularArea() {
		double radio = this.calcularRadio();
		return Math.PI * Math.pow(radio,2);
	}
	public double calcularRadio() {
		return this.diametro / 2;
	}
	
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