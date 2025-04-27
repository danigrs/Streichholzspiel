import java.util.Scanner;

public class Eingabe {
    
    public static int leseZahl(){
        Ausgabe.zahlEingeben();

        Scanner scanner = new Scanner(System.in);
        int zahl = 0;

        try {
            String eingabe = scanner.nextLine(); // Eingabe lesen
            zahl = Integer.parseInt(eingabe);   // Eingabe in Zahl umwandeln
            // Ausgabe.zahlNichtImBereich(zahl);          // Bereich prüfen
        } catch (NumberFormatException e) {
            Ausgabe.keineZahl(); // Bei ungültiger Eingabe erneut aufrufen
        }
       
        return zahl;
    }

    public static int leseHoelzer(){
        if (leseZahl() > 3 || leseZahl() < 1){
            Ausgabe.zahlNichtImBereich();
            return leseZahl();
        }
        return leseZahl();
    }
}
