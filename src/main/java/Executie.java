import java.util.ArrayList;


public class Executie {

  public static void main (String[] args) {

    ArrayList<ContBancar> contAlex = new ArrayList<ContBancar>();

    contAlex.add(new Depunere(1, "salar", "2019/10/05", 2000));
    contAlex.add(new Depunere(2, "taxa de protectie", "2019/10/10", 500));
    contAlex.add(new Retragere(1, "cumparaturi la kaufland", "2019/10/01", 100, "groceries"));
    contAlex.add(new Retragere(2, "cumparaturi la lidl", "2019/10/10", 50, "groceries"));
    contAlex.add(new Retragere(3, "shopping", "2019/10/11", 160, "shopping"));
    contAlex.add(new Retragere(4, "abonament", "2019/10/30", 100, "transport"));
    contAlex.add(new Retragere(5, "taxi", "2019/10/15", 25, "transport"));

    InterogareSold b = new InterogareSold(contAlex);
    System.out.println("Actual balance is: " + b.getBalance());


  }

}

