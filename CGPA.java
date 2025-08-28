import java.util.Scanner;
public class CGPA {
    public static void main(String[] args) {
        Scanner kk = new Scanner(System.in);
        System.err.println("Enter Either Capital | Small Characters For Grades");
        System.out.print("Total Subjects: ");
        int n = kk.nextInt();
        float cal = 0,addc=0;
        for (int i = 1; i <= n; i++) {
            System.out.print("\nEnter Subject-" + i + " Grade: ");
            char ch = kk.next().charAt(0);
            ch = Character.toUpperCase(ch);
            System.out.print("Enter Subject-" + i + " Credits: ");
            float k = kk.nextFloat();
            addc=addc+k;
            int total;
            switch (ch) {
                case 'S': {
                    total = 10;
                    cal = cal + total * k;
                    break;
                }
                case 'A': {
                    total = 9;
                    cal = cal + total * k;
                    break;
                }
                case 'B': {
                    total = 8;
                    cal = cal + total * k;
                    break;
                }
                case 'C': {
                    total = 7;
                    cal = cal + total * k;
                    break;
                }
                case 'D': {
                    total = 6;
                    cal = cal + total * k;
                    break;
                }
                case 'E': {
                    total = 5;
                    cal = cal + total * k;
                    break;
                }
                case 'F': {
                    total = 0;
                    cal = cal + total * k;
                    break;
                }
                default:
                    System.out.println("Enter Only (S|A|B|C|D|E|F) this characters Dude");
            }
            if (i == n) {
                System.out.println("Superb Buddy..... \nFew More Steps...\nEnter Your total Labs");
                int l = kk.nextInt();
                for (int s = 1; s <= l; s++) {
                    System.out.print("\nEnter Lab-" + s + " Grade: ");
                    char ch1 = kk.next().charAt(0);
                    ch1 = Character.toUpperCase(ch);
                    System.out.print("Enter Lab-" + s + " Credits: ");
                    float k1 = kk.nextFloat();
                    addc+=k;
                    switch (ch1) {
                        case 'S': {
                            total = 10;
                            cal = cal + total * k;
                            break;
                        }
                        case 'A': {
                            total = 9;
                            cal = cal + total * k;
                            break;
                        }
                        case 'B': {
                            total = 8;
                            cal = cal + total * k;
                            break;
                        }
                        case 'C': {
                            total = 7;
                            cal = cal + total * k;
                            break;
                        }
                        case 'D': {
                            total = 6;
                            cal = cal + total * k;
                            break;
                        }
                        case 'E': {
                            total = 5;
                            cal = cal + total * k;
                            break;
                        }
                    }
                }
                float result1=cal/addc;
                System.err.printf("CONGRATULATION DUDE YOU GOT %.2f  CGPA",result1);
            }
        }
    }
}
