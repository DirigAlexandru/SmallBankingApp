import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;


public class Tests {

  ArrayList<ContBancar> contAlex = new ArrayList<ContBancar>();


  @Test
  public void Test1Salariu () {

    contAlex.add(new Depunere(1, "Salariu luna mai", "20190505", 10));

    InterogareSold interogare = new InterogareSold(contAlex);
    System.out.println(interogare.getBalance());//
    Assert.assertEquals(10, interogare.getBalance());
  }


  @Test
  public void Test2Demo () {

    contAlex.add(new Depunere(2, "Salariu luna mai", "20190505", 15));

    InterogareSold interogare = new InterogareSold(contAlex);
    System.out.println(interogare.getBalance());//
    Assert.assertEquals(15, interogare.getBalance());
  }
}
