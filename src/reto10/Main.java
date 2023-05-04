package reto10;

import java.util.ArrayList;
import java.util.List;
/**
 * Clase principal que contiene el método main para ejecutar los retos.
 */

class Main {
    /**
     * Método principal que ejecuta los retos llamando a los métodos privados correspondientes.
     *
     * @param args argumentos para el método main
     */
    public static void main(String[] args) {

        //reto10();
         reto11();
        // reto12();

    }

    /**
     * Método que ejecuta el reto 10.,11 o12 haciendo el respectivo cambio de quitar las diagonales
     */

    private static void reto10(){
        //Abstrayendo sobre entrevistador
        System.out.println("Abstrayendo sobre entrevistador:");
        Utilidades.testEntrevistador(new SrEngineer("Pepe", 80, "JLM12993RVF"));
        Utilidades.testEntrevistador(new RH("Jose", 20, "JLM12993RVF"));
        Utilidades.testEntrevistador(new CEO("Pepe", 80, "JLM12993RVF"));

        //Abstrayendo sobre programador
        System.out.println("Abstrayendo sobre programador:");
        Utilidades.testProgramador(new JrEngineer("Pepe", 80, "JLM12993RVF"));
        Utilidades.testProgramador(new SrEngineer("Pepe", 80, "JLM12993RVF"));

        //Abstrayendo sobre empleado

        System.out.println("Abstrayendo sobre empleado:");
        Utilidades.testEmpleado(new SrEngineer("Pepe", 80, "JLM12993RVF"));
        Utilidades.testEmpleado(new Manager("Pepe", 80, "JLM12993RVF"));
        Utilidades.testEmpleado(new JrEngineer("Pepe", 80, "JLM12993RVF"));
        Utilidades.testEmpleado(new RH("Pepe", 80, "JLM12993RVF"));
    }
    /**
     * Método que ejecuta el reto 11.
     */
    private static void reto11(){
        List<Empleado> empleadosOut = new ArrayList<Empleado>();


        empleadosOut.add(new JrEngineer("Joaquin", 20, "TEGH1234LME"));
        empleadosOut.add(new JrEngineer("Felipe", 21, "TEGH1234LME"));
        empleadosOut.add(new JrEngineer("Gonzo", 14, "TEGH1234LME"));
        empleadosOut.add(new JrEngineer("Enrique", 23, "TEGH1234LME"));
        empleadosOut.add(new JrEngineer("Pepe", 19, "TEGH1234LME"));
        empleadosOut.add(new JrEngineer("Jose", 33, "TEGH1234LME"));
        empleadosOut.add(new JrEngineer("Patricio", 28, "TEGH1234LME"));
        empleadosOut.add(new JrEngineer("Jesus", 38, "TEGH1234LME"));
        empleadosOut.add(new JrEngineer("Pancho", 15, "TEGH1234LME"));
        empleadosOut.add(new JrEngineer("Lalo", 12, "TEGH1234LME"));

        EscritorLectorArchivo.EscribirObjetosComoString("listaEmpleados.txt", empleadosOut);
        System.out.println("Archivo de texto creado.");

        System.out.println("Leyendo archivo de texto:");
        String cadenaEmpleados = EscritorLectorArchivo.leerArchivoComoString("listaEmpleados.txt");
        System.out.println(cadenaEmpleados);

        List<Empleado> empleados = EscritorLectorArchivo.parsearStringALista(cadenaEmpleados);
        Utilidades.filtradoXEdad(20, 100, "\nEmpleados con mas de 20 años", empleados);

    }
    /**
     * Método que ejecuta el reto 12.
     */
    private static void reto12(){
        String cadenaEmpleados = EscritorLectorArchivo.leerArchivoComoString("empleados.txt");
        System.out.println(cadenaEmpleados);

        List<Empleado> empleados = EscritorLectorArchivo.parsearStringALista(cadenaEmpleados);
        Utilidades.filtradoXEdad(19, 26, "\nEmpleados con mas de 20 años", empleados);
        Utilidades.ultimoElementoFiltroXEdadYAlfabetico(empleados);
        Utilidades.filtroXAlfabetico(empleados, 10);
        Utilidades.promedioEdad(empleados);
    }



}
