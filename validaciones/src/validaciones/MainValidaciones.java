package validaciones;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;

public class MainValidaciones {

	public static void main(String[] args) {
		//validacionEntreValoresPermitidos();
		//ValidacionTelefono();
		validacionFechas();	
	}
	private static void validacionFechas() {
		// Contexto fecha ingresada por el usuario;
		//suponemos que ud limpio un String y lo convirtio a int
		int year = 2022;
		int mes = 2;
		int dia = 29;
		System.out.println("Procesando Fecha...");
		try {
		LocalDate.of(year, mes, dia); 
		//procesamiento de la fecha
		
		}catch(Exception e) {
			System.out.println("Fecha Invalida!!!");
		}
	}
	public static void ValidacionTelefono() {
		//String telefonoIngresadoPorUsuario = "9 ab32 5987";//muestra error porque no cumple los requisitos
		String telefonoIngresadoPorUsuario = "9 9232 5987";//cumple los requisitos
		//Strip limpia espacios en el principio y al final y devuelve un String
		//Replace limpia espacios entremedio y devuelve un String
		String telefonoLimpioDeEspacios = telefonoIngresadoPorUsuario.strip().replace(" ","");
		int largoTelefono = telefonoLimpioDeEspacios.length();
		
		if (largoTelefono ==9 && telefonoLimpioDeEspacios.matches("[0-9]{9}")) {
			System.out.println("Telefono Correcto");
		}else {
			System.out.println("Telefono Incorrecto");
		}
	}
	
	public static void validacionEntreValoresPermitidos() {
		Collection<String> valoresPermitidos = Arrays.asList("BMW", "AUDI", "MERCEDES");
		String valorIngresadoPorUsuario = "TOYOTA";
		boolean marcaPermitida = valoresPermitidos.contains(valorIngresadoPorUsuario);
		
		if (marcaPermitida) {
			System.out.println("Hacer la Mantencion");
		}else {
			System.out.println("Lo sentimos su marca no tiene soporte en esta concesionaria");
		}
	}

}
