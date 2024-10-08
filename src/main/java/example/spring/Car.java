package example.spring;

public class Car {
    String model;
    int year;

    Person owner;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
