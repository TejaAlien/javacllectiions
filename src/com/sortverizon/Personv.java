package com.sortverizon;

public class Personv {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String  firtname;
    private String lastName;
    private String Area;

    public String getFirtname() {
        return firtname;
    }

    public void setFirtname(String firtname) {
        this.firtname = firtname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String area) {
        Area = area;
    }

    public Personv(int id,String firtname, String lastName, String area) {
        this.id =id;
        this.firtname = firtname;
        this.lastName = lastName;
        Area = area;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firtname='" + firtname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Area='" + Area + '\'' +
                '}';
    }
}

