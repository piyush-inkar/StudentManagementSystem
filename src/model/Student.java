package model;

public class Student {

    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }

        // Getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getId() {
        return id;
    }

    public void displayStudent(){

        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("-------------------------------\n");
    }
}
