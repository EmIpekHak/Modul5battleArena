import java.util.Random;

public class OnePunchMan extends Kämpfer {
    public OnePunchMan(String name) {
        super(name);
    }

    @Override
    public void spezialfaehigkeitAktivieren() {
        if (!isSpezialfaehigkeitAktiv()) {
            setSpezialfaehigkeitAktiv(true);
            System.out.println("Du hast die Spezialfähigkeit aktiviert.");
        } else {
            System.out.println("Spezialfähigkeit bereits aktiviert.");
        }


    }

    @Override
    public void spezialfaehigkeitDeaktivieren() {
        if (isSpezialfaehigkeitAktiv()) {
            setSpezialfaehigkeitAktiv(false);
            System.out.println("Du hast die Spezialfähigkeit deaktiviert.");
        } else {
            System.out.println("Spezialfähigkeit bereits deaktiviert.");
        }

    }

    @Override
    public void angreifen(Kämpfer gegner) {
        int schaden = new Random().nextInt(11) + 8;
        if (isSpezialfaehigkeitAktiv()) {
            schaden = schaden + new Random().nextInt(101);
            setSpezialfaehigkeitAktiv(false);
        }
        gegner.schadenNehmen(schaden);
        System.out.println("Du hast: " + schaden + " Schaden verursacht");
    }
}
