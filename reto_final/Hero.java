package reto_final;
import java.util.function.Predicate;
class Hero extends Character {
    /**
     * Constructor de la clase Hero.
     *
     * @param var1   La vida inicial del héroe.
     * @param var2   La habilidad del héroe.
     * @param var4   Un predicado que se utiliza para determinar si el número de hadas es un múltiplo.
     */
    Hero(int var1, double var2, Predicate<Integer> var4) {
        super(var1, var2, var4);
    }
}
