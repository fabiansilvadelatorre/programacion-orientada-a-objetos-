package reto10;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import java.nio.charset.StandardCharsets;
import java.io.*;
/**
 * Lee el archivo especificado y devuelve su contenido como una cadena de texto.
 * @param archivo El archivo que se va a leer.
 * @return La cadena de texto que contiene el contenido del archivo.
 */
public class EscritorLectorArchivo {

    public static String leerArchivoComoString(String archivo) {
        // Path p = Path.of("src\\reto12\\" + archivo).toAbsolutePath();
        Path p = Paths.get(archivo);
        String info = "";

        try {
            info = new String(Files.readAllBytes(p));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return info;
    }
    /**
     * Convierte una cadena de texto en un objeto Empleado.
     * @param empleado La cadena de texto que se va a convertir en un objeto Empleado.
     * @return Un objeto Empleado con los valores especificados en la cadena de texto.
     */
    public static Empleado parsearStringAEmpleado(String empleado) {
        String[] attr = empleado.split(";");// Atributos de empleado
        Empleado emp = null;
        try {
            emp = new JrEngineer(attr[0], Integer.parseInt(attr[1]), attr[2]);
        } catch (Exception e) {
            try {

                emp = new JrEngineer(attr[0], Integer.parseInt(attr[2]), attr[1]);
            } catch (Throwable e2) {
                System.out.println("No fue posible parsear texto a objeto: " + empleado);
            }
        }
        return emp;
    }

    /**
     * Escribe una lista de objetos en un archivo de texto.
     * @param archivo El archivo donde se va a escribir la lista.
     * @param lista La lista de objetos que se van a escribir en el archivo.
     */
    public static void EscribirObjetosComoString(String archivo, List lista) {
        try {
            lista.stream().forEach(objeto -> {
                EscribirStringEnArchivo(archivo, objeto.toString() + "\n");
            });
        } catch (Exception ex) {
            System.out.print("Exception: " + ex);
        }

    }
    /**
     * Escribe una cadena de texto en un archivo.
     * @param archivo El archivo donde se va a escribir la cadena de texto.
     * @param text La cadena de texto que se va a escribir en el archivo.
     */
    private static void EscribirStringEnArchivo(String archivo, String text) {

        try {
            BufferedWriter bf = new BufferedWriter(new FileWriter(archivo, true));
            bf.write(text);
            bf.close();
        } catch (Exception ex) {
            System.out.print("Invalid Path: " + ex);
        }
    }
    /**
     * Convierte una cadena de texto en una lista de objetos Empleado.
     * @param objetos La cadena de texto que se va a convertir en una lista de objetos Empleado.
     * @return Una lista de objetos Empleado con los valores especificados en la cadena de texto.
     */
    public static List parsearStringALista(String objetos) {
        List lista = new ArrayList();

        for (var obj : objetos.split("\n"))
            lista.add(parsearStringAEmpleado(obj));

        return lista;
    }
}