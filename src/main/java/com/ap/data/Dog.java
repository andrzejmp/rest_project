package com.ap.data;

import java.util.Date;

public class Dog {

private String name;
private Date birthDate;
private String bread;

    public Dog(String name, Date birthDate, String bread) {
        this.name = name;
        this.birthDate = birthDate;
        this.bread = bread;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }
}
