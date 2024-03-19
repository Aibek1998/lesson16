package model;

import model.Person;

public class Singer extends Person {
    private String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public Singer(String bandName) {
        this.bandName = bandName;
    }

    public Singer() {
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    @Override
    public String toString() {
        return "Singer (" +
                "bandName : " + bandName + '\'' +
                ')';
    }
    public void walk (){
        System.out.println();
    }
    public void eat (){
        System.out.println();
    }
    public void learn (){
        System.out.println();
    }
}
