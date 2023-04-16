package hmif.babak_penyisihan;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AnharAhliPemrogrammanTest {

  @Test
  void test0() {
    int[] arr = { 1, 8, 2, 9, 3 };
    int n = arr.length;
    assertEquals(2, AnharAhliPemrogramman.solution(arr, n));
  }

  @Test
  void test1() {
    int[] arr = { 1, 2, 3 };
    int n = arr.length;
    assertEquals(1, AnharAhliPemrogramman.solution(arr, n));
  }

  @Test
  void test2() {
    int[] arr = { 26, 25, 21, 19, 17, 12, 8, 4, 1 };
    int n = arr.length;
    assertEquals(5, AnharAhliPemrogramman.solution(arr, n));
  }

  @Test
  void test3() {
    int[] arr = { 1, 5, 6, 7, 9, 15 };
    int n = arr.length;
    assertEquals(3, AnharAhliPemrogramman.solution(arr, n));
  }

  @Test
  void test4() {
    int[] arr = { 2, 4, 6, 8, 10 };
    int n = arr.length;
    assertEquals(4, AnharAhliPemrogramman.solution(arr, n));
  }

  @Test
  void test5() {
    int[] arr = { 1, 3, 5, 8, 13, 21, 24, 25, 30 };
    int n = arr.length;
    assertEquals(6, AnharAhliPemrogramman.solution(arr, n));
  }

  @Test
  void test6() {
    int[] arr = { 3, 6, 9, 18, 21, 24, 27 };
    int n = arr.length;
    assertEquals(7, AnharAhliPemrogramman.solution(arr, n));
  }

  @Test
  void test7() {
    int[] arr = { 2, 8, 10, 18, 28, 36 };
    int n = arr.length;
    assertEquals(4, AnharAhliPemrogramman.solution(arr, n));
  }

  @Test
  void test8() {
    int[] arr = { 1, 3, 6, 9, 15, 24, 39, 42, 81, 82 };
    int n = arr.length;
    assertEquals(7, AnharAhliPemrogramman.solution(arr, n));
  }

  @Test
  void test9() {
    int[] arr = { 1, 5, 6, 11, 12, 17, 29, 30, 35, 59 };
    int n = arr.length;
    assertEquals(10, AnharAhliPemrogramman.solution(arr, n));
  }
}
