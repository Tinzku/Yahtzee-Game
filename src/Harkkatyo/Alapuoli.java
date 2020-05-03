package Harkkatyo;
import java.util.ArrayList;
import java.util.Collections;

public class Alapuoli extends Poytakirja {
    
    ArrayList<Boolean> alaonkoKaytetty = new ArrayList<Boolean>(Collections.nCopies(9, false)); //Boolean arraylist, jolla voidaan tarkistaa onko kyseinen yhdistelmä jo käytetty
    ArrayList<Integer> alaNopat = new ArrayList<Integer>(Collections.nCopies(6, 0)); //Nopat
    ArrayList<Integer> alaPisteet = new ArrayList<Integer>(Collections.nCopies(9, 0)); //Arraylist johon joka kierroksella tallennetaan jokaisen mahdollisen yhdistelmän pisteet
    int alapuoliPisteet = 0;

    public ArrayList<Integer> alaTulokset(ArrayList<Integer> Nopat){ //Lasketaan kuinka montako kutakin silmälukua on
        for(int i = 0; i < Nopat.size(); i++){ 
            if(Nopat.get(i) == 1){
               alaNopat.set(0, (1 + alaNopat.get(0)));
            }
            else if(Nopat.get(i) == 2){
                alaNopat.set(1, (1 + alaNopat.get(1)));
            }
            else if(Nopat.get(i) == 3){
                alaNopat.set(2, (1 + alaNopat.get(2)));
            }
            else if(Nopat.get(i) == 4){
                alaNopat.set(3, (1 + alaNopat.get(3)));
            }
            else if(Nopat.get(i) == 5){
               alaNopat.set(4, (1 + alaNopat.get(4)));
            }
            else if(Nopat.get(i) == 6){
                alaNopat.set(5, (1 + alaNopat.get(5)));
            }
        }
        YksiPari();
        KaksiParia();
        Kolmoisluku();
        Neloisluku();
        PieniSuora();
        SuuriSuora();
        Tayskasi();
        Sattuma();
        Yatzy();
        return(alaNopat);
    }

