import java.util.*;

public class MaxInMatrix {
    public static void main(String[] args) {
        Scanner kk = new Scanner(System.in);
        int[][] arr = new int[3][3];

        // Input
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = kk.nextInt();
            }
        }

        int sum = 0, prev = -1;

        for (int i = 0; i < 3; i++) {
            int max = Integer.MIN_VALUE;
            int temp = -1;

            for (int j = 0; j < 3; j++) {
                if (j != prev && arr[i][j] > max) {
                    max = arr[i][j];
                    temp = j;
                }
            }

            // In case all other columns are invalid (e.g., only one column remains)
            if (temp == -1) {
                // Fallback to any value (e.g., arr[i][prev]) if no valid column found
                max = arr[i][prev];
                temp = prev;
            }

            prev = temp;
            sum += max;
        }

        System.out.print(sum + " ");
    }
}
