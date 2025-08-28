public class Pattern5 {
    public static void main(String[] args) {
        int n=4,c=0,m=1;
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("  ");
            }
            for(int k=1;k<=m;k++){
                System.out.print(c+" ");
                if(k<i && i>1)
                    c--;
                else
                    c++;
            }
            System.out.println();
            m=m+2;
            //c++;
        }

    }
}
