package com.switchfully.springbootfuniversity.model.dto;

public class UpdateCourseDto {

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

    public UpdateCourseDto setName(String name) {
        this.name = name;
        return this;
    }

    public UpdateCourseDto setAmountOfStudyPoints(int amountOfStudyPoints) {
        this.amountOfStudyPoints = amountOfStudyPoints;
        return this;
    }

    public UpdateCourseDto setProfessorId(String professorId) {
        this.professorId = professorId;
        return this;
    }
}
