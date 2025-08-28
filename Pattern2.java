public class Pattern2 {
    public static void main(String[] args) {
    //    int[][] arr=new int[5][5];
        int k=5,temp;
        for(int i=1;i<=5;i++)
        {
            temp=i;
            for(int j=1;j<=i;j++)
            {
               System.out.print(temp+" ");
               temp=temp+k-j;
            }
            System.out.println();
        }
    }
}
