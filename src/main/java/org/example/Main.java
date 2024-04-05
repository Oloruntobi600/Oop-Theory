package org.example;

//The concept of Polymorphism allows objects of different classes to be treated as objects of a common superclass.
// It enables a single interface to represent multiple underlying forms. Polymorphism allows for flexibility,
// adaptability, and code reuse in OOP by facilitating dynamic method invocation and runtime binding

//// Creating instances of different subclasses
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Tobi", 30,"Ibadan", +234);
        Person person2 = new Person(2, "Kunle", 30,"Lagos", +237);

        person1.displayName("Tobi", 30);


    }
}