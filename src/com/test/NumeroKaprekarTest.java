package com.test;

import com.ejer.utileria.NumeroKaprekar;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase para realizar tests Junit para el número Kaprekar
 */
class NumeroKaprekarTest {

    @Test
    @DisplayName("Pruebas número Kaprekar")
    void testNumeroKaprekar() {
        assertTrue(NumeroKaprekar.comprobarKaprekar(new BigInteger("9")));
        assertTrue(NumeroKaprekar.comprobarKaprekar(new BigInteger("45")));
        assertTrue(NumeroKaprekar.comprobarKaprekar(new BigInteger("55")));
        assertTrue(NumeroKaprekar.comprobarKaprekar(new BigInteger("99")));
        assertTrue(NumeroKaprekar.comprobarKaprekar(new BigInteger("2223")));

        assertEquals(NumeroKaprekar.comprobarKaprekar(new BigInteger("8")), false);
        assertEquals(NumeroKaprekar.comprobarKaprekar(new BigInteger("10")), false);
        assertEquals(NumeroKaprekar.comprobarKaprekar(new BigInteger("300")), false);
    }

    @Test
    @DisplayName("Pruebas número Kaprekar: Para los números que al separar el número a la izquierda hayan 0s")
    void testNumeroKaprekarNumerosEspeciales() {
        assertTrue(NumeroKaprekar.comprobarKaprekar(new BigInteger("4879")));
        assertTrue(NumeroKaprekar.comprobarKaprekar(new BigInteger("5292")));

    }

}