    public int AlapuolenPisteet(String PValinta){ //
        if("Yksi pari".equalsIgnoreCase(PValinta)){
            if(alaonkoKaytetty.get(0) == false){
                    alaonkoKaytetty.set(0, true);
                    alapuoliPisteet += alaPisteet.get(0);
                    System.out.println("Yhden parin pisteet:" + alaPisteet.get(0));
                }
            else{
                System.out.println("Olet jo käyttänyt tämän yhdistelmän, valitse toinen.");
                return 1;
            }
        }
        else if("Kaksi paria".equalsIgnoreCase(PValinta)){
            if(alaonkoKaytetty.get(1) == false){
                alaonkoKaytetty.set(1, true);
                alapuoliPisteet += alaPisteet.get(1);
                System.out.println("Kahden parin pisteet:" + alaPisteet.get(1));
            }
            else{
                System.out.println("Olet jo käyttänyt tämän yhdistelmän, valitse toinen.");
                return 1;
            }
        }
        else if("Kolmoisluku".equalsIgnoreCase(PValinta)){
            if(alaonkoKaytetty.get(2) == false){
                alaonkoKaytetty.set(2, true);
                alapuoliPisteet += alaPisteet.get(2);
                System.out.println("Kolmoisluvun pisteet:" + alaPisteet.get(2));
            }
            else{
                System.out.println("Olet jo käyttänyt tämän yhdistelmän, valitse toinen.");
                return 1;
            }
        }
        else if("Neloisluku".equalsIgnoreCase(PValinta)){ 
            if(alaonkoKaytetty.get(3) == false){
                alaonkoKaytetty.set(3, true);
                alapuoliPisteet += alaPisteet.get(3);
                System.out.println("Neloisluvun pisteet:" + alaPisteet.get(3));
            }
            else{
                System.out.println("Olet jo käyttänyt tämän yhdistelmän, valitse toinen.");
                return 1;
            }
        }
        else if("Pieni suora".equalsIgnoreCase(PValinta)){
            if(alaonkoKaytetty.get(4) == false){
                alaonkoKaytetty.set(4, true);
                alapuoliPisteet += alaPisteet.get(4);
                System.out.println("Pienen suoran pisteet:" + alaPisteet.get(4));
            }
            else{
                System.out.println("Olet jo käyttänyt tämän yhdistelmän, valitse toinen.");
                return 1;
            }
        }
        else if("Suuri suora".equalsIgnoreCase(PValinta)){
            if(alaonkoKaytetty.get(5) == false){
                alaonkoKaytetty.set(5, true);
                alapuoliPisteet += alaPisteet.get(5);
                System.out.println("Suuren suoran pisteet:" + alaPisteet.get(5));
            }
            else{
                System.out.println("Olet jo käyttänyt tämän yhdistelmän, valitse toinen.");
                return 1;
            }
        }
        else if("Tayskasi".equalsIgnoreCase(PValinta)){
            if(alaonkoKaytetty.get(6) == false){
                alaonkoKaytetty.set(6, true);
                alapuoliPisteet += alaPisteet.get(6);
                System.out.println("Täyskäden pisteet:" + alaPisteet.get(6));
            }
            else{
                System.out.println("Olet jo käyttänyt tämän yhdistelmän, valitse toinen.");
                return 1;
            }
        }
        
        else if("Sattuma".equalsIgnoreCase(PValinta)){
            if(alaonkoKaytetty.get(7) == false){
                alaonkoKaytetty.set(7, true);
                alapuoliPisteet += alaPisteet.get(7);
                System.out.println("Sattuman pisteet:" + alaPisteet.get(7));
            }
            else{
                System.out.println("Olet jo käyttänyt tämän yhdistelmän, valitse toinen yhdistelmä.");
                return 1;
            }
        }
        else if("Yatzy".equalsIgnoreCase(PValinta)){
            if(alaonkoKaytetty.get(8) == false){
                    alaonkoKaytetty.set(8, true);
                    alapuoliPisteet += alaPisteet.get(8);
                    System.out.println("Yatzyn pisteet:" + alaPisteet.get(8));
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
        System.out.println("Tämän hetkiset alapuolen pisteet: " + alapuoliPisteet);
        return 0;
    }


    //Seuraavat metodit laskevat alapuolen yhdistelmien pisteitä

    public void YksiPari(){
        for(int i = alaNopat.size()-1; i >= 0; i--){
            if(alaNopat.get(i) >= 2){
                alaPisteet.set(0, ((i+1) * alaNopat.get(i)));
                break;
            }
        }
    }
    public void KaksiParia(){
        int s = -1;
        for(int i = 0; i < alaNopat.size(); i++){
            if(alaNopat.get(i) >= 2){
                if(s == -1){
                    s = i;
                }
                else{
                    alaPisteet.set(1, ((i+1) * alaNopat.get(i) + (s+1) * alaNopat.get(s)));
                    break;
                }
            }
        }
    }
    public void Kolmoisluku(){
        alaPisteet.set(2, 0);
        for(int i = 0; i < alaNopat.size(); i++){
            if(alaNopat.get(i) == 3){
                alaPisteet.set(2, ((i+1) * alaNopat.get(i)) + alaPisteet.get(2));
            }
            else if(alaNopat.get(i) == 2){
                alaPisteet.set(2, alaPisteet.get(2) + ((i+1) * 2));
            }
            else if(alaNopat.get(i) == 1){
                alaPisteet.set(2, alaPisteet.get(2) + (i+1));
            }
        }
    }
    public void Neloisluku(){
        alaPisteet.set(3, 0);
        for(int i = 0; i < alaNopat.size(); i++){
            if(alaNopat.get(i) == 4){
                alaPisteet.set(3, ((i+1) * alaNopat.get(i)) + alaPisteet.get(3));
            }
            else if(alaNopat.get(i) == 1){
                alaPisteet.set(3, alaPisteet.get(3) + (i+1));
            }
        }
    }
    public void PieniSuora(){
        boolean t = true;
        for(int i = 0; i < alaNopat.size()-1; i++){
            if(alaPisteet.get(i) != 1){
                t = false;
                break;
            }
        }
        if(t){
            alaPisteet.set(4, 15);
        }
    }
    public void SuuriSuora(){
        boolean t = true;
        for(int i = 1; i < alaNopat.size(); i++){
            if(alaNopat.get(i) != 1){
                t = false;
                break;
            }
        }
        if(t){
            alaPisteet.set(5, 20);
        }
    }
    public void Tayskasi(){
        int k = 0;
        int j = 0;
        for(int i = 0; i < alaNopat.size(); i++){
            if(alaNopat.get(i) == 3){
                k = i;
            }
            else if(alaNopat.get(i) == 2){
                j = i;
            }
        }
        if(k != 0 && j != 0){
            alaPisteet.set(6, (((k+1)*3) + (j+1)*2));
        }
    }
    public void Sattuma(){
        int s = 0;
        for(int i = 0; i < alaNopat.size(); i++){
            s += alaNopat.get(i) * (i+1);
        }
        alaPisteet.set(7, s);
    }
    public void Yatzy(){
        for(int i = 0; i <alaNopat.size(); i++){
            if(alaNopat.get(i) == 5){
                alaPisteet.set(8, 50);
            }
        }
    }
    public Alapuoli(){
    }
    
    //Resetoidaan välimuisti erroreiden estämiseksi
    
    public void resetAlapuoli(){
        alaNopat = new ArrayList<Integer>(Collections.nCopies(8, 0));
    }
}      