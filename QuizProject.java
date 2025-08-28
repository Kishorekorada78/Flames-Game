
import java.util.*;
public class QuizProject {
    public static void main(String[] args) {
        Scanner kk=new Scanner(System.in);
        //System.err.println("\"Welcome to Mini Quiz\"");
        System.out.println("The Questions are based on java language\nLet's Goooo...");
        int[] ans={3,2,3,1,4};
        int n=ans.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            switch(i){
                case 0:
                    System.out.println("I. Which is not a java version?\n1.JDK alpha and Beta\n2.JDK SE 10\n3.Python 1.3.2\n4.JDK SE 18");
                    break;
                case 1:
                    System.out.println("\nII. In which months even and odd version are released ?\n1.March,June\n2.March,September\n3.April,September\n4.April,May");
                    break;
                case 2:
                    System.out.println("\nIII. Which is not a types of variables ?\n1.Local Variable\n2.Instance Variable\n3.Global Variable\n4.Static Variable");
                    break;
                case 3:
                    System.out.println("\nIV. Which is valid identifer ?\n1._java\n2.123java\n3.Java'test\n4.j-lan");
                    break;
                case 4:
                    System.out.println("\nV. What is the size of int data type?\n1.2 byte\n2.3 byte\n3.5 byte\n4.4 byte");
                    break;
            }
            System.out.print("Your Option: ");
            int tar=kk.nextInt();
            if(tar==ans[i]) {
                System.out.println("That's Correct: " + tar);
                count++;
            }
            else {
                System.out.println("Sorry it is wrong: " + tar);
                System.out.println("Correct One: " + ans[i]);
            }
        }
  if(count>=3)
      System.out.println("\nYou are Brilliant ....\n"+"Your score: "+count+"/"+n);
  else
      System.out.println("\nWell try Buddy....\n"+"Your score: "+count+"/"+n);
    }
}
