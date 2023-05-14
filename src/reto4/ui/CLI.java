package reto4.ui;
import java.util.Scanner;
public class CLI {
    public static void Muestrameelmenu() {
        String meses = "Ene-Feb-Mar  Abr-May-Jun  Jul-Ago-Sep  Oct-Nov-Dic";
        String sabor_1 = "Chocolate 111 483 471 427";
        String sabor_2 = "Vainilla 192 500 355 158";
        String sabor_3 = "Fresa 289 470 474 160";
        String sabor_4 = "Oreo 415 114 161 308";
        String[][] arreglo = {
                meses.split(" "),
                sabor_1.split(" "),
                sabor_2.split(" "),
                sabor_3.split(" "),
                sabor_4.split(" ")
        };
    }
}
