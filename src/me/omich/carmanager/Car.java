package me.omich.carmanager;

import java.util.Objects;

public abstract class Car implements Serviceable {

    String name;
    int yearOfProduction;
    int price;
    int weight;
    Color color;
    private int distance = 0;
    protected int distanceOnService = 0;

    public Car(String name, int yearOfProduction, int price, int weight, Color color) {
        this.name = name;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.weight = weight;
        this.color = color;
    }

    public int getDistanceOnService() {
        return distanceOnService;
    }

    public void addDistance(int additionalDistance) throws Exception {

        if (additionalDistance < 0) {

            throw new Exception("Пробег не может быть отрицательным числом!");

        }
        distance += additionalDistance;
        distanceOnService += additionalDistance;

    }

    public void addDistance(double additionalDistance) throws Exception {

        if (additionalDistance < 0) {

            throw new Exception("Пробег не может быть отрицательным числом!");

        }
        distance += additionalDistance;
        distanceOnService += additionalDistance;
    }

    public void service() {
        distanceOnService = 0;
    }


    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", price=" + price +
                ", weight=" + weight +
                ", color=" + color +
                ", distance=" + distance +
                ", distanceOnService=" + distanceOnService +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfProduction == car.yearOfProduction && price == car.price && weight == car.weight && Objects.equals(name, car.name) && color == car.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfProduction, price, weight, color);
    }


}
