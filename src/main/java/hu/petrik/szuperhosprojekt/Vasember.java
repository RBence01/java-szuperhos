package hu.petrik.szuperhosprojekt;

import java.util.Random;

public class Vasember extends Bosszuallo implements Milliardos {
    private static final Random rnd = new Random();
    public Vasember() {
        super(150, true);
    }

    @Override
    public boolean megmentiAVilagot() {
        return this.getSzuperero() > 1000;
    }

    @Override
    public void kutyutKeszit() {
        this.setSzuperero(this.getSzuperero() + rnd.nextFloat()*10);
    }

    @Override
    public String toString() {
        return "Vasember: " + super.toString();
    }
}
