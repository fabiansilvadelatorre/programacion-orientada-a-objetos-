package reto_final;
import java.util.function.Predicate;
/**
 * La clase Character representa un personaje con atributos de vida, hadas, habilidad .
 */
public class Character {
    int life;
    int faries = 0;
    Predicate<Integer> isModulo;
    private double hability;
    /**
     * Constructor de la clase Character.
     *
     * @param var1   La vida inicial del personaje.
     * @param var2   La habilidad del personaje.
     * @param var4   Un predicado que se utiliza para determinar si el número de hadas es un múltiplo.
     */
    Character(int var1, double var2, Predicate<Integer> var4) {
        this.life = var1;
        this.hability = var2;
        this.isModulo = var4;
    }
    /**
     * Incrementa el número de hadas del personaje en uno.
     * Si el número de hadas es un múltiplo, se incrementa también la vida del personaje.
     */

    public void gainFaries() {
        this.life = this.isModulo.test(++this.faries) ? this.life + 1 : this.life;
    }
    /**
     * Incrementa la vida del personaje en uno.
     */

    public void heal() {
        ++this.life;
    }
    /**
     * Decrementa la vida del personaje en uno.
     */
    public void damage() {
        --this.life;
    }

    public boolean isDead() {
        return this.life == 0;
    }
    /**
     * Verifica si el personaje está muerto.
     *
     * @return true si la vida del personaje es igual a cero, de lo contrario, false.
     */
    public int getLife() {
        return this.life;
    }

    /**
     * Obtiene el número de hadas del personaje.
     *
     * @return El número de hadas del personaje.
     */
    public int getFaries() {
        return this.faries;
    }
    /**
     * Obtiene la habilidad del personaje.
     *
     * @return La habilidad del personaje.
     */

    public double getHability() {
        return this.hability;
    }
}
