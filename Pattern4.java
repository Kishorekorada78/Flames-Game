public class Pattern4 {
    // pattern
//          1
//         1 1
//        1 2 1
//       1 3 3 1
//      1 4 6 4 1
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++)
        {
            int temp=1;
            for(int j=0;j<n-i;j++)  //
            {
                    System.out.print(" ");
            }
            for(int k=0;k<=i;k++)  // 0>=0 0>=0 1>=1
            {
                System.out.print(temp + " ");
                temp = temp *(i-k) / (k +1);
            }
            System.out.println();
        }
    }
}
