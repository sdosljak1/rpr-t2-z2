package ba.unsa.etf.rpr.tutorijal02;

public class Interval {

    private double pocetna;
    private double krajnja;
    private boolean pocetnaPripada;
    private boolean krajnjaPripada;

    public Interval(double pocetna, double krajnja, boolean pocetnaPripada, boolean krajnjaPripada) {
        if (pocetna > krajnja) throw new IllegalArgumentException;
        this.pocetna = pocetna;
        this.krajnja = krajnja;
        this.pocetnaPripada = pocetnaPripada;
        this.krajnjaPripada = krajnjaPripada;
    }

    public Interval() {
        pocetna = 0;
        krajnja = 0;
        pocetnaPripada = false;
        krajnjaPripada = false;
    }

    public boolean isNull() {
        if( pocetna == krajnja )return true;
        return false;
    }


}
