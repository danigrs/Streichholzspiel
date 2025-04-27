public class Spiel {
    int anzahl;
    int[] streichhoelzer = new int[3];
    
    public Spiel(int anzahl){
        this.anzahl = anzahl;
        while (anzahl != 0){
            if (anzahl % 2 == 0){
                computerZiehen();
                anzahl--;
            } else {
                menschZiehen();
                anzahl--;
            }
        }
    }

    public void computerZiehen(){

    }

    public void menschZiehen(){

    }

    private void berechneComputerZug(){

    }

}
