public abstract class Kämpfer {
    private String name;
    private int lebenspunkte;
    private boolean spezialfähigkeitAktiv;

    public Kämpfer(String name) {
        this.name = name;
        this.lebenspunkte = 100; // Start mit 100 Lebenspunkten
        this.spezialfähigkeitAktiv = false;
    }

    // Getter und Setter
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

    // Methode, um Schaden zu nehmen
    public void schadenNehmen(int punkte) {
        setLebenspunkte(lebenspunkte - punkte); // Lebenspunkte reduzieren
        if (lebenspunkte == 0) {
            System.out.println(name + " wurde besiegt!");
        }
    }

    // Abstrakte Methode für Angriff (muss in Unterklassen implementiert werden)
    public abstract void angreifen(Kämpfer gegner);
}
