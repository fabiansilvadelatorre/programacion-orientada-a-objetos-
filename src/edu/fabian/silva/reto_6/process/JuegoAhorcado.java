package edu.fabian.silva.reto_6.process;
import java.util.Scanner;
public class JuegoAhorcado {
    public static String letra = "";
    public static void jugar(String palabra) {
        Scanner scanner = new Scanner(System.in);
        int vidas = 5;
        String palabraAdivinada = "";
        for (int i = 0; i < palabra.length(); i++) {
            palabraAdivinada += "X";
        }
        while(vidas > 0 && !palabraAdivinada.equals(palabra)){
            System.out.println("La palabra que hay que adivinar es: " + palabraAdivinada);
            System.out.println("Te quedan " + vidas + " vidas");
            System.out.println("Ingrese una letra: ");
            try {
                letra = scanner.nextLine().toLowerCase();
                if (letra.equals("0")) {
                    return;
                }
                if (letra.length() != 1 || !Character.isLetter(letra.charAt(0))) {
                    throw new IllegalArgumentException();
                }
            } catch (IllegalArgumentException exception) {
                System.out.println("Favor de ingresar una letra válida");
                continue;
            }

            boolean acierto = false;
            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra.charAt(0)){
                    palabraAdivinada = palabraAdivinada.substring(0,i) + letra + palabraAdivinada.substring(i + 1);
                    acierto = true;
                }
            }
            if (acierto){
                System.out.println("Acertaste");
            }
            else {
                System.out.println("Fallaste, intentalo de nuevo");
                vidas--;
            }
        }
        if (palabraAdivinada.equals(palabra)){
            System.out.println("Adivinaste la palabra");
        }else {
            System.out.println("No adivinaste la palabra");
        }
    }
}
