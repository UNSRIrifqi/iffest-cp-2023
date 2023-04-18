package masalahDesignerInterior;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;


import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class RoomPaintingTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test0() {
        int N = 3;
        int[] Red = {6, 5, 3};
        int[] Green = {3, 1, 6};
        int[] Blue = {9, 4, 2};
        int result = 9;
        RoomPainting roomPainting = new RoomPainting(N, Red, Green, Blue);
        assertEquals(result, roomPainting.getMinimumCost());
    }
    @Test
    public void test1() {
        int N = 3;
        int[] Red = {6, 4, 3};
        int[] Green = {9, 2, 6};
        int[] Blue = {9, 6, 2};
        int result = 10;
        RoomPainting roomPainting = new RoomPainting(N, Red, Green, Blue);
        assertEquals(result, roomPainting.getMinimumCost());
    }
    @Test
    public void test2() {
        int N = 4;
        int[] Red = {6, 5, 3, 1};
        int[] Green = {3, 1, 6, 6};
        int[] Blue = {9, 4, 2, 8};
        int result = 10;
        RoomPainting roomPainting = new RoomPainting(N, Red, Green, Blue);
        assertEquals(result, roomPainting.getMinimumCost());
    }
    @Test
    public void test3() {
        int N = 4;
        int[] Red = {6, 5, 6, 4};
        int[] Green = {3, 9, 6, 6};
        int[] Blue = {9, 4, 4, 8};
        int result = 16;
        RoomPainting roomPainting = new RoomPainting(N, Red, Green, Blue);
        assertEquals(result, roomPainting.getMinimumCost());
    }
    @Test
    public void test4() {
        int N = 4;
        int[] Red = {8, 5, 2, 1};
        int[] Green = {4, 9, 6, 6};
        int[] Blue = {9, 4, 4, 8};
        int result = 14;
        RoomPainting roomPainting = new RoomPainting(N, Red, Green, Blue);
        assertEquals(result, roomPainting.getMinimumCost());
    }
    @Test
    public void test5() {
        int N = 5;
        int[] Red = {6, 4, 3, 1, 5};
        int[] Green = {2, 8, 9, 6, 9};
        int[] Blue = {1, 4, 2, 8, 6};
        int result = 14;
        RoomPainting roomPainting = new RoomPainting(N, Red, Green, Blue);
        assertEquals(result, roomPainting.getMinimumCost());
    }
    @Test
    public void test6() {
        int N = 5;
        int[] Red = {6, 8, 3, 4, 5};
        int[] Green = {6, 8, 9, 6, 9};
        int[] Blue = {9, 4, 5, 4, 6};
        int result = 22;
        RoomPainting roomPainting = new RoomPainting(N, Red, Green, Blue);
        assertEquals(result, roomPainting.getMinimumCost());
    }
    @Test
    public void test7() {
        int N = 6;
        int[] Red = {6, 4, 3, 1, 5, 5};
        int[] Green = {2, 8, 9, 6, 9, 6};
        int[] Blue = {1, 4, 2, 8, 6, 9};
        int result = 19;
        RoomPainting roomPainting = new RoomPainting(N, Red, Green, Blue);
        assertEquals(result, roomPainting.getMinimumCost());
    }
    @Test
    public void test8() {
        int N = 6;
        int[] Red = {6, 4, 6, 1, 5, 5};
        int[] Green = {2, 8, 8, 4, 9, 9};
        int[] Blue = {9, 4, 2, 8, 6, 9};
        int result = 20;
        RoomPainting roomPainting = new RoomPainting(N, Red, Green, Blue);
        assertEquals(result, roomPainting.getMinimumCost());
    }
    @Test
    public void test9() {
        int N = 7;
        int[] Red = {6, 4, 3, 1, 5, 5, 1};
        int[] Green = {2, 8, 9, 6, 9, 6, 6};
        int[] Blue = {1, 4, 2, 8, 6, 9, 2};
        int result = 21;
        RoomPainting roomPainting = new RoomPainting(N, Red, Green, Blue);
        assertEquals(result, roomPainting.getMinimumCost());
    }
}
