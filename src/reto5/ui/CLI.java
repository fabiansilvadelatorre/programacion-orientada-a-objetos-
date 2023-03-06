package reto5.ui;
import reto5.ui.CLI;
import reto5.Main;
import reto5.proces.Proces;
import java.util.Random;
import java.util.Scanner;

import static reto5.proces.Proces.obtenerPalabra;

public class CLI {
    public static void MuestraElMenu() {
    Scanner teclado = new Scanner(System.in);
    String entrada = "";

    while (!entrada.equals("0")) {
        System.out.println("\nElija nivel dificultad...");
        System.out.println("(1) --> Fácil");
        System.out.println("(2) --> Intermedio");
        System.out.println("(3) --> Avanzado");
        System.out.println("(0) --> SALIR");
        System.out.print("Su opción [0-3]: ");
        entrada = teclado.nextLine();

        if (!entrada.equals("0")) {
            //Pedim
            // os una palabra en base al nivel de dificultad
            String palabra = obtenerPalabra(entrada);

            if (palabra == null) //Si hemos recibido null, es porque la opcion no es válida
                System.out.println("Escoja una opción válida.");
            else {
                String letra = "";
                System.out.print("\nPruebe una letra [0 = SALIR]: ");
                letra = teclado.nextLine().toLowerCase();
                {
                    while (!letra.equals("0")) {
                        if (palabra.contains(letra)) {
                            //Mostramos palabra pero solo enseñando la letra coincidente
                            System.out.println("\nEsa letra SI existe en la palabra:");
                            for (int i = 0; i < palabra.length(); i++) {
                                if (palabra.charAt(i) == letra.charAt(0)) //Es la letra coincidente
                                    System.out.print(palabra.charAt(i));
                                else //No es la letra, tapamos con asterisco
                                    System.out.print('*');
                            }
                        } else
                            System.out.println("Esa letra NO existe en la palabra");

                        System.out.print("\nPruebe otra letra [0 = SALIR]: ");
                        letra = teclado.nextLine();
                    }
                }
            }
        }
        System.out.println("\n\nFIN DEL PROGRAMA");
        teclado.close();
    }
}

    public static void ejecutar() {
    }
}
