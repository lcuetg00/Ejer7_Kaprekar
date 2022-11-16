import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        //Comprobación Kaprekar del 1 al 10000
        for(int i=4;i<10000;i++) {
            BigInteger num = new BigInteger(Integer.toString(i));
            if(NumeroKaprekar.comprobarKaprekar(num)) {
                System.out.println("Num es kaprekar: "+i);
            }
        }


    }
}