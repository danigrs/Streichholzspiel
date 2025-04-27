public class Spiel {
    private int anzahl;

    private int[] streichhoelzer = new int[3];
    
    public Spiel(int anzahl){
        this.anzahl = anzahl;
        loop:
        while (this.anzahl >= 0){
            if (this.anzahl % 2 == 0){
                computerZiehen();
                if (this.anzahl <= 0){
                    Ausgabe.menschGewinnt();
                    break;
                }
            } else {
                menschZiehen();
                if (this.anzahl <= 0){
                    Ausgabe.computerGewinnt();
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
        return 1;
    }

}
