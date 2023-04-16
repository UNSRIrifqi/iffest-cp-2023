package hmif.babak_final;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class YotsubaSiPemenangTest {
    @Test
    void test0() {
        int m = 3;
        int n = 3;
        int expectedResults = 6;
        assertEquals(expectedResults, YotsubaSiPemenang.solution(m, n));
    }

    @Test
    void test1() {
        int m = 1;
        int n = 1;
        int expectedResults = 1;
        assertEquals(expectedResults, YotsubaSiPemenang.solution(m, n));
    }

    @Test
    void test2() {
        int m = 5;
        int n = 5;
        int expectedResults = 70;
        assertEquals(expectedResults, YotsubaSiPemenang.solution(m, n));
    }

    @Test
    void test3() {
        int m = 7;
        int n = 5;
        int expectedResults = 210;
        assertEquals(expectedResults, YotsubaSiPemenang.solution(m, n));
    }

    @Test
    void test4() {
        int m = 10;
        int n = 15;
        int expectedResults = 817190;
        assertEquals(expectedResults, YotsubaSiPemenang.solution(m, n));
    }

    @Test
    void test5() {
        int m = 99;
        int n = 1;
        int expectedResults = 1;
        assertEquals(expectedResults, YotsubaSiPemenang.solution(m, n));
    }

    @Test
    void test6() {
        int m = 25;
        int n = 3;
        int expectedResults = 325;
        assertEquals(expectedResults, YotsubaSiPemenang.solution(m, n));
    }

    @Test
    void test7() {
        int m = 1;
        int n = 75;
        int expectedResults = 1;
        assertEquals(expectedResults, YotsubaSiPemenang.solution(m, n));
    }

    @Test
    void test8() {
        int m = 33;
        int n = 4;
        int expectedResults = 6545;
        assertEquals(expectedResults, YotsubaSiPemenang.solution(m, n));
    }

    @Test
    void test9() {
        int m = 17;
        int n = 7;
        int expectedResults = 74613;
        assertEquals(expectedResults, YotsubaSiPemenang.solution(m, n));
    }
}
