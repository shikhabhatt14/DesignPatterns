package com.example.DesignPatterns.creational.builder;

public class UserWebDTO implements UserDTO {
    private String name;
    private String address;
    private String age;

    // Constructors
    public UserWebDTO() {
    }

    public UserWebDTO(String name, String address, String age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    // toString method
    @Override
    public String toString() {
        return "UserWebDTO{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
