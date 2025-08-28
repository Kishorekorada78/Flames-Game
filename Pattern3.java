public class Pattern3 {
    public static void main(String[] args) {
        int k=5,s=1,n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j) {
                    if(i==3 || i==4) {
                        k=k+2;
                        System.out.print(k+ " ");
                        k--;
                    }
                    else{
                        System.out.print(k + " ");
                        k--;
                    }
                }
                else if(i+j==4) {
                    if(i==3 || i==4) {
                        s--;
                        System.out.print(s+ " ");

                    }else {
                        System.out.print(s + " ");
                        s++;
                    }
                }
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
