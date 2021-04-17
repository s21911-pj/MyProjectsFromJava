package pl.pjatk.core;

public class Pojo {

    private int number;
    private double koszt;
    private String name;
    private String place;

    public Pojo() {
    }

    public Pojo(int number, double koszt, String name, String place) {
        this.number = number;
        this.koszt = koszt;
        this.name = name;
        this.place = place;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getKoszt() {
        return koszt;
    }

    public void setKoszt(double koszt) {
        this.koszt = koszt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void soutSomething() {
        System.out.println("Something");
    }
}
