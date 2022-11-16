import java.math.BigInteger;

/**
 * Clase con métodos estáticos para operaciones numéricas
 */
public class NumeroKaprekar {

    /**
     * Constructor privado para impedir que se cree una instancia de la clase (todos sus métodos son estáticos)
     */
    private NumeroKaprekar() {
    }

    /**
     * Comprueba si un número cumple las condiciones de ser Kaprekar
     * Condiciones para que sea Kaprekar:
     * -Debe de ser un entero positivo
     * -Si se divide el cuadrado del número en dos mitades, la suma de esas dos mitades debe de ser el número original
     * @param numero
     * @return true si el número es Kaprekar
     *         false si el número no es Kaprekar
     * @throws IllegalArgumentException si numero es null
     */
    public static boolean comprobarKaprekar(final BigInteger numero) throws  IllegalArgumentException {
        if(numero == null) {
            throw new IllegalArgumentException("Clase NumeroKaprekar: comprobarKaprekar el BigInteger introducido es null");
        }
        if(numero.compareTo(BigInteger.ZERO) == -1) {
            return false;
        }
        //Saco el número al cuadrado en un String
        String cifraCuadrado = numero.pow(2).toString();
        int mitad = (cifraCuadrado.length()/2);

        //Separo el cuadrado del número en 2 números diferentes, construyendolos con la mitad del String cifraCuadrado
        BigInteger mitad1 = new BigInteger(cifraCuadrado.substring(mitad , cifraCuadrado.length()));
        BigInteger mitad2 = new BigInteger(cifraCuadrado.substring(0, mitad));

        //Si la suma de las dos mitades da lugar al mismo número introducido, es un número Kaprekar
        if(mitad1.add(mitad2).compareTo(numero) == 0) {
            return true;
        } else {
            //Casos especiales para los nñumeros Kaprekar
            //Los números como  el 4879 o el 5292 la forma de separar en dos números es diferente.
            //Ejemplo:
            //4879^2 = 23804641
            //2380 + 4641 = 7021 != 4879

            //Para estos números, si a la izquierda de su mitad hay 0s, hay que añadirselos al otro sumando:
            //238 + 04641 = 4879

            //Aquí compruebo si la mitad de ese número contiene 0s a la derecha, si es así los quito
            while(mitad2.mod(BigInteger.TEN) == BigInteger.ZERO) {
                mitad2 = mitad2.divide(BigInteger.TEN);
            }
            //vuelvo a realizar la comprobación de su suma
            return (mitad1.add(mitad2).compareTo(numero) == 0);
        }
    }
}
