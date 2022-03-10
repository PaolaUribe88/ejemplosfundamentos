public class Frases {
	public static String[]frases = {
			"Nada cambia si nada cambia",
			"Esta listo",
			"que es lo que pasa",
			"no alcanzo a copiar",
			"voy a llorar",
			
	};
	public static void main(String[] args) {
		if(args.length ==0) {
			mostrarFraseAleatoria();
		} else {
			mostrarTodaslasFrases();
		}
	}
	public static void mostrarFraseAleatoria() {

		double numeroAleatorio= Math.random()* frases.length;
		int numeroAleatorioEntero=(int)numeroAleatorio;
		System.out.println( frases[numeroAleatorioEntero]);

	}
	public static void mostrarTodaslasFrases() {
		for (int i=0; i <frases.length; i++ ) {
		System.out.println( frases[i]);
		}
	}
}
