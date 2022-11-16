import java.math.BigInteger;

public class NumeroKaprekar {

    //Numeros kaprekar: enteros positivos no negativos
    //Su cuadrado se separa en dos sumandos que dan el dígito original
    public static boolean comprobarKaprekar(final BigInteger numero) {
        if(numero.compareTo(BigInteger.ZERO) == -1) {
            return false;
        }
        //Saco el número al cuadrado en un String
        String cifraCuadrado = numero.pow(2).toString();
        int mitad = (cifraCuadrado.length()/2);

        //Separo el cuadrado del número en 2 números diferentes, construyendolos con la mitad del String cifraCuadrado
        BigInteger mitad1 = new BigInteger(cifraCuadrado.substring(mitad , cifraCuadrado.length()));
        BigInteger mitad2 = new BigInteger(cifraCuadrado.substring(0, mitad));

        //Falta comprobación para el 4879 y 5292
        //
        //while(mitad2.mod(BigInteger.TEN) == BigInteger.ZERO) {
        //    mitad2 = mitad2.divide(BigInteger.TEN);
        //}


        if(mitad1.add(mitad2).compareTo(numero) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
