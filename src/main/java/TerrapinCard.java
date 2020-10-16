public class TerrapinCard{

  private double balance;

  public TerrapinCard(double cBalance) {
    // write code here
    balance = cBalance;
  }

  public String toString() {
    // write code here
    System.out.println("The card has " + balance + " dollars");
    return "The card has " + balance + " dollars";
  }

  public void payEconomical() {
    // write code here
    if ((balance - 2.50) >= 0.00)
    {
    balance = balance - 2.50;
    }
  }

  public void payGourmet() {
    // write code here
    if ((balance - 4.00) >= 0.00)
    {
    balance = balance - 4.00;
    }
  }

  public void loadMoney(double amount) {
    //write code here
    if (amount > 0)
    {
      balance = balance + amount;
    }
  }
}