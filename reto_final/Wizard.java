package reto_final;

import java.util.function.Predicate;
/**
 * La clase Wizard es una subclase de Character y representa a un mago en el juego.
 */
class Wizard extends Character {
    /**
     * Constructor de la clase Wizard.
     *
     * @param var1   La vida inicial del mago.
     * @param var2   La habilidad del mago.
     * @param var4   Un predicado que se utiliza para determinar si el número de hadas es un múltiplo.
     */
    Wizard(int var1, double var2, Predicate<Integer> var4) {
        super(var1, var2, var4);
    }

    /**
     * Reduce el número de hadas capturadas por el mago y ajusta su vida en consecuencia.
     *
     * @param var1   El número de hadas que se van a liberar.
     */
    public void looseFaries(int var1) {
        if (this.faries != 0) {
            --this.faries;
            this.life = this.isModulo.test(var1) ? this.life - 1 : this.life;
        }

    }
}