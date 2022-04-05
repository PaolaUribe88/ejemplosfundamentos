package cli;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import modelo.Automovil;
import modelo.Bicicleta;
import modelo.Transporte;
import sort.OrdenTransporteByCapacidadCargaDesc;

public class MainTransportes {

	public static void main(String[] args) {
		List<Transporte> activos = new ArrayList<>();
		activos.add(new Automovil(2000,7900000));
		activos.add(new Bicicleta("No Aplica", 100,1, 2, 150000));
		activos.add(new Automovil(2000,11900000));
		activos.add(new Bicicleta("No Aplica", 80,1, 2, 200000));
		
		//ORDEN ARTIFICIAL (INTERFACE COMPARATOR) SE PUEDE IMPLEMENTAR EN TODAS LAS CLASES
		Collections.sort(activos,new OrdenTransporteByCapacidadCargaDesc());
		activos.forEach(System.out::println);
		
		//ORDEN NATURAL (INTERFACE COMPARABLE) SOLO UNO X CADA CLASE ESTE ESTA IMPLEMENTADO EN CLASE TRANSPORTE
		//Collections.sort(activos);//orden natural de  la lista ordenado por el atributo avaluo
		//activos.forEach(System.out::println);
		
		/*
		Set<Transporte> activosOrdenados = new TreeSet<>( activos );
		activosOrdenados.forEach( System.out::println );
		*/ 
		
		/*
		 * Orden Natural con inserción de uno en uno 
		Set<Transporte> activosOrdenados = new TreeSet<>( );
		for( Transporte transporte : activos ) {
			activosOrdenados.add(transporte);
		}
		activosOrdenados.forEach( System.out::println );
		*/
		
			
	}

}
