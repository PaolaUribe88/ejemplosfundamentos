package cli;

import java.util.LinkedList;
import java.util.Queue;

public class MainColas {

	public static void main(String[] args) {
		
		Queue<String> filaSupermercado = new LinkedList<>();
		filaSupermercado.add("Pedro");
		//SE PUEDE UTILIZAR ADD O OFFER
		//LA DIFERENCIA ES QUE ADD LANZA UN EXCEPCION Y OFFER RETORNA FALSE ANTE UN PROBLEMA
		filaSupermercado.offer("Juan");
		filaSupermercado.add("Sergio");
		filaSupermercado.add("Carolina");
		//=======================================================
		
		//MOSTRAR ESTADO ANTES DE SACAR ELEMENTO DE LA COLA
		System.out.println(filaSupermercado);//PRINTLN SE OCUPA CUANDO ES STRING IMPRIME TODO LO CREADO EN FILASUPERMERCADO
		String persona = filaSupermercado.poll();//SACAMOS A ALGUIEN DE LA COLA 
		System.out.printf("Atendiendo a %s...%n", persona);
		System.out.println("Estan pendientes ...");
		System.out.println(filaSupermercado);
		
		persona = filaSupermercado.remove();
		System.out.printf("Atendiendo a %s...%n", persona);
		System.out.println("Estan pendientes ...");
		System.out.println(filaSupermercado);
		
		persona = filaSupermercado.remove();
		System.out.printf("Atendiendo a %s...%n", persona);
		System.out.println("Estan pendientes ...");
		System.out.println(filaSupermercado);
		
		persona = filaSupermercado.remove();
		System.out.printf("Atendiendo a %s...%n", persona);
		System.out.println("Todos han sido atendidos ...");
		System.out.println(filaSupermercado);
		
		
		
	} 

}
