package web.model;

public class Car {
    private String model;
    private int distanceTraveled;
    private int age;

    public Car(String model, int distanceTraveled, int age) {
        this.model = model;
        this.distanceTraveled = distanceTraveled;
        this.age = age;
    }

    public String getModel() {
        return model;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public int getAge() {
        return age;
    }
}
