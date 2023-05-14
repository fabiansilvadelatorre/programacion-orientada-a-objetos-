package reto10;

import java.util.ArrayList;
import java.util.List;

public class Utilidades {
    public static void testProgramador(Programer p){
        p.programar();
        System.out.println("Clase abstraida: " + p.getClass().getSimpleName() + "\n");
    }

    public static void testEmpleado(Empleado e){
        e.trabajar();
        System.out.println("Clase abstraida: " + e.getClass().getSimpleName() + "\n");
    }

    public static void testEntrevistador(Entrevistador e){
        e.entrevistar();
        System.out.println("Clase abstraida: " + e.getClass().getSimpleName() + "\n");
    }




    public static void filtradoXEdad(int edadMin, int edadMax, String mensaje, List<Empleado> emps) {

        System.out.println("Filtro - " + mensaje + ":\n");

        emps.stream().filter(prog -> prog.edad > edadMin && prog.edad < edadMax).forEach(System.out::println);
    }

    public static void filtroXAlfabetico(List<Empleado> emps, int limite){
        System.out.println("\nNombre de los primeros " + limite + " empleados ordenados alfabeticamente: \n" );
        emps.stream().map(emp -> {emp.setOrder(true); return emp;} ).sorted().limit(limite).forEach(System.out::println);
    }

    public static void ultimoElementoFiltroXEdadYAlfabetico(List<Empleado> emps){
        System.out.println("\nUltimo elemento usando orden por edad y por nombre: \n" );
        var ultimoEmp = emps.stream().sorted().reduce((p,s) -> s).orElse(null);
        System.out.println(ultimoEmp);
    }

    public static void promedioEdad(List<Empleado> emps){
        System.out.println("\nEl promedio de todas las edades es: \n" );
        float edadProm = (float) emps.stream().map(emp -> emp.edad).reduce((p,s) -> p+s).orElse(0);
        edadProm =  edadProm/emps.size();
        System.out.println(edadProm);
    }
}