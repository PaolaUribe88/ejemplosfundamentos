package herencias;

import java.util.Scanner;

public class Liquidacion {

	public static void main(String[] args) {
		//CREAMOS  LA INSTANCIA O UN OBJETO(PAOLA) DEL TIPO DOCENTE (CREAMOS UN DOCENTE PAOLA)
		//LOS OBJETOS SON LAS INSTANCIAS DE LAS ENTIDADES
		//ENTIDAD DOCENTE, OBJETO INSTANCIADO paola
		//ENTIDAD OBJETO = NEW ENTIDAD
		Docente paola = new Docente ("Paola Uribe", "987654321-1", 1000000, 40);
		//AQUI LLAMAMOS AL METODO CREADO EN EL OBJETO
		paola.mostrarLiquidacion();

	}



}
