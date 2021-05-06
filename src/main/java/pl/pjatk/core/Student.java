package pl.pjatk.core;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int rate;
    private String name;
    private String surname;
    private String subjectOfStudy;

    public Student() {

    }

    public Student(Long id, int rate, String name, String forname, String subjectOfStudy) {
        this.id = id;
        this.rate = rate;
        this.name = name;
        this.surname = forname;
        this.subjectOfStudy = subjectOfStudy;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getForname() {
        return surname;
    }

    public void setForname(String forname) {
        this.surname = forname;
    }

    public String getSubjectOfStudy() {
        return subjectOfStudy;
    }

    public void setSubjectOfStudy(String subjectOfStudy) {
        this.subjectOfStudy = subjectOfStudy;
    }

    /*Student student1 = new Student(1L,3,"Pio","Mas","Java");*/
}
