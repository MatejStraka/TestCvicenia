import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Scanner;

public class TestDatum {

    @Test
    public void TestFormatDatumu(){

        Datum mojDatum = new Datum(0,0,0);
        mojDatum.setDen(12);
        mojDatum.setMesiac(3);
        mojDatum.setRok(2022);
        Assert.assertEquals(mojDatum.zobrazDatum(), "12/3/2022");
    }

    @Test
    public void TestMesiacVacsiAko12(){
        Datum mojDatum = new Datum(0,0,0);
        mojDatum.setDen(12);
        mojDatum.setMesiac(30);
        mojDatum.setRok(2022);
        Assert.assertEquals(mojDatum.zobrazDatum(), "12/12/2022");
    }
}
