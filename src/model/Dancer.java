package model;

import model.Person;

public class Dancer extends Person {
    private String groupName;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public Dancer(String groupName) {
        this.groupName = groupName;
    }

    public Dancer() {
    }

    public String getGroupName(String karnaval) {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "Dancer (" +
                "groupName : " + groupName + '\'' +
                ')';
    }
    public void  eat (){
        System.out.println();
    }
    public void walk (){
        System.out.println();
    }
    public void learn (){
        System.out.println();
    }
}
