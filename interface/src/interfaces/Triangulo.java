package interfaces;

public class Triangulo implements Figura {
	double base;
	double altura;
	double lado1;
	double lado2;
	double lado3;
	
	//CONSTRUCTOR____________________________________________________________________
	public Triangulo() {
		
	}
	
	public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
		
		this.base = base;
		this.altura = altura;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}


	//METODOS_____________________________________________________________________
    public double calcularArea() {
        return base * altura /2;
    }    
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }
    
    //GETTER Y SETTER________________________________________________________________
    
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}
	
	
  
    

	
	
}
