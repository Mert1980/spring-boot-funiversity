package com.switchfully.springbootfuniversity.model.dto;

public class CreateCourseDto {

    private String name;
    private int amountOfStudyPoints;
    private int professorId;

    public String getName() {
        return name;
    }

    public int getAmountOfStudyPoints() {
        return amountOfStudyPoints;
    }

    public int getProfessorId() {
        return professorId;
    }

    public CreateCourseDto setName(String name) {
        this.name = name;
        return this;
    }

    public CreateCourseDto setAmountOfStudyPoints(int amountOfStudyPoints) {
        this.amountOfStudyPoints = amountOfStudyPoints;
        return this;
    }

    public CreateCourseDto setProfessorId(int professorId) {
        this.professorId = professorId;
        return this;
    }
}
