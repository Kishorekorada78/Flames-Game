import java.util.Scanner;
public class Leetcodeproblem {
    public static void main(String[] args) {
        Scanner kk=new Scanner(System.in);
        String str=kk.nextLine().toUpperCase();
        int result=getvalue(str);
        System.out.println(result);
    }
    public static int getvalue(String str) {
        int n = str.length();
        int total=0;
        for (int i = 0; i < n; i++) {
            int value = resultvalue(str.charAt(i));
            if(value==-1)
                System.out.println("Not valid");
            if(i+1<n && value<resultvalue(str.charAt(i+1)))
                total-=value;
            else
                total+=value;
        }
        return total;
    }
    public static int resultvalue(char ch)
        {
            switch(ch) {
                case 'I':
                    return 1;
                case 'V':
                    return 5;
                case 'X':
                    return 10;
                case 'L':
                    return 50;
                case 'C':
                    return 100;
                case 'D':
                    return 500;
                case 'M':
                    return 1000;
                default:
                    return -1;
            }
        }
    }


