package reto_final;

import java.util.function.Predicate;

public class Main { public static void main(String[] args) {
    /**
     * El método main es el punto de entrada del programa.
     *
     * @param args   Los argumentos de línea de comandos .
     */
    System.out.println("The Evil Wizard And The Fairies crusade");
    System.out.println("Press Enter to continue.");
    try {
        System.in.read();
    } catch (Exception e) {
        e.printStackTrace();
    }

    Game game = new Game(10, 5, 5, 10, 10);
    game.start();
}
}


