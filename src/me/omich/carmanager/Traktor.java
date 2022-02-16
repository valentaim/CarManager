package me.omich.carmanager;

public class Traktor extends Ferma {
    public Traktor(String name, int yearOfProduction, int price, int weight, Color color) {
        super(name, yearOfProduction, price, weight, color);
    }

    @Override
    public boolean isReadyToService() {
        return false;
    }

    @Override
    public void addDistance(int additionalDistance) throws Exception {

    }

    @Override
    public void addDistance(double additionalDistance) throws Exception {

    }
}
