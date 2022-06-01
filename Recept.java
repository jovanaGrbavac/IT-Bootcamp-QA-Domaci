package Nedelja8Sreda;

import java.util.ArrayList;

public class Recept {
    private String nazivRecepta;
    private int tezinaRecepta;
    public ArrayList<SastojakRecepta> sastojci;


    public Recept(String nazivRecepta, int tezinaRecepta, ArrayList<SastojakRecepta> sastojci) {
        this.nazivRecepta = nazivRecepta;
        this.tezinaRecepta = tezinaRecepta;

        this.sastojci = sastojci;
    }

    public Recept(){
        this.nazivRecepta = "";
        this.tezinaRecepta = 1;
        this.sastojci = new ArrayList<>();
    }

    public String getNazivRecepta() {
        return nazivRecepta;
    }

    public int getTezinaRecepta() {
        return tezinaRecepta;
    }

    public ArrayList<SastojakRecepta> getSastojci() {
        return sastojci;
    }

    public void dodajSastojak(SastojakRecepta sastojak){
        sastojci.add(sastojak);
    }

    public void ukloniSastojak(SastojakRecepta sastojak){
        sastojci.remove(sastojak);
    }

    public String tezina ( ){

       switch (tezinaRecepta){
            case 1: return "Pocetni";
            case 2:  return "Lak";
            case 3: return "Srednji";
            case 4: return "Tezak";
            case 5: return "Majstorski";
            default: return "Unesite broj od 1 do 5.";

        }
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Naziv recepta je: ").append(nazivRecepta.toString()).append(".").append("\n");
        sb.append(tezina().toString()).append(" nivo.").append("\n");
        sb.append("Sastojci: ");
        for (SastojakRecepta sastojak: sastojci) {
            sb.append(sastojak.getNazivSastojka() + ", ");
        }

        return sb.toString();
    }
}
