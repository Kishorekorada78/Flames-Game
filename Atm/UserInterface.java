package Atm;

import java.util.*;

public class UserInterface {
    public static void main(String[] args) {
        AtmOperations imp=new AtmOperations();
        Scanner kk=new Scanner(System.in);
        int atmNum=123;
        int atmpin=456;
        System.out.println("Enter the Atm Number ");
        int atmNum2=kk.nextInt();
        System.out.println("Enter the Pin: ");
        int atmpin2=kk.nextInt();
        boolean status=true;
        while(status) {
            if (atmNum2 == atmNum && atmpin2 == atmpin) {
                System.out.println(" 1.ViewBalance\n 2.withdrawAmount\n 3.DepositAmount\n 4.MiniStatement\n 5.Exit");
                System.out.println("Enter the Choice: ");
                int choice = kk.nextInt();
                switch (choice) {
                    case 1:
                        imp.viewBalanace();
                        break;
                    case 2:
                        System.out.println("Enter the amount to withdraw: ");
                        double withdrawAmount = kk.nextDouble();
                        imp.withdrawAmount(withdrawAmount);
                        break;
                    case 3:
                        System.out.println("Enter the deposit Amount: ");
                        double depositAmount = kk.nextDouble();
                        imp.depositAmount(depositAmount);
                        break;
                    case 4:
                        imp.viewMiniStatement();
                        break;
                    case 5:
                        System.out.println("Collect Your Card\n Thank you");
                        status = false;
                        break;
                }
            } else {
                System.out.println("Incorrect Atm Pin Or Number");
            }
        }
    }
}
