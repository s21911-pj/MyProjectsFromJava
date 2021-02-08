package pl.pjatk.usedCarDealer.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double engineCapacity;
    private String carBrand;
    private String carModel;
    private double price;

    public int getOwner() {
        return owner;
    }

    public void setOwner(int owner) {
        this.owner = owner;
    }

    private String color;
    private int owner;

    public Car(Long id, double engineCapacity, String carBrand, String carModel, double price, String color, int owner) {
        this.id = id;
        this.engineCapacity = engineCapacity;
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.price = price;
        this.color = color;
        this.owner = owner;
    }

    public Car() {
    }

    public Car(Long id, double engineCapacity, String carName, String carModel, double price, String color) {
        this.id = id;
        this.engineCapacity = engineCapacity;
        this.carBrand = carName;
        this.carModel = carModel;
        this.price = price;
        this.color = color;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carName) {
        this.carBrand = carName;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
