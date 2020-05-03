package Harkkatyo;

/**
 *
 * @author Matias Laukkanen
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GUI { //GUI-luokka jota ei saatu valmiiksi
    
    public static void addComponentsToPane(Container pane){
      
        // esitellään JLabel-komponentit
        JLabel label;
        
        // muutetaan ulkoasu
        pane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        // ikkunan kokoa kasvattaessa komponentit keskitetään soluunsa
        c.fill = GridBagConstraints.CENTER;
        
        // lisätään JLabel-komponentit
        label = new JLabel("Lukitse:");
        // määritellään komponentin sijainti
        c.gridx = 0;
        c.gridy = 1;
        // lisätään komponentti
        pane.add(label, c);
        
        label = new JLabel("Heittoja jäljellä:");
        c.gridx = 6;
        c.gridy = 0;
        pane.add(label, c);
        
        label = new JLabel("Ykköset (5)");
        c.gridx = 0;
        c.gridy = 2;
        pane.add(label, c);
        
        label = new JLabel("Kakkoset (10)");
        c.gridx = 0;
        c.gridy = 3;
        pane.add(label, c);
        
        label = new JLabel("Kolmoset (15)");
        c.gridx = 0;
        c.gridy = 4;
        pane.add(label, c);
        
        label = new JLabel("Neloset (20)");
        c.gridx = 0;
        c.gridy = 5;
        pane.add(label, c);
        
        label = new JLabel("Vitoset (25)");
        c.gridx = 0;
        c.gridy = 6;
        pane.add(label, c);
        
        label = new JLabel("Kutoset (30)");
        c.gridx = 0;
        c.gridy = 7;
        pane.add(label, c);
        
        label = new JLabel("Välisumma (63)");
        c.gridx = 0;
        c.gridy = 8;
        pane.add(label, c);
        
        label = new JLabel("Bonus (50)");
        c.gridx = 0;
        c.gridy = 9;
        pane.add(label, c);
        
        label = new JLabel("Pari (12)");
        c.gridx = 0;
        c.gridy = 10;
        pane.add(label, c);
        
        label = new JLabel("Kaksi paria (22)");
        c.gridx = 0;
        c.gridy = 11;
        pane.add(label, c);
        
        label = new JLabel("Kolme samaa (18)");
        c.gridx = 0;
        c.gridy = 12;
        pane.add(label, c);
        
        label = new JLabel("Neljä samaa (24)");
        c.gridx = 0;
        c.gridy = 13;
        pane.add(label, c);
        
        label = new JLabel("Pieni suora (15)");
        c.gridx = 0;
        c.gridy = 14;
        pane.add(label, c);
        
        label = new JLabel("Iso suora (20)");
        c.gridx = 0;
        c.gridy = 15;
        pane.add(label, c);
        
        label = new JLabel("Täyskäsi (28)");
        c.gridx = 0;
        c.gridy = 16;
        pane.add(label, c);
        
        label = new JLabel("Sattuma (30)");
        c.gridx = 0;
        c.gridy = 17;
        pane.add(label, c);
        
        label = new JLabel("Yatzy (50)");
        c.gridx = 0;
        c.gridy = 18;
        pane.add(label, c);
        
        label = new JLabel("Yhteensä (374)");
        c.gridx = 0;
        c.gridy = 20;
        pane.add(label, c);
        
        // esitellään ja lisätään JButton-komponentit
        JButton buttonHeita = new JButton("Heitä");
        c.gridx = 7;
        c.gridy = 1;
        pane.add(buttonHeita, c);
        
        JButton buttonKaytaYkkoset = new JButton("Käytä");
        c.gridx = 2;
        c.gridy = 2;
        pane.add(buttonKaytaYkkoset, c);
        
        JButton buttonKaytaKakkoset = new JButton("Käytä");
        c.gridx = 2;
        c.gridy = 3;
        pane.add(buttonKaytaKakkoset, c);
        
        JButton buttonKaytaKolmoset = new JButton("Käytä");
        c.gridx = 2;
        c.gridy = 4;
        pane.add(buttonKaytaKolmoset, c);
        
        JButton buttonKaytaNeloset = new JButton("Käytä");
        c.gridx = 2;
        c.gridy = 5;
        pane.add(buttonKaytaNeloset, c);
        
        JButton buttonKaytaVitoset = new JButton("Käytä");
        c.gridx = 2;
        c.gridy = 6;
        pane.add(buttonKaytaVitoset, c);
        
        JButton buttonKaytaKutoset = new JButton("Käytä");
        c.gridx = 2;
        c.gridy = 7;
        pane.add(buttonKaytaKutoset, c);
        
        JButton buttonKaytaPari = new JButton("Käytä");
        c.gridx = 2;
        c.gridy = 10;
        pane.add(buttonKaytaPari, c);
        
        JButton buttonKaytaKaksiParia = new JButton("Käytä");
        c.gridx = 2;
        c.gridy = 11;
        pane.add(buttonKaytaKaksiParia, c);
        
        JButton buttonKaytaKolmeSamaa = new JButton("Käytä");
        c.gridx = 2;
        c.gridy = 12;
        pane.add(buttonKaytaKolmeSamaa, c);
        
        JButton buttonKaytaNeljaSamaa = new JButton("Käytä");
        c.gridx = 2;
        c.gridy = 13;
        pane.add(buttonKaytaNeljaSamaa, c);
        
        JButton buttonKaytaPieniSuora = new JButton("Käytä");
        c.gridx = 2;
        c.gridy = 14;
        pane.add(buttonKaytaPieniSuora, c);
        
        JButton buttonKaytaIsoSuora = new JButton("Käytä");
        c.gridx = 2;
        c.gridy = 15;
        pane.add(buttonKaytaIsoSuora, c);
        
        JButton buttonKaytaTayskasi = new JButton("Käytä");
        c.gridx = 2;
        c.gridy = 16;
        pane.add(buttonKaytaTayskasi, c);
        
        JButton buttonKaytaSattuma = new JButton("Käytä");
        c.gridx = 2;
        c.gridy = 17;
        pane.add(buttonKaytaSattuma, c);
        
        JButton buttonKaytaYatzy = new JButton("Käytä");
        c.gridx = 2;
        c.gridy = 18;
        pane.add(buttonKaytaYatzy, c);
        
        // esitellään ja lisätään JTextField-komponentit
        
        JTextField textFieldNoppa1 = new JTextField("1");
        // tekstikentän arvoa ei voi vaihtaa kirjoittamalla
        textFieldNoppa1.setEditable(false);
        c.gridx = 1;
        c.gridy = 0;
        pane.add(textFieldNoppa1, c);
        
        JTextField textFieldNoppa2 = new JTextField("1");
        textFieldNoppa1.setEditable(false);
        c.gridx = 2;
        c.gridy = 0;
        pane.add(textFieldNoppa2, c);
        
        JTextField textFieldNoppa3 = new JTextField("1");
        textFieldNoppa3.setEditable(false);
        c.gridx = 3;
        c.gridy = 0;
        pane.add(textFieldNoppa3, c);
        
        JTextField textFieldNoppa4 = new JTextField("1");
        textFieldNoppa4.setEditable(false);
        c.gridx = 4;
        c.gridy = 0;
        pane.add(textFieldNoppa4, c);
        
        JTextField textFieldNoppa5 = new JTextField("1");
        textFieldNoppa5.setEditable(false);
        c.gridx = 5;
        c.gridy = 0;
        pane.add(textFieldNoppa5, c);
        
        JTextField textFieldHeittojaJaljella = new JTextField("3");
        textFieldHeittojaJaljella.setEditable(false);
        c.gridx = 6;
        c.gridy = 1;
        pane.add(textFieldHeittojaJaljella, c);
                         
        JTextField textFieldYkkoset = new JTextField("0");
        textFieldYkkoset.setEditable(false);
        c.gridx = 1;
        c.gridy = 2;
        pane.add(textFieldYkkoset, c);
        
        JTextField textFieldKakkoset = new JTextField("0");
        textFieldKakkoset.setEditable(false);
        c.gridx = 1;
        c.gridy = 3;
        pane.add(textFieldKakkoset, c);
        
        JTextField textFieldKolmoset = new JTextField("0");
        textFieldKolmoset.setEditable(false);
        c.gridx = 1;
        c.gridy = 4;
        pane.add(textFieldKolmoset, c);
        
        JTextField textFieldNeloset = new JTextField("0");
        textFieldNeloset.setEditable(false);
        c.gridx = 1;
        c.gridy = 5;
        pane.add(textFieldNeloset, c);
        
        JTextField textFieldVitoset = new JTextField("0");
        textFieldVitoset.setEditable(false);
        c.gridx = 1;
        c.gridy = 6;
        pane.add(textFieldVitoset, c);
        
        JTextField textFieldKutoset = new JTextField("0");
        textFieldKutoset.setEditable(false);
        c.gridx = 1;
        c.gridy = 7;
        pane.add(textFieldKutoset, c);
        
        JTextField textFieldValisumma = new JTextField("0");
        textFieldValisumma.setEditable(false);
        c.gridx = 1;
        c.gridy = 8;
        pane.add(textFieldValisumma, c);
        
        JTextField textFieldBonus = new JTextField("0");
        textFieldBonus.setEditable(false);
        c.gridx = 1;
        c.gridy = 9;
        pane.add(textFieldBonus, c);
        
        JTextField textFieldPari = new JTextField("0");
        textFieldPari.setEditable(false);
        c.gridx = 1;
        c.gridy = 10;
        pane.add(textFieldPari, c);
        
        JTextField textFieldKaksiParia = new JTextField("0");
        textFieldKaksiParia.setEditable(false);
        c.gridx = 1;
        c.gridy = 11;
        pane.add(textFieldKaksiParia, c);
        
        JTextField textFieldKolmeSamaa = new JTextField("0");
        textFieldKolmeSamaa.setEditable(false);
        c.gridx = 1;
        c.gridy = 12;
        pane.add(textFieldKolmeSamaa, c);
        
        JTextField textFieldNeljaSamaa = new JTextField("0");
        textFieldNeljaSamaa.setEditable(false);
        c.gridx = 1;
        c.gridy = 13;
        pane.add(textFieldNeljaSamaa, c);
        
        JTextField textFieldPieniSuora = new JTextField("0");
        textFieldPieniSuora.setEditable(false);
        c.gridx = 1;
        c.gridy = 14;
        pane.add(textFieldPieniSuora, c);
        
        JTextField textFieldIsoSuora = new JTextField("0");
        textFieldIsoSuora.setEditable(false);
        c.gridx = 1;
        c.gridy = 15;
        pane.add(textFieldIsoSuora, c);
        
        JTextField textFieldTayskasi = new JTextField("0");
        textFieldTayskasi.setEditable(false);
        c.gridx = 1;
        c.gridy = 16;
        pane.add(textFieldTayskasi, c);
        
        JTextField textFieldSattuma = new JTextField("0");
        textFieldSattuma.setEditable(false);
        c.gridx = 1;
        c.gridy = 17;
        pane.add(textFieldSattuma, c);
        
        JTextField textFieldYatzy = new JTextField("0");
        textFieldYatzy.setEditable(false);
        c.gridx = 1;
        c.gridy = 18;
        pane.add(textFieldYatzy, c);
        
        JTextField textFieldYhteensa = new JTextField("0");
        textFieldYhteensa.setEditable(false);
        c.gridx = 1;
        c.gridy = 20;
        pane.add(textFieldYhteensa, c);
        
        // lisätään JCheckBox-komponentit
        
        JCheckBox checkBoxNoppa1 = new JCheckBox();
        c.gridx = 1;
        c.gridy = 1;
        pane.add(checkBoxNoppa1, c);
        
        JCheckBox checkBoxNoppa2 = new JCheckBox();
        c.gridx = 2;
        c.gridy = 1;
        pane.add(checkBoxNoppa2, c);
        
        JCheckBox checkBoxNoppa3 = new JCheckBox();
        c.gridx = 3;
        c.gridy = 1;
        pane.add(checkBoxNoppa3, c);
        
        JCheckBox checkBoxNoppa4 = new JCheckBox();
        c.gridx = 4;
        c.gridy = 1;
        pane.add(checkBoxNoppa4, c);
        
        JCheckBox checkBoxNoppa5 = new JCheckBox();
        c.gridx = 5;
        c.gridy = 1;
        pane.add(checkBoxNoppa5, c);     
    }
    
    private static void createAndShowGUI(){
        
        // lisätään ja määritellään ikkuna
        JFrame frame = new JFrame("Yatzy");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // lisätään komponentit ikkunaan
        addComponentsToPane(frame.getContentPane());
        
        //näytetään ikkuna
        frame.pack();
        frame.setVisible(true);          
    }

    
    //suoritetaan ohjelma
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
        
    }          
}