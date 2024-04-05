package org.example;



// The concept of encapsulation simply means hiding data and making it inaccessible.
// it is important as it encourages dependency between calling codes and class.
//



public class Person {
    private int id;
    private String name;
    private int age;
    private String address;
    private long phoneNumber;

    public Person(int id, String name, int age, String address, long phoneNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public void displayName(String Name, int age) {
        if (getName().equals(name) && getAge() == age) {
            System.out.println(" Customer Name:" + name + " is:" + age + "years old");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}

