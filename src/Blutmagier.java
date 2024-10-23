import java.util.Random;
import java.util.RandomAccess;

public class Blutmagier extends Kämpfer {
    public Random random = new Random();

    public Blutmagier(String name) {
        super(name);
        random = new Random();
    }

    @Override
    public void spezialfaehigkeitAktivieren() {
        if (!isSpezialfaehigkeitAktiv() && getLebenspunkte() > 50) {
            setSpezialfaehigkeitAktiv(true);
            setLebenspunkte(getLebenspunkte() / 2);
            System.out.println("Hat die Spezialfaehigkeit aktiviert.");

        } else {
            System.out.println("Du erfüllst die Anforderungen nicht");
        }
    }

    @Override
    public void spezialfaehigkeitDeaktivieren() {
        if (isSpezialfaehigkeitAktiv()) {
            setSpezialfaehigkeitAktiv(false);
            System.out.println("Hat die Spezialfaehigkeit deaktiviert.");
        }

    }

    @Override
    public void angreifen(Kämpfer gegner) {
        int schaden = random.nextInt(13) + 18;
        if (isSpezialfaehigkeitAktiv()) {
            schaden = schaden * 2;

        }
        gegner.schadenNehmen(schaden);
        System.out.print("Der Gegner hat: " + schaden + " Schaden genommen");
    }


}
