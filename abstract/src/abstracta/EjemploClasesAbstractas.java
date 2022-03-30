package abstracta;

public class EjemploClasesAbstractas {

	public static void main(String[] args) {
		
		//Clase nombre variable = valor
		 Circulo circulo1 = new Circulo(65); // si se puede instanciar 
		 double calculoAreaC = circulo1.calcularArea();
		 double calculoPerimetroC = circulo1.calcularPerimetro();
		 double calculoRadio = circulo1.calcularRadio();
		 System.out.println(" CIRCULO \n**********");
		 System.out.println("El Area es:  " +calculoAreaC);
		 System.out.println("El Perimetro es:  "+calculoPerimetroC);
		 System.out.println("El Radio es: "+calculoRadio);
		 System.out.println("_________________________________________\n");
		 
		 
		 
		 Rectangulo rectangulo1 = new Rectangulo(20,20);
		 double calculoAreaR = rectangulo1.calcularArea();
		 double calculoPerimetroR = rectangulo1.calcularPerimetro();
		 System.out.println(" RECTANGULO \n*************");
		 System.out.println("El Area es:  "+calculoAreaR);
		 System.out.println("El Perimetro es:  "+calculoPerimetroR);
		 System.out.println("_________________________________________\n");
		 
		 //Figura f = new Figura(); NO SE PUEDE INSTANCIAR LA CLASE ABSTRACTA "FIGURA"
	        // error: Figura is abstract; cannot be instantiated
	        //Figura figura = new Figura();
		 
		 
	}

}
