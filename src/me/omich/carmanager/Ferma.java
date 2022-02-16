package me.omich.carmanager;

public abstract class Ferma implements Serviceable {

    String name;
    int yearOfProduction;
    int price;
    int weight;
    Color color;
    private int distance = 0;
    protected int distanceOnService = 0;

    public Ferma(String name, int yearOfProduction, int price, int weight, Color color) {
        this.name = name;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public int getDistanceOnService() {
        return distanceOnService;
    }

    public void setDistanceOnService(int distanceOnService) {
        this.distanceOnService = distanceOnService;
    }

    @Override
    public String toString() {
        return "Ferma{" +
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

        Ferma ferma = (Ferma) o;

        if (yearOfProduction != ferma.yearOfProduction) return false;
        if (price != ferma.price) return false;
        if (weight != ferma.weight) return false;
        if (distance != ferma.distance) return false;
        if (distanceOnService != ferma.distanceOnService) return false;
        if (name != null ? !name.equals(ferma.name) : ferma.name != null) return false;
        return color == ferma.color;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + yearOfProduction;
        result = 31 * result + price;
        result = 31 * result + weight;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + distance;
        result = 31 * result + distanceOnService;
        return result;
    }
}
