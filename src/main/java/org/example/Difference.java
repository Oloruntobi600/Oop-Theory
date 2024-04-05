package org.example;

public class Difference {
}
// The difference between composition and inheritance is that:
// inheritance inherits only from the base class while Composition takes objects from other classes and the parent object
//holds reference of all composed objects.

//example of inheritance is this:
public class Customer extends Person{
    private int customerId;

    public Customer(int id, String name, int age, String address, long phoneNumber, int customerId) {
        super(id, name, age, address, phoneNumber);
        this.customerId = customerId;
    }


    // example of composition is this:
    public class Main {
        public static void main(String[] args) {
        Customer customer = new Customer();


        }
    }