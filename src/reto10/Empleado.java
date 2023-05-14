package reto10;
import java.io.Serializable;
import java.util.Objects;
/**

 Esta clase representa a un empleado.

 Contiene atributos como nombre, edad, sueldo, registro, teléfono y RFC.

 Implementa la interfaz Serializable para que los objetos de esta clase puedan ser serializados.

 Implementa la interfaz Comparable para poder ordenar objetos de tipo Empleado.
 */
public abstract class Empleado implements Serializable, Comparable<Empleado>{
    public int edad;
    public int sueldo;
    public int registro;
    public int telefono;
    public String nombre;
    public String RFC;
    public boolean order = false;

    Empleado(String nombre, int edad, String RFC){
        this.nombre = nombre;
        this.edad = edad;
        this.RFC = RFC;
    }

    /**
     * Los empleados ejecutan la accion de trabajar
     * */
    public void trabajar(){
        System.out.println("Empleado ejecuta trabajo");
    }

    abstract public void obtenerPago();


    public void setOrder(boolean order){
        this.order = order;
    }

    @Override
    public int hashCode() {
        return Objects.hash(edad, sueldo, registro, telefono, nombre);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return edad == empleado.edad && sueldo == empleado.sueldo && registro == empleado.registro && telefono == empleado.telefono && Objects.equals(nombre, empleado.nombre);
    }

    @Override
    public String toString() {
        return this.nombre + ";" + this.edad + ";" + this.RFC;
    }

    private int naturalOrder(Empleado otroEmpleado){
        if(order) return this.nombre.compareTo(otroEmpleado.nombre);


        return this.edad == otroEmpleado.edad ?  this.nombre.compareTo(otroEmpleado.nombre): this.edad < otroEmpleado.edad ? -1: 1;
    }


    @Override
    public int compareTo(Empleado otroEmpleado){
        return naturalOrder(otroEmpleado);
    }



}