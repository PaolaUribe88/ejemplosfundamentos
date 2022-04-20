
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class BaseDatos {

	public static Connection getConexion() throws SQLException {//THROWS AGREGA LA EXCEPCION
		// 1 METODO PARA CREAR LA CONECCION
		return DriverManager.getConnection("jdbc:hsqldb:file:MIBASEDATOS", "SA", "");//STRING DE CONEXCION
	}
		
	public static List<Bodega> getBodegas() throws SQLException {
		//PARA MANEJAR LA EXCEPCION AL LLAMAR EL METODO LO EXIGE ENVUELTO EN TRY CATCH
		/*	ASI SE LLAMA AL METODO DESDE EL MAIN
		 * try {
			getBodegas();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	*/
		try (
				Connection conexion   = getConexion();//LLAMAMOS LA CONECCION CREADA EN EL METODOSO GETCONEXION
				Statement declaracion = conexion.createStatement();
				){
				String sql = "SELECT * FROM bodegas";
				ResultSet resultado = declaracion.executeQuery(sql);
				//OBJETO DE CLASE POJO LLAMADA BODEGA
				List<Bodega> bodegas = new ArrayList<>();
				while(resultado.next()){
					int id = resultado.getInt("id");
					String nombre = resultado.getString("nombre");
					boolean estado = resultado.getBoolean("estado");
					Bodega bodega = new Bodega(id, nombre, estado);
					bodegas.add(bodega);
				
				}		
				/*bodegas.forEach(b -> System.out.printf("ID: %d Nombre: %s Estado: %s %n"
						, b.getId()
						, b.getNombre()
						, b.isEstado()
						));*/
				return bodegas;
			} catch (SQLException e) {
				
				throw e;//RELANZA LA EXCEPCION
			}
		
		
	}
	public static void insertarFilas() {
		//INSERTANDO FILAS
		try (
				Connection conexion   = getConexion();//LLAMAMOS LA CONECCION CREADA EN EL METODOSO GETCONEXION
				Statement declaracion = conexion.createStatement();
				){
				String sql = "INSERT INTO bodegas(id, nombre, estado)VALUES(1, 'A01', 1), (2, 'A02', 0),(3, 'A03', 1), (4, 'A04', 2),(5, 'A05', 2)";
				int filasInsertadas = declaracion.executeUpdate(sql);//CREAMOS UNA VARIABLE LOCAL LLAMADA FILASINSERTADAS
				System.out.printf("SE INSERTARON %d FILAS.",filasInsertadas);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		
	}
	
	public static void crearTabla() {
		
		//CREAR TABLA 
		try (
			Connection conexion   = getConexion();
			Statement declaracion = conexion.createStatement();
			){
			String sql = "CREATE TABLE bodegas(id INTEGER, nombre CHAR(5), estado BOOLEAN)";
			declaracion.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	

}
