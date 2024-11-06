package hu.petrik.szuperhosprojekt;

import java.text.MessageFormat;

public class Batman implements Szuperhos, Milliardos{
    private float lelemyesseg;

    public Batman() {
        this.lelemyesseg = 100;
    }

    @Override
    public void kutyutKeszit() {
        this.lelemyesseg += 50;
    }

    @Override
    public boolean legyoziE(Szuperhos other) {
        return other.mekkoraAzEreje() < this.lelemyesseg;
    }

    @Override
    public double mekkoraAzEreje() {
        return lelemyesseg*2;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Batman: leleményesség: {0}", lelemyesseg);
    }
}
