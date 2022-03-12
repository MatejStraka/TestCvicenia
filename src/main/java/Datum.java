public class Datum {
    private int den;
    private int mesiac;
    private int rok;

    public Datum(int novyDen, int mesiac, int rok){
        den = novyDen;
        this.mesiac = mesiac;
        this.rok = rok;
    }

    public int getDen(){
        return den;
    }

    public int getMesiac(){
        return mesiac;
    }

    public int getRok(){
        return rok;
    }

    public void setDen(int newDen){
        den = newDen;
    }

    public void setMesiac(int novyMesiac){
        if(novyMesiac>12) {
            mesiac = 12;
        } else {
            mesiac = novyMesiac;
        }
    }

    public void setRok(int novyRok){
        rok = novyRok;
    }

    public String zobrazDatum(){
        System.out.printf("Sformatovany datum %d/%d/%d \n", den, mesiac, rok);
        return den+"/"+mesiac+"/"+rok;
    }
}
