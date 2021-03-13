package pl.pjatk.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date transactionDate;
    private double transactionCost;

    @JsonIgnore
    @OneToMany(mappedBy = "transaction")
    private List<Car> transactionCarList;

    @JsonIgnore
    @OneToMany(mappedBy = "transaction")
    private List<Client> transactionClientList;


    public Transaction() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public double getTransactionCost() {
        return transactionCost;
    }

    public void setTransactionCost(double transactionCost) {
        this.transactionCost = transactionCost;
    }

    public Transaction(Long id, Date transactionDate, double transactionCost, List<Transaction> transactionList) {
        this.id = id;
        this.transactionDate = transactionDate;
        this.transactionCost = transactionCost;

    }

    public Transaction(Long id, Date transactionDate, double transactionCost) {
        this.id = id;
        this.transactionDate = transactionDate;
        this.transactionCost = transactionCost;
    }
}
