package reto10;

public class Manager extends Empleado implements Entrevistador {

    public String nombreDivision;

    Manager(String nombre, int edad, String RFC){
        super(nombre, edad, RFC);
    }

    /**
     * El manager ejecuta la accion de entrevistar
     * */
    @Override
    public void entrevistar(){
        System.out.println("Ejecutando entrevista");
    }

    /**
     * El manager ejecuta la accion de cobrar sueldo
     */
    @Override
    public void obtenerPago() {
        System.out.println("Manager tiene paga elevada");
    }
}