package me.omich.carmanager;

public class CarManager {
    public static void main(String[] args) throws Exception {

        Car prius = new PassengerCar("Toyota primus", 2008, 15000, 1200, Color.GREEN);
        Car renault = new Bus("Renault Logan", 2000, 9700, 1600, Color.WHITE);
        Car renault2 = new PassengerCar("Renault Logan", 2000, 9700, 1600, Color.WHITE);

        Ferma traktor = new Traktor("Slavyanka", 2000, 10000, 2000, Color.BLACK);
        Ferma traktor2 = new Traktor("Slavyanka2", 2010, 15000, 2000, Color.WHITE);

        Ferma combain = new Combain("Lesovsk", 2012, 9000, 5000, Color.BLUE);
        Ferma combain2 = new Combain("Lesovsk", 2012, 9000, 5000, Color.BLUE);




        prius.addDistance(1000);
        prius.addDistance(2000);
        prius.addDistance(20.9);
        prius.addDistance(15000);
        renault.addDistance(15000);

        traktor.addDistance(1000);
        traktor2.addDistance(500);
        combain.addDistance(30);
        combain2.addDistance(1);


        System.out.println(prius);
        System.out.println(renault);
        System.out.println(renault2);

        System.out.println(traktor);
        System.out.println(traktor2);
        System.out.println(combain);
        System.out.println(combain2);

        System.out.println(prius.getDistanceOnService());
        //
        //        prius.service();
        //
        //        System.out.println("********************");
        //        System.out.println(renault.equals(renault2));
        //
        //        System.out.println(prius);
        //
        //        System.out.println(prius.equals(renault2));
        //        System.out.println(prius.isReadyToService());
        //        System.out.println(renault.isReadyToService());
        System.out.println(prius.isReadyToService());
        System.out.println(renault.isReadyToService());
    }
}