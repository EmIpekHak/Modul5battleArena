import java.util.Random;
public class Zwerge extends Kämpfer{
    Random random = new Random();

    public Zwerge(String name) {
        super(name);
        random = new Random();
    }

    public void angreifen(Kämpfer gegner) {
    int schaden = random.nextInt(11) + 15;
    if (isSpezialfaehigkeitAktiv()&& getLebenspunkte() < 50){
        int erfolg = if (getLebenspunkte() <=10?7:getLebenspunkte() <= 20?5: getLebenspunkte() <= 50?3;
    }

    }


}
