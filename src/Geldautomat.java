import java.util.Scanner;

public class Geldautomat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int saldo = 1000;
        int auswahl;
        int betrag;

        System.out.println("1: Kontostand anzeigen");
        System.out.println("2: Geld einzahlen");
        System.out.println("3: Geld abheben");
        System.out.println("4: System verlassen");
        System.out.print("Bitte wählen Sie eine Option: ");

        auswahl = scan.nextInt();

        switch (auswahl) {
            case 1:
                System.out.println("Ihr aktueller Kontostand beträgt: " + saldo + " €");
                break;

            case 2:
                System.out.print("Einzahlungsbetrag: ");
                betrag = scan.nextInt();
                saldo += betrag;
                System.out.println("Neuer Kontostand: " + saldo + " €");
                break;

            case 3:
                System.out.print("Auszahlungsbetrag: ");
                betrag = scan.nextInt();
                if (betrag > saldo) {
                    System.out.println("Nicht genügend Kontostand!");
                } else {
                    saldo -= betrag;
                    System.out.println("Kalan bakiye: " + saldo + " €");
                }
                break;

            case 4:
                System.out.println("System wird beendet...");
                break;

            default:
                System.out.println("Ungültige Eingabe!");
                break;
        }
    }
}
