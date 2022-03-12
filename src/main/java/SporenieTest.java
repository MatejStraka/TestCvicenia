public class SporenieTest {

    public static void main(String[] args) {
        Sporenie.setRocnyUrok(0.04);

        Sporenie ucet1 = new Sporenie(1000);
        Sporenie ucet2 = new Sporenie(2000);

        ucet1.spocitajMesacnyUrok();
        ucet2.spocitajMesacnyUrok();

        System.out.println(ucet1.getNasporenaSuma());
        System.out.println(ucet2.getNasporenaSuma());

        Sporenie.setRocnyUrok(0.05);

        ucet1.spocitajMesacnyUrok();
        ucet2.spocitajMesacnyUrok();

        System.out.println(ucet1.getNasporenaSuma());
        System.out.println(ucet2.getNasporenaSuma());
    }
}
