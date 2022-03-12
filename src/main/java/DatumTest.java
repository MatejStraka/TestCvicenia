import java.util.Scanner;

public class DatumTest {

    public static void main(String[] args) {
        Datum mojDatum = new Datum(0,0,0);
        Scanner input = new Scanner(System.in);
        System.out.println("Zadaj den:");
        int den = input.nextInt();
        mojDatum.setDen(den);

        System.out.println("Zadaj mesiac:");
        int mesiac = input.nextInt();
        mojDatum.setMesiac(mesiac);

        System.out.println("Zadaj rok:");
        int rok = input.nextInt();
        mojDatum.setRok(rok);

        mojDatum.zobrazDatum();

    }
}