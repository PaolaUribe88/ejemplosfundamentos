package cli;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MainMapas {

	public static void main(String[] args) {
	mapasConHashMap();	
	
	}
	
	public static void mapasConHashMap() {
		//EJEMPLO 1
		//map de que tipo es la clave y de que tipo el valor strin string variable traducciones = instaciada
		Map<String,String> traducciones = new HashMap<>();
		//variable put(clave, valor)
		traducciones.put("Hola","Hello");
		traducciones.put("Chao","Bye");
		traducciones.put("Buenos Dias ","Good Morning");
		traducciones.put("¿Como estas?","How are You?");
		/*
		String buenosDiasEnIngles = traducciones.get("Buenos Dias");
		System.out.printf("Buenos Dias En Ingles se dice : %s %n", buenosDiasEnIngles);
		*/
		traducciones.forEach ((clave, valor) -> System.out.printf("Español : %s | Ingles : %s %n", clave,valor));
		
		
	}
	
	public static void mapasConLinkesHashMap() {
		//ORDEN NATURAL EJEMPLO 2
		Map<String,String> traducciones = new LinkedHashMap<>();
		//variable put(clave, valor)
		traducciones.put("Hola","Hello");
		traducciones.put("Chao","Bye");
		traducciones.put("Buenos Dias ","Good Morning");
		traducciones.put("¿Como estas?","How are You?");
		/*
		String buenosDiasEnIngles = traducciones.get("Buenos Dias");
		System.out.printf("Buenos Dias En Ingles se dice : %s %n", buenosDiasEnIngles);
		*/
		traducciones.forEach ((clave, valor) -> System.out.printf("Español : %s | Ingles : %s %n", clave,valor));
		
	}
	public static void mapasConTreeMap() {
		//ORDEN ALFAVETICO
		Map<String,String> traducciones = new TreeMap<>();
		//variable put(clave, valor)
		traducciones.put("Hola","Hello");
		traducciones.put("Chao","Bye");
		traducciones.put("Buenos Dias ","Good Morning");
		traducciones.put("¿Como estas?","How are You?");
		/*
		String buenosDiasEnIngles = traducciones.get("Buenos Dias");
		System.out.printf("Buenos Dias En Ingles se dice : %s %n", buenosDiasEnIngles);
		*/
		traducciones.forEach ((clave, valor) -> System.out.printf("En Español  se dice : %s | En Ingles se traduce : %s %n", clave,valor));
		
	
	}
	public static void hasMapPaises() {
		Map<String, List<String>> paisesSegunContinente = new HashMap<>();
		paisesSegunContinente.put("America",Arrays.asList("Chile", "Colombia","Perú", "Venezuela"));
		paisesSegunContinente.put("Europa",Arrays.asList("España", "Portugal","Alemania", "Francia"));
		paisesSegunContinente.put("Africa",Arrays.asList("Egipto", "Sudafrica","Nigeria", "Tanzania"));
		
		paisesSegunContinente.forEach( (continente, paises) -> {
			paises.forEach( pais -> System.out.printf("%s Pertenece al Continente: %s%n", pais, continente) );
			});
	}

}
