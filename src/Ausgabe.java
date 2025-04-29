public class Ausgabe {

    public static void zahlEingeben() {
        System.out.print("Bitte eine ganze Zahl eingeben: ");
    }

    public static void keineZahl(){
        System.out.println("Ungültige Eingabe.");
    }

    public static void zahlNichtImBereich(){
        System.out.println("Zahl im ungültigen Bereich. Bitte Zahl zwischen 1 & 3 wählen.");
    }

    public static void menschGewinnt(){
        System.out.println("Gratulation, du hast gewonnen!");
    }

    public static void computerGewinnt(){
        System.out.println("Schade, du hast leider verloren!");
    }

    public static void zugNichtMoeglich(){
        System.out.println("Zug nicht möglich, da zu wenig Streichhölzer auf dem Tisch liegen.");
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
