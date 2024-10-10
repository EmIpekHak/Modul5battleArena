public abstract class Kämpfer {
    private String name;
    private int lebenspunkte;
    private boolean spezialfähigkeitAktiv;

    public Kämpfer(String name) {
        this.name = name;
        this.lebenspunkte = 100;
        this.spezialfähigkeitAktiv = false;
    }

    public String getName() {
        return name;
    }

    public int getLebenspunkte() {
        return lebenspunkte;
    }

    public void setLebenspunkte(int lebenspunkte) {
        this.lebenspunkte = Math.max(0, Math.min(100, lebenspunkte)); // Werte zwischen 0 und 100
    }

    public boolean isSpezialfaehigkeitAktiv() {
        return spezialfähigkeitAktiv;
    }

    public void setSpezialfaehigkeitAktiv(boolean spezialfaehigkeitAktiv) {
        this.spezialfähigkeitAktiv = spezialfaehigkeitAktiv;
    }


    public void schadenNehmen(int punkte) {
        setLebenspunkte(lebenspunkte - punkte);
        if (lebenspunkte == 0) {
            System.out.println(name + " wurde besiegt!");
        }
    }
    public abstract void spezialfaehigkeitAktivieren();
    public abstract void spezialfaehigkeitDeaktivieren();

    public abstract void angreifen(Kämpfer gegner);
}
