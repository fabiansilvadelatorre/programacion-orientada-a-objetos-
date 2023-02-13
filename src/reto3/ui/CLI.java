package reto3.ui;
import reto3.proces.Proces;
import java.util.Scanner;
public class CLI {
    public static void mostrarMenu(){
        System.out.println("1)decimal a binario");
        System.out.println("2)binario a decimal ");
        System.out.println("3)decimal a octadecimal");
        System.out.println("4)decimal a hexadicimal");
        Scanner scanner = new Scanner(System.in);
        int numero, exp, digito;
        double binario,octadecimal;
        int option = scanner.nextInt();scanner.nextLine();
        /**
         */
        long num, auxi, dig, decimal;
        int exponente;
        boolean esBinario;
        /**
         * variables segundo programa
         */
        int decimales[] = { 16777215, 12, 21 };
        Scanner sc = new Scanner(System.in);
        switch (option){
            case 1:
                /**
                 * programa que conbierte de decimal a binario
                 */
                do{
                    System.out.print("Introduce un numero entero >= 0: ");
                    numero = sc.nextInt();
                }while(numero < 0);

                exp=0;
                binario=0;
                while(numero!=0){
                    digito = numero % 2;
                    binario = binario + digito * Math.pow(10, exp);
                    exp++;
                    numero = numero/2;
                }
                System.out.printf("Binario: %.0f %n", binario);
            case 2:
                /**
                 * programa de binario a decimal
                 */
                do {
                    System.out.print("Introduce un numero binario: ");
                    num = sc.nextLong();

                    esBinario = true;
                    auxi = num;
                    while (auxi != 0) {
                        dig = auxi % 10;
                        if (dig != 0 && dig != 1) {
                            esBinario = false;
                        }
                        auxi = auxi / 10;
                    }
                } while (!esBinario);/** comprueba si es numero binaro */
                exponente = 0;
                decimal = 0;
                while (num != 0) {
                    dig= num % 10;
                    decimal = decimal + dig * (int) Math.pow(2, exponente);
                    exponente++;
                    num = num / 10;
                }
                System.out.println("Decimal: " + decimal);
                /** conversor binario a decimal  */
            case 3 :

                do{
                    System.out.print("Introduce un numero entero >= 0: ");
                    numero = sc.nextInt();
                }while(numero < 0);

                exp=0;
                octadecimal=0;
                while(numero!=0){
                    digito = numero % 8;
                    octadecimal = octadecimal + digito * Math.pow(10, exp);
                    exp++;
                    numero = numero/8;
                }
                System.out.printf("hexadecimal: %.0f %n", octadecimal);
            case 4:}
        Scanner teclado = new Scanner(System.in);
                System.out.print("Introduce un número decimal: ");
                int decimals = teclado.nextInt();
                teclado.close();
        char digitosH[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String hexadecimal2 = "";
        int resto, aux = decimals;

        while(aux>0){
            resto = aux % 16;
            hexadecimal2 = digitosH[resto] + hexadecimal2;
            aux /= 16;
        }
        System.out.printf("%n%nMétodo 2 -> Decimal: %d, Hexadecimal: %s", decimals, hexadecimal2);

        }
        }





