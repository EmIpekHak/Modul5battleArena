import java.util.Random;

public class Drachen extends Kämpfer {
    private Random random;

    public Drachen(String name) {
        super(name);
        random = new Random();
    }

    @Override
    public void angreifen(Kämpfer gegner) {
        int schaden = random.nextInt(6) + 20; // Schaden zwischen 20 und 25
        if (isSpezialfaehigkeitAktiv()) {
            int minus = random.nextInt(6) + 5; // Malus zwischen 5 und 10
            schaden -= minus;
        }
        System.out.print("Der Gegner hat: " + schaden + " Schaden genommen");
        gegner.schadenNehmen(schaden);
    }

    public void spezialfaehigkeitAktivieren() {
        if (!isSpezialfaehigkeitAktiv()) {
            setSpezialfaehigkeitAktiv(true);
            setLebenspunkte(getLebenspunkte() + 10); // 10 Lebenspunkte dazu
            System.out.println(getName() + " hat die Spezialfähigkeit Fliegen aktiviert.");
        }
    }

    public void spezialfaehigkeitDeaktivieren() {
        if (isSpezialfaehigkeitAktiv()) {
            setSpezialfaehigkeitAktiv(false);
            System.out.println(getName() + " hat die Spezialfähigkeit Fliegen deaktiviert.");
        }
    }
}
