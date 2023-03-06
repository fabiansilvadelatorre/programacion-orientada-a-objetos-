package reto6.Proces;
import reto6.ui.CLI;
import reto6.Proces.Proces;
import reto6.main;
import java.util.Random;
import java.util.Scanner;
public class Proces {
    public static String adivinarPalabra(int nivel) {
        String[] palabrasFaciles = {"gato", "perro", "casa", "sol", "manzana"};
        String[] palabrasMedias = {"bicicleta", "computadora", "jardín", "silla", "libro"};
        String[] palabrasDificiles = {"paleontología", "constitucionalismo", "excepcionalidad", "hipopotomonstrosesquipedaliofobia", "electroencefalografista"};
        String[] palabras;
        if (nivel == 1) {
            palabras = palabrasFaciles;
        } else if (nivel == 2) {
            palabras = palabrasMedias;
        } else if (nivel == 3) {
            palabras = palabrasDificiles;
        } else {
            return null;
        }
        Random random = new Random();
        int indice = random.nextInt(palabras.length);
        return palabras[indice];
    }
}
