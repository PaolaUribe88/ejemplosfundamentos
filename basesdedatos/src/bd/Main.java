package bd;
import java.sql.*;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
	
	private static Object serverbd;

	public static Connection getConexion() throws SQLException {
		// debemos configurar las variables de ambiente en el Sistema Operativo
		// serían: hostdb, userdb y passworddb
		String serverbd = System.getenv("serverbd");
		String usuario = System.getenv("userbd");
		String urlBd = String.format("jdbc:postgresql://%s:5432/%s", serverbd, usuario);
		System.out.println(urlBd);
		String password = System.getenv("passwordbd");
		return DriverManager.getConnection(urlBd, usuario, password);
		}

	public static void main(String[] args) {
		ejemploCrearTabla();
	}
	public static void ejemploCrearTabla() {//PARA CREAR TABLA
		try (
				Connection conexion = getConexion();
				//eclipse le permite dar automaticamente envolver en try cath
				Statement declaracion = conexion.createStatement();	
				
			){
				String sql = "CREATE TABLE prueba (id smallserial,nombre char(20))";
				
				declaracion.execute(sql);
				
				System.out.printf("Se creo correctamente la tabla prueba");
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
	
	public static void ejemploUpdate() {//PARA actualizar la 
		try (
				Connection conexion = getConexion();
				//eclipse le permite dar automaticamente envolver en try cath
				PreparedStatement declaracion = conexion.prepareStatement("UPDATE alumnos SET carrera = 'JAVA'");	
				//topo de dato Prepared        y metodoso es prepare	
			){
			
				int filasActualizadas = declaracion.executeUpdate();
				System.out.printf("Se Actualizo correctamente %d fila(s).",filasActualizadas);
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
	
		public static void ejemploDelete() {//PARA ELEMINAR UN ELEMENTO
			try (
					Connection conexion = getConexion();
					//eclipse le permite dar automaticamente envolver en try cath
					PreparedStatement declaracion = conexion.prepareStatement("DELETE FROM  alumnos WHERE  id=?");	
					//topo de dato Prepared        y metodoso es prepare	
				){
				int alumnoIdABorrar = 6;
					declaracion.setInt(1,alumnoIdABorrar);//BORRANDO POR ID INT
					int filasBorradas = declaracion.executeUpdate();
					System.out.printf("Se elimino correctamente %d fila(s).",filasBorradas);
					
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
	
		public static void ejemploInsert() {
			//try with resources
			try (
				Connection conexion = getConexion();
				//eclipse le permite dar automaticamente envolver en try cath
				PreparedStatement declaracion = conexion.prepareStatement("INSERT INTO alumnos(nombre,carrera)VALUES (?,?)");//INSERTAR DATOS A DB 	
				//topo de dato Prepared        y metodoso es prepare	
			){
		
				declaracion.setString(1,"Homero,Simpsons");//NOMBRE
				declaracion.setString(2,"Seguridad Nuclear");//CARRERA
				int filasInsertadas = declaracion.executeUpdate();
				System.out.printf("Se insertó correctamente %d fila(s).",filasInsertadas);
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		
		public static void ejemploSelect() {
			//try with resources
			try (
				Connection conexion = getConexion();
				//eclipse le permite dar automaticamente envolver en try cath
				Statement declaracion = conexion.createStatement();	
				ResultSet rsAlumnos	= declaracion.executeQuery("SELECT id,nombre,carrera FROM alumnos");//solo para seleccionar
				
			){
				while (rsAlumnos.next()) {
					int id = rsAlumnos.getInt("ID");
					String nombre = rsAlumnos.getString("NOMBRE");
					String carrera = rsAlumnos.getString("CARRERA");
					System.out.printf("ID: %d NOMBRE: %s CARRERA: %s %n",id,nombre,carrera);
				}
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		
		

}
