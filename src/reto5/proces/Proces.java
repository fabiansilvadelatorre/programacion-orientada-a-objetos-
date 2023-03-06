package reto5.proces;
/**
 * librerias
 */

import java.util.Random;
import java.util.Scanner;
public class Proces {
    //Palabras fijas para adivinar según nivel
    private static final String[] FACIL = {
            "bar", "bolas", "pelona", "verde", "puerta", "mano", "musa", "aguacate"
    };

    private static final String[] INTERMEDIO = {
            "cabalgata", "dracula", "ebanjelista", "fantacia",
            "lagarto", "habana", "plusbalia", "obediente"
    };

    private static final String[] AVANZADO = {
            "abnegaciones", "chubasqueros", "deliberacion",	"emocionantes",
            "enloquecedor",	"inmobiliaria",	"instrumentos",	"urbanizacion",
            "traumatizado", "trasnochador","murcielago","paranguaricutirimicuaro",
            "quetzalcoatl"
    };

    /**
     * Proporciona una palabra al azar de uno de los arrays de palabras
     * prefijadas, según el nivel de dificultad indicado.
     * @param nivel Valor del nivel de dificultad
     * @return Palabra al azar o valor null si el valor de nivel no es válido.
     */
    public static String obtenerPalabra(String nivel) {
        Random azar = new Random();
        switch(nivel) {
            case "1":
                return FACIL[azar.nextInt(FACIL.length)];
            case "2":
                return INTERMEDIO[azar.nextInt(INTERMEDIO.length)];
            case "3":
                return AVANZADO[azar.nextInt(AVANZADO.length)];
            default:
                return null;

        }
    }
}
