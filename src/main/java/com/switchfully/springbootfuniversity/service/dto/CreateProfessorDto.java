package com.switchfully.springbootfuniversity.service.dto;

public class CreateProfessorDto {

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public CreateProfessorDto setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public CreateProfessorDto setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
}
