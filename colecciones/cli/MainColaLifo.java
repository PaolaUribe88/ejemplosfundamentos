package cli;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class MainColaLifo {

	public static void main(String[] args) {
		//EJEMPLO LIFO 
		//LAST IN FIRST OUT = (ULTIMO EN INGRESAR PRIMERO EN SALIR)
		Deque<String> productos = new LinkedList<>();
		productos.addAll(Arrays.asList("Maquina1", "Maquina2", "Maquina3", "Maquina4"));
		
		//SACAMOS LA MAQUINA 4
		System.out.println(productos);
		String maquina = productos.pollLast();
		System.out.printf("Sacando la %s para el cliente ...%n", maquina);
		System.out.println(productos);
		
		System.out.println("================================");
		
		//SACAMOS MAQUINA 3 PERO SIGUE PRESENTE
		System.out.println(productos);
		maquina = productos.peekLast();
		System.out.printf("Sacando la %s para el cliente ...%n", maquina);
		System.out.println(productos);
		
		System.out.println("================================");
		
		//SACAMOS MAQUINA 3 PERO SIGUE PRESENTE
		System.out.println(productos);
		maquina = productos.pollLast();
		System.out.printf("Sacando la %s para el cliente ...%n", maquina);
		System.out.println(productos);
	}

}
