package hu.petrik.szuperhosprojekt;

import java.text.MessageFormat;

public abstract class Bosszuallo implements Szuperhos {
    private float szuperero;
    private boolean vanEGyengesege;

    public Bosszuallo(float szuperero, boolean vanEGyengesege) {
        this.szuperero = szuperero;
        this.vanEGyengesege = vanEGyengesege;
    }

    public void setSzuperero(float value) {
        this.szuperero = value;
    }

    public void setVanEGyengesege(boolean value) {
        this.vanEGyengesege = value;
    }

    public float getSzuperero() {
        return szuperero;
    }

    public boolean isVanEGyengesege() {
        return vanEGyengesege;
    }

    public abstract boolean megmentiAVilagot();

    @Override
    public boolean legyoziE(Szuperhos other) {
        if (other instanceof Batman) return other.mekkoraAzEreje()*2 <= this.mekkoraAzEreje();
        else return ((Bosszuallo)other).vanEGyengesege && other.mekkoraAzEreje() < this.mekkoraAzEreje();
    }

    @Override
    public double mekkoraAzEreje() {
        return szuperero;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Szupererő: {0}; {1} gyengesége", szuperero, vanEGyengesege ? "van" : "nincs");
    }
}
