package com.example.DesignPatterns.creational.builder;

import java.time.LocalDate;
import java.time.Period;

public class UserWebDTOBuilder implements UserDTOBuilder {

    private String fname;
    private String lname;
    private String age;
    private String address;
    private UserWebDTO dto;

    @Override
    public UserDTOBuilder withFirstName(String fname) {
        this.fname = fname;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lname) {
        this.lname = lname;
        return this;
    }

    @Override
    public UserDTOBuilder withBirthday(LocalDate date) {
        Period ageInYears = Period.between(date, LocalDate.now());
        age = String.valueOf(ageInYears.getYears());
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address = address.getHouseNumber() + " " + address.getStreet() + ", " +
                address.getCity() + ", " + address.getState() + ", " + address.getZipcode();
        return this;
    }

    @Override
    public UserDTO build() {
        dto = new UserWebDTO(fname+" "+lname, address, age);
        return dto;
    }

    @Override
    public UserDTO getUserDTO() {
        return dto;
    }
}
