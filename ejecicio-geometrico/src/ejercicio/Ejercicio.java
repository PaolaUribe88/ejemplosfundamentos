
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio {
	
	private static ArrayList<AreaRectangulo> areaRectangulo = new ArrayList<>();
	private static ArrayList<Circulo> Circulo = new ArrayList<>();
	
	private static short opcionSeleccionada;
    private final static short OPCION_AREA_RECTANGULO = 1;
    private final static short OPCION_AREA_CIRCULO= 2;
    private final static short OPCION_RADIO_CIRCULO= 3;
    private final static short OPCION_PERIMETRO_CIRCULO= 4;
    private final static short OPCION_SALIR= 4;
    
    
	public static void main(String[] args) {
		do {
			opcionSeleccionada = menu();
		}while(opcionSeleccionada!=OPCION_SALIR);
		
	}
	private static short menu(){
			//CREO MENU
		   //entrega datos en consola
		System.out.println("MENU\n*******\n");
        System.out.println("[1.] Calcular Area Rectangulo");
        System.out.println("[2.] Calcular Area Circulo");
        System.out.println("[3.] Calcular Radio Circulo");
        System.out.println("[4.] CalcularPerimetro Circulo");
        System.out.println("[5.] Salir!!!");
        
        System.out.println("Seleccione opcion de Menu");
        Scanner scannerEjercicio = new Scanner(System.in);
        opcionSeleccionada =(short) scannerEjercicio.nextInt();
        
        switch( opcionSeleccionada ) {
                case OPCION_AREA_RECTANGULO:
                        calcularAreaRectangulo();
                        break;  
                case OPCION_AREA_CIRCULO:
                    	calcularAreaC();
                    	break;
                case OPCION_RADIO_CIRCULO:
                    	calcularRadio();
                    	break;
                case OPCION_PERIMETRO_CIRCULO:
                		calcularPerimetro();
                		break;    	
	}
		return opcionSeleccionada;
}
	private static void calcularAreaRectangulo() {
		Scanner scanner = new Scanner(System.in);
		 System.out.println("Ingrese Altura del Rectangulo");//solicita datos al usuario
		 double altura = scanner.nextDouble();
		 System.out.println("Ingrese Base del Rectangulo");//solicita datos al usuario
		 double base = scanner.nextDouble();
//llamamos a la clase, creamos un atributo = nueva clase y le pasamos parametros(atributo creado en clase)		 
		 AreaRectangulo areaRectangulo = new AreaRectangulo(base,altura);
		 double area= areaRectangulo.calcularArea();
		 System.out.printf("El Area del Rectangulo es: %f %n%n", area);//entrega datos en consola
	}
	private static void calcularPerimetro() {
		Scanner scanner = new Scanner(System.in);
		 System.out.println("Ingrese Perimetro del Circulo");//solicita datos al usuario
		 double diametro = scanner.nextDouble();
//llamamos a la clase, creamos un atributo = nueva clase y le pasamos parametros(atributo creado en clase)
		 Circulo circulo = new Circulo(diametro);
		 double perimetro= circulo.calcularPerimetro();
		 System.out.printf("El Perimetro del Circulo es: %f %n%n", perimetro);//entrega datos en consola
		
	}
	private static void calcularRadio() {
		Scanner scanner = new Scanner(System.in);
		 System.out.println("Ingrese Radio del Circulo");//solicita datos al usuario//solicita datos al usuario
		 double diametro = scanner.nextDouble();
//llamamos a la clase, creamos un atributo = nueva clase y le pasamos parametros(atributo creado en clase)	
		 Circulo circulo = new Circulo(diametro);
		 double radio= circulo.calcularRadio();
		 System.out.printf("El Radio del Circulo es: %f %n%n", radio);//entrega datos en consola
		
	}
	private static void calcularAreaC() {
		Scanner scanner = new Scanner(System.in);
		 System.out.println("Ingrese el Diametro del Circulo");//solicita datos al usuario
		 double diametro = scanner.nextDouble();
//llamamos a la clase, creamos un atributo = nueva clase y le pasamos parametros(atributo creado en clase)			 
		 Circulo circulo = new Circulo(diametro);
		 double area= circulo.calcularAreaC();
		 System.out.printf("El Area del Circulo es: %f %n%n", diametro);//entrega datos en consola
	}
}