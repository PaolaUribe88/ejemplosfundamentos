package herencias;

public class Docente extends Empleado {
    private int horasTrabajadas;
 
    public Docente(
            String nombre,
            String rut,
            int sueldo,
            int horasTrabajadas
                ) {
        super(nombre, rut, sueldo);
        this.horasTrabajadas = horasTrabajadas;
    }
 
    // no relevante para el ejemplo 
    private void sop(String t) {
        System.out.println(t);
    }
 
    public void mostrarLiquidacion(){
        // NO puedo llamar directamente 
        // a this.nombre porque es private 
    	//forma de llamar un atributo o metodo private
        sop( this.getNombre() );//sop = imprime el nombre llamando al metodo creado en la linea 17 y 18
       // sop(this.getRut());
        
        // a sueldo si, pq es protected 
        //forma de mostrar un atributo o metodo protected
        sop( "Sueldo:" + this.sueldo );//sop es un sistem out print line abreviado
        // por implementar ...
        sop("Rut: " + this.rut);
    }
    
}