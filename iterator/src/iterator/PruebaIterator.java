package iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class PruebaIterator {

	public static void main(String[] args) {
		List<String> nombres = new ArrayList<>( Arrays.asList("Pilar", "Paola", "Otro") );
		nombres.add("Jessie");//agrega a la lista
		nombres.add(0,"Alejandra");//reescribe en la posicion 0 y mueve al resto en posicion 
		nombres.addAll(Arrays.asList("Javiera", "Andrea"));//addAll permite agregar mas elementos a la lista 
		
		nombres.set(4,"Ruben");
		System.out.println("nombres.set(3,'Ruben')");
		System.out.println(nombres);
		
		// si la lista NO está vacía
		if( !nombres.isEmpty() ) {
		// hacer algo
		}
		
		//Forma 1
		Iterator<String> iterador = nombres.iterator();
		while( iterador.hasNext() ) {
		System.out.printf("Nombre = %s %n", iterador.next() );
		}
		
		// Forma 2
		//for(int i = 0; i<nombres.size(); i++) {

		}

		// Forma 3
		//for(String nombre : nombres) {

		//}
		//System.out.println(nombres);

	//}
	
	

}
