package cli;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import modelo.Automovil;
import modelo.Terrestre;

public class Main {

	public static void main(String[] args) {
		//POLIMORFISMO
		Collection<String> lenguajes = Arrays.asList("Java", "Go", "Php", "JavaScript", "Ruby");
		//lenguajes.forEach(System.out::println);//reemplaza el for tradicional
		//lenguajes.forEach ejecuta un print por cada elemento creado en la linea de collection
		
		//filtro de lenguajes que empiezan con J en LAMBDA
		//Forma 1 parametro -> valorRetorno
		//Forma 2 (parametro) -> valorRetorno
		//Forma 3 (parametro1, parametro2) -> valorRetorno
		//Forma 4 parametro -> {expresion1; return expresion2;}
		lenguajes
		.stream()
		.filter(lenguaje -> lenguaje.startsWith("J"))
		.forEach(System.out::println);
		
		//SI SE QUIERE GUARDAR LA LISTA DE ELEMENTOS FILTRADO EN UNA VARIABLE PERO NO MUESTRA EN PANTALLA
		List <String> lenguajesComienzanJ = lenguajes
				.stream()
				.filter(lenguaje -> lenguaje.startsWith("J"))
				.toList();
		
	
		//Forma 1 de suma
		List<Integer> capacidadesCarga= Arrays.asList(10,20,30);
		int acumulado = 0;
		int capacidadCargaEmpresa = capacidadesCarga.stream()
				.reduce(acumulado,(acum,capacidadCarga) ->acum + capacidadCarga);
		//System.out.printf("La Capacidad de carga de la Empresa es %d%n", capacidadCargaEmpresa);
		
		//Ejemplo Automovil
		List<Terrestre> transportesTerrestres = Arrays.asList(
				new  Automovil (1000),
				new  Automovil (2000),
				new  Automovil (3000));
		
		double capacidadCargaEmpresa2 = transportesTerrestres
		.stream()
		.mapToDouble(auto -> auto.getCapacidadCarga())
		.sum();
		System.out.printf("La Capacidad de carga de la Empresa es %.2f %n", capacidadCargaEmpresa2);
		
	} 

}
