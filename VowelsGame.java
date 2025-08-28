
public class VowelsGame {
    public static void main(String[] args) {
        String str="am a legendu";
         char[] arr={'a','e','i','o','u'};
         int n=str.length();
         String str1="";
         for(int i=0;i<n;i++){
             boolean flag=false;
             if(str.charAt(i)=='u') {
                 str1 += "a";
                 flag=true;
             }
             for(int j=0;j<arr.length-1;j++) {
                 if (str.charAt(i)==arr[j]) {
                      flag=true;
                      str1+=arr[j+1];
                 }
             }
             if(!flag)
                 str1+= str.charAt(i);
         }
         System.out.println(str1);
    }
}

