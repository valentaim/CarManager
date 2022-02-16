package me.omich.carmanager;

public interface Serviceable {

    boolean isReadyToService();
    int getDistanceOnService();

    void addDistance(int additionalDistance) throws Exception;
    void addDistance(double additionalDistance) throws Exception;

}
