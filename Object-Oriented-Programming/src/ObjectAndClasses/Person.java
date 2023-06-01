package ObjectAndClasses;
import java.util.Scanner;
import java.util.ArrayList;


public class Person
{
    private String name;
    private int age;
    private int height;
    private int weight;

    public Person(String name) {
        this(name , 0);
    }

    public Person(String name , int age){
        this.name = name;
        this.age = age;
        this.weight = 0;
        this.height = 0;
    }

    public void printPerson() {
        System.out.println(this.name + " is " + this.age + " years old");
    }

    public void growOlder() {
//        this.age++; we can call the second Grow old Method.
        this.growOlder(1);
    }

//    Method overLoading
    public void growOlder(int years) {
        this.age = this.age + years;
    }


    public boolean isAdult() {
        if (this.age < 18) {
            return false;
        }
        return true;
    }

    public double bodyMassIndex() {
        double heightInMeters = this.height / 100.0;
        return this.weight / (heightInMeters * heightInMeters);
    }

    public String toString() {
        return this.name + " is " + this.age + " years old";
    }


    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {

        Person paul = new Person("Paul", 24);
        System.out.println(paul);

        paul.growOlder();
        System.out.println(paul);

        paul.growOlder(10);
        System.out.println(paul);

    }
}
