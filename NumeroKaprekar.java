import java.math.BigInteger;

public class NumeroKaprekar {

    //Numeros kaprekar: enteros positivos no negativos
    //Su cuadrado se separa en dos sumandos que dan el dígito original
    public static boolean comprobarKaprekar(final BigInteger numero) {
        //Si numero < 0
        if(numero.compareTo(BigInteger.ZERO) == -1) {
            return false;
        }
        //
        String cifraCuadrado = numero.pow(2).toString();
        int mitad = (cifraCuadrado.length()/2);
        if((cifraCuadrado.length() & 1) == 1) {
            //si es impar
            mitad=mitad+1;
        }

        BigInteger mitad1 = new BigInteger(cifraCuadrado.substring(0,mitad));
        BigInteger mitad2 = new BigInteger(cifraCuadrado.substring(mitad, cifraCuadrado.length()));

        if(mitad1.add(mitad2).compareTo(numero) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
