import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean eins = true;
        boolean zwei = false;
        boolean drei = true;
        boolean vier = true;
        boolean fünf = true;
        boolean sechs = true;
        boolean sieben = true;


        Scanner Erste = new Scanner(System.in);
        Scanner Zweite = new Scanner(System.in);
        Scanner Dritte = new Scanner(System.in);
        Scanner Vierte = new Scanner(System.in);
        Scanner Fünfte = new Scanner(System.in);
        Scanner Siebte = new Scanner(System.in);

        int i = 0;
        System.out.println("Wilkommen zum Quiz. Antworte mit der Zahl 1, 2 oder 3");

        System.out.println("Erste Frage: Ist 1 + 1 = 2 oder 3?");
        System.out.println(
                "1: 2\n" +
                "2: 3\n" +
                "3. Keines der beiden");
        int first = Integer.parseInt(Erste.next());

        while (!(first == 1) || (first == 2) || (first == 3)){
            System.out.println("Keine richtige eingabe. Bitte gib die Zahl 1, 2 oder 3 als deine Antwort an.");
            break;
        }

        if (first == 1) {
            i++;
        }

        System.out.println("Zweite Frage: Können Schweine fliegen?");
        System.out.println(
                "1: Nein\n" +
                        "2: Ja\n" +
                        "3. Nur bestimmte");
        int second = Integer.parseInt(Erste.next());
        if (second == 1) {
            i++;
        }

        System.out.println("Dritte Frage: Wie viele Staaten hat Deutchland?");
        System.out.println(
                "1: 12\n" +
                        "2: 10\n" +
                        "3. 16");
        int third = Integer.parseInt(Erste.next());
        if (third == 3) {
            i++;
        }

        System.out.println("Vierte Frage: Was ist die kälteste Temperatur die es geben kann in °C?");
        System.out.println(
                "1: −89.2\n" +
                        "2: -67,8\n" +
                        "3. Es gibt kein Limit");
        int forth = Integer.parseInt(Erste.next());
        if (forth == 2) {
            i++;
        }

        System.out.println("Fünfte Frage: Wie viele Haare het eine Glatze? ;)");
        System.out.println(
                "1: 0\n" +
                        "2: 1\n" +
                        "3. unzählige");
        int fifth = Integer.parseInt(Erste.next());
        if (fifth==1) {
            i++;
        }

        System.out.println("Sechste Frage: Wer hat das Internet erfunden?");System.out.println(
                "1: Paul Allen\n" +
                        "2: Bill Gates\n" +
                        "3. Tim Berners-Lee");
        int sixth = Integer.parseInt(Erste.next());
        if (sixth == 3) {
            i++;
        }

        System.out.println("Siebte Frage: An welchem Monat ist Halloween?");System.out.println(
                "1: November\n" +
                        "2: Oktober\n" +
                        "3. August");
        int seventh = Integer.parseInt(Erste.next());
        if (seventh == 2) {
            i++;
        }

        System.out.println("Deine Punktzahl ist: " + i + ".");

    }
}