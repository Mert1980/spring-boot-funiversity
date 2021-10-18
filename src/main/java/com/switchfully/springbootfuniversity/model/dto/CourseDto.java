package com.switchfully.springbootfuniversity.model.dto;

public class CourseDto {

    private String id;
    private String name;
    private int amountOfStudyPoints;
    private String professorId;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAmountOfStudyPoints() {
        return amountOfStudyPoints;
    }

    public String getProfessorId() {
        return professorId;
    }

    public CourseDto setId(String id) {
        this.id = id;
        return this;
    }

    public CourseDto setName(String name) {
        this.name = name;
        return this;
    }

    public CourseDto setAmountOfStudyPoints(int amountOfStudyPoints) {
        this.amountOfStudyPoints = amountOfStudyPoints;
        return this;
    }

    public CourseDto setProfessorId(String professorId) {
        this.professorId = professorId;
        return this;
    }
}
