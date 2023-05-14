package reto6.ui;
import reto6.ui.CLI;
import reto6.Proces.Proces;
import reto6.main;
import java.util.Random;
import java.util.Scanner;



public class CLI {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al adivinador de palabras. Para salir, ingrese 0.");
        while (true) {
            System.out.print("Ingrese el nivel de dificultad (1 = fácil, 2 = medio, 3 = difícil): ");
            int nivel = scanner.nextInt();
            if (nivel == 0) {
                System.out.println("Gracias por jugar. Hasta la vista.");
                break;
            }
            String palabra = Proces.adivinarPalabra(nivel);
            if (palabra == null) {
                System.out.println("Nivel no válido. Intente nuevamente.");
            } else {
                System.out.println("La palabra es de " + palabra.length() + " letras.");
                int intentos = 0;
                StringBuilder letrasEncontradas = new StringBuilder();
                for (int i = 0; i < palabra.length(); i++) {
                    letrasEncontradas.append("*");
                }
                while (!letrasEncontradas.toString().equals(palabra)) {
                    System.out.print("Ingrese una letra: ");
                    String letra = scanner.next();
                    boolean encontrada = false;
                    for (int i = 0; i < palabra.length(); i++) {
                        if (palabra.charAt(i) == letra.charAt(0)) {
                            letrasEncontradas.setCharAt(i, letra.charAt(0));
                            encontrada = true;
                        }
                    }
                    if (encontrada) {
                        System.out.println("¡Correcto! Letras encontradas: " + letrasEncontradas);
                    } else {
                        System.out.println("Incorrecto. Intente nuevamente.");
                    }
                    intentos++;
                }
                System.out.println("¡Felicidades! Adivinó la palabra " + palabra + " en " + intentos + " intentos.");
            }
        }
    }
}