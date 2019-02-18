package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C1Test {

    @Test
    void c1TestNormal () {
        double [] t = {1, 3, 2, 3};
        int max = C1.nMax(t);
        int expectedRes = 2;
        assertEquals(expectedRes, max);
    }

    @Test
    void c1TestDixElements () { // Test normal aussi (escroquerie !)
        double [] t = {1, 3, 2, 3, 5, 8, 36, 2, 36, 36};
        int max = C1.nMax(t);
        int expectedRes = 3;
        assertEquals(expectedRes, max);
    }

    @Test
    void c1TestUnElement () {
        double [] t = {99};
        int max = C1.nMax(t);
        int expectedRes = 1;
        assertEquals(expectedRes, max);
    }

    @Test
    void c1TestTousEgaux () {
        double [] t = {21, 21, 21, 21, 21, 21, 21, 21};
        int max = C1.nMax(t);
        int expectedRes = 8;
        assertEquals(expectedRes, max);
    }

    @Test
    void c1TestTousZero () {
        double [] t = {0, 0, 0, 0, 0, 0, 0};
        int max = C1.nMax(t);
        int expectedRes = 7;
        assertEquals(expectedRes, max);
    }

    @Test
    void c1TestAvecNegatifs () {
        double [] t = {-23, -98, -56, -45, -23};
        int max = C1.nMax(t);
        int expectedRes = 2;
        assertEquals(expectedRes, max);
    }

    @Test
    void c1TestAvecPositifsNegatifs () {
        double [] t = {-26, 112, 56, -47, -26};
        int max = C1.nMax(t);
        int expectedRes = 1;
        assertEquals(expectedRes, max);
    }

    @Test
    void c1TestSansElement () {
        double [] t = {};
        int max;
        try {
            max=C1.nMax(t);
            fail();
        }
        catch (EmptyArgException eae){
        }
    }


}