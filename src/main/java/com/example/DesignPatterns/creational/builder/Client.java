package com.example.DesignPatterns.creational.builder;

import java.time.LocalDate;

public class Client {

    //Example of builder pattern:
    // 1. The builder pattern is a creational design pattern that allows for the step-by-step construction of complex objects.
    // 2. It separates the construction of a complex object from its representation, allowing the same construction process to create different representations.
    // 3. The builder pattern is often used when an object needs to be created with many optional parameters or when the construction process involves multiple steps.
    // 4. It provides a fluent interface for constructing objects, making the code more readable and maintainable.
    // 5. The builder pattern is commonly used in scenarios where an object has a large number of parameters, especially when some of them are optional.
    // 6. It is also useful when the construction process involves multiple steps or when the object being constructed is complex.
    // 7. The builder pattern can be used to create immutable objects, where the object is constructed in a single step and cannot be modified afterward.
    // 8. It is often used in conjunction with the factory pattern to create objects with specific configurations.
    // 9. The builder pattern can improve code readability and maintainability by providing a clear and concise way to construct complex objects.
    // 10. It can also help to reduce the number of constructor overloads and improve the separation of concerns in the codebase.
    // 11. The builder pattern is commonly used in frameworks and libraries to provide a flexible and extensible way to create objects.
    // 12. It is also used in APIs to provide a fluent interface for constructing requests and responses.
    // 13. The builder pattern can be used to create objects with a specific configuration or state, allowing for more control over the construction process.


    public static void main(String[] args) {
        User user = createUser();
        UserDTOBuilder builder = new UserWebDTOBuilder();
        UserDTO dto = builder.withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withBirthday(user.getBirthday())
                .withAddress(user.getAddress())
                .build();

        System.out.println(dto);

    }

    public static User createUser(){
        User user = new User();

        user.setFirstName("Ron");
        user.setLastName("Weasley");
        user.setBirthday(LocalDate.of(1960, 5, 6));
        Address address = new Address();
        address.setHouseNumber("100");
        address.setStreet("4 Privet Drive");
        address.setCity("Little Whinging");
        address.setState("Surrey");
        address.setZipcode("87123");
        user.setAddress(address);

        return user;
    }

}
