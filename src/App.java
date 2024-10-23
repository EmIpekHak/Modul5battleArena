import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Kämpfer drache = new Drachen("Drache");
        Kämpfer zwerg = new Zwerge("Zwerg");
        Kämpfer blutmagier = new Blutmagier("Blutmagier");
        Kämpfer onepunchman = new OnePunchMan("Onepunchman");

        Scanner scanner = new Scanner(System.in);
        String spielanleitung = """
                1: Drache
                2: Zwerg
                3: Blutmagier
                4: Onepunchman
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
            case 3:
                kämpfer1 = blutmagier;
                break;
            default:
                kämpfer1 = onepunchman;
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
            case 3:
                kämpfer2 = blutmagier;
                break;
            default:
                kämpfer2 = onepunchman;
        }
        Arena arena = new Arena(kämpfer1, kämpfer2);
        arena.fight();
    }
}
