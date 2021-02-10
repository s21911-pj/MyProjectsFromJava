package pl.pjatk.demo.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double engineCapacity;
    private String carBrand;
    private String carModel;
    private double price;
    private String color;
    private int owner;


    @JsonIgnore
    @OneToMany(mappedBy = "transaction")
    private List<Car>carList;

    public Car() {
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

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
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

    public int getOwner() {
        return owner;
    }

    public void setOwner(int owner) {
        this.owner = owner;
    }

    public Car(Long id, double engineCapacity, String carBrand, String carModel, double price, String color, int owner) {
        this.id = id;
        this.engineCapacity = engineCapacity;
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.price = price;
        this.color = color;
        this.owner = owner;
    }
}

