package vomistr;

import java.util.Scanner;

public class Vomistr {
	
	//CONSTANTES
	private final static int OPCION_MENU_CREAR_TICKET = 1;
	private final static int OPCION_MENU_VER_TICKET = 2;
	private final static int OPCION_MENU_SALIR = 3;
	
	
	public static void main(String[] args) {
	int opcionSeleccionada;
		do {
			opcionSeleccionada = menu();
			switch (opcionSeleccionada){
				case OPCION_MENU_CREAR_TICKET:
					crearTicket();
					break;
				case OPCION_MENU_VER_TICKET:
					verTicket();
					break;
					
			}
		}while (opcionSeleccionada != OPCION_MENU_SALIR);
		
	}
	private static void crearTicket() {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Ingrese Numero Ticket");
		int numeroTicket = scanner.nextInt();
		
		System.out.println("Ingrese Fecha Ticket");
		String fecha = scanner.nextLine();
		
		System.out.println("Ingrese Numero Ticket");
		String descripcionProblema = scanner.nextLine();
		
		System.out.println("Ingrese Numero Ticket");
		String estado = scanner.nextLine();
		
		System.out.println("Ingrese Numero Ticket");
		String solucionProblema = scanner.nextLine();
		
	}

	private static void verTicket() {
	
	
	}


	


	private static int menu() {
		System.out.println("\t\tMenu Atencion al Cliente ******************\n");
		System.out.println("[1.] Crear Ticket");
		System.out.println("[2.] Ver Ticket");
		System.out.println("[3.] Salir");
		System.out.println("Por favor Seleccione una Opcion");
		Scanner scanner = new Scanner(System.in);
		int opcionSeleccionada = scanner.nextInt();
		
		return opcionSeleccionada;
	}


}
