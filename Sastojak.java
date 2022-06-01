package Nedelja8Sreda;

public class Sastojak {
    private String nazivSastojka;
    private double cenaSastojka;

    public Sastojak(String nazivSastojka, double cenaSastojka) {
        this.nazivSastojka = nazivSastojka;
        this.cenaSastojka = cenaSastojka;
    }

    public Sastojak() {
        this.nazivSastojka = "";
        this.cenaSastojka = 0.0;
    }

    public String getNazivSastojka() {
        return nazivSastojka;
    }

    public void setNazivSastojka(String nazivSastojka) {
        this.nazivSastojka = nazivSastojka;
    }

    public double getCenaSastojka() {
        return cenaSastojka;
    }

    public void setCenaSastojka(double cenaSastojka) {
        this.cenaSastojka = cenaSastojka;
    }
}
