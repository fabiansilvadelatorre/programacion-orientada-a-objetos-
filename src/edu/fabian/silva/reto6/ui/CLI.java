package edu.fabian.silva.reto6.ui;

import edu.fabian.silva.reto6.process.JuegoAhorcado;

import java.util.Scanner;

public class CLI {
    public static void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        String[] nivelFacil = {"vaca", "coco", "alce", "leon"};
        String[] nivelMedio = {"adopcion", "autoridad", "aspirina","almacen"};
        String[] nivelDificil = {"agrietamiento", "antecedente", "biodiversidad", "descendiente"};

        System.out.println("Bienvenido al ahorcado");
        int opcion = 1;
        while (opcion!= 0){
            System.out.println("Escoge el nivel de dificultad del nivel");
            System.out.println("1 - facil");
            System.out.println("2 - medio");
            System.out.println("3 - dificil");
            System.out.println("0 - salir");
            opcion = scanner.nextInt();

            if (opcion == 0){
                break;
            }
            String[] palabras = null;
            switch (opcion){
                case 1:
                    palabras = nivelFacil;
                    break;
                case 2:
                    palabras = nivelMedio;
                    break;
                case 3:
                    palabras = nivelDificil;
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
            if (palabras != null){
                JuegoAhorcado.jugar(palabras[(int) (Math.random() * palabras.length)]);
            }
        }
        System.out.println("Vuelve pronto");
    }
}
