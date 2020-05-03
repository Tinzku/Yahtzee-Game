package Harkkatyo;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Pelaa {
    
    public static void main(String[] args){
        ArrayList <Integer> Nopat = new ArrayList<Integer>(Collections.nCopies(5, 0)); //Luodaan alussa valmiiksi tyhjä arraylist nopille
        Poytakirja poytakirjaolio = new Poytakirja();
        Scanner scanner = new Scanner(System.in);
        Noppa noppa1 = new Noppa(); //Luodaan noppa-oliot
        Noppa noppa2 = new Noppa();
        Noppa noppa3 = new Noppa();
        Noppa noppa4 = new Noppa();
        Noppa noppa5 = new Noppa();
        for(int p = 0; p > -1; p++){ //Looppi, jossa kysytään pelataanko, näytetäänkö highscoret, näytetäänkö ohjeet vai lopetetaanko 
            System.out.println("Kirjoita 'Pelaa' aloittaaksesi pelin, 'Highscore' nähdäksesi parhaat pisteet,"
                    + " 'Ohjeet' nähdäksesi kuinka peliä pelataan ja 'Lopeta' lopettaaksesi pelin");
            String paaValinta = scanner.nextLine();
            if("Pelaa".equalsIgnoreCase(paaValinta)){
                Alapuoli alapuoliolio = new Alapuoli();
                Ylapuoli ylapuoliolio = new Ylapuoli();
                System.out.println("Syötä pelaajanimesi:");
                String tamanhetkinenPelaaja = scanner.nextLine();
                poytakirjaolio.settamanhetkinenPelaaja(tamanhetkinenPelaaja);
                System.out.println("Tervetuloa pelaamaan, " + tamanhetkinenPelaaja + "!");
                System.out.println("");
                for(int g = 0; g < 16; g++){ // pää-pelaamis looppi 
                    if(g != 0){
                        System.out.println("");
                    }
                    System.out.println("UUSI KIERROS:"); //aloitetaan uusi kierros ja heitetään nopat
                    for(int k = 0; k < 3; k++){
                        if(noppa1.heitetaanko()){    
                            noppa1.heita();
                        }
                        if(noppa2.heitetaanko()){    
                            noppa2.heita();
                        }
                        if(noppa3.heitetaanko()){    
                            noppa3.heita();
                        }
                        if(noppa4.heitetaanko()){    
                            noppa4.heita();
                        }
                        if(noppa5.heitetaanko()){    
                            noppa5.heita();
                        }
                        Nopat.set(0, noppa1.annaArpaluku());
                        Nopat.set(1, noppa2.annaArpaluku());
                        Nopat.set(2, noppa3.annaArpaluku());
                        Nopat.set(3, noppa4.annaArpaluku());
                        Nopat.set(4, noppa5.annaArpaluku());
                        System.out.println("Nopat tällä hetkellä: ");
                        for(int i = 0; i < 5; i++) {
                            System.out.print(Nopat.get(i));
                            if(i < 4){
                                System.out.print(",");
                            }
                        }
                        System.out.println("");
                        if(k !=2){
                            System.out.println("Anna lukittavat nopat, jos haluat lukita noppia:"); //kysytään halutaanko noppia lukita, jätetään tyhjäksi jos ei
                            String PLukinnat = scanner.nextLine();
                            String[] lukittavatNopat = PLukinnat.split(",");
                            for(int l = 0; l < lukittavatNopat.length; l++){
                                if(lukittavatNopat[l].length() != 0){
                                    int arpaLuku = Integer.parseInt(lukittavatNopat[l]);
                                    if(arpaLuku == 1){    
                                        noppa1.lukitse(false);
                                    }
                                    if(arpaLuku == 2){    
                                        noppa2.lukitse(false);
                                    }
                                    if(arpaLuku == 3){    
                                        noppa3.lukitse(false);
                                    }
                                    if(arpaLuku == 4){    
                                        noppa4.lukitse(false);
                                    }
                                    if(arpaLuku == 5){    
                                        noppa5.lukitse(false);
                                    }
                                }
                            }
                        }
                    }
                    ylapuoliolio.ylaTulokset(Nopat);
                    alapuoliolio.alaTulokset(Nopat);
                    System.out.println("Minkä tuloksen haluat kirjata?"); //Kysyy minkä tuloksen haluaa kirjata, palauttaa 0 jos komento meni läpi, 1 jos komento hylätään, 2 jos komentoa ei tunnistettu
                    int m = 1;
                    while (m != 0){
                        String PValinta = scanner.nextLine();
                        m = ylapuoliolio.YlapuolenPisteet(PValinta);
                        if(m == 2){
                            m = alapuoliolio.AlapuolenPisteet(PValinta); 
                        }
                        if(m == 2){
                            System.out.println("Komentoa ei tunnistettu!");
                        }
                    }
                    noppa1.lukitse(true); //Kaikkien noppien lukitukset poistetaan
                    noppa2.lukitse(true);
                    noppa3.lukitse(true);
                    noppa4.lukitse(true);
                    noppa5.lukitse(true);
                    ylapuoliolio.resetYlapuoli();
                    alapuoliolio.resetAlapuoli();
                    System.out.println("__________________________________________________");
                }
                int total = alapuoliolio.alapuoliPisteet + ylapuoliolio.ylapuoliPisteet + ylapuoliolio.Bonus; //Kirjataan Highscoret.txt tiedostoon total 
                poytakirjaolio.setScore(total);
            }
            if("Highscore".equalsIgnoreCase(paaValinta)){ //Printataan Highscoret.txt tiedoston sisältö
                poytakirjaolio.printtaa();
            }
            if("Ohjeet".equalsIgnoreCase(paaValinta)){ //Printataan ohjeet
                System.out.println("");
                System.out.println("Yatzy:");
                System.out.println("");
                System.out.println("Yatzyn tavoitteena on saada täytettyä pistelomake mahdollisimman tehokkaasti.");
                System.out.println("Kukin pelaaja saa vuorollaan heittää noppia kolme kertaa. Ensimmäisellä kerralla on heitettävä kaikki nopat. Seuraavalla kahdella heittokerralla pelaaja saa vapaasti valita, mitkä nopat heittää.");
                System.out.println("Heittovuorolla noppia ei ole pakko heittää kolmea kertaa (Jos haluat että kaikki nopat heitetään uudelleen, jätä kenttä tyhjäksi). Kun pelaaja päättää heittovuoronsa, tulos kirjataan pöytäkirjaan ja vuoro siirtyy seuraavalle pelaajalle.");
                System.out.println("Noppia lukitaan vasemmalta päin, esimerkiksi jos haluat lukita nopat 2 ja 4, kirjoita riville 2,4 - silloin muut nopat heitetään uudelleen.");
                System.out.println("Pöytäkirjaa saa täyttää tässä versiossa vapaasti, mutta yhtä yhdistelmää saa käyttää vain kerran.");
                System.out.println("Heittojen jälkeen peli kysyy valitsemaan pöytäkirjasta yhdistelmän, minkä pelaaja haluaa käyttää.");
                System.out.println("Yhdistelmä ovat seuraavat:");
                System.out.println("Yläosa: Ykköset (ykkoset), Kakkoset, Kolmoset, Neloset, Vitoset, Kutoset.");
                System.out.println("Alaosa: Yksi pari, Kaksi pari, Kolmoisluku, Neloisluku, "
                        + "Pieni suora, Suuri suora, Täyskasi (Tayskasi), Sattuma, Yatzy.");
                System.out.println("Mikäli pöytäkirjan yläosan yhdistelmistä pelaaja saa 63 pistettä tai yli, hän saa 50 bonuspistettä lopputulokseensa.");
                System.out.println("Pelaajan peli on ohi, kun kaikki kohdat pöytäkirjasta on täytetty. Lopputulos saadaan laskemalla pelaajan pisteet yhteen, eniten pisteitä kerännyt voittaa.");
                System.out.println("______________________________________________________________________________________________________");
                System.out.println("");
            }
            if("Lopeta".equalsIgnoreCase(paaValinta)){ //Peli suljetaan
                scanner.close();
                System.exit(1);
            }
        }
    }
}  