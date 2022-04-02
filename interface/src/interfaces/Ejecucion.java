package interfaces;


public class Ejecucion {

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
		 
		 //PARA TRIANGULO ESCALENO
		 Triangulo triangulo1 = new Triangulo (10,10,10,10,10);
		 double calcularAreaT = triangulo1.calcularArea();
		 double calcularPerimetroT = triangulo1.calcularPerimetro();
		 System.out.println(" TRIANGULO \n*************");
		 System.out.println("El Area es:  "+calcularAreaT);
		 System.out.println("El Perimetro es:  "+calcularPerimetroT);
		 System.out.println("_________________________________________\n");

	}

}
