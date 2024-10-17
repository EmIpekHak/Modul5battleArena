import java.util.Random;
public class Zwerge extends Kämpfer{
    Random random = new Random();

    public Zwerge(String name) {
        super(name);
        random = new Random();
    }

    @Override
    public void spezialfaehigkeitAktivieren() {
        if(!isSpezialfaehigkeitAktiv()&&getLebenspunkte()<50){
            setSpezialfaehigkeitAktiv(true);
            System.out.println("Hat die Spezialfähigkeit aktiviert.");
        }else{
            setSpezialfaehigkeitAktiv(false);
            System.out.println("Du erfüllst die Anforderungen nicht");
        }
    }

    @Override
    public void spezialfaehigkeitDeaktivieren() {
        if(isSpezialfaehigkeitAktiv()){
            setSpezialfaehigkeitAktiv(false);
            System.out.println("Hat die Spezialfähigkeit deaktiviert.");
        }
    }

    public void angreifen(Kämpfer gegner) {
    int schaden = random.nextInt(11) + 15;
    if (isSpezialfaehigkeitAktiv()&& getLebenspunkte() < 50){
        int erfolg = 0;
        if (getLebenspunkte() <= 10) {
            erfolg = (7);
        } else {
            if (getLebenspunkte() <= 20) {
                erfolg = (5);
            } else {
                if (getLebenspunkte() <= 50) erfolg = 3;
            }
            if (random.nextInt(11) <= erfolg) {
                schaden *=2;
                System.out.print("Zwerg hat erfolgreich seinem Gegner eine Kopfnuss gegeben damit hat er: " + schaden + "hinzugefügt!");
            }
            else {
                schaden /=2;
                System.out.print("Zwerg hat die Schulter des gegners mit der Kopfnuss getroffen deshalbt hat er nur: " + schaden + "gemacht");
            }

        }
        gegner.schadenNehmen(schaden);
        System.out.print("Der Gegner hat:" + schaden + "genommen");
    }


    }


}
