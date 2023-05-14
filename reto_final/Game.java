package reto_final;
import java.util.function.Predicate;
import java.io.PrintStream;

/**
 * La clase Game representa el juego con un héroe y un mago, y contiene funciones para iniciar el juego,
 * realizar un paso en el juego y mostrar las estadísticas del juego.
 */
public class Game {
    Hero hero;
    Wizard wizard;
    /**
     * Constructor de la clase Game.
     *
     * @param var1   La vida inicial del héroe.
     * @param var2   La vida inicial del mago.
     * @param var3   La habilidad del mago.
     * @param var5   El número máximo de hadas para el predicado del héroe.
     * @param var6   El número máximo de hadas para el predicado del mago.
     */
    Game(int var1, int var2, double var3, int var5, int var6) {
        System.out.println(var6);
        this.hero = new Hero(var1, 1.0 - var3 / 10.0, (var1x) -> {
            return var1x % var6 == 0;
        });
        this.wizard = new Wizard(var2, var3 / 10.0, (var1x) -> {
            return var1x % var6 == 0;
        });
    }
    /**
     * Inicia el juego y ejecuta el ciclo principal del juego hasta que el héroe o el mago estén muertos.
     * Muestra un mensaje de victoria o derrota según el resultado del juego y muestra las estadísticas finales.
     */
    public void start() {
        while(true) {
            if (this.hero.isDead()) {
                System.out.println("You loose: Hero Died");
            } else {
                if (!this.wizard.isDead()) {
                    this.step();
                    continue;
                }

                System.out.println("You win: Wizard Died");
            }

            this.stats();
            return;
        }
    }

    /**
     * Muestra las estadísticas del juego, incluyendo el número de hadas rescatadas por el héroe y capturadas por el mago.
     */

    private void stats() {
        System.out.println("\nGame Stats: ");
        System.out.println("Rescued Faries: " + this.hero.getFaries());
        System.out.println("Captured Faries: " + this.wizard.getFaries());
    }
    /**
     * Realiza un paso en el juego. El mago puede capturar hadas y el héroe puede intentar rescatar hadas del mago.
     */
    private void step() {
        PrintStream var10000;
        int var10001;
        if (Math.random() < this.wizard.getHability()) {
            this.wizard.gainFaries();
            var10000 = System.out;
            var10001 = this.wizard.getLife();
            var10000.println("Wizard captured fairy; Wizard has " + var10001 + " lives. And " + this.wizard.getFaries() + " captured fairies.");
        }

        if (Math.random() < this.hero.getHability()) {
            if (this.wizard.getFaries() == 0) {
                System.out.println("There are no captured fairies, rescue attempt finished.");
                return;
            }

            if (Math.random() > this.hero.getHability()) {
                this.hero.damage();
                System.out.println("Troll hit you while trying to rescue fairy!; you have: " + this.hero.getLife() + " lives.");
            }

            this.hero.gainFaries();
            this.wizard.looseFaries(this.hero.getFaries());
            var10000 = System.out;
            var10001 = this.hero.getLife();
            var10000.println("Hero rescued a fairy!; you have: " + var10001 + " lives. Wizard has: " + this.wizard.getLife() + " lives.");
            System.out.println("Hero has rescued " + this.hero.getFaries() + " fairies.");
        }

    }
}



