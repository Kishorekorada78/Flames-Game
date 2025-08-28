
import java.util.*;
public class CurrencyConvertor {
    public static void main(String[] args) {
        System.out.println(" Welcome to Currency Convertor");
        Scanner kk=new Scanner(System.in);
        System.out.print(" Enter Amount : ");
        int amount=kk.nextInt();
        System.out.print(" Here is a list of currency converting options.\n 1. INR to USD & USD to INR \n 2. INR to Euro & Euro to INR \n 3. INR to Singapore Dollar & \n    Singapore Dollar to INR\n 4. INR to Kuwait Dinar & Kuwait Dinar to INR \n Choose the option : ");
        int option=kk.nextInt();
            switch (option) {
                case 1:
                    double b = amount * 85.2;
                    double c = amount * 0.012;
                    System.out.println(" INR to USD = $" + c);
                    System.out.println(" USD to INR = " + b + " Rupees");
                    break;
                case 2:
                    double d = amount * 97.0533;
                    double e = amount * 0.0103;
                    System.out.println(" INR to Euro= " + e + " EUR");
                    System.out.println(" Euro to INR = " + d + " Rupees");
                    break;
                case 3:
                    double f = amount * 0.0154;
                    double g = amount * 65.10;
                    System.out.println(" INR to Singapore Dollar=" + f + " SGD");
                    System.out.println(" Singapore Dollar to INR = " + (float) g + " Rupees");
                    break;
                case 4:
                    double h = amount * 0.0036;
                    double i = amount * 280.82;
                    System.out.println(" INR to Kuwait Dinar =" + (float)h + " KWD");
                    System.out.println(" Kuwait Dinar to INR = " + (float) i + " Rupees");
                    break;
                default:
                    System.out.println("Invalid Option !... Try Again ");
            }
   System.out.println("Thank you for Visiting ...");
    }
}
