public class CardRunner {
  public static void main(String args[]){
    TerrapinCard cardBilly = new TerrapinCard (20);
    TerrapinCard cardBrian = new TerrapinCard (30);

    cardBilly.payGourmet();
    cardBrian.payEconomical();

    System.out.print("Billy: ");
    cardBilly.toString();
    System.out.print("Brian: ");
    cardBrian.toString();

    cardBilly.loadMoney(20);
    cardBrian.payGourmet();

    System.out.print("Billy: ");
    cardBilly.toString();
    System.out.print("Brian: ");
    cardBrian.toString();

    cardBilly.payEconomical();
    cardBilly.payEconomical();
    cardBrian.loadMoney(50);

    System.out.print("Billy: ");
    cardBilly.toString();
    System.out.print("Brian: ");
    cardBrian.toString();
  }
}
