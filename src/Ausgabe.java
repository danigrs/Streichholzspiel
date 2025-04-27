import java.util.Scanner;

public class Ausgabe {

    public static void zahlEingeben() {
        Scanner scanner = new Scanner(System.in);
        keineZahl(scanner);
    }

    public static void keineZahl(Scanner eingabe){
        int zahl = 0;
        boolean valid = false;

        while (!valid) {
            System.out.print("Bitte eine Zahl eingeben: ");
            if (eingabe.hasNextInt()) {
                zahl = eingabe.nextInt();
                valid = true;
                zahlNichtImBereich(zahl);
            } else {
                System.out.println("Ungültige Eingabe. Bitte eine ganze Zahl eingeben.");
                eingabe.next(); // ungültige Eingabe verwerfen
            }
        }
    }

    public static void zahlNichtImBereich(int zahl){
        if (zahl > 3 || zahl < 1){
            System.out.println("Zahl im ungültigen Bereich. Bitte Zahl zwischen 1 & 3 wählen.");
            zahlEingeben();
        }
    }

    public static void menschGewinnt(){
        System.out.println("Gratulation, du hast gewonnen!");
    }

    public static void computerGewinnt(){
        System.out.println("Schade, du hast leider verloren!");
    }

    public static void zugNichtMoeglich(){
        System.out.println("Zug nicht möglich, da zu wenig Streichhölzer auf dem tisch liegen.");
    }

    public static void spielStand(int anzahl){
        System.out.println("Es befinden sich derzeit " + anzahl + " Streichhölzer auf dem Tisch.");
    }

    public static void menschZug(int zahlGezogeneHoelzer, int verbleibendeHoelzer){
        System.out.println("Sie nehmen " + zahlGezogeneHoelzer + " Hölzer und es bleiben noch " + verbleibendeHoelzer + " Hölzer übrig.");
    }

    public static void computerZug(int zahlGezogeneHoelzer, int verbleibendeHoelzer){
        System.out.println("Computer nimmt " + zahlGezogeneHoelzer + " Hölzer und es bleiben noch " + verbleibendeHoelzer + " Hölzer übrig.");
    }

}
