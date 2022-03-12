import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSporenie {

    @Test
    public void TestNasporenejSumy(){
        Sporenie.setRocnyUrok(0.04);
        Sporenie ucet1 = new Sporenie(1000);
        Sporenie ucet2 = new Sporenie(2000);

        ucet1.spocitajMesacnyUrok();
        ucet2.spocitajMesacnyUrok();
        Assert.assertEquals(ucet1.getNasporenaSuma(), 1003.3333333333334);
        Assert.assertEquals(ucet2.getNasporenaSuma(), 2006.6666666666667);
    }

    @Test
    public void TestNasporenejSumyPoZvyseniUroku(){
        Sporenie.setRocnyUrok(0.04);
        Sporenie ucet1 = new Sporenie(1000);
        Sporenie ucet2 = new Sporenie(2000);

        ucet1.spocitajMesacnyUrok();
        ucet2.spocitajMesacnyUrok();

        Sporenie.setRocnyUrok(0.05);
        ucet1.spocitajMesacnyUrok();
        ucet2.spocitajMesacnyUrok();

        Assert.assertEquals(ucet1.getNasporenaSuma(), 1007.5138888888889);
        Assert.assertEquals(ucet2.getNasporenaSuma(), 2015.0277777777778);
    }
}
