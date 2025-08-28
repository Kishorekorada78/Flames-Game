import java.util.Arrays;

public class ArraysConverting {
    public static void main(String[] args) {
        // 2D to 1D conversion
//        int[][] arr={{1,2},{3,4}};
//        int k=0;
//        int[] ar=new int[arr.length*arr[0].length];
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[0].length;j++){
//                ar[k++]=arr[i][j];
//            }
//        }
//        for(int i=0;i<ar.length;i++)
//            System.out.print(ar[i]);
        // 1D to 2D conversion
        int[] arr = {1, 2, 3, 4, 5, 6};
        int r = 3, col = 2;
        int[][] a2d = new int[r][col];
        for (int i = 0; i < arr.length; i++)
            a2d[i / col][i % col] = arr[i];
        for (int i = 0; i < r; i++)
            System.out.print(Arrays.toString(a2d[i]));
    }

}
