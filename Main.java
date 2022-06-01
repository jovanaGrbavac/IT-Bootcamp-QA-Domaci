package Nedelja8Sreda;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Sastojak> lista = new ArrayList<>();
        lista.add(new Sastojak("jaje", 13));
        lista.add(new Sastojak("secer", 0.12));
        lista.add(new Sastojak("brasno", 0.1)); //dodala sastojke u listu sastojaka

        ArrayList<SastojakRecepta> lista2 = new ArrayList<>();

        lista2.add(new SastojakRecepta("jaje", 15, 5 ));
        lista2.add(new SastojakRecepta("brasno", 0.1, 300));      //dodala sastojke u drugu listu sa kolicinom

        SastojakRecepta sastojak2 = new SastojakRecepta("brasno", 0.15, 300);

        SastojakRecepta sastojak = new SastojakRecepta("voda", 0.25, 100); //ovde sam napravila sastojak koji dodajemo u listu

        System.out.println("Sastojak brasno cena: " + sastojak.ukupnaCenaSastojka());       //provera funkcije za cenu sastojka

        Recept cheesecake = new Recept("Cheesecake", 3, lista2);
        System.out.println("Tezina recepta: " + cheesecake.tezina());
        cheesecake.dodajSastojak(sastojak);             //ovde sam dodala sastojak
        System.out.println("Broj sastojaka: " + cheesecake.sastojci.size());
        cheesecake.ukloniSastojak(sastojak);            //ovde sam uklonila sastojak
        System.out.println("Broj sastojaka: " + cheesecake.sastojci.size());

        System.out.println(cheesecake.getTezinaRecepta());      //da li radi funkcija za pisanje tezine recepta

        System.out.println(cheesecake.toString());      //da li radi funkcija toString





    }
}