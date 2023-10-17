package org.example;

public class Car {
    private int id;
    private String make;

    private String model;

    private int year;

    public int getId() {
        return id;
    }
// use this constructor when we only have make, model and year
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
// use this constructer when we have all properties ( including id)
    // such as when we get the car from the database

    public Car(int id, String make, String model, int year) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "org.example.Car{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
