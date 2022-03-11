
public class Remuneracion {

	private static int montosalud;
	public static void main(String[] args) {
		if(args.length < 6){
			//si se ejecuta el programa sin argumentos voy a invocar un metodos
			mostrarAyuda();
			} else {
			calcularRemuneracion(args);
			}
	}

	private static void mostrarAyuda() {
		// creo el metodo mostrarAyuda
		System.out.println("Remuneracion[sueldo-base][colacion][movilizacion][afp][salud][tipo-contrato]");
		System.out.println("Ejemplo: Remuneracion 800000 100000 50000 habitat fonasa indefinido");
		//i=indefinido f=fijo c=casa particular
	}

	private static void calcularRemuneracion(String[] args) {
		// creo el metodo calcularRemuneracion, aqui vamos a hacer todas conversiones de tipo de dato
		int sueldoBase =Integer.parseInt(args[0]);
		int colacion =Integer.parseInt(args[1]);
		int movilizacion =Integer.parseInt(args[2]);
		String afp = (args[3]);
		String salud =(args[4]);
		char tipoContrato =(args[5].charAt(0));
		float montoUfIsapre = 2.5f;
		
		int montoImponible = calcularMontoImponible(sueldoBase);
		int montoAfp = calcularMontoAfp(montoImponible, afp);
		int montoSalud = calcularMontoSalud(montoImponible, montoUfIsapre, salud);
		int montoSeguroCesantiaTrabajador = calcularSeguroCesantiaTrabajador(montoImponible, tipoContrato);
		int montoSeguroCesantiaEmpleador = calcularSeguroCesantiaEmpleador(montoImponible, tipoContrato); 
		int montoSeguroCesantia = montoSeguroCesantiaTrabajador + montoSeguroCesantiaEmpleador;
		
		
		System.out.printf("Monto Imponible: $%d \n", montoImponible);//\n es un saldo de linea %d interpola un numero entero
		System.out.printf("AFP: %s\n", afp);//%s interpola un texto 
		System.out.printf("Monto AFP: $%d \n", montoAfp);
		System.out.printf("Monto no Imponible: $%d \n", calcularMontoNoImponible(colacion, movilizacion));
		System.out.printf("Salud: %s \n", salud);
		System.out.printf("Monto Salud: $%d \n", montoSalud);
		System.out.printf("Monto Seguro Cesantia Trabajador: $%d \n", montoSeguroCesantiaTrabajador);
		System.out.printf("Monto Seguro Cesantia Empleador: $%d \n", montoSeguroCesantiaEmpleador);
		System.out.printf("Monto Seguro Cesantia Total: $%d \n", montoSeguroCesantia);
	}
	private static int calcularMontoImponible(int sueldoBase) {
		return sueldoBase;
	}
	private static int calcularMontoNoImponible(int colacion, int movilizacion) {
		return colacion + movilizacion;
	}
	
	private static int calcularMontoAfp (int montoImponible, String afp) {
		switch (afp) {
		case "capital":{
			return (int) (montoImponible * 0.1144);
		}
		case "cuprum":{
			return (int) (montoImponible * 0.1144);
		}
		case "habitat":{
			return (int) (montoImponible * 0.1127);
		}
		case "planvital":{
			return (int) (montoImponible * 0.1116);
		}
		case "provida":{
			return (int) (montoImponible * 0.1145);
		}
		case "modelo":{
			return (int) (montoImponible * 0.1058);
		}
		case "uno":{
			return (int) (montoImponible * 0.1069);
		}
		default:
		}
		return montoImponible;
		
	}
	private static int calcularMontoSalud (int montoImponible,float montoUfSalud, String salud) {
		float uf = 31539.20f;
		
		switch (salud) {
		case "fonasa":{
			return (int) (montoImponible * 0.07);
		}
		case "colmena":{
			return (int) (montoUfSalud * uf);
		}
		case "consalud":{
			return (int) (montoUfSalud * uf);
		}
		case "cruzBlanca":{
			return (int) (montoUfSalud * uf);
		}
		case "masvida":{
			return (int) (montoUfSalud * uf);
		}
		case "vidaTres":{
			return (int) (montoUfSalud * uf);
		}
		case "banmedica":{
			return (int) (montoUfSalud * uf);
		}
		default:
		}
		return 0;
	
	}
	private static int calcularSeguroCesantiaTrabajador (int montoImponible, char tipoContrato ) {
		switch (tipoContrato) {
			case 'i' :{
				return (int) (montoImponible * 0.006);
			}
			default:
			}
				return 0;
		
			}
	private static int calcularSeguroCesantiaEmpleador(int montoImponible, char tipoContrato) {
		switch (tipoContrato) {
		case 'i' :{
			return (int) (montoImponible * 0.024);
		}
		case 'f' :{
			return (int) (montoImponible * 0.030);
		}
		case 'c' :{
			return (int) (montoImponible * 0.030);
		}
		default:
		}
			return 0;
	
		}
		
	}

