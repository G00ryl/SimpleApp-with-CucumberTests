import org.junit.Assert;
import org.junit.Test;

public class TestBankomatu {

    @Test
    public void TestWplaty(){
        Bankomat atm = new Bankomat();
        atm.wplataPieniedzy(200);
        Assert.assertTrue(atm.pokazSaldo()==200);
        atm.wplataPieniedzy(-250);
        Assert.assertTrue(atm.pokazSaldo()==200);
    }

    @Test
    public void TestWyplaty(){
        Bankomat atm = new Bankomat();
        atm.wyplataPieniedzy(200);
        Assert.assertTrue(atm.pokazSaldo()==0);
        atm.wplataPieniedzy(-250);
        Assert.assertTrue(atm.pokazSaldo()==0);
        atm.wplataPieniedzy(250);
        Assert.assertTrue(atm.pokazSaldo()==250);
    }
}
