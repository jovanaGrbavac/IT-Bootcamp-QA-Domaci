package Nedelja8Sreda;

public class SastojakRecepta extends Sastojak {

    private double kolicinaSastojaka;

    public SastojakRecepta(double kolicinaSastojaka) {
        this.kolicinaSastojaka = kolicinaSastojaka;
    }

    public SastojakRecepta(String nazivSastojka, double cenaSastojka, double kolicinaSastojaka) {
        super(nazivSastojka, cenaSastojka);
        this.kolicinaSastojaka = kolicinaSastojaka;
    }


    public SastojakRecepta(){
        this.kolicinaSastojaka = 0.0;
    }

    public double getKolicinaSastojaka() {
        return kolicinaSastojaka;
    }

    public void setKolicinaSastojaka(double kolicinaSastojaka) {
        this.kolicinaSastojaka = kolicinaSastojaka;
    }

    public double ukupnaCenaSastojka() {
        double cena = getCenaSastojka() * getKolicinaSastojaka();
        return cena;





    }



}
