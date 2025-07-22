package Atm;

import java.util.*;

public class AtmOperations  implements AtmInterface{
     Atm atm=new Atm();
     Map<Double,String> map=new HashMap<Double,String>();
    public void depositAmount(double depositAmount) {
    System.out.println("depositedAmount: "+depositAmount);
    atm.setBalance(atm.getBalance()+depositAmount);
    map.put(depositAmount,"Deposited Successfully");
    }

    public void viewBalanace() {
   System.out.println("Available Balance: "+atm.getBalance());
    }

    public void withdrawAmount(double withdrawAmount) {
          if(withdrawAmount%500==0){
              if(withdrawAmount<=atm.getBalance()){
                  System.out.println("Collect the cash "+withdrawAmount);
                   atm.setBalance(atm.getBalance()-withdrawAmount);
                   map.put(withdrawAmount,"Amount withdrawn");
                   viewBalanace();
              }else {
                  System.out.println("Insufficient balance");
              }
          }
              else
                  System.out.println("Enter the amount in terms of 500");
    }

    @Override
    public void viewMiniStatement() {
      Set<Double> set=map.keySet();
      for (Double d:set){
          System.out.println(d+"="+map.get(d));
      }
    }
}
