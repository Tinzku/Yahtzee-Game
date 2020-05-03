package Harkkatyo;
import java.util.Random;

/** 
 * Arpakuutiota mallintava luokka
 * v0.2
 * Lisätty int[] heitto ja sen mukaiset metodit
 */

public class Noppa {
    
    private int arpaluku;                     // yksittäisen nopan arvo
    private boolean uudelleen;          // tallentaa tiedon siitä, halutaanko noppa heittää uudestaan
    
    private static Random noppa = new Random();
    
    public Noppa() {
        arpaluku = 0;
        uudelleen = true;
    }
    
    /* Asettaa nopalle arvon */
    public void heita() {
        arpaluku = noppa.nextInt(6) + 1;
    }
    
    /* Palauttaa nopan arvon */
    public int annaArpaluku() {
        return arpaluku;
    }
    
    /* Palauttaa tiedon siitä, heitetäänkö noppaa uudelleen */
    public boolean heitetaanko() {
        return uudelleen;
    }
    
    /* Asettaa nopan lukittavaksi tai heitettäväksi uudelleen */
    public void lukitse(boolean uudelleen) {
        this.uudelleen = uudelleen;
    }        
}