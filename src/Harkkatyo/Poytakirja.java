package Harkkatyo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;


class Poytakirja {
    String tamanhetkinenPelaaja;
        
    public void settamanhetkinenPelaaja(String tamanhetkinenPelaaja){  //tallennetaan tämän hetkinen pelaaja
        this.tamanhetkinenPelaaja = tamanhetkinenPelaaja;
    }

    public void setScore(int total){ //Kirjataan tiedot .txt -tiedostoon
        try {
            String totaali = tamanhetkinenPelaaja + ": " + total + System.getProperty("line.separator");
            Files.write(Paths.get("Highscoret.txt"), totaali.getBytes(), StandardOpenOption.APPEND);
        }catch (IOException e) {
            System.out.println("Virhe tallentaessa!");
        }
    }
    public void printtaa(){ //Printataan .txt -tiedot
        try {
            BufferedReader in = new BufferedReader(new FileReader("Highscoret.txt"));
            String line;
            while((line = in.readLine()) != null){
                System.out.println(line);
            }
            in.close(); 
        }catch (IOException e) {
            System.out.println("Virhe printattaessa highscoreja!");
        }
    }
    
    public Poytakirja(){ 
    }
}