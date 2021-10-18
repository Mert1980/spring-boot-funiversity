package com.switchfully.springbootfuniversity.model.dto;

public class UpdateProfessorDto {

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public UpdateProfessorDto setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UpdateProfessorDto setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
}
