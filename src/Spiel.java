import java.util.Random;

public class Spiel {
    private int anzahl;
    
    public Spiel(int anzahl){
        this.anzahl = anzahl;
        Random random = new Random();
        int zufallszahl = random.nextInt(2) + 1;

        if (zufallszahl % 2 == 0){
            while (this.anzahl >= 0) {
                computerZiehen();
                if (this.anzahl <= 0){
                    Ausgabe.menschGewinnt();
                    break;
                }
                menschZiehen();
                if (this.anzahl <= 0){
                    Ausgabe.computerGewinnt();
                    break;
                }
            }
        } else {
            while (this.anzahl >= 0) {
                menschZiehen();
                if (this.anzahl <= 0){
                    Ausgabe.computerGewinnt();
                    break;
                }
                computerZiehen();
                if (this.anzahl <= 0){
                    Ausgabe.menschGewinnt();
                    break;
                }
            }
        }
    }

    public int getAnzahl() {
        return anzahl;
    }

    public void computerZiehen(){
        int anzahlGezogeneHoelzer = berechneComputerZug();
        anzahl = anzahl - anzahlGezogeneHoelzer;
        Ausgabe.computerZug(anzahlGezogeneHoelzer, anzahl);
    }

    public void menschZiehen(){
        int anzahlGezogeneHoelzer = Eingabe.leseHoelzer();
        if (anzahlGezogeneHoelzer > anzahl){
            Ausgabe.zugNichtMoeglich();
            menschZiehen();
        } else {
            anzahl = anzahl - anzahlGezogeneHoelzer;
            Ausgabe.menschZug(anzahlGezogeneHoelzer, anzahl);
        }
    }

    public int berechneComputerZug(){
        Random random = new Random();
        int zufallszahl = random.nextInt(3) + 1;

        return zufallszahl;
    }

}
