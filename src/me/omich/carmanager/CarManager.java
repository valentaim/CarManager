package me.omich.carmanager;

public class CarManager {
    public static void main(String[] args) throws Exception {

        PassengerCar prius = new PassengerCar("Toyota primus", 2008, 15000, 1200, Color.GREEN);
        Bus renault = new Bus("Renault Logan", 2000, 9700, 1600, Color.WHITE);
        Car renault2 = new Car("Renault Logan", 2000, 9700, 1600, Color.WHITE);

        prius.addDistance(1000);
        prius.addDistance(2000);
        prius.addDistance(20.9);
        prius.addDistance(15000);
        renault.addDistance(15000);


        System.out.println(prius);
        System.out.println(renault);
        System.out.println(renault2);

        System.out.println(prius.getDistanceOnService());

        prius.service();

        System.out.println("********************");

        System.out.println(prius);

//        System.out.println(prius.equals(renault2));
//        System.out.println(renault.equals(renault2));
//
//        System.out.println(prius.isReadyToService());
//        System.out.println(renault.isReadyToService());

    }
}