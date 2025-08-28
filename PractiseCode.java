import javax.swing.*;
import java.lang.reflect.Array;
import java.util.*;

import static java.lang.Math.ceil;

public class PractiseCode {
    public static <floor> void main(String[] args) {
        Scanner kk = new Scanner(System.in);
//        int[][] arr = new int[3][3];
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                arr[i][j] = kk.nextInt();
//            }
//        }
//        int[][] arr={{1,1,2},{0,1,1},{0,0,1}};
//        int n=arr.length;
//        boolean b=true;
//        for(int i=0;i<n;i++){
//            for(int j=i;j<n;j++){
//                if(arr[i][j]==0) {
//                    b = false;
//                    break;
//                }
//            }
//        }
//        if(b)
//            System.out.println("true");
//        else
//
//            System.out.println("False");
//        String str="level";
//        String str1="";
//        int count=1;
//        for(int i=0;i<str.length()-1;i++) {
//            if (count < 2) {
//                for (int j = 1; j < str.length(); j++) {
//                    if (str.charAt(i) == str.charAt(j)) {
//                        count++;
//                        str1 = str1 + str.charAt(i);
//                    }
//                }
//            }
//        }
//
//    System.out.println(str1+count);
//        String str = "KIS@#KI123#";
//        int n = str.length();
//        int dig=0,let=0,spl=0;
//        if (n > 8 && n < 15) {
//            for (char c:str.toCharArray()) {
//                  if(Character.isDigit(c))
//                      dig++;
//                  else if(Character.isLetter(c))
//                      let++;
//                  else if(!Character.isWhitespace(c))
//                      spl++;
//            }
//        }
//        if(dig>=2 && spl>=3 && let>=3)
//            System.out.println("valid password");
//        else
//            System.out.println("Invalid ");
        // first non repeating character
//        String s="abcdcdeffh";
//        int n=s.length();
//        for(int i=0;i<n-1;i++){
//            if(s.charAt(i)!=s.charAt(i+1)){
//                System.out.println(s.charAt(i));
//                break;
//            }
//
//        }
//        int n=2;
//     for(int i=0;i<5;i++){
//         for(int j=0;j<=i;j++){
//             int temp=nextprime((n));
//             System.out.print(temp+" ");
//             n=temp+1;
//         }
//         System.out.println();
//     }
//
//    }
//    public static int nextprime(int n) {
//        while (true) {
//            int count = 0;
//            for (int i = 2; i <= n / 2; i++) {
//                if (n % i == 0) {
//                    count++;
//                    break;
//                }
//            }
//            if (count == 0 && n > 1)
//                return n;
//            n++;
//        }
//        String str="a1b2c3d4";
//       // String s="";
//        int n=1,m=0;
//        int k=str.length();
//        while(n<k) {
//            for (int i = 0; i < str.charAt(n)-'0'; i++) {
//                System.out.print( str.charAt(m));
//            }
//            n=n+2;
//            m=m+2;
//        }
        // second largest number
        //[ 1 4 5 7 2 9]
//        int arr[]={1,2,3,5,2,1};
//        int result=palindrome(arr);
//        if(result==1)
//             System.out.println("Palindrome");
//        else
//            System.out.println("Not Palindrome");
//   }
//   public static int palindrome(int[] arr){
//        int n= arr.length;
//        int[] rev=new int[n];
//        if(n<2)
//            return 0;
//        int k=0;
//        for(int i=n-1;i>=0;i--)
//        {
//            rev[k]=arr[i];
//            k++;
//        }
//        for(int i=0;i<n;i++)
//        {
//            if(arr[i]!=rev[i])
//                return 0;
//        }
//
//        return 1;
//        int arr[]={1,4,1,3,3,3,4,1};
//        System.out.println(distinctCount(arr));
//   }
//     public static int distinctCount(int[] arr){
//        int n=arr.length;
//        int count=0;
//        for(int i=0;i<n;i++){
//            boolean dc=true;
//            for(int j=i-1;j>=0;j--){
//                if(arr[i]==arr[j])
//                    dc=false;
//            }
//            if(dc)
//                count++;
//        }
//        return count;
        //       [ 1,0,3,4,0,9,0]
        //[1,3,4,9,0,0,0]
        // password checker
        // starting value not digit
        // contains one digit
        // contains one uppercase
        // does not contains " " and /
        // length>4
//        int[] arr = {10, 5, 20, 5, 10, 5};
//        int n = arr.length;
//        for (int i = 0; i < n; i++) {
//            boolean flag = false;
//            for (int j = i-1; j >=0; j--) {
//                    if(arr[i]==arr[j]){
//                        flag=true;
//                        break;
//                        }
//            }
//            int count = 1;
//            if (flag)
//                continue;
//            else {
//                for (int j = i + 1; j < n; j++) {
//                    if (arr[i] == arr[j])
//                        count++;
//                }
//            }
//            System.out.println(arr[i]+" "+count);
//
//        int nums[] = {41, 65, 14, 80, 20, 10, 55, 58, 24, 56, 28, 86, 96, 10, 3,-1, 84, 4, 41, 13, 32, 42, 43, 83, 78, 82, 70, 15, -41};
//        System.out.println(arraySign(nums));
//    }
//            public static int arraySign(int[] nums) {
//                int n=nums.length;
//                double pos=1;
//                int neg=0;
//                for(int i=0;i<n;i++){
//                    if(nums[i]<0)
//                        neg++;
//                    pos=pos*nums[i];  //[41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41]
//                }
//                if(pos==0)
//                    return 0;
//                else if(neg%2!=0 || pos<0)
//                    return -1;
//                else
//                    return 1;
//        Bike b = () -> {
//            int num=9987;
//            if(num%2==0)
//            System.out.println("Even ");
//            else
//            System.out.println("Odd ");
//            return num;
//        };System.out.println(b.para());
//        Bike c=new Bike() {
//            @Override
//            public int para() {
//                int kk=20;
//                return kk;
//            }
//        };
//        System.out.println(c.para());
//    }
//    interface Bike {
////        public int para();
//        int n=5,k=2;
//        int count=0;
//        while(count<n){
//            if(prime(k)) {
//                System.out.print(k);
//                count++;
//                if (count < n)
//                    System.out.print(" ");
//            }
//            k++;
//        }
//
//    }
//    public static boolean prime(int num){
//        if(num==2)
//            return true;
//        if(num%2==0)
//            return false;
//        for(int i=3;i*i<=num;i+=2)
//        {
//            if(num%i==0)
//                return false;
//        }
//        return true;
//        int n=5;
//        for(int i=1;i<=n;i++) {
//            for (int j = n; j > i; j--) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= i; k++)
//                System.out.print("* ");
//            System.out.println();
//        }
//        for(int i=4;i>=1;i--) {
//            for (int j = n; j > i; j--) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= i; k++)
//                System.out.print("* ");
//            System.out.println();
//        }
        // Lamda Expression: it is a way of writing a code to minimize by the anonymous function
        // Syntax : (Arguments), -> , { Function body }
        // with lamda expression
//          house h1=() -> "Kishore";
//          System.out.println(h1.getgate());
//          house h3=() -> {
//              int speed =100;
//              System.out.println(speed);
//              return "Pora";
//          };System.out.println(h3.getgate());
//          owner h2=new owner();
//          System.out.println(h2.getgate());
//    }
//}
//// without lamda expression
//    class owner implements house{
//        public String getgate(){
//            String  amount="100";
//         System.out.println("Owner implemnets house ");
//         return amount;
//        fun((a1,str) -> System.out.println(str+a1),10,"siri");
//        }
//        static void fun(house h1,int a1,String str){
//        h1.getgate(a1,str);
//        }
//    }
//
//  interface house{
//    public void getgate(int a1,String str);
        //}
        // tic tac toe
//      int[] arr={10,20,30,40,50,60};
//      int[] ar1={10,20,30,40,50,60};
//      int[] ar2={20,30,40};
//        String[] str1={"Dubai","America","Russia"};
//         List<String> list=Arrays.asList(str1);
//         List<Integer> list2=new ArrayList<>(Arrays.asList(1,2,3,5,6,7));
//         str1[0]="India";
//         list.set(2,"Japan");
//         System.out.println(list);
//        System.out.println(list2);
//          Student[] students={
//                  new Student(100,"Kishore",500),
//                  new Student(101,"Nkhil",400),
//                  new Student(109,"raju",350),
//                  new Student(107,"bhuva",450)
//          };
//        Arrays.sort(students,Student);
//        System.out.println(Arrays.toString(students));
//
//      }
//      public class Student {
//        int rollno;
//        String name;
//        int marks;
//        Student(int rollno,String name, int marks){
//            this.rollno=rollno;
//            this.name=name;
//            this.marks=marks;
//        }
//        class adho implements Comparable<Student>{
//            int poin
//
//            @Override
//            public int compareTo(Student o) {
//                return 0;
//            }
//        }
//        @Override
//        public String toString(){
//            return rollno+" "+name+" "+marks;
//        }
//
//          @Override
//          public int compareTo(Top1 o) {
//              return 1;
//          }
        String str1 = kk.next();
        String str2 = kk.next();
      //  FlamesFinding(str1, str2);
        System.out.println(FlamesFinding(str1,str2));
    }

