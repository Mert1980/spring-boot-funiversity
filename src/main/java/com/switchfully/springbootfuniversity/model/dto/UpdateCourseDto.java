package com.switchfully.springbootfuniversity.model.dto;

public class UpdateCourseDto {

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

    public UpdateCourseDto setName(String name) {
        this.name = name;
        return this;
    }

    public UpdateCourseDto setAmountOfStudyPoints(int amountOfStudyPoints) {
        this.amountOfStudyPoints = amountOfStudyPoints;
        return this;
    }

    public UpdateCourseDto setProfessorId(int professorId) {
        this.professorId = professorId;
        return this;
    }
}
