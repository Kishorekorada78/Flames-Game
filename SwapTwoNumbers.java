public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a=10,b=100;
        System.out.print(a+" "+b +"\n");
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+b);
    }
}
