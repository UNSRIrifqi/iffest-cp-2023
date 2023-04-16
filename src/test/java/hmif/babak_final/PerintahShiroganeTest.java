package hmif.babak_final;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PerintahShiroganeTest {
    @Test
    void test0() {
        int m = 3;
        int n = 5;
        int d = 4;
        int result = 6;
        assertEquals(result, PerintahShirogane.solution(m, n, d));
    }

    @Test
    void test1() {
        int m = 3;
        int n = 9;
        int d = 8;
        int result = -1;
        assertEquals(result, PerintahShirogane.solution(m, n, d));
    }

    @Test
    void test2() {
        int m = 5;
        int n = 8;
        int d = 7;
        int result = 8;
        assertEquals(result, PerintahShirogane.solution(m, n, d));
    }

    @Test
    void test3() {
        int m = 6;
        int n = 12;
        int d = 10;
        int result = -1;
        assertEquals(result, PerintahShirogane.solution(m, n, d));
    }

    @Test
    void test4() {
        int m = 25;
        int n = 35;
        int d = 30;
        int result = 10;
        assertEquals(result, PerintahShirogane.solution(m, n, d));
    }

    @Test
    void test5() {
        int m = 44;
        int n = 77;
        int d = 65;
        int result = -1;
        assertEquals(result, PerintahShirogane.solution(m, n, d));
    }

    @Test
    void test6() {
        int m = 44;
        int n = 77;
        int d = 65;
        int result = -1;
        assertEquals(result, PerintahShirogane.solution(m, n, d));
    }

    @Test
    void test7() {
        int m = 26;
        int n = 66;
        int d = 44;
        int result = 30;
        assertEquals(result, PerintahShirogane.solution(m, n, d));
    }

    @Test
    void test8() {
        int m = 20;
        int n = 25;
        int d = 23;
        int result = -1;
        assertEquals(result, PerintahShirogane.solution(m, n, d));
    }

    @Test
    void test9() {
        int m = 55;
        int n = 87;
        int d = 3;
        int result = 96;
        assertEquals(result, PerintahShirogane.solution(m, n, d));
    }

    @Test
    void test10() {
        int m = 32;
        int n = 45;
        int d = 5;
        int result = 32;
        assertEquals(result, PerintahShirogane.solution(m, n, d));
    }
}
