public class Sporenie {

    private static double rocnyUrok;
    private double nasporenaSuma;

    public Sporenie(double suma){
        nasporenaSuma = suma;
    }

    public Sporenie(){
        nasporenaSuma = 0;
    }

    public double spocitajMesacnyUrok(){
        double zisk = nasporenaSuma*rocnyUrok/12;
        nasporenaSuma += zisk;
        return zisk;
    }

    public static void setRocnyUrok(double novyUrok){
        rocnyUrok = novyUrok;
    }

    public static double getRocnyUrok(){
        return rocnyUrok;
    }

    public void setNasporenaSuma(double novaSuma){
        nasporenaSuma = novaSuma;
    }

    public double getNasporenaSuma(){
        return nasporenaSuma;
    }

}
