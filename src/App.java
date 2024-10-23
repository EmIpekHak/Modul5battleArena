import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Kämpfer drache = new Drachen("Drache");
        Kämpfer zwerg = new Zwerge("Zwerg");
        Kämpfer blutmagier = new Blutmagier("Blutmagier");

        Scanner scanner = new Scanner(System.in);
        String spielanleitung = """
                1: Drache
                2: Zwerg
                3: Blutmagier
                """;
        System.out.println(spielanleitung);
        int eingabe = scanner.nextInt();
        Kämpfer kämpfer1;
        Kämpfer kämpfer2;
        switch (eingabe) {
            case 1:
                kämpfer1 = drache;
                break;
            case 2:
                kämpfer1 = zwerg;
                break;
            default:
                kämpfer1 = blutmagier;
        }
        System.out.println("Spieler Zwei wählen sie einen Charakter");
        int eingabe2 = scanner.nextInt();
        switch (eingabe2) {
            case 1:
                kämpfer2 = drache;
                break;
            case 2:
                kämpfer2 = zwerg;
                break;
            default:
                kämpfer2 = blutmagier;
        }
        Arena arena = new Arena(kämpfer1, kämpfer2);
        arena.fight();
    }
}
