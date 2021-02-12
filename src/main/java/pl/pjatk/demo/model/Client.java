package pl.pjatk.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;


@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double money;
    private String name;
    private String surname;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "Transaction_id")
    private Transaction transaction;

    public Client() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public Client(Long id, double money, String name, String surname) {
        this.id = id;
        this.money = money;
        this.name = name;
        this.surname = surname;

    }
}
