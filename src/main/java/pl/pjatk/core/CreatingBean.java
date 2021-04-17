package pl.pjatk.core;

public class CreatingBean {
    public String exist;

    public CreatingBean(String exist) {
        this.exist = exist;
    }

    public String getExist() {
        return exist;
    }

    public void setExist(String exist) {
        this.exist = exist;
    }

    public void beanCreated() {
        System.out.println("Bean is created");
    }




}
