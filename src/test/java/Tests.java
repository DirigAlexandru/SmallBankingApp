import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;


public class Tests {

    ArrayList<ContBancar> contAlex = new ArrayList<ContBancar>();


    @Test
    public void Test1Salariu() {

        contAlex.add(new Depunere(1, "Salariu luna mai", "20190505", 10));
        InterogareSold interogare = new InterogareSold(contAlex);
        System.out.println(interogare.getBalance());//
        Assert.assertEquals(10, interogare.getBalance());
    }

    @Test
    public void Test2Retragere() {
        contAlex.add(new Depunere(2, "Salariu luna mai", "20190801", 500));
        contAlex.add(new Retragere(3, "cumparaturi la piata", "20190816", 20, "Groceries"));
        InterogareSold interogare = new InterogareSold(contAlex);
        System.out.println(interogare.getBalance());
        Assert.assertEquals(480, interogare.getBalance());
    }

    @Test
    public void Test3ToStringDepunere() {
        String data = new String();
        double suma = 0;

        contAlex.add(new Depunere(2, "Salariu luna mai", "20190801", 500));
        System.out.println(contAlex.toString());

        for (ContBancar item : contAlex) {
            data = item.data;
            suma = item.suma;
        }
        Assert.assertEquals("[Depunere [data=" + data + ", suma=" + suma + "]]", contAlex.toString());
    }

    @Test
    public void Test4ToStringRetragere() {
        contAlex.add(new Retragere(3, "cumparaturi la piata", "20190816", 20, "Groceries"));
        System.out.println(contAlex.toString());
        Assert.assertEquals("["+contAlex.get(0)+"]", contAlex.toString());
    }
}