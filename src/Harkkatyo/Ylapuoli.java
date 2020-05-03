package Harkkatyo;

import java.util.ArrayList;
import java.util.Collections;

public class Ylapuoli extends Poytakirja{
    
    ArrayList<Boolean> ylaonkoKaytetty = new ArrayList<Boolean>(Collections.nCopies(7, false)); //Boolean arraylist, jolla voidaan tarkistaa onko kyseinen yhdistelmä jo käytetty  
    ArrayList<Integer> Ylapisteet = new ArrayList<Integer>(Collections.nCopies(6, 0)); //Arraylist johon joka kierroksella tallennetaan jokaisen mahdollisen yhdistelmän pisteet
    ArrayList<Integer> NopanTulokset = new ArrayList<Integer>(Collections.nCopies(6, 0)); //Nopat
    int ylapuoliPisteet = 0; //Yläpuolen yhteispisteet
    int Bonus = 0; //Mahdolliset bonuspisteet

    public ArrayList<Integer> ylaTulokset(ArrayList<Integer> Nopat){ //Lasketaan kuinka monta kutakin nopan silmälukua on
       for(int i = 0; i < Nopat.size(); i++){ 
           if(Nopat.get(i) == 1){
               NopanTulokset.set(0, (1 + NopanTulokset.get(0)));
           }
           else if(Nopat.get(i) == 2){
               NopanTulokset.set(1, (2 + NopanTulokset.get(1)));
           }
           else if(Nopat.get(i) == 3){
               NopanTulokset.set(2, (3 + NopanTulokset.get(2)));
           }
           else if(Nopat.get(i) == 4){
               NopanTulokset.set(3, (4 + NopanTulokset.get(3)));
           }
           else if(Nopat.get(i) == 5){
               NopanTulokset.set(4, (5 + NopanTulokset.get(4)));
           }
           else if(Nopat.get(i) == 6){
               NopanTulokset.set(5, (6 + NopanTulokset.get(5)));
           }
        }
        return(NopanTulokset);
    }
    
    //Seuraavat metodit laskevat alapuolen yhdistelmien pisteitä
    
    
    public int YlapuolenPisteet(String PValinta){
        if("ykkoset".equalsIgnoreCase(PValinta)){
            if(ylaonkoKaytetty.get(0) == false){
                ylaonkoKaytetty.set(0, true);
                ylapuoliPisteet += NopanTulokset.get(0);
                System.out.println("Pisteet:" + NopanTulokset.get(0));
            }
            else{
                System.out.println("Olet jo käyttänyt tämän yhdistelmän, valitse toinen.");
                return 1;
            }
        }
        else if("kakkoset".equalsIgnoreCase(PValinta)){
            if(ylaonkoKaytetty.get(1) == false){
                ylaonkoKaytetty.set(1, true);
                ylapuoliPisteet += NopanTulokset.get(1);
                System.out.println("Pisteet:" + NopanTulokset.get(1));
            }
            else{
                System.out.println("Olet jo käyttänyt tämän yhdistelmän, valitse toinen.");
                return 1;
            }
        }
        else if("kolmoset".equalsIgnoreCase(PValinta)){
            if(ylaonkoKaytetty.get(2) == false){
                ylaonkoKaytetty.set(2, true);
                ylapuoliPisteet += NopanTulokset.get(2);
                System.out.println("Pisteet:" + NopanTulokset.get(2));
            }
            else{
                System.out.println("Olet jo käyttänyt tämän yhdistelmän, valitse toinen.");
                return 1;
            }
        }
        else if("neloset".equalsIgnoreCase(PValinta)){
            if(ylaonkoKaytetty.get(3) == false){
                ylaonkoKaytetty.set(3, true);
                ylapuoliPisteet += NopanTulokset.get(3);
                System.out.println("Pisteet:" + NopanTulokset.get(3));
            }
            else{
                System.out.println("Olet jo käyttänyt tämän yhdistelmän, valitse toinen.");
                return 1;
            }
        }
        else if("vitoset".equalsIgnoreCase(PValinta)){
            if(ylaonkoKaytetty.get(4) == false){
                ylaonkoKaytetty.set(4, true);
                ylapuoliPisteet += NopanTulokset.get(4);
                System.out.println("Pisteet:" + NopanTulokset.get(4));
            }
            else{
                System.out.println("Olet jo käyttänyt tämän yhdistelmän, valitse toinen.");
                return 1;
                
            }
        }
        else if("kutoset".equalsIgnoreCase(PValinta)){
            if(ylaonkoKaytetty.get(5) == false){
                if(NopanTulokset.get(5) != 0){
                ylaonkoKaytetty.set(5, true);
                ylapuoliPisteet += NopanTulokset.get(5);
                System.out.println("Pisteet:" + NopanTulokset.get(5));
                }
            }
            else{
                System.out.println("Olet jo käyttänyt tämän yhdistelmän, valitse toinen.");
                return 1;
            }
        }
        else{
            return 2;
        }
        System.out.println("");
        System.out.println("Tämän hetkiset yläpuolen pisteet: " + ylapuoliPisteet);
        if(ylapuoliPisteet >= 63){                                                          //Lisätään mahdolliset bonuspisteet jos välisumma on suurempi tai yhtäsuuri kuin 63
            System.out.println("Onneksi olkoon, saat lisätä itsellesi 50 pisteen bonuksen!");
            Bonus += 50;
            System.out.println("Yläpuolenpisteet :" + ylapuoliPisteet + "ja bonus: " + Bonus);
        }
        return 0;
    }
    public Ylapuoli(){
    }
    
    //Resetoidaan välimuisti erroreiden estämiseksi
    
    public void resetYlapuoli(){
        NopanTulokset = new ArrayList<Integer>(Collections.nCopies(6, 0));
    }
}