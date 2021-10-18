package com.switchfully.springbootfuniversity.model.dto;

public class CreateCourseDto {

    private String name;
    private int amountOfStudyPoints;
    private String professorId;

    public String getName() {
        return name;
    }

    public int getAmountOfStudyPoints() {
        return amountOfStudyPoints;
    }

    public String getProfessorId() {
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

    public CreateCourseDto setProfessorId(String professorId) {
        this.professorId = professorId;
        return this;
    }
}
