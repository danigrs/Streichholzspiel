import java.util.Scanner;

public class Eingabe {
    
    public static int leseZahl(){
        Ausgabe.zahlEingeben();

        Scanner scanner = new Scanner(System.in);
        int zahl = 0;

        try {
            String eingabe = scanner.nextLine(); // Eingabe lesen
            zahl = Integer.parseInt(eingabe);   // Eingabe in Zahl umwandeln
        } catch (NumberFormatException e) {
            Ausgabe.keineZahl();
            return leseHoelzer();
        }
       
        return zahl;
    }

    public static int leseHoelzer(){
        int zahl = leseZahl();
        if (zahl > 3 || zahl < 1){
            Ausgabe.zahlNichtImBereich();
            return leseHoelzer();
        }
        return zahl;
    }
}
