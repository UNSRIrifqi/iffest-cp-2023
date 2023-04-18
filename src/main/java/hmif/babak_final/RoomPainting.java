package masalahDesignerInterior;

/**
 * Hello world!
 *
 */
import java.util.Scanner;

public class RoomPainting {
    private int N;
    private int[][] costs;

    public RoomPainting(int N, int[] Red, int[] Green, int[] Blue) {
        this.N = N;
        this.costs = new int[N][3];
        for (int i = 0; i < N; i++) {
            this.costs[i][0] = Red[i];
            this.costs[i][1] = Green[i];
            this.costs[i][2] = Blue[i];
        }
    }

    public int getMinimumCost() {
        int[][] dp = new int[N][3];


        dp[0][0] = costs[0][0];
        dp[0][1] = costs[0][1];
        dp[0][2] = costs[0][2];

  
        for (int i = 1; i < N; i++) {
            dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + costs[i][0];
            dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + costs[i][1];
            dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + costs[i][2];
        }

 
        return Math.min(Math.min(dp[N-1][0], dp[N-1][1]), dp[N-1][2]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();;
        int[] Red = new int[N];
        int[] Green = new int[N];
        int[] Blue = new int[N];
        for(int i = 0; i < N; i++){
            Red[i] = scanner.nextInt();
        }
        for(int i = 0; i < N; i++){
            Green[i] = scanner.nextInt();
        }
        for(int i = 0; i < N; i++){
            Blue[i] = scanner.nextInt();
        }
        RoomPainting roomPainting = new RoomPainting(N, Red, Green, Blue);
        int minimumCost = roomPainting.getMinimumCost();
        System.out.println(minimumCost);
    }
}

