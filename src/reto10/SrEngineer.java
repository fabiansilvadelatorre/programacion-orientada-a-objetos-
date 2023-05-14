package reto10;

public class SrEngineer extends JrEngineer implements Entrevistador{

    public String liderDeProyecto;

    SrEngineer(String nombre, int edad, String RFC){
        super(nombre, edad, RFC);
    }

    /**
     * El senior ejecuta la accion de programar
     */
    public void programar(){
        System.out.println("Programa programa");
    }

    /**
     * El senior ejecuta la accion de entrevistar
     * */
    @Override
    public void entrevistar(){
        System.out.println("pregunta cosas tecnicas de programacion");
    }
}