    static String FlamesFinding(String s1, String s2) {
        List<Character> l1 = new ArrayList<>();
        List<Character> l2 = new ArrayList<>();
        for (char c : s1.toLowerCase().toCharArray())
            l1.add(c);
        for (char c : s2.toLowerCase().toCharArray())
            l2.add(c);
        Iterator<Character> it = l1.iterator();
        while (it.hasNext()) {
            char ch = it.next();
            if (l2.contains(ch)) {
                it.remove();
                l2.remove((Character) ch);
            }
        }
        l1.addAll(l2);
      //  System.out.println(l1);
        //System.out.println(l2);
        int k = l1.size();
        System.out.println(k);
        String str="flames";
        LinkedList<Character> list = new LinkedList<>();
        for(char c:str.toCharArray())
            list.add(c);
        Iterator<Character> it1 = list.iterator();
        while (list.size() > 1) {
            int count = 0;
            while (count < k) {
                while (count < k && it1.hasNext()) {
                    it1.next();
                    count++;
                }
                if (count < k) {
                    it1 = list.iterator();
                    it1.next();
                    count++;
                }
            }
            it1.remove();
        }
        switch(list.getFirst()){
            case 'f':
               return "Friends";
            case 'l':
               return "Love";
            case 'a':
                return "Affection";
            case 'm':
               return "Marriage";
            case 'e':
               return "Enemy";
            case 's':
               return "Siblings";
        }
        return "Nothing";
    }
}

