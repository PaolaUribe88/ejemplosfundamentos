package cli;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MainSet {

	public static void main(String[] args) {

		List<String>listadoLenguajes =new ArrayList<>( Arrays.asList("PHP", "JAVA", "JS", "C#", "JAVA", "PHYTON", "C++"));
		
		//Set<String> listadoLenguajesSinDuplicados = new HashSet<>(listadoLenguajes);
		//listadoLenguajesSinDuplicados.forEach(System.out::println);
		
		/*
		Set<String> listadoLenguajesSinDuplicados = new HashSet<>();
		for (String lenguaje: listadoLenguajes) {
		 boolean resultadoInsercion = listadoLenguajesSinDuplicados.add(lenguaje);
		 if(resultadoInsercion) {
			 System.out.printf("Se inserto correctamente el lenguaje %s. %n", lenguaje);
		 }else
			 System.out.printf("Ya se habia insertado el lenguaje %s. %n", lenguaje);
		}
	}*/
		//Set<String> lenguajesOrdenados = new TreeSet<>(listadoLenguajes);
		//lenguajesOrdenados.forEach(System.out::println);
		
		
		//ORDEN NO NATURAL
		//ORDENA LOS STRING DE LA Z A LA A
		Collections.sort(listadoLenguajes, new Comparator<String>() {

			@Override
			public int compare(String lenguaje1, String lenguaje2) {
				if (lenguaje1.compareTo(lenguaje2)>0) {
					return -1;
				}else if (lenguaje1.compareTo(lenguaje2)>0) {
					return 1;
				}else {
				return 0;
			}
			
		}
		});
		listadoLenguajes.forEach(System.out::println);
		
	}		
		
}
