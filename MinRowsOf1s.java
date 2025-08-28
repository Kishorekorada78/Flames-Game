import java.util.*;
public class MinRowsOf1s {
    public static void main(String[] args) {
        int[][] arr = {
                {0, 1, 1 },
                {1, 0, 1 },
                {0, 1, 0}
        };
        System.out.println(fun(arr));
    }

    public static int fun(int[][] arr) {
        int m = arr[0].length;
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < m; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1)
                    count++;
            }
            if (count < min) {
                min = count;
                index = i;
            }
        }
        return index;
    }
}
