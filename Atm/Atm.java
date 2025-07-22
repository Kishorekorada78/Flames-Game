package Atm;

public class Atm {
    private double balance;
    private double withdrawAmount;
    private double depositAmount;
      public Atm() {
          super();
      }
    public double getBalance(){
        return balance;
    }
      public void setBalance(double balance){
          this.balance=balance;
      }
      public double getDepositAmount(){
          return depositAmount;
      }
      public void setDepositAmount(double depositAmount){
          this.depositAmount=depositAmount;
      }
      public double getWithdrawAmount(){
          return withdrawAmount;
      }
      public void setWithdrawAmount(double withdrawAmount){
          this.withdrawAmount=withdrawAmount;
      }

    @Override
    public String toString() {
        return "Atm{" +
                "balance=" + balance +
                ", withdraw=" + withdrawAmount +
                ", depositAmount=" + depositAmount +
                '}';
    }
}
