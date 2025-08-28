public class reverseAwords {
    public static void main(String[] args) {
        String str="I like this problem";//problem this like i
        String arr1=str.replaceAll("  "," ").trim();
        String arr[]=arr1.split(" ");
        int n=arr.length;
        System.out.println(n);
        String str1="";
        for(int i=n-1;i>=0;i--)
            str+=arr[i];
        System.out.print(str1);
    }
}
