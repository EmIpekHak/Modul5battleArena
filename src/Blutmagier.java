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
        if(!isSpezialfaehigkeitAktiv()&&getLebenspunkte()>50){
            setSpezialfaehigkeitAktiv(true);
            setLebenspunkte(getLebenspunkte()/2);
            System.out.println(getName() + " hat die Spezialfaehigkeit aktiviert.");

        }
    }

    @Override
    public void spezialfaehigkeitDeaktivieren() {
        if (isSpezialfaehigkeitAktiv()) {
            setSpezialfaehigkeitAktiv(false);
            System.out.println(getName() + " hat die Spezialfaehigkeit deaktiviert.");
        }

    }

    @Override
    public void angreifen(Kämpfer gegner) {
        int schaden = random.nextInt(13)+18;
        if (isSpezialfaehigkeitAktiv()){
            schaden = schaden*2;

        }
        System.out.println(getName() + " hat angegriffen und:  " + schaden + " verursacht");
    }


}
