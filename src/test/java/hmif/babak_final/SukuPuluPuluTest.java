package hmif.babak_final;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SukuPuluPuluTest {
    @Test
    void test0() {
        int[][] cases = {
                            {5, 3, 9},
                            {13, 2, 25, 8}
                        };
        int[] expectedResults = {6, 11};
        for (int i = 0; i < cases.length; i++) {
            assertEquals(expectedResults[i], SukuPuluPulu.solution(cases[i]));
        }
    }

    @Test
    void test1() {
        int[][] cases = {
                            {9, 19, 1, 5, 4},
                            {5, 4, 1, 19, 9}
                        };
        int[] expectedResults = {9, 9};
        for (int i = 0; i < cases.length; i++) {
            assertEquals(expectedResults[i], SukuPuluPulu.solution(cases[i]));
        }
    }

    @Test
    void test2() {
        int[][] cases = {
                            {5, 8, 3, 9, 1, 7},
                            {12, 3, 2, 10},
                            {15, 11, 17, 14, 19}
                        };
        int[] expectedResults = {7, 6, 16};
        for (int i = 0; i < cases.length; i++) {
            assertEquals(expectedResults[i], SukuPuluPulu.solution(cases[i]));
        }
    }

    @Test
    void test3() {
        int[][] cases = {
                            {3, 4},
                            {5, 6, 7},
                            {8, 9, 10, 11},
                            {12, 13, 14, 15, 16}
                        };
        int[] expectedResults = {4, 6, 10, 14};
        for (int i = 0; i < cases.length; i++) {
            assertEquals(expectedResults[i], SukuPuluPulu.solution(cases[i]));
        }
    }

    @Test
    void test4() {
        int[][] cases = {
                            {2},
                            {2, 4},
                            {2, 4, 8},
                            {2, 4, 8, 16},
                            {2, 4, 8, 16, 32}
                        };
        int[] expectedResults = {2, 3, 5, 7, 10};
        for (int i = 0; i < cases.length; i++) {
            assertEquals(expectedResults[i], SukuPuluPulu.solution(cases[i]));
        }
    }

    @Test
    void test5() {
        int[][] cases = {
                            {3, 9, 27, 81, 243, 729},
                            {4, 16, 64, 256, 1024},
                            {5, 25, 125, 625},
                            {6, 36, 216},
                            {7, 49},
                            {8},
                        };
        int[] expectedResults = {150, 267, 195, 74, 28, 8};
        for (int i = 0; i < cases.length; i++) {
            assertEquals(expectedResults[i], SukuPuluPulu.solution(cases[i]));
        }
    }

    @Test
    void test6() {
        int[][] cases = {
                            {2, 93, 38, 18, 27, 61, 84, 91, 83, 78, 90, 18, 88, 72, 18, 92, 47, 78, 36, 54, 26, 47, 28, 47, 18}
                        };
        int[] expectedResults = {57};
        for (int i = 0; i < cases.length; i++) {
            assertEquals(expectedResults[i], SukuPuluPulu.solution(cases[i]));
        }
    }

    @Test
    void test7() {
        int[][] cases = {
                            {123, 321, 234, 432, 345, 543, 456, 654, 567, 765},
                            {1234, 4321, 2345, 5432, 9999}
                        };
        int[] expectedResults = {450, 4128};
        for (int i = 0; i < cases.length; i++) {
            assertEquals(expectedResults[i], SukuPuluPulu.solution(cases[i]));
        }
    }

    @Test
    void test8() {
        int[][] cases = {
                            {70, 66, 41, 47, 20, 68, 69, 72, 59, 81, 83, 56, 57, 74, 18, 98, 62, 40, 86, 75, 9, 91, 80, 58, 44, 54, 39, 17, 32, 88, 43, 100, 28, 36, 90, 53, 50, 10, 42, 12, 78, 31, 19, 82, 99, 49, 37, 48, 7, 87, 4, 65, 89, 67, 95, 61, 64, 33, 30, 55, 27, 92, 51, 52, 34, 14, 35, 93, 16, 97, 73, 22, 1, 6, 11, 63, 29, 84, 46, 5, 2, 60, 23, 21, 94, 13, 45, 8, 79, 85, 77, 24, 25, 96, 76, 15, 38, 26, 71, 3},
                            {8, 1, 18, 8, 20, 4, 18, 11, 7, 5, 5, 17, 11, 19, 2, 20, 7, 15, 11, 17, 2, 14, 8, 13, 5, 18, 5, 11, 2, 12, 10, 2, 20, 1, 7, 18, 5, 14, 2, 18, 2, 14, 15, 6, 19, 17, 11, 1, 1, 17},
                            {158, 139, 455, 440, 272, 464, 411, 281, 314, 499, 372, 403, 380, 292, 156, 342, 118, 219, 106, 358, 382, 288, 134, 252, 355}
                        };
        int[] expectedResults = {51, 13, 309};
        for (int i = 0; i < cases.length; i++) {
            assertEquals(expectedResults[i], SukuPuluPulu.solution(cases[i]));
        }
    }

    @Test
    void test9() {
        int[][] cases = {
                            {2, 8, 2, 9, 5, 10, 4, 6, 4, 10, 3, 6, 3, 8, 10, 6, 2, 7, 10, 9, 2, 3, 1, 6, 9, 1, 10, 5, 4, 8, 10, 3, 10, 9, 3, 8, 10, 8, 8, 6, 8, 6, 8, 8, 8, 2, 10, 6, 4, 8, 9, 7, 3, 1, 1, 9, 2, 10, 6, 7, 9, 6, 1, 5, 3, 4, 5, 8, 1, 9, 6, 6, 6, 5, 5, 6, 2, 10, 5, 5, 8, 8, 6, 2, 1, 8, 1, 4, 8, 5, 1, 8, 2, 10, 8, 3, 5, 5, 6, 1},
                            {13, 16, 17, 13, 16, 16, 12, 15, 18, 14, 17, 19, 14, 13, 13, 19, 17, 14, 16, 12, 12, 16, 17, 16, 12, 18, 16, 19, 17, 17, 16, 17, 11, 14, 11, 20, 18, 14, 12, 19, 11, 13, 20, 20, 16, 19, 20, 13, 16, 20, 20, 15, 19, 12, 12, 20, 18, 16, 18, 12, 14, 17, 14, 16, 17, 12, 17, 15, 12, 14, 13, 14, 11, 20, 12, 18, 15, 14, 11, 12, 12, 18, 11, 12, 20, 16, 18, 11, 11, 18, 20, 14, 12, 13, 13, 16, 13, 17, 20, 12},
                            {27, 28, 30, 21, 34, 30, 24, 24, 39, 36, 22, 27, 27, 35, 26, 28, 32, 33, 28, 35, 21, 31, 38, 34, 37, 24, 22, 32, 22, 26, 22, 33, 39, 34, 25, 25, 27, 32, 31, 39, 34, 33, 39, 31, 24, 29, 22, 33, 31, 27, 25, 30, 32, 40, 32, 21, 30, 32, 24, 29, 21, 30, 33, 22, 37, 38, 27, 29, 34, 36, 38, 22, 30, 23, 21, 28, 39, 35, 40, 29, 27, 38, 30, 35, 38, 36, 25, 22, 28, 26, 39, 35, 31, 26, 26, 34, 35, 37, 25, 31}
                        };
        int[] expectedResults = {8, 17, 33};
        for (int i = 0; i < cases.length; i++) {
            assertEquals(expectedResults[i], SukuPuluPulu.solution(cases[i]));
        }
    }
}
