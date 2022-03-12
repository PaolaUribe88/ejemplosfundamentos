public class RemuneracionA {
	
	public static void saludo() {
		System.out.println("Hola");
	}

		public static void main (String [] args) {//static quiere decir que no se pueden generar instancias
			Colaborador juanPerez = new Colaborador("Juan Perez", 500000);
			Colaborador leandroSoto = new Colaborador("Landro Soto", 600000);
			
			Colaborador Luciano = new Colaborador();
			
		System.out.println("# RemuneracionA");
		System.out.println("Sueldo base Juan Perez ="+juanPerez.getSueldoBase());
		juanPerez.setSueldoBase(600000);
		System.out.println("Sueldo Base Juan Perez ="+juanPerez.getSueldoBase());
		}
		

	}


