package com.spring.voter.datasource.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.text.DateFormat;
import java.util.Date;

@Entity
public class Voting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    int yes;

    int no;

    String name;

    Date date;


    public Voting(int yes, int no, String name, Date date){
        this.yes=yes;
        this.no=no;
        this.name=name;
        this.date=date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYes() {
        return yes;
    }

    public void setYes(int yes) {
        this.yes = yes;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
