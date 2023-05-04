package reto10;

public class RH extends Empleado implements Entrevistador{

    public String correo;

    RH(String nombre, int edad, String RFC){
        super(nombre, edad, RFC);
    }
    /**
     * Empleado de RH ejecuta la accion entrevistar
     */
    @Override
    public void entrevistar(){
        System.out.println("preguntar el background");
    }

    /**
     * Empleado de RH ejecuta la accion de cobrar sueldo
     * */
    @Override
    public void obtenerPago() {
        System.out.println("RH tiene pago bajo");
    }
}