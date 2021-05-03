package pl.pjatk.core;

public class Car {


    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Car(int id, String name, Integer number) {
        this.id = id;
        this.name = name;
        this.number = number;
    }

    private String name;
    private Integer number;

}
