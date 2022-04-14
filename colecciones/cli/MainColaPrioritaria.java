package cli;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MainColaPrioritaria {

	public static void main(String[] args) {
		Producto leche1 = new Producto("Leche 1lt", LocalDate.of(2023, 11, 1));
		Producto leche2 = new Producto("Leche 1lt", LocalDate.of(2022, 4, 20));
		Producto leche3 = new Producto("Leche 1lt", LocalDate.of(2022, 12, 10));
		Producto leche4 = new Producto("Leche 1lt", LocalDate.of(2022, 5, 18));
		//Producto leche5 = new Producto("Leche 1lt", LocalDate.of(2022, 7, 27)); error orden
		
		Queue<Producto> inventario = new PriorityQueue<>(Comparator.comparing(Producto::getVencimiento));
		inventario.addAll(Arrays.asList(leche1,leche2,leche3,leche4));
		System.out.println(" INVENTARIO LIFO ");
		System.out.println("******************\n");
		
		inventario.forEach(leche -> System.out.printf(
				"%s Vence: %tY-%tm-%td %n"
				,leche.getNombre(),leche.getVencimiento(),leche.getVencimiento(),leche.getVencimiento()));
		
		System.out.println("\n============================================================\n");
		Producto leche = inventario.remove();
		LocalDate fechaActual = LocalDate.now();
		//si la leche que sacamos del estante esta vencida, sacar una nueva
		if(leche.getVencimiento().isBefore(fechaActual )) {
			//leche vencida saco una nueva
			leche = inventario.remove();
		}
		System.out.printf("Sacando del estante Leche Vencida %s...%n", inventario);
		
		
		
		
	}

}
class Producto{
	protected String nombre;
	protected LocalDate vencimiento;
	
	public Producto(String nombre, LocalDate vencimiento) {
		this.nombre = nombre;
		this.vencimiento = vencimiento;
	}
	public String getNombre() {return nombre;}
	public LocalDate getVencimiento() {return vencimiento;}
	
	@Override
	public String toString() {
		return String.format("Producto %s, vence en  %tY-%tm-%td %n", nombre,vencimiento,vencimiento,vencimiento);
	}
	
	
}

