package main;

import model.Dancer;
import model.Programmer;
import model.Singer;

public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        programmer.setName("Aibek");
        programmer.setDesignation("KYRGYZSTAN");
        programmer.setCompanyName("CodeSphereAcademy");
        programmer.eat();
        programmer.walk();
        programmer.learn();
        System.out.println(programmer);
        Dancer dancer = new Dancer();
        dancer.setName("Mia");
        dancer.setGroupName("karnaval");
        dancer.getDesignation("Brazil");
        System.out.println(dancer);
        Singer singer = new Singer ("Djek","Italian","Roc");
        System.out.println(singer);

    }
}
