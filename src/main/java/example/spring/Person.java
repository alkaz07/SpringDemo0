package example.spring;

public class Person {
    String name;

    Car car;

    public Person(String name) {
        this.name = name;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", car=" + car +
                '}';
    }
}
