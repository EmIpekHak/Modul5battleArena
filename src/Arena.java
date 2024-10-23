
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Arena {
    private Kämpfer kämpfer1;
    private Kämpfer kämpfer2;
    private Kämpfer gewinner;


    public Arena(Kämpfer kämpfer1, Kämpfer kämpfer2) {
        this.kämpfer1 = kämpfer1;
        this.kämpfer2 = kämpfer2;
    }


    public void fight() {
        boolean fightstart = true;
        int x = new Random().nextInt(2);
        Kämpfer kämpferanderreihe = x == 0 ? kämpfer1 : kämpfer2;
        Kämpfer gegner = x == 1 ? kämpfer1 : kämpfer2;
        Scanner scanner = new Scanner(System.in);
        String spielanleitung = """
                1: Angreifen
                2: Spezialfähigkeit aktivieren
                3: Spezialfähigkeit deaktivieren
                """;
        while (fightstart) {
            System.out.println("Dieser Kämpfer startet: " + kämpferanderreihe.getName());
            System.out.println(spielanleitung);
            int eingabe = scanner.nextInt();
            switch (eingabe) {
                case 1:
                    kämpferanderreihe.angreifen(gegner);
                    break;
                case 2:
                    kämpferanderreihe.spezialfaehigkeitAktivieren();
                    break;
                case 3:
                    kämpferanderreihe.spezialfaehigkeitDeaktivieren();
            }
            System.out.println(gegner);
            if (gegner.getLebenspunkte() <= 0) {
                gewinner = kämpferanderreihe;
                System.out.println(gewinner.getName() + " hat gewonnen!!!!");
                fightstart = false;
            }
            Kämpfer tempkämpfer = gegner;
            gegner = kämpferanderreihe;
            kämpferanderreihe = tempkämpfer;
        }

    }

}
