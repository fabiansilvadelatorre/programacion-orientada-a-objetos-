package reto10;
/**

 Representa un CEO que es un tipo de Manager con información adicional.


 */
public class CEO extends Manager {
    public int empresa;
    public int valorEmpresa;
    public int valorFraccionEmpresa;
    /**

     Crea una instancia de CEO con su nombre, edad y RFC.
     @param nombre el nombre del CEO (heredado de Manager)
     @param edad la edad del CEO (heredado de Manager)
     @param RFC el RFC del CEO (heredado de Manager)
     */
    CEO(String nombre, int edad, String RFC){
        super(nombre, edad, RFC);
    }
}