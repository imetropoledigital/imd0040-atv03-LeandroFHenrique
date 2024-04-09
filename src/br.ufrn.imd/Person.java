package br.ufrn.imd;

public class Person {
    String name;
    String hometown;

    public Person(String name, String hometown) {
        this.name = name;
        this.hometown = hometown;
    }

    public String getHometownn() {
        return hometown;
    }

    public String getName(){
        return name;
    }
}