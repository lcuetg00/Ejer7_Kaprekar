import java.math.BigInteger;
import java.security.InvalidParameterException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase encargada de la interacción con el usuario
 * Lee las entradas del usuario para realizar las operacones necesarias
 */
public class Consola {
    //Formato de texto
    /**
     * Utilizada al imprimir por pantalla caracteres.
     * Hace que texto escrito tengan un fondo amarillo.
     */
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    /**
     * Utilizada al imprimir por pantalla caracteres.
     * Hace que texto escrito tenga el formato por defecto.
     */
    public static final String ANSI_RESET = "\u001B[0m";
    /**
     * Retorno de carro proporcionado por el sistema que se esté utilizando
     */
    public static final String RETORNO_CARRO = System.getProperty("line.separator");


    /**
     * Contructor de Consola.
     * No realiza ninguna operación.
     */
    public Consola() {
    }


    /**
     * Inicia la interfaz de la consola.
     * Lee la entrada del usuario y realiza las operaciones necesarias
     */
    public void iniciarConsola() {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ejercicio 6: Generación Aleatoria");
            System.out.println("Inserte el número a comprobar si es kaprekar");
            String num = scanner.next();
            System.out.println(NumeroKaprekar.comprobarKaprekar(new BigInteger(num)) ? num + " es un número Kaprekar" : num + " no es un número Kaprekar");

            //Ocurre cuando metemos un caracter dierente a un número
        }  catch (NumberFormatException e) {
            System.out.println(ANSI_YELLOW_BACKGROUND + "Formato incorrecto del número" + ANSI_RESET);

        } catch (InvalidParameterException e) {
            System.out.println(e.toString());

        }

        System.out.println("Saliendo del programa");

    }

    /**
     * Imprime el menú de opciones
     */
    public void imprimirMenu() {
        System.out.println("___________________");
        System.out.println("1) Comrpobación número Kaprekar");
        System.out.println("2) Salir");
        System.out.println("___________________");
    }

}
