package reto10;

public class JrEngineer extends Empleado implements Programer{

    public String stack;
    public String nombreSupervisor;


    /**
     * El programador jr ejecuta la accion de programar
     * */

    JrEngineer(String nombre, int edad, String RFC){
        super(nombre, edad, RFC);
    }

    public void programar(){
        System.out.println("programa como puede");
    }

    /**El programador jr ejecuta la accion de cobrar el sueldo*/
    @Override
    public void obtenerPago(){
        System.out.println("Jrs cobran sueldo medio");
    }
}