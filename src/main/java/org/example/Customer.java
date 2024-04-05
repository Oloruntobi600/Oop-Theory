package org.example;


// The concept of inheritance allows a new class (called a subclass or derived class)
// to inherit attributes and methods from an existing class (called a superclass or base class).

//Inheritance allows code to be reused across multiple classes. Instead of re-implementing
// common behavior in each class, you can define it once in a superclass and have subclasses inherit it.


public class Customer extends Person{
    private int customerId;

    public Customer(int id, String name, int age, String address, long phoneNumber, int customerId) {
        super(id, name, age, address, phoneNumber);
        this.customerId = customerId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                '}';
    }
}
