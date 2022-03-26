import java.io.IOException;
import java.io.FileWriter;
import java.io.File;
public class TrabajoArchivos {

  public static void main (String[] arg){
      crearArchivoCsvDinamico();
      //esCarpetaOArchivo(); asi se invoca el metodo en el main

  }
  private static void crearArchivoCsvDinamico(){
    //crear reporte dinamico para que otros usuarios puedan verlo
    //tipo de dato String variable =
      String carpetaUsuario = System.getProperty("user.home");
      //tipo dato variable nombre de la variable a generar
      String nombreArchivo   = "reporte2-20220326.csv";
      //t dato nombre de variable = nombre de variable concatenada con nomrbre de variable
      String rutaCompletaArchivo = carpetaUsuario + File.separator + nombreArchivo;
      String contenidoArchivoReporte = generarContenidoArchivosCSV();

    try {
      FileWriter writer = new FileWriter(rutaCompletaArchivo);
      System.out.printf("Escribiendo archivo: %s%n", rutaCompletaArchivo);
      writer.write(contenidoArchivoReporte);
      writer.close();
    }catch(IOException ioe){
      //mensaje para el usuario
      System.out.println("Hubo un problema al escribir el reporte.");
      System.out.println("Contacte con el administrador.");
      //por implementar archivo de log
    }
  }
  //ejemplo5
  private static void rutaDinamicaSegunSistemaOperativo(){
    String userHome = System.getProperty("user.home");
    String archivo = userHome + File.separator + "reportes" + File.separator;
    System.out.printf("archivo; %s%n", archivo);

  }

  //consigue la ruta de manera dinamica de cada usuario
  //Ejemplo 4
  public static void carpetaHomeUsuarioDinamica(){
    String userHome = System.getProperty("user.home");
    System.out.printf("User Home: %s %n", userHome);
  }
  // ejemplo 3
  private static void esCarpetaOArchivo() {

      File directorioActual    = new File(".");
      String[] listadoArchivos = directorioActual.list();

      for( String archivo : listadoArchivos ) {
        File archivoActual    = new File(archivo);
        if(archivoActual.isDirectory()){
          System.out.printf("Dir: %s %n", archivo);
        }
        if(archivoActual.isDirectory()){
          System.out.printf("File: %s %n", archivo);
        }
      }

    }
    //Ejemplo2
    private static void mostrarrchivoCarpetaUsuario(){
      //si escribimos de manera titeral la ruta
      //debemos ESCAPAR el backslash (\) usando otro
      //la ruta es
      File directorioActual1 = new File("C:\\Users\\Paola");
      String[] listadoArchivos = directorioActual1.list();

      for(String archivo : listadoArchivos){
        System.out.printf("%s%n", archivo);
      }

    }
      //Ejemplo1
    private static void crearArchivoCsv(){
      String nombreArchivo   = "reporte-20220326.csv";
      String contenidoArchivoReporte = generarContenidoArchivosCSV();

      try {
        FileWriter writer = new FileWriter(nombreArchivo);
        writer.write(contenidoArchivoReporte);
        writer.close();
      }catch(IOException ioe){
        //mensaje para el usuario
        System.out.println("Hubo un problema al escribir el reporte.");
        System.out.println("Contacte con el administrador.");
        //por implementar archivo de log
      }
    }
      //Ejemplo1
    private static String generarContenidoArchivosCSV(){
    String cabeceraCsv      = "BODEGA, ESTADO, ARRENDATARIO";
    String contenidoArchivo = cabeceraCsv + "\n";
    contenidoArchivo += "Bodega1, desocupada, \n";
    contenidoArchivo += "Bodega2, ocupada, Juanito Perez \n";
    // abreviación de esto:
   //contenidoArchivo = contenidoArchivo + "bodega2,ocupada,Juanito Perez\n";
   contenidoArchivo += "bodega3,ocupada,Juanito Perez\n";
   return contenidoArchivo;
  }
